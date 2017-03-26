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

			case InPortEditPart.VISUAL_ID:
				return new InPortEditPart(view);

			case InPortNameTypeEditPart.VISUAL_ID:
				return new InPortNameTypeEditPart(view);

			case OutPortEditPart.VISUAL_ID:
				return new OutPortEditPart(view);

			case OutPortNameTypeEditPart.VISUAL_ID:
				return new OutPortNameTypeEditPart(view);

			case ParentPortWakeEditPart.VISUAL_ID:
				return new ParentPortWakeEditPart(view);

			case ParentPortWakeLabelEditPart.VISUAL_ID:
				return new ParentPortWakeLabelEditPart(view);

			case ParentSelfWakeEditPart.VISUAL_ID:
				return new ParentSelfWakeEditPart(view);

			case ParentSelfWakeLabelEditPart.VISUAL_ID:
				return new ParentSelfWakeLabelEditPart(view);

			case ParentMethodEditPart.VISUAL_ID:
				return new ParentMethodEditPart(view);

			case ParentMethodLabelEditPart.VISUAL_ID:
				return new ParentMethodLabelEditPart(view);

			case ParentExternalEditPart.VISUAL_ID:
				return new ParentExternalEditPart(view);

			case ParentExternalLabelEditPart.VISUAL_ID:
				return new ParentExternalLabelEditPart(view);

			case ParentTransitionEditPart.VISUAL_ID:
				return new ParentTransitionEditPart(view);

			case ParentTransitionLabelEditPart.VISUAL_ID:
				return new ParentTransitionLabelEditPart(view);

			case ParentWakeQueueEditPart.VISUAL_ID:
				return new ParentWakeQueueEditPart(view);

			case ParentWakeQueueNameEditPart.VISUAL_ID:
				return new ParentWakeQueueNameEditPart(view);

			case ParentAsynchronousStatemachineEditPart.VISUAL_ID:
				return new ParentAsynchronousStatemachineEditPart(view);

			case ParentAsynchronousStatemachineNameEditPart.VISUAL_ID:
				return new ParentAsynchronousStatemachineNameEditPart(view);

			case ParentSynchronousStatemachineEditPart.VISUAL_ID:
				return new ParentSynchronousStatemachineEditPart(view);

			case ParentSynchronousStatemachineNameEditPart.VISUAL_ID:
				return new ParentSynchronousStatemachineNameEditPart(view);

			case ParentProcessStatemachineEditPart.VISUAL_ID:
				return new ParentProcessStatemachineEditPart(view);

			case ParentProcessStatemachineNameEditPart.VISUAL_ID:
				return new ParentProcessStatemachineNameEditPart(view);

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

			case SubcomponentInPortEditPart.VISUAL_ID:
				return new SubcomponentInPortEditPart(view);

			case SubcomponentInPortNameTypeEditPart.VISUAL_ID:
				return new SubcomponentInPortNameTypeEditPart(view);

			case SubcomponentOutPortEditPart.VISUAL_ID:
				return new SubcomponentOutPortEditPart(view);

			case SubcomponentOutPortNameTypeEditPart.VISUAL_ID:
				return new SubcomponentOutPortNameTypeEditPart(view);

			case ComponentStatemachinesEditPart.VISUAL_ID:
				return new ComponentStatemachinesEditPart(view);

			case ComponentOperationsEditPart.VISUAL_ID:
				return new ComponentOperationsEditPart(view);

			case ComponentSubcomponentsEditPart.VISUAL_ID:
				return new ComponentSubcomponentsEditPart(view);

			case ComponentWakeQueuesEditPart.VISUAL_ID:
				return new ComponentWakeQueuesEditPart(view);

			case AbstractOutReceiverSourceEditPart.VISUAL_ID:
				return new AbstractOutReceiverSourceEditPart(view);

			case AbstractInSenderDestinationsEditPart.VISUAL_ID:
				return new AbstractInSenderDestinationsEditPart(view);

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
