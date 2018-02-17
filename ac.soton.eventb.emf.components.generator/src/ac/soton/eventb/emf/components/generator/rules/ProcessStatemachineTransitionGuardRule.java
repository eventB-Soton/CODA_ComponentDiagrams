/*******************************************************************************
 * (c) Crown owned copyright (2017) (UK Ministry of Defence)
 *
 * All rights reserved. This program and the accompanying materials are 
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      University of Southampton - Initial API and implementation
 *******************************************************************************/
package ac.soton.eventb.emf.components.generator.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eventb.emf.core.machine.Event;

import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.emf.translator.eventb.utils.Make;
import ac.soton.eventb.statemachines.Initial;
import ac.soton.eventb.statemachines.Transition;

public class ProcessStatemachineTransitionGuardRule extends AbstractProcessStatemachineRule  implements IRule {
	
	@Override
	public boolean enabled(EObject sourceElement) throws Exception {
		assert(sourceElement instanceof Transition);
		return  super.enabled(sourceElement) && 
				!(
				((Transition)sourceElement).eContainer() == rootSm &&			//not for top level...
				((Transition)sourceElement).getSource() instanceof Initial );	//... initial transitions
	}
		
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();
		
		//in all elaborated events of this tr
		for (Event elaboratedEvent : ((Transition) sourceElement).getElaborates()){
			
			//guard for state-machine enabled 
			ret.add(Make.descriptor(elaboratedEvent,guards,Make.guard(Strings.ENBLSM_GUARD_NAME(rootSm), Strings.ENBLSM_TRUE_PRED(rootSm)),5));
		
		}
				
		//finished
		return ret;
	}


}
