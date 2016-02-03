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

import org.eventb.emf.core.EventBElement;

import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.util.ComponentsUtils;
import ac.soton.eventb.emf.diagrams.generator.AbstractRule;
import ac.soton.eventb.emf.diagrams.generator.IRule;
import ac.soton.eventb.statemachines.Statemachine;

public abstract class AbstractProcessStatemachineRule extends AbstractRule  implements IRule {
	
	protected Statemachine rootSm = null;
	
	@Override
	public boolean enabled(EventBElement sourceElement) throws Exception {
		rootSm = ComponentsUtils.getRootStatemachine(sourceElement);
		return  
				//sourceElement is inside a state machine that is owned by a component (not necessarily directly owned)
				rootSm != null 
				&&
				//state machine is a process state machine
				rootSm.eContainingFeature() == ComponentsPackage.Literals.COMPONENT__PROCESS_STATEMACHINES;
	}
		


}
