/*
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.components.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import ac.soton.eventb.emf.components.AbstractComponentOperation;
import ac.soton.eventb.emf.components.AbstractInReceiver;
import ac.soton.eventb.emf.components.AbstractInSender;
import ac.soton.eventb.emf.components.AbstractOutReceiver;
import ac.soton.eventb.emf.components.AbstractOutSender;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.emf.components.InPort;
import ac.soton.eventb.emf.components.OutPort;
import ac.soton.eventb.emf.components.WakeQueue;
import ac.soton.eventb.emf.components.diagram.edit.parts.AbstractInSenderDestinationsEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.AbstractOutReceiverSourceEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentDiagramEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentOperationsEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentStatemachinesEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentSubcomponentsEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentWakeQueuesEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ConnectorEditPart;

import ac.soton.eventb.emf.components.diagram.edit.parts.ExternalEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.InPort2EditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.InPortEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.MethodEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.OutPort2EditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.OutPortEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.PortWakeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ProcessStatemachineEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SelfWakeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.StatemachineEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SubcomponentEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SynchronousStatemachineEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.TransitionEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.WakeQueueEditPart;
import ac.soton.eventb.emf.components.diagram.providers.ComponentsElementTypes;
import ac.soton.eventb.statemachines.Statemachine;

/**
 * @generated
 */
public class ComponentsDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsNodeDescriptor> getSemanticChildren(View view) {
		switch (ComponentsVisualIDRegistry.getVisualID(view)) {
		case ComponentDiagramEditPart.VISUAL_ID:
			return getComponent_1000SemanticChildren(view);
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2005SemanticChildren(view);
		case ComponentStatemachinesEditPart.VISUAL_ID:
			return getComponentStatemachines_7004SemanticChildren(view);
		case ComponentOperationsEditPart.VISUAL_ID:
			return getComponentOperations_7005SemanticChildren(view);
		case ComponentSubcomponentsEditPart.VISUAL_ID:
			return getComponentSubcomponents_7006SemanticChildren(view);
		case ComponentWakeQueuesEditPart.VISUAL_ID:
			return getComponentWakeQueues_7007SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsNodeDescriptor> getComponent_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) view.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			Component childElement = (Component) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ComponentEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getConnectors().iterator(); it
				.hasNext();) {
			Connector childElement = (Connector) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConnectorEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getInPorts().iterator(); it
				.hasNext();) {
			InPort childElement = (InPort) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InPortEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutPorts().iterator(); it
				.hasNext();) {
			OutPort childElement = (OutPort) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutPortEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsNodeDescriptor> getComponent_2005SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) view.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInPorts().iterator(); it
				.hasNext();) {
			InPort childElement = (InPort) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InPort2EditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutPorts().iterator(); it
				.hasNext();) {
			OutPort childElement = (OutPort) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutPort2EditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * Customised to allow several collections of state machines in the same compartment
	 * @generated NOT
	 */
	public static List<ComponentsNodeDescriptor> getComponentStatemachines_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProcessStatemachines().iterator(); it
				.hasNext();) {
			Statemachine childElement = (Statemachine) it.next();
			if (ComponentsVisualIDRegistry.isNodeVisualIDFor(view,
					childElement, ProcessStatemachineEditPart.VISUAL_ID)) {
				result.add(new ComponentsNodeDescriptor(childElement,
						ProcessStatemachineEditPart.VISUAL_ID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSynchronousStatemachines()
				.iterator(); it.hasNext();) {
			Statemachine childElement = (Statemachine) it.next();
			if (ComponentsVisualIDRegistry.isNodeVisualIDFor(view,
					childElement, SynchronousStatemachineEditPart.VISUAL_ID)) {
				result.add(new ComponentsNodeDescriptor(childElement,
						SynchronousStatemachineEditPart.VISUAL_ID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAsynchronousStatemachines()
				.iterator(); it.hasNext();) {
			Statemachine childElement = (Statemachine) it.next();
			if (ComponentsVisualIDRegistry.isNodeVisualIDFor(view,
					childElement, StatemachineEditPart.VISUAL_ID)) {
				result.add(new ComponentsNodeDescriptor(childElement,
						StatemachineEditPart.VISUAL_ID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsNodeDescriptor> getComponentOperations_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperations().iterator(); it
				.hasNext();) {
			AbstractComponentOperation childElement = (AbstractComponentOperation) it
					.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PortWakeEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SelfWakeEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MethodEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExternalEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TransitionEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsNodeDescriptor> getComponentSubcomponents_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			Component childElement = (Component) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SubcomponentEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsNodeDescriptor> getComponentWakeQueues_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) containerView.getElement();
		LinkedList<ComponentsNodeDescriptor> result = new LinkedList<ComponentsNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWakeQueues().iterator(); it
				.hasNext();) {
			WakeQueue childElement = (WakeQueue) it.next();
			int visualID = ComponentsVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WakeQueueEditPart.VISUAL_ID) {
				result.add(new ComponentsNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getContainedLinks(View view) {
		switch (ComponentsVisualIDRegistry.getVisualID(view)) {
		case ComponentDiagramEditPart.VISUAL_ID:
			return getComponent_1000ContainedLinks(view);
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2005ContainedLinks(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2006ContainedLinks(view);
		case InPortEditPart.VISUAL_ID:
			return getInPort_2007ContainedLinks(view);
		case OutPortEditPart.VISUAL_ID:
			return getOutPort_2008ContainedLinks(view);
		case StatemachineEditPart.VISUAL_ID:
			return getStatemachine_3015ContainedLinks(view);
		case SynchronousStatemachineEditPart.VISUAL_ID:
			return getStatemachine_3016ContainedLinks(view);
		case ProcessStatemachineEditPart.VISUAL_ID:
			return getStatemachine_3017ContainedLinks(view);
		case PortWakeEditPart.VISUAL_ID:
			return getPortWake_3008ContainedLinks(view);
		case SelfWakeEditPart.VISUAL_ID:
			return getSelfWake_3009ContainedLinks(view);
		case MethodEditPart.VISUAL_ID:
			return getMethod_3010ContainedLinks(view);
		case ExternalEditPart.VISUAL_ID:
			return getExternal_3013ContainedLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_3014ContainedLinks(view);
		case SubcomponentEditPart.VISUAL_ID:
			return getComponent_3012ContainedLinks(view);
		case WakeQueueEditPart.VISUAL_ID:
			return getWakeQueue_3018ContainedLinks(view);
		case InPort2EditPart.VISUAL_ID:
			return getInPort_3019ContainedLinks(view);
		case OutPort2EditPart.VISUAL_ID:
			return getOutPort_3020ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getIncomingLinks(View view) {
		switch (ComponentsVisualIDRegistry.getVisualID(view)) {
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2005IncomingLinks(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2006IncomingLinks(view);
		case InPortEditPart.VISUAL_ID:
			return getInPort_2007IncomingLinks(view);
		case OutPortEditPart.VISUAL_ID:
			return getOutPort_2008IncomingLinks(view);
		case StatemachineEditPart.VISUAL_ID:
			return getStatemachine_3015IncomingLinks(view);
		case SynchronousStatemachineEditPart.VISUAL_ID:
			return getStatemachine_3016IncomingLinks(view);
		case ProcessStatemachineEditPart.VISUAL_ID:
			return getStatemachine_3017IncomingLinks(view);
		case PortWakeEditPart.VISUAL_ID:
			return getPortWake_3008IncomingLinks(view);
		case SelfWakeEditPart.VISUAL_ID:
			return getSelfWake_3009IncomingLinks(view);
		case MethodEditPart.VISUAL_ID:
			return getMethod_3010IncomingLinks(view);
		case ExternalEditPart.VISUAL_ID:
			return getExternal_3013IncomingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_3014IncomingLinks(view);
		case SubcomponentEditPart.VISUAL_ID:
			return getComponent_3012IncomingLinks(view);
		case WakeQueueEditPart.VISUAL_ID:
			return getWakeQueue_3018IncomingLinks(view);
		case InPort2EditPart.VISUAL_ID:
			return getInPort_3019IncomingLinks(view);
		case OutPort2EditPart.VISUAL_ID:
			return getOutPort_3020IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getOutgoingLinks(View view) {
		switch (ComponentsVisualIDRegistry.getVisualID(view)) {
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2005OutgoingLinks(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2006OutgoingLinks(view);
		case InPortEditPart.VISUAL_ID:
			return getInPort_2007OutgoingLinks(view);
		case OutPortEditPart.VISUAL_ID:
			return getOutPort_2008OutgoingLinks(view);
		case StatemachineEditPart.VISUAL_ID:
			return getStatemachine_3015OutgoingLinks(view);
		case SynchronousStatemachineEditPart.VISUAL_ID:
			return getStatemachine_3016OutgoingLinks(view);
		case ProcessStatemachineEditPart.VISUAL_ID:
			return getStatemachine_3017OutgoingLinks(view);
		case PortWakeEditPart.VISUAL_ID:
			return getPortWake_3008OutgoingLinks(view);
		case SelfWakeEditPart.VISUAL_ID:
			return getSelfWake_3009OutgoingLinks(view);
		case MethodEditPart.VISUAL_ID:
			return getMethod_3010OutgoingLinks(view);
		case ExternalEditPart.VISUAL_ID:
			return getExternal_3013OutgoingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_3014OutgoingLinks(view);
		case SubcomponentEditPart.VISUAL_ID:
			return getComponent_3012OutgoingLinks(view);
		case WakeQueueEditPart.VISUAL_ID:
			return getWakeQueue_3018OutgoingLinks(view);
		case InPort2EditPart.VISUAL_ID:
			return getInPort_3019OutgoingLinks(view);
		case OutPort2EditPart.VISUAL_ID:
			return getOutPort_3020OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getComponent_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getComponent_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getConnector_2006ContainedLinks(
			View view) {
		Connector modelElement = (Connector) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractOutReceiver_Source_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractInSender_Destinations_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getInPort_2007ContainedLinks(
			View view) {
		InPort modelElement = (InPort) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractInSender_Destinations_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getOutPort_2008ContainedLinks(
			View view) {
		OutPort modelElement = (OutPort) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractOutReceiver_Source_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getStatemachine_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getStatemachine_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getStatemachine_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getPortWake_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getSelfWake_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getMethod_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getExternal_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getTransition_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getComponent_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getWakeQueue_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getInPort_3019ContainedLinks(
			View view) {
		InPort modelElement = (InPort) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractInSender_Destinations_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getOutPort_3020ContainedLinks(
			View view) {
		OutPort modelElement = (OutPort) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractOutReceiver_Source_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getComponent_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getConnector_2006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getInPort_2007IncomingLinks(
			View view) {
		InPort modelElement = (InPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AbstractInSender_Destinations_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getOutPort_2008IncomingLinks(
			View view) {
		OutPort modelElement = (OutPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AbstractOutReceiver_Source_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getStatemachine_3015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getStatemachine_3016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getStatemachine_3017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getPortWake_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getSelfWake_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getMethod_3010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getExternal_3013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getTransition_3014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getComponent_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getWakeQueue_3018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getInPort_3019IncomingLinks(
			View view) {
		InPort modelElement = (InPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AbstractInSender_Destinations_4009(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getOutPort_3020IncomingLinks(
			View view) {
		OutPort modelElement = (OutPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_AbstractOutReceiver_Source_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getComponent_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getConnector_2006OutgoingLinks(
			View view) {
		Connector modelElement = (Connector) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractOutReceiver_Source_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractInSender_Destinations_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getInPort_2007OutgoingLinks(
			View view) {
		InPort modelElement = (InPort) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractInSender_Destinations_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getOutPort_2008OutgoingLinks(
			View view) {
		OutPort modelElement = (OutPort) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractOutReceiver_Source_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getStatemachine_3015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getStatemachine_3016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getStatemachine_3017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getPortWake_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getSelfWake_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getMethod_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getExternal_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getTransition_3014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getComponent_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getWakeQueue_3018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getInPort_3019OutgoingLinks(
			View view) {
		InPort modelElement = (InPort) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractInSender_Destinations_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComponentsLinkDescriptor> getOutPort_3020OutgoingLinks(
			View view) {
		OutPort modelElement = (OutPort) view.getElement();
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_AbstractOutReceiver_Source_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentsLinkDescriptor> getIncomingFeatureModelFacetLinks_AbstractOutReceiver_Source_4008(
			AbstractOutSender target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ComponentsPackage.eINSTANCE
					.getAbstractOutReceiver_Source()) {
				result.add(new ComponentsLinkDescriptor(setting.getEObject(),
						target,
						ComponentsElementTypes.AbstractOutReceiverSource_4008,
						AbstractOutReceiverSourceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentsLinkDescriptor> getIncomingFeatureModelFacetLinks_AbstractInSender_Destinations_4009(
			AbstractInReceiver target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ComponentsPackage.eINSTANCE
					.getAbstractInSender_Destinations()) {
				result.add(new ComponentsLinkDescriptor(
						setting.getEObject(),
						target,
						ComponentsElementTypes.AbstractInSenderDestinations_4009,
						AbstractInSenderDestinationsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentsLinkDescriptor> getOutgoingFeatureModelFacetLinks_AbstractOutReceiver_Source_4008(
			AbstractOutReceiver source) {
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		AbstractOutSender destination = source.getSource();
		if (destination == null) {
			return result;
		}
		result.add(new ComponentsLinkDescriptor(source, destination,
				ComponentsElementTypes.AbstractOutReceiverSource_4008,
				AbstractOutReceiverSourceEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComponentsLinkDescriptor> getOutgoingFeatureModelFacetLinks_AbstractInSender_Destinations_4009(
			AbstractInSender source) {
		LinkedList<ComponentsLinkDescriptor> result = new LinkedList<ComponentsLinkDescriptor>();
		for (Iterator<?> destinations = source.getDestinations().iterator(); destinations
				.hasNext();) {
			AbstractInReceiver destination = (AbstractInReceiver) destinations
					.next();
			result.add(new ComponentsLinkDescriptor(source, destination,
					ComponentsElementTypes.AbstractInSenderDestinations_4009,
					AbstractInSenderDestinationsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<ComponentsNodeDescriptor> getSemanticChildren(View view) {
			return ComponentsDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ComponentsLinkDescriptor> getContainedLinks(View view) {
			return ComponentsDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ComponentsLinkDescriptor> getIncomingLinks(View view) {
			return ComponentsDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ComponentsLinkDescriptor> getOutgoingLinks(View view) {
			return ComponentsDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
