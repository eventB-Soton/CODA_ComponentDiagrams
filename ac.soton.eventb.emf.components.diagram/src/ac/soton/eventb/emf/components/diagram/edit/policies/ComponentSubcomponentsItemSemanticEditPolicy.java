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
package ac.soton.eventb.emf.components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ac.soton.eventb.emf.components.diagram.edit.commands.SubcomponentCreateCommand;
import ac.soton.eventb.emf.components.diagram.providers.ComponentsElementTypes;

/**
 * @generated
 */
public class ComponentSubcomponentsItemSemanticEditPolicy extends
		ComponentsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentSubcomponentsItemSemanticEditPolicy() {
		super(ComponentsElementTypes.Component_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentsElementTypes.Component_3012 == req.getElementType()) {
			return getGEFWrapper(new SubcomponentCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
