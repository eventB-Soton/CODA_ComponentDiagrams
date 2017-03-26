/*******************************************************************************
 *  (c) Crown owned copyright 2011, 2017 (UK Ministry of Defence)
 *  
 *  All rights reserved. This program and the accompanying materials  are 
 *  made available under the terms of the Eclipse Public License v1.0 which
 *  accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  This is to identify the UK Ministry of Defence as owners along with the
 *   license rights provided.
 *  
 *  Contributors:
 *  			University of Southampton - Initial implementation
 *******************************************************************************/
package ac.soton.eventb.emf.components.generator.rules;

import java.util.ArrayList;
import java.util.List;

import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Event;

import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.eventb.emf.diagrams.generator.GenerationDescriptor;
import ac.soton.eventb.emf.diagrams.generator.IRule;
import ac.soton.eventb.emf.diagrams.generator.utils.Make;
import ac.soton.eventb.statemachines.Final;
import ac.soton.eventb.statemachines.Transition;

public class SynchronousStatemachineTransitionActionRule extends AbstractSynchronousStatemachineRule  implements IRule {
	
	@Override
	public boolean enabled(EventBElement sourceElement) throws Exception {
		assert(sourceElement instanceof Transition);
		return  super.enabled(sourceElement) && 
				!(
				((Transition)sourceElement).eContainer() == rootSm &&			//not for top level...
				((Transition)sourceElement).getTarget() instanceof Final );		//... final transitions
	}
		
	@Override
	public List<GenerationDescriptor> fire(EventBElement sourceElement, List<GenerationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));
		List<GenerationDescriptor> ret = new ArrayList<GenerationDescriptor>();
		
		//in all elaborated events of this op
		for (Event elaboratedEvent : ((Transition) sourceElement).getElaborates()){
			
			//action for state-machine synch 
			ret.add(Make.descriptor(elaboratedEvent,actions,Make.action(Strings.SYNCSM_ACTION_NAME(rootSm), Strings.SYNCSM_TRUE_EXPR(rootSm)),5));
		
		}
				
		//finished
		return ret;
	}


}
