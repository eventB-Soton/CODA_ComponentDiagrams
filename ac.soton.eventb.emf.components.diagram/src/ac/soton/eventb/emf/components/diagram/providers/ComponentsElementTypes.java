/*
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.components.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.diagram.edit.parts.AbstractInSenderDestinationsEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.AbstractOutReceiverSourceEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentDiagramEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentEditPart;
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
import ac.soton.eventb.emf.components.diagram.part.ComponentsDiagramEditorPlugin;
import ac.soton.eventb.statemachines.StatemachinesPackage;

/**
 * @generated
 */
public class ComponentsElementTypes {

	/**
	 * @generated
	 */
	private ComponentsElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ComponentsDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Component_1000 = getElementType("ac.soton.eventb.emf.components.diagram.Component_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Component_2005 = getElementType("ac.soton.eventb.emf.components.diagram.Component_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connector_2006 = getElementType("ac.soton.eventb.emf.components.diagram.Connector_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InPort_2007 = getElementType("ac.soton.eventb.emf.components.diagram.InPort_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OutPort_2008 = getElementType("ac.soton.eventb.emf.components.diagram.OutPort_2008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Statemachine_3015 = getElementType("ac.soton.eventb.emf.components.diagram.Statemachine_3015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Statemachine_3016 = getElementType("ac.soton.eventb.emf.components.diagram.Statemachine_3016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Statemachine_3017 = getElementType("ac.soton.eventb.emf.components.diagram.Statemachine_3017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PortWake_3008 = getElementType("ac.soton.eventb.emf.components.diagram.PortWake_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SelfWake_3009 = getElementType("ac.soton.eventb.emf.components.diagram.SelfWake_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Method_3010 = getElementType("ac.soton.eventb.emf.components.diagram.Method_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType External_3013 = getElementType("ac.soton.eventb.emf.components.diagram.External_3013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Transition_3014 = getElementType("ac.soton.eventb.emf.components.diagram.Transition_3014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Component_3012 = getElementType("ac.soton.eventb.emf.components.diagram.Component_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType WakeQueue_3018 = getElementType("ac.soton.eventb.emf.components.diagram.WakeQueue_3018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InPort_3019 = getElementType("ac.soton.eventb.emf.components.diagram.InPort_3019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OutPort_3020 = getElementType("ac.soton.eventb.emf.components.diagram.OutPort_3020"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AbstractOutReceiverSource_4008 = getElementType("ac.soton.eventb.emf.components.diagram.AbstractOutReceiverSource_4008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AbstractInSenderDestinations_4009 = getElementType("ac.soton.eventb.emf.components.diagram.AbstractInSenderDestinations_4009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Component_1000,
					ComponentsPackage.eINSTANCE.getComponent());

			elements.put(Component_2005,
					ComponentsPackage.eINSTANCE.getComponent());

			elements.put(Connector_2006,
					ComponentsPackage.eINSTANCE.getConnector());

			elements.put(InPort_2007, ComponentsPackage.eINSTANCE.getInPort());

			elements.put(OutPort_2008, ComponentsPackage.eINSTANCE.getOutPort());

			elements.put(Statemachine_3015,
					StatemachinesPackage.eINSTANCE.getStatemachine());

			elements.put(Statemachine_3016,
					StatemachinesPackage.eINSTANCE.getStatemachine());

			elements.put(Statemachine_3017,
					StatemachinesPackage.eINSTANCE.getStatemachine());

			elements.put(PortWake_3008,
					ComponentsPackage.eINSTANCE.getPortWake());

			elements.put(SelfWake_3009,
					ComponentsPackage.eINSTANCE.getSelfWake());

			elements.put(Method_3010, ComponentsPackage.eINSTANCE.getMethod());

			elements.put(External_3013,
					ComponentsPackage.eINSTANCE.getExternal());

			elements.put(Transition_3014,
					ComponentsPackage.eINSTANCE.getTransition());

			elements.put(Component_3012,
					ComponentsPackage.eINSTANCE.getComponent());

			elements.put(WakeQueue_3018,
					ComponentsPackage.eINSTANCE.getWakeQueue());

			elements.put(InPort_3019, ComponentsPackage.eINSTANCE.getInPort());

			elements.put(OutPort_3020, ComponentsPackage.eINSTANCE.getOutPort());

			elements.put(AbstractOutReceiverSource_4008,
					ComponentsPackage.eINSTANCE.getAbstractOutReceiver_Source());

			elements.put(AbstractInSenderDestinations_4009,
					ComponentsPackage.eINSTANCE
							.getAbstractInSender_Destinations());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Component_1000);
			KNOWN_ELEMENT_TYPES.add(Component_2005);
			KNOWN_ELEMENT_TYPES.add(Connector_2006);
			KNOWN_ELEMENT_TYPES.add(InPort_2007);
			KNOWN_ELEMENT_TYPES.add(OutPort_2008);
			KNOWN_ELEMENT_TYPES.add(Statemachine_3015);
			KNOWN_ELEMENT_TYPES.add(Statemachine_3016);
			KNOWN_ELEMENT_TYPES.add(Statemachine_3017);
			KNOWN_ELEMENT_TYPES.add(PortWake_3008);
			KNOWN_ELEMENT_TYPES.add(SelfWake_3009);
			KNOWN_ELEMENT_TYPES.add(Method_3010);
			KNOWN_ELEMENT_TYPES.add(External_3013);
			KNOWN_ELEMENT_TYPES.add(Transition_3014);
			KNOWN_ELEMENT_TYPES.add(Component_3012);
			KNOWN_ELEMENT_TYPES.add(WakeQueue_3018);
			KNOWN_ELEMENT_TYPES.add(InPort_3019);
			KNOWN_ELEMENT_TYPES.add(OutPort_3020);
			KNOWN_ELEMENT_TYPES.add(AbstractOutReceiverSource_4008);
			KNOWN_ELEMENT_TYPES.add(AbstractInSenderDestinations_4009);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ComponentDiagramEditPart.VISUAL_ID:
			return Component_1000;
		case ComponentEditPart.VISUAL_ID:
			return Component_2005;
		case ConnectorEditPart.VISUAL_ID:
			return Connector_2006;
		case InPortEditPart.VISUAL_ID:
			return InPort_2007;
		case OutPortEditPart.VISUAL_ID:
			return OutPort_2008;
		case StatemachineEditPart.VISUAL_ID:
			return Statemachine_3015;
		case SynchronousStatemachineEditPart.VISUAL_ID:
			return Statemachine_3016;
		case ProcessStatemachineEditPart.VISUAL_ID:
			return Statemachine_3017;
		case PortWakeEditPart.VISUAL_ID:
			return PortWake_3008;
		case SelfWakeEditPart.VISUAL_ID:
			return SelfWake_3009;
		case MethodEditPart.VISUAL_ID:
			return Method_3010;
		case ExternalEditPart.VISUAL_ID:
			return External_3013;
		case TransitionEditPart.VISUAL_ID:
			return Transition_3014;
		case SubcomponentEditPart.VISUAL_ID:
			return Component_3012;
		case WakeQueueEditPart.VISUAL_ID:
			return WakeQueue_3018;
		case InPort2EditPart.VISUAL_ID:
			return InPort_3019;
		case OutPort2EditPart.VISUAL_ID:
			return OutPort_3020;
		case AbstractOutReceiverSourceEditPart.VISUAL_ID:
			return AbstractOutReceiverSource_4008;
		case AbstractInSenderDestinationsEditPart.VISUAL_ID:
			return AbstractInSenderDestinations_4009;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return ac.soton.eventb.emf.components.diagram.providers.ComponentsElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return ac.soton.eventb.emf.components.diagram.providers.ComponentsElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return ac.soton.eventb.emf.components.diagram.providers.ComponentsElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
