/*
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.components.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import ac.soton.eventb.emf.components.diagram.edit.commands.ExternalCreateCommand;
import ac.soton.eventb.emf.components.diagram.edit.commands.MethodCreateCommand;
import ac.soton.eventb.emf.components.diagram.edit.commands.PortWakeCreateCommand;
import ac.soton.eventb.emf.components.diagram.edit.commands.SelfWakeCreateCommand;
import ac.soton.eventb.emf.components.diagram.edit.commands.TransitionCreateCommand;
import ac.soton.eventb.emf.components.diagram.providers.ComponentsElementTypes;

/**
 * @generated
 */
public class ComponentOperationsItemSemanticEditPolicy extends
		ComponentsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentOperationsItemSemanticEditPolicy() {
		super(ComponentsElementTypes.Component_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentsElementTypes.PortWake_3008 == req.getElementType()) {
			return getGEFWrapper(new PortWakeCreateCommand(req));
		}
		if (ComponentsElementTypes.SelfWake_3009 == req.getElementType()) {
			return getGEFWrapper(new SelfWakeCreateCommand(req));
		}
		if (ComponentsElementTypes.Method_3010 == req.getElementType()) {
			return getGEFWrapper(new MethodCreateCommand(req));
		}
		if (ComponentsElementTypes.External_3013 == req.getElementType()) {
			return getGEFWrapper(new ExternalCreateCommand(req));
		}
		if (ComponentsElementTypes.Transition_3014 == req.getElementType()) {
			return getGEFWrapper(new TransitionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
