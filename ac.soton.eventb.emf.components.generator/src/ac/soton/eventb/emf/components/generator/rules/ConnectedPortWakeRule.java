/**
 * (c) Crown owned copyright (2015-2016) (UK Ministry of Defence)
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
import ac.soton.eventb.emf.components.DataPacket;
import ac.soton.eventb.emf.components.PortWake;
import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.eventb.emf.components.util.ComponentsUtils;
import ac.soton.eventb.emf.diagrams.generator.AbstractRule;
import ac.soton.eventb.emf.diagrams.generator.GenerationDescriptor;
import ac.soton.eventb.emf.diagrams.generator.IRule;
import ac.soton.eventb.emf.diagrams.generator.utils.Find;
import ac.soton.eventb.emf.diagrams.generator.utils.Make;

/**
 * This rule deals with port wakes that receive on inports that are connected to connectors.
 * This involves generating synchronisation with the timer event as well as guarding
 * elaborated events to make sure the inport value has arrived on the connector
 * 
 * Note that generation of parameters representing inports are dealt with elsewhere
 * <p>
 * 
 * </p>
 * 
 * @author cfs
 * @version
 * @see
 * @since
 */
public class ConnectedPortWakeRule extends AbstractRule  implements IRule {

	private Event timerEvent = null;
	
	/**
	 * only if inport is connected
	 */
	@Override
	public boolean enabled(EventBElement sourceElement) throws Exception{
		assert(sourceElement instanceof PortWake);
		for (DataPacket r : ((PortWake)sourceElement).getReceives()){
			if (r.getConnector()!=null){
				return true;
			}
		}
		return false;
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
		if (!dependenciesOK(sourceElement,generatedElements)) throw new Exception("rule fired before dependencies available (sourceElement:"+sourceElement+", rule:"+ConnectedPortWakeRule.class+")");
		List<GenerationDescriptor> ret = new ArrayList<GenerationDescriptor>();
		
		PortWake pw = (PortWake) sourceElement;
		
		for (Event elaboratedEvent : pw.getElaborates()){	
 			//guard for value on connector for each received connector
			for (DataPacket r : pw.getReceives()){
				
				//if connected, generate guard for reading connector
				if (r.getConnector()!=null){					
					ret.add(Make.descriptor(elaboratedEvent,guards,Make.guard(Strings.CN_RECV_GUARD_NAME(r), Strings.CN_RECV_GUARD_PRED(r, r.getPort().getName())),6));
				}
			}
			ret.add(Make.descriptor(elaboratedEvent,guards,Make.guard(Strings.CN_NEWV_GUARD_NAME(), Strings.CN_NEWV_GUARD_PRED(pw)),1));		
		}
	
		//guard in timer event to parameterize condition of having a current value (this is to allow for decomposition)
		ret.add(Make.descriptor(timerEvent,parameters,Make.parameter(Strings.TE_PW_READY_PARAM_NAME(pw), ""),4));
		ret.add(Make.descriptor(timerEvent,guards,Make.guard(Strings.TE_PW_READY_GUARD_NAME(pw), Strings.TE_PW_READY_GUARD_PRED(pw)),4));
		//guard in timer event ensures PW events finished or no current value available
		ret.add(Make.descriptor(timerEvent,guards,Make.guard(Strings.TE_PW_DONE_GUARD_NAME(pw), Strings.TE_PW_DONE_GUARD_PRED(pw)),4));
		
		//reset operations synch in timer event
		ret.add(Make.descriptor(timerEvent,actions,Make.action(Strings.OS_ACTION_NAME(pw), Strings.OS_FALSE_EXPR(pw)),4));
		
		////////
		return ret;
	}

}
