/*
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.components.diagram.sheet;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Image;
import org.eventb.emf.core.EventBNamed;

import ac.soton.eventb.emf.components.diagram.edit.parts.ConnectorReceiversEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ConnectorSenderEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ProcessStatemachineEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.StatemachineEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SynchronousStatemachineEditPart;
import ac.soton.eventb.emf.components.diagram.navigator.ComponentsNavigatorGroup;
import ac.soton.eventb.emf.components.diagram.part.ComponentsDiagramEditorPlugin;
import ac.soton.eventb.emf.components.diagram.part.ComponentsVisualIDRegistry;
import ac.soton.eventb.emf.components.diagram.providers.ComponentsElementTypes;
import ac.soton.eventb.emf.core.extension.coreextension.EventBLabeled;

/**
 * @generated
 */
public class ComponentsSheetLabelProvider extends BaseLabelProvider implements
		ILabelProvider {

	/**
	 * customised to provide a more informative title. 
	 * e.g. indicate kind of statemachine, append name from domain model
	 * 
	 * @generated NOT
	 */
	public String getText(Object element) {
		element = unwrap(element);
		if (element instanceof ComponentsNavigatorGroup) {
			return ((ComponentsNavigatorGroup) element).getGroupName();
		}

		String result = ""; //default empty string

		//obtain type part
		IElementType etype = getElementType(element);
		if (etype != null)
			result = etype.getDisplayName();

		//obtain contextual part if any
		if (element instanceof ProcessStatemachineEditPart) {
			result = "Process " + result;
		} else if (element instanceof SynchronousStatemachineEditPart) {
			result = "Synchronous " + result;
		} else if (element instanceof StatemachineEditPart) {
			result = "Asynchronous " + result;
		} else if (element instanceof ConnectorSenderEditPart) {
			result = "Sender";
		} else if (element instanceof ConnectorReceiversEditPart) {
			result = "Receiver";
		}

		//append name of domain model element where possible
		EObject domainObject = getDomainObject(element);
		if (domainObject instanceof EventBNamed) {
			result = result + " : " + ((EventBNamed) domainObject).getName();
		} else if (domainObject instanceof EventBLabeled) {
			result = result + " : " + ((EventBLabeled) domainObject).getLabel();
		}

		return result;
	}

	private Image senderIcon = ComponentsDiagramEditorPlugin
			.findImageDescriptor(
					"/ac.soton.eventb.emf.components.edit/icons/full/obj16/Sender.gif")
			.createImage();
	private Image receiverIcon = ComponentsDiagramEditorPlugin
			.findImageDescriptor(
					"/ac.soton.eventb.emf.components.edit/icons/full/obj16/Receiver.gif")
			.createImage();

	public void dispose() {
		senderIcon.dispose();
		receiverIcon.dispose();
	}

	/**
	 * @generated NOT
	 */
	public Image getImage(Object element) {
		element = unwrap(element);
		if (element instanceof SynchronousStatemachineEditPart) {
			return ((SynchronousStatemachineEditPart) element).getLabelIcon();
		} else if (element instanceof ConnectorSenderEditPart) {
			return senderIcon;
		} else if (element instanceof ConnectorReceiversEditPart) {
			return receiverIcon;
		}
		IElementType etype = getElementType(getView(element));
		return etype == null ? null : ComponentsElementTypes.getImage(etype);
	}

	/**
	 * @generated
	 */
	private Object unwrap(Object element) {
		if (element instanceof IStructuredSelection) {
			return ((IStructuredSelection) element).getFirstElement();
		}
		return element;
	}

	/**
	 * @generated
	 */
	private View getView(Object element) {
		if (element instanceof View) {
			return (View) element;
		}
		if (element instanceof IAdaptable) {
			return (View) ((IAdaptable) element).getAdapter(View.class);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getElementType(View view) {
		// For intermediate views climb up the containment hierarchy to find the one associated with an element type.
		while (view != null) {
			int vid = ComponentsVisualIDRegistry.getVisualID(view);
			IElementType etype = ComponentsElementTypes.getElementType(vid);
			if (etype != null) {
				return etype;
			}
			view = view.eContainer() instanceof View ? (View) view.eContainer()
					: null;
		}
		return null;
	}

	/**
	 * @custom
	 */
	private IElementType getElementType(Object element) {
		//FIXME: how to obtain the element type when we don't have a view
		//		if (element instanceof EObject) {
		//			int vid = ComponentsVisualIDRegistry.getLinkWithClassVisualID((EObject)element);
		//			return 	ComponentsElementTypes.getElementType(ComponentsVisualIDRegistry.getDiagramVisualID((EObject)element));
		//		}else 
		return getElementType(getView(element));
	}

	/**
	 * @custom
	 */
	private EObject getDomainObject(Object element) {
		Object unwrappedElement = unwrap(element);
		if (unwrappedElement instanceof EObject)
			return (EObject) unwrappedElement;
		Object model = ((EditPart) element).getModel();
		if (model instanceof View) {
			return ((View) model).getElement();
		} else
			return null;
	}

}
