/*
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.components.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import ac.soton.eventb.emf.components.diagram.part.ComponentsVisualIDRegistry;

/**
 * @generated
 */
public class ComponentsEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ComponentsVisualIDRegistry.getVisualID(view)) {

			case ComponentDiagramEditPart.VISUAL_ID:
				return new ComponentDiagramEditPart(view);

			case ComponentEditPart.VISUAL_ID:
				return new ComponentEditPart(view);

			case ComponentNameEditPart.VISUAL_ID:
				return new ComponentNameEditPart(view);

			case ConnectorEditPart.VISUAL_ID:
				return new ConnectorEditPart(view);

			case ConnectorNameEditPart.VISUAL_ID:
				return new ConnectorNameEditPart(view);

			case ConnectorTypeEditPart.VISUAL_ID:
				return new ConnectorTypeEditPart(view);

			case StatemachineEditPart.VISUAL_ID:
				return new StatemachineEditPart(view);

			case SynchronousStatemachineEditPart.VISUAL_ID:
				return new SynchronousStatemachineEditPart(view);

			case ProcessStatemachineEditPart.VISUAL_ID:
				return new ProcessStatemachineEditPart(view);

			case PortWakeEditPart.VISUAL_ID:
				return new PortWakeEditPart(view);

			case SelfWakeEditPart.VISUAL_ID:
				return new SelfWakeEditPart(view);

			case MethodEditPart.VISUAL_ID:
				return new MethodEditPart(view);

			case ExternalEditPart.VISUAL_ID:
				return new ExternalEditPart(view);

			case TransitionEditPart.VISUAL_ID:
				return new TransitionEditPart(view);

			case SubcomponentEditPart.VISUAL_ID:
				return new SubcomponentEditPart(view);

			case WakeQueueEditPart.VISUAL_ID:
				return new WakeQueueEditPart(view);

			case ComponentStatemachinesEditPart.VISUAL_ID:
				return new ComponentStatemachinesEditPart(view);

			case ComponentOperationsEditPart.VISUAL_ID:
				return new ComponentOperationsEditPart(view);

			case ComponentSubcomponentsEditPart.VISUAL_ID:
				return new ComponentSubcomponentsEditPart(view);

			case ComponentWakeQueuesEditPart.VISUAL_ID:
				return new ComponentWakeQueuesEditPart(view);

			case ConnectorSenderEditPart.VISUAL_ID:
				return new ConnectorSenderEditPart(view);

			case ConnectorReceiversEditPart.VISUAL_ID:
				return new ConnectorReceiversEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}
}
