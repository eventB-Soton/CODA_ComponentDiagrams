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

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import ac.soton.eventb.emf.components.diagram.edit.commands.ComponentCreateCommand;
import ac.soton.eventb.emf.components.diagram.edit.commands.ConnectorCreateCommand;
import ac.soton.eventb.emf.components.diagram.edit.commands.InPortCreateCommand;
import ac.soton.eventb.emf.components.diagram.edit.commands.OutPortCreateCommand;
import ac.soton.eventb.emf.components.diagram.edit.commands.ParentAsynchronousStatemachineCreateCommand;
import ac.soton.eventb.emf.components.diagram.edit.commands.ParentExternalCreateCommand;
import ac.soton.eventb.emf.components.diagram.edit.commands.ParentMethodCreateCommand;
import ac.soton.eventb.emf.components.diagram.edit.commands.ParentPortWakeCreateCommand;
import ac.soton.eventb.emf.components.diagram.edit.commands.ParentProcessStatemachineCreateCommand;
import ac.soton.eventb.emf.components.diagram.edit.commands.ParentSelfWakeCreateCommand;
import ac.soton.eventb.emf.components.diagram.edit.commands.ParentSynchronousStatemachineCreateCommand;
import ac.soton.eventb.emf.components.diagram.edit.commands.ParentTransitionCreateCommand;
import ac.soton.eventb.emf.components.diagram.edit.commands.ParentWakeQueueCreateCommand;
import ac.soton.eventb.emf.components.diagram.providers.ComponentsElementTypes;

/**
 * @generated
 */
public class ComponentDiagramItemSemanticEditPolicy extends
		ComponentsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentDiagramItemSemanticEditPolicy() {
		super(ComponentsElementTypes.Component_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComponentsElementTypes.Component_2005 == req.getElementType()) {
			return getGEFWrapper(new ComponentCreateCommand(req));
		}
		if (ComponentsElementTypes.Connector_2006 == req.getElementType()) {
			return getGEFWrapper(new ConnectorCreateCommand(req));
		}
		if (ComponentsElementTypes.InPort_2007 == req.getElementType()) {
			return getGEFWrapper(new InPortCreateCommand(req));
		}
		if (ComponentsElementTypes.OutPort_2008 == req.getElementType()) {
			return getGEFWrapper(new OutPortCreateCommand(req));
		}
		if (ComponentsElementTypes.PortWake_2010 == req.getElementType()) {
			return getGEFWrapper(new ParentPortWakeCreateCommand(req));
		}
		if (ComponentsElementTypes.SelfWake_2011 == req.getElementType()) {
			return getGEFWrapper(new ParentSelfWakeCreateCommand(req));
		}
		if (ComponentsElementTypes.Method_2012 == req.getElementType()) {
			return getGEFWrapper(new ParentMethodCreateCommand(req));
		}
		if (ComponentsElementTypes.External_2013 == req.getElementType()) {
			return getGEFWrapper(new ParentExternalCreateCommand(req));
		}
		if (ComponentsElementTypes.Transition_2014 == req.getElementType()) {
			return getGEFWrapper(new ParentTransitionCreateCommand(req));
		}
		if (ComponentsElementTypes.WakeQueue_2009 == req.getElementType()) {
			return getGEFWrapper(new ParentWakeQueueCreateCommand(req));
		}
		if (ComponentsElementTypes.Statemachine_2015 == req.getElementType()) {
			return getGEFWrapper(new ParentAsynchronousStatemachineCreateCommand(
					req));
		}
		if (ComponentsElementTypes.Statemachine_2016 == req.getElementType()) {
			return getGEFWrapper(new ParentSynchronousStatemachineCreateCommand(
					req));
		}
		if (ComponentsElementTypes.Statemachine_2017 == req.getElementType()) {
			return getGEFWrapper(new ParentProcessStatemachineCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
