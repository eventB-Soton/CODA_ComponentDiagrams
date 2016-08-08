/*
 * Copyright (c) 2011-2014 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.components.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import ac.soton.eventb.emf.components.diagram.edit.parts.InPortEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SubcomponentInPortEditPart;
import ac.soton.eventb.emf.components.diagram.providers.ComponentsElementTypes;
import ac.soton.eventb.emf.components.diagram.providers.ComponentsModelingAssistantProvider;

/**
 * @generated
 */
public class ComponentsModelingAssistantProviderOfInPortEditPart extends
		ComponentsModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((InPortEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(InPortEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ComponentsElementTypes.AbstractInSenderDestinations_4009);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((InPortEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			InPortEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof InPortEditPart) {
			types.add(ComponentsElementTypes.AbstractInSenderDestinations_4009);
		}
		if (targetEditPart instanceof SubcomponentInPortEditPart) {
			types.add(ComponentsElementTypes.AbstractInSenderDestinations_4009);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((InPortEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(InPortEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ComponentsElementTypes.AbstractInSenderDestinations_4009) {
			types.add(ComponentsElementTypes.InPort_2007);
			types.add(ComponentsElementTypes.InPort_3019);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((InPortEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(InPortEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ComponentsElementTypes.AbstractInSenderDestinations_4009);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((InPortEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(InPortEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ComponentsElementTypes.AbstractInSenderDestinations_4009) {
			types.add(ComponentsElementTypes.Connector_2006);
			types.add(ComponentsElementTypes.InPort_2007);
			types.add(ComponentsElementTypes.InPort_3019);
		}
		return types;
	}

}
