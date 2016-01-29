/**
 * (c) Crown owned copyright (2015) (UK Ministry of Defence)
 * This work is licensed under a Creative Commons Attribution-NonCommercial-ShareAlike 4.0
 * International License
 *  
 * This is to identify the UK Ministry of Defence as owners along with the license rights provided. The
 * URL of the CC BY NC SA 4.0 International License is 
 * http://creativecommons.org/licenses/by-nc-sa/4.0/legalcode (Accessed 02-NOV-15).
 * 
 * Contributors:
 * 	University of Southampton - Initial implementation
 *  
*/
package ac.soton.eventb.emf.components.generator.rules;

import java.util.ArrayList;
import java.util.List;

import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.emf.components.DataPacket;
import ac.soton.eventb.emf.components.PortWake;
import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.eventb.emf.components.util.ComponentsUtils;
import ac.soton.eventb.emf.diagrams.generator.AbstractRule;
import ac.soton.eventb.emf.diagrams.generator.GenerationDescriptor;
import ac.soton.eventb.emf.diagrams.generator.IRule;
import ac.soton.eventb.emf.diagrams.generator.utils.Find;
import ac.soton.eventb.emf.diagrams.generator.utils.Make;

public class PortWakeRule extends AbstractRule  implements IRule {

	private Event timerEvent = null;
	
	@Override
	public boolean enabled(EventBElement sourceElement) throws Exception{
		assert(sourceElement instanceof PortWake);
		return true;
	}

	@Override
	public boolean dependenciesOK(EventBElement sourceElement, List<GenerationDescriptor> generatedElements) throws Exception{
		Machine machine = (Machine)sourceElement.getContaining(MachinePackage.Literals.MACHINE);
		Component root = (Component) ComponentsUtils.getRootComponent(sourceElement);
		timerEvent = (Event) Find.generatedElement(generatedElements,machine,events,Strings.TE_NAME(root));
		return timerEvent!=null;
	}
	
	@Override
	public List<GenerationDescriptor> fire(EventBElement sourceElement, List<GenerationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));
		if (!dependenciesOK(sourceElement,generatedElements)) throw new Exception("rule fired before dependencies available (sourceElement:"+sourceElement+", rule:"+PortWakeRule.class+")");
		List<GenerationDescriptor> ret = new ArrayList<GenerationDescriptor>();
		
		PortWake pw = (PortWake) sourceElement;
		
		List<Connector> receivedConnectors = new ArrayList<Connector>();
		for (DataPacket r : pw.getReceives()){
			receivedConnectors.add(r.getConnector());
		}
		for (Event elaboratedEvent : pw.getElaborates()){	
 			//guard for value on connector for each received connector
			for (DataPacket r : pw.getReceives()){
				ret.add(Make.descriptor(elaboratedEvent,guards,Make.guard(Strings.CN_RECV_GUARD_NAME(r), Strings.CN_RECV_GUARD_PRED(r)),4));
			}
			ret.add(Make.descriptor(elaboratedEvent,guards,Make.guard(Strings.CN_NEWV_GUARD_NAME(), Strings.CN_NEWV_GUARD_PRED(pw)),1));		
		}
	
		//guard in timer event ensures PW events finished
		ret.add(Make.descriptor(timerEvent,guards,Make.guard(Strings.TE_PW_DONE_GUARD_NAME(pw), Strings.TE_PW_DONE_GUARD_PRED(pw)),4));

		
		//reset operations synch in timer event
		ret.add(Make.descriptor(timerEvent,actions,Make.action(Strings.OS_ACTION_NAME(pw), Strings.OS_FALSE_EXPR(pw)),4));
		
		////////
		return ret;
	}

}
