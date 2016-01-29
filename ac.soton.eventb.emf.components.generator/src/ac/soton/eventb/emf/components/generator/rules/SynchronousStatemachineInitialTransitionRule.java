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

import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.eventb.emf.diagrams.generator.GenerationDescriptor;
import ac.soton.eventb.emf.diagrams.generator.IRule;
import ac.soton.eventb.emf.diagrams.generator.utils.Make;
import ac.soton.eventb.statemachines.Initial;
import ac.soton.eventb.statemachines.Transition;

public class SynchronousStatemachineInitialTransitionRule extends AbstractSynchronousStatemachineRule  implements IRule {
	
	@Override
	public boolean enabled(EventBElement sourceElement) throws Exception {
		assert(sourceElement instanceof Transition);
		return  super.enabled(sourceElement) && 								
				((Transition)sourceElement).eContainer() == rootSm &&			//only for top level...
				((Transition)sourceElement).getSource() instanceof Initial;		//... initial transitions
	}
		
	@Override
	public List<GenerationDescriptor> fire(EventBElement sourceElement, List<GenerationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));
		List<GenerationDescriptor> ret = new ArrayList<GenerationDescriptor>();
		
		//in all elaborated events of this tr
		for (Event elaboratedEvent : ((Transition) sourceElement).getElaborates()){
			
			//action to enable the state-machine
			ret.add(Make.descriptor(elaboratedEvent,actions,Make.action(Strings.ENBLSM_ACTION_NAME(rootSm), Strings.ENBLSM_TRUE_EXPR(rootSm)),5));
		
		}
				
		//finished
		return ret;
	}


}
