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
package ac.soton.eventb.emf.components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ac.soton.eventb.emf.components.diagram.edit.commands.ProcessStatemachineCreateCommand;
import ac.soton.eventb.emf.components.diagram.edit.commands.StatemachineCreateCommand;
import ac.soton.eventb.emf.components.diagram.edit.commands.SynchronousStatemachineCreateCommand;
import ac.soton.eventb.emf.components.diagram.providers.ComponentsElementTypes;

/**
 * @generated
 */
public class ComponentStatemachinesItemSemanticEditPolicy extends
		ComponentsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentStatemachinesItemSemanticEditPolicy() {
		super(ComponentsElementTypes.Component_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentsElementTypes.Statemachine_3015 == req.getElementType()) {
			return getGEFWrapper(new StatemachineCreateCommand(req));
		}
		if (ComponentsElementTypes.Statemachine_3016 == req.getElementType()) {
			return getGEFWrapper(new SynchronousStatemachineCreateCommand(req));
		}
		if (ComponentsElementTypes.Statemachine_3017 == req.getElementType()) {
			return getGEFWrapper(new ProcessStatemachineCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
