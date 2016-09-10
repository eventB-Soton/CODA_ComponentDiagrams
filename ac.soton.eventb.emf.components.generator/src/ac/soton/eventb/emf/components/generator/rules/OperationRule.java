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

import ac.soton.eventb.emf.components.AbstractComponentOperation;
import ac.soton.eventb.emf.components.AbstractPort;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.DelayedDataPacket;
import ac.soton.eventb.emf.components.Method;
import ac.soton.eventb.emf.components.OperationAction;
import ac.soton.eventb.emf.components.OperationGuard;
import ac.soton.eventb.emf.components.OperationWitness;
import ac.soton.eventb.emf.components.OutPort;
import ac.soton.eventb.emf.components.WakeEvent;
import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.eventb.emf.core.extension.coreextension.TypedParameter;
import ac.soton.eventb.emf.diagrams.generator.AbstractRule;
import ac.soton.eventb.emf.diagrams.generator.GenerationDescriptor;
import ac.soton.eventb.emf.diagrams.generator.IRule;
import ac.soton.eventb.emf.diagrams.generator.utils.Make;

public class OperationRule extends AbstractRule implements IRule {

	@Override
	public boolean enabled(EventBElement sourceElement) throws Exception{
		assert(sourceElement instanceof AbstractComponentOperation);
		return true;
	}
	
	@Override
	public List<GenerationDescriptor> fire(EventBElement sourceElement, List<GenerationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));

		AbstractComponentOperation op = (AbstractComponentOperation) sourceElement;
		List<GenerationDescriptor> ret = new ArrayList<GenerationDescriptor>();
		//Machine machine = (Machine)sourceElement.getContaining(MachinePackage.Literals.MACHINE);
		
		//in all elaborated events of this op
		for (Event elaboratedEvent : op.getElaborates()){

			//generate users parameters 
			for (TypedParameter p : op.getParameters()){
				//parameter
				ret.add(Make.descriptor(elaboratedEvent,parameters,Make.parameter(Strings.OP_PARAMETER_NAME(p),p.getComment()),10));
				//guard for type of parameter
				ret.add(Make.descriptor(elaboratedEvent,guards,Make.guard(Strings.OP_PARAMETER_TYPE_GUARD_NAME(p), Strings.OP_PARAMETER_TYPE_GUARD_PRED(p)),1));
			}
			
			//generate users witnesses 
			for (OperationWitness w : op.getWitnesses()){
				ret.add(Make.descriptor(elaboratedEvent,witnesses,Make.witness(Strings.USER_WITNESS_NAME(w), Strings.USER_WITNESS_PRED(w), w.getComment()),10));				
			}
			
			//generate users guards 
			for (OperationGuard g : op.getGuards()){
				ret.add(Make.descriptor(elaboratedEvent,guards,Make.guard(Strings.USER_GUARD_NAME(g), g.isTheorem(), Strings.USER_GUARD_PRED(g),g.getComment()),10));				
			}
			
			//generate users actions
			for (OperationAction a : op.getActions()){
				ret.add(Make.descriptor(elaboratedEvent,actions,Make.action(Strings.USER_ACTION_NAME(a), Strings.USER_ACTION_EXPR(a),a.getComment()),10));				
			}
			
			//enable the synch flag of each method called
			for (Method m : op.getCalls()){
				ret.add(Make.descriptor(elaboratedEvent,actions,Make.action(Strings.OS_ACTION_NAME(m), Strings.OS_FALSE_EXPR(m)),4));				
			}
			
			//set value on connector for each send
			for (DelayedDataPacket s : op.getSends()){

				//generate parameters for the complete chain of output ports
				AbstractPort oport = s.getPort();
				String value = s.getValue();
				
				while (oport instanceof OutPort ){
					//generate parameter and guards for connection to local port
					ret.add(Make.descriptor(elaboratedEvent,parameters,Make.parameter(oport.getName(), 
							"output port of "+ ((Component)oport.getContaining(ComponentsPackage.Literals.COMPONENT)).getName()),4));	
					ret.add(Make.descriptor(elaboratedEvent,guards,Make.guard(Strings.OPT_GUARD_NAME(oport.getName()), Strings.OPT_GUARD_PRED(oport.getName(),value)),4));
					ret.add(Make.descriptor(elaboratedEvent,guards,Make.guard(Strings.OPT_TYPE_NAME(oport.getName()), Strings.OPT_TYPE_PRED(oport.getName(),oport.getType())),5));
					value = oport.getName();
					oport = ((OutPort)oport).getDestination();
				}
				
				if (s.getConnector()!=null){
					ret.add(Make.descriptor(elaboratedEvent,actions,Make.action(Strings.CN_SEND_ACTION_NAME(s), Strings.CN_SEND_ACTION_EXPR(s,s.getPort().getName())),6));	
				}
			}

			//set components wakeup for each wakeEvent
			for (WakeEvent w : op.getWakes()){
				ret.add(Make.descriptor(elaboratedEvent,actions,Make.action(Strings.WU_MIN_SET_ACTION_NAME(w), Strings.WU_MIN_SET_ACTION_EXPR(w)),4));				
				ret.add(Make.descriptor(elaboratedEvent,actions,Make.action(Strings.WU_MAX_SET_ACTION_NAME(w), Strings.WU_MAX_SET_ACTION_EXPR(w)),4));				
			}
			
		}
		
		////////
		return ret;
	}
	
	

}
