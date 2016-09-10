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

import ac.soton.eventb.emf.components.AbstractComponentOperation;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.DataPacket;
import ac.soton.eventb.emf.components.Method;
import ac.soton.eventb.emf.components.PortWake;
import ac.soton.eventb.emf.components.SelfWake;
import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.eventb.emf.components.util.ComponentsUtils;
import ac.soton.eventb.emf.diagrams.generator.AbstractRule;
import ac.soton.eventb.emf.diagrams.generator.GenerationDescriptor;
import ac.soton.eventb.emf.diagrams.generator.IRule;
import ac.soton.eventb.emf.diagrams.generator.utils.Find;
import ac.soton.eventb.emf.diagrams.generator.utils.Make;


public class AutonomousOperationRule extends AbstractRule  implements IRule {

	private Event timerEvent = null;
	
	@Override
	public boolean enabled(EventBElement sourceElement) throws Exception {
		assert(sourceElement instanceof AbstractComponentOperation);
		return sourceElement instanceof SelfWake || sourceElement instanceof Method ||
				(sourceElement instanceof PortWake && isConnected((PortWake)sourceElement)) ; //PortWake is only synchronised if connected
	}

	private boolean isConnected(PortWake pw) {
		for (DataPacket r : pw.getReceives()){
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
		if (!dependenciesOK(sourceElement,generatedElements)) throw new Exception("rule fired before dependencies available (sourceElement:"+sourceElement+", rule:"+AutonomousOperationRule.class+")");
		AbstractComponentOperation op = (AbstractComponentOperation) sourceElement;
		List<GenerationDescriptor> ret = new ArrayList<GenerationDescriptor>();
		
		//find the machine 
		Machine machine = (Machine)sourceElement.getContaining(MachinePackage.Literals.MACHINE);
		
		//create the synch flag for this operation
		Event initialisation = (Event) Find.named(machine.getEvents(), "INITIALISATION");
		ret.add(Make.descriptor(machine,variables,Make.variable(Strings.OS_NAME(op), "synch flag for operation"),1));
		if (sourceElement instanceof SelfWake){
			ret.add(Make.descriptor(machine,invariants,Make.invariant(Strings.OS_TYPE_NAME(op), Strings.OS_TYPE_PRED_SELFWAKE(op, ((SelfWake)sourceElement).getQueue()),""),5)); //lower pri as needs queue 
			ret.add(Make.descriptor(initialisation,actions,Make.action(Strings.OS_ACTION_NAME(op), Strings.OS_EMPTY_EXPR(op)),5));			
		}else{
			ret.add(Make.descriptor(machine,invariants,Make.invariant(Strings.OS_TYPE_NAME(op), Strings.OS_TYPE_PRED(op),""),1));
			ret.add(Make.descriptor(initialisation,actions,Make.action(Strings.OS_ACTION_NAME(op), Strings.OS_TRUE_EXPR(op)),1));
		}
		
		AbstractComponentOperation opa = op.getRefines();
		//  We may need a gluing invariant if the operation has been relocated into a sub-component 
		if (opa!=null && !Strings.OS_NAME(op).equals(Strings.OS_NAME(opa))){
			if (!(opa instanceof PortWake) || isConnected((PortWake)opa)){
				ret.add(Make.descriptor(machine, invariants, Make.invariant(Strings.OS_REFREL_NAME(op), Strings.OS_REFREL_PRED(op,op.getRefines()), "refinement relation for "+ op.getLabel()), 10));
			}	
		}
		
		
		//in all elaborated events of this op
		for (Event elaboratedEvent : op.getElaborates()){
			if (sourceElement instanceof SelfWake){
				//check/set operation synch 
				ret.add(Make.descriptor(elaboratedEvent,guards,Make.guard(Strings.OS_GUARD_NAME(op), Strings.SW_NOTDONE_PRED(op,((SelfWake)sourceElement).getQueue())),1));
				ret.add(Make.descriptor(elaboratedEvent,actions,Make.action(Strings.OS_ACTION_NAME(op), Strings.SW_DONE_EXPR(op,((SelfWake)sourceElement).getQueue())),1));				
			}else{
				//check/set operation synch 
				ret.add(Make.descriptor(elaboratedEvent,guards,Make.guard(Strings.OS_GUARD_NAME(op), Strings.OS_FALSE_PRED(op)),1));
				ret.add(Make.descriptor(elaboratedEvent,actions,Make.action(Strings.OS_ACTION_NAME(op), Strings.OS_TRUE_EXPR(op)),1));
			}
		
		}
		
		//finished
		return ret;
	}

}
