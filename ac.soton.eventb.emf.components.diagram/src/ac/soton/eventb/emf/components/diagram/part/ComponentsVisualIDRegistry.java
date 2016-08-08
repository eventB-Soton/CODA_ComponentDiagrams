/*
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.components.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentDiagramEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentNameEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentOperationsEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentStatemachinesEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentSubcomponentsEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentWakeQueuesEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ConnectorEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ConnectorNameEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ConnectorTypeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ExternalEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.InPortEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.InPortNameTypeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.MethodEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.OutPortEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.OutPortNameTypeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.PortWakeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ProcessStatemachineEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SelfWakeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.StatemachineEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SubcomponentEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SubcomponentInPortEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SubcomponentInPortNameTypeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SubcomponentOutPortEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SubcomponentOutPortNameTypeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SynchronousStatemachineEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.TransitionEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.WakeQueueEditPart;
import ac.soton.eventb.statemachines.StatemachinesPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ComponentsVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "ac.soton.eventb.emf.components.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ComponentDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return ComponentDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return ac.soton.eventb.emf.components.diagram.part.ComponentsVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ComponentsDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ComponentsPackage.eINSTANCE.getComponent().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Component) domainElement)) {
			return ComponentDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = ac.soton.eventb.emf.components.diagram.part.ComponentsVisualIDRegistry
				.getModelID(containerView);
		if (!ComponentDiagramEditPart.MODEL_ID.equals(containerModelID)
				&& !"components".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ComponentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ac.soton.eventb.emf.components.diagram.part.ComponentsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComponentDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ComponentDiagramEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return ComponentEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ConnectorEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getInPort().isSuperTypeOf(
					domainElement.eClass())) {
				return InPortEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getOutPort().isSuperTypeOf(
					domainElement.eClass())) {
				return OutPortEditPart.VISUAL_ID;
			}
			break;
		case ComponentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getInPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SubcomponentInPortEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getOutPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SubcomponentOutPortEditPart.VISUAL_ID;
			}
			break;
		case ComponentStatemachinesEditPart.VISUAL_ID:
			if (StatemachinesPackage.eINSTANCE.getStatemachine().isSuperTypeOf(
					domainElement.eClass())) {
				return StatemachineEditPart.VISUAL_ID;
			}
			if (StatemachinesPackage.eINSTANCE.getStatemachine().isSuperTypeOf(
					domainElement.eClass())) {
				return SynchronousStatemachineEditPart.VISUAL_ID;
			}
			if (StatemachinesPackage.eINSTANCE.getStatemachine().isSuperTypeOf(
					domainElement.eClass())) {
				return ProcessStatemachineEditPart.VISUAL_ID;
			}
			break;
		case ComponentOperationsEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getPortWake().isSuperTypeOf(
					domainElement.eClass())) {
				return PortWakeEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getSelfWake().isSuperTypeOf(
					domainElement.eClass())) {
				return SelfWakeEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getMethod().isSuperTypeOf(
					domainElement.eClass())) {
				return MethodEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getExternal().isSuperTypeOf(
					domainElement.eClass())) {
				return ExternalEditPart.VISUAL_ID;
			}
			if (ComponentsPackage.eINSTANCE.getTransition().isSuperTypeOf(
					domainElement.eClass())) {
				return TransitionEditPart.VISUAL_ID;
			}
			break;
		case ComponentSubcomponentsEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return SubcomponentEditPart.VISUAL_ID;
			}
			break;
		case ComponentWakeQueuesEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getWakeQueue().isSuperTypeOf(
					domainElement.eClass())) {
				return WakeQueueEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = ac.soton.eventb.emf.components.diagram.part.ComponentsVisualIDRegistry
				.getModelID(containerView);
		if (!ComponentDiagramEditPart.MODEL_ID.equals(containerModelID)
				&& !"components".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ComponentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ac.soton.eventb.emf.components.diagram.part.ComponentsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComponentDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ComponentDiagramEditPart.VISUAL_ID:
			if (ComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentEditPart.VISUAL_ID:
			if (ComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentStatemachinesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentSubcomponentsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentWakeQueuesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SubcomponentInPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SubcomponentOutPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectorEditPart.VISUAL_ID:
			if (ConnectorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectorTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InPortEditPart.VISUAL_ID:
			if (InPortNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutPortEditPart.VISUAL_ID:
			if (OutPortNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SubcomponentInPortEditPart.VISUAL_ID:
			if (SubcomponentInPortNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SubcomponentOutPortEditPart.VISUAL_ID:
			if (SubcomponentOutPortNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentStatemachinesEditPart.VISUAL_ID:
			if (StatemachineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SynchronousStatemachineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProcessStatemachineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentOperationsEditPart.VISUAL_ID:
			if (PortWakeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SelfWakeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MethodEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExternalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TransitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentSubcomponentsEditPart.VISUAL_ID:
			if (SubcomponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentWakeQueuesEditPart.VISUAL_ID:
			if (WakeQueueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Component element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case ComponentStatemachinesEditPart.VISUAL_ID:
		case ComponentOperationsEditPart.VISUAL_ID:
		case ComponentSubcomponentsEditPart.VISUAL_ID:
		case ComponentWakeQueuesEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ComponentDiagramEditPart.VISUAL_ID:
			return false;
		case ConnectorEditPart.VISUAL_ID:
		case InPortEditPart.VISUAL_ID:
		case OutPortEditPart.VISUAL_ID:
		case PortWakeEditPart.VISUAL_ID:
		case SelfWakeEditPart.VISUAL_ID:
		case MethodEditPart.VISUAL_ID:
		case SubcomponentEditPart.VISUAL_ID:
		case ExternalEditPart.VISUAL_ID:
		case TransitionEditPart.VISUAL_ID:
		case StatemachineEditPart.VISUAL_ID:
		case SynchronousStatemachineEditPart.VISUAL_ID:
		case ProcessStatemachineEditPart.VISUAL_ID:
		case WakeQueueEditPart.VISUAL_ID:
		case SubcomponentInPortEditPart.VISUAL_ID:
		case SubcomponentOutPortEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return ac.soton.eventb.emf.components.diagram.part.ComponentsVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return ac.soton.eventb.emf.components.diagram.part.ComponentsVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return ac.soton.eventb.emf.components.diagram.part.ComponentsVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return ac.soton.eventb.emf.components.diagram.part.ComponentsVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return ac.soton.eventb.emf.components.diagram.part.ComponentsVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return ac.soton.eventb.emf.components.diagram.part.ComponentsVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

	/**
	 * Checks that the visualId is valid for representing the domain element in the containerView
	 * 
	 * (Customisation - use instead of getNodeVisualID which cannot support two collections of the same domain element type in the same container)
	 * 
	 * @param containerView
	 * @param domainElement
	 * @param visualID
	 * @return
	 */
	public static boolean isNodeVisualIDFor(View containerView,
			EObject domainElement, int visualID) {
		if (domainElement == null) {
			return false;
		}
		String containerModelID = ac.soton.eventb.emf.components.diagram.part.ComponentsVisualIDRegistry
				.getModelID(containerView);
		if (!ComponentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ComponentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ac.soton.eventb.emf.components.diagram.part.ComponentsVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComponentDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ComponentDiagramEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getComponent().isSuperTypeOf(
					domainElement.eClass())) {
				if (ComponentEditPart.VISUAL_ID == visualID)
					return true;
			}
			if (ComponentsPackage.eINSTANCE.getConnector().isSuperTypeOf(
					domainElement.eClass())) {
				if (ConnectorEditPart.VISUAL_ID == visualID)
					return true;
			}
			if (ComponentsPackage.eINSTANCE.getInPort().isSuperTypeOf(
					domainElement.eClass())) {
				if (InPortEditPart.VISUAL_ID == visualID)
					return true;
			}
			if (ComponentsPackage.eINSTANCE.getOutPort().isSuperTypeOf(
					domainElement.eClass())) {
				if (OutPortEditPart.VISUAL_ID == visualID)
					return true;
			}
			break;
		case ComponentEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getInPort().isSuperTypeOf(
					domainElement.eClass())) {
				if (SubcomponentInPortEditPart.VISUAL_ID == visualID)
					return true;
			}
			if (ComponentsPackage.eINSTANCE.getOutPort().isSuperTypeOf(
					domainElement.eClass())) {
				if (SubcomponentOutPortEditPart.VISUAL_ID == visualID)
					return true;
			}
		case ComponentStatemachinesEditPart.VISUAL_ID:
			if (StatemachinesPackage.eINSTANCE.getStatemachine().isSuperTypeOf(
					domainElement.eClass())) {
				if (StatemachineEditPart.VISUAL_ID == visualID)
					return true;
			}
			if (StatemachinesPackage.eINSTANCE.getStatemachine().isSuperTypeOf(
					domainElement.eClass())) {
				if (SynchronousStatemachineEditPart.VISUAL_ID == visualID)
					return true;
			}
			if (StatemachinesPackage.eINSTANCE.getStatemachine().isSuperTypeOf(
					domainElement.eClass())) {
				if (ProcessStatemachineEditPart.VISUAL_ID == visualID)
					return true;
			}
			break;
		case ComponentOperationsEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getPortWake().isSuperTypeOf(
					domainElement.eClass())) {
				if (PortWakeEditPart.VISUAL_ID == visualID)
					return true;
			}
			if (ComponentsPackage.eINSTANCE.getSelfWake().isSuperTypeOf(
					domainElement.eClass())) {
				if (SelfWakeEditPart.VISUAL_ID == visualID)
					return true;
			}
			if (ComponentsPackage.eINSTANCE.getMethod().isSuperTypeOf(
					domainElement.eClass())) {
				if (MethodEditPart.VISUAL_ID == visualID)
					return true;
			}
			if (ComponentsPackage.eINSTANCE.getExternal().isSuperTypeOf(
					domainElement.eClass())) {
				if (ExternalEditPart.VISUAL_ID == visualID)
					return true;
			}
			if (ComponentsPackage.eINSTANCE.getTransition().isSuperTypeOf(
					domainElement.eClass())) {
				if (TransitionEditPart.VISUAL_ID == visualID)
					return true;
			}
			break;
		case ComponentSubcomponentsEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getComponent().isSuperTypeOf(
					domainElement.eClass())) {
				if (SubcomponentEditPart.VISUAL_ID == visualID)
					return true;
			}
			break;
		case ComponentWakeQueuesEditPart.VISUAL_ID:
			if (ComponentsPackage.eINSTANCE.getWakeQueue().isSuperTypeOf(
					domainElement.eClass())) {
				if (WakeQueueEditPart.VISUAL_ID == visualID)
					return true;
			}
			break;
		}
		return false;
	}

}
