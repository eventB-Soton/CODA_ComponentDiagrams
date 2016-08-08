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

import ac.soton.eventb.emf.components.diagram.edit.parts.OutPortEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SubcomponentOutPortEditPart;
import ac.soton.eventb.emf.components.diagram.providers.ComponentsElementTypes;
import ac.soton.eventb.emf.components.diagram.providers.ComponentsModelingAssistantProvider;

/**
 * @generated
 */
public class ComponentsModelingAssistantProviderOfOutPortEditPart extends
		ComponentsModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((OutPortEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(OutPortEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ComponentsElementTypes.AbstractOutReceiverSource_4008);
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
		return doGetRelTypesOnSourceAndTarget((OutPortEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			OutPortEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof OutPortEditPart) {
			types.add(ComponentsElementTypes.AbstractOutReceiverSource_4008);
		}
		if (targetEditPart instanceof SubcomponentOutPortEditPart) {
			types.add(ComponentsElementTypes.AbstractOutReceiverSource_4008);
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
		return doGetTypesForTarget((OutPortEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(OutPortEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ComponentsElementTypes.AbstractOutReceiverSource_4008) {
			types.add(ComponentsElementTypes.OutPort_2008);
			types.add(ComponentsElementTypes.OutPort_3020);
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
		return doGetRelTypesOnTarget((OutPortEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(OutPortEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ComponentsElementTypes.AbstractOutReceiverSource_4008);
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
		return doGetTypesForSource((OutPortEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(OutPortEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ComponentsElementTypes.AbstractOutReceiverSource_4008) {
			types.add(ComponentsElementTypes.Connector_2006);
			types.add(ComponentsElementTypes.OutPort_2008);
			types.add(ComponentsElementTypes.OutPort_3020);
		}
		return types;
	}

}
