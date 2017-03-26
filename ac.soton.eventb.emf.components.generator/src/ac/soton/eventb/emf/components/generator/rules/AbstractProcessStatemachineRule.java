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
