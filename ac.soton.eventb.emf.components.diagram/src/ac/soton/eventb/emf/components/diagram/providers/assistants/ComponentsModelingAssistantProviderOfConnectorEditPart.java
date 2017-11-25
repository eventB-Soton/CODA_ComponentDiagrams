/*******************************************************************************
 * (c) Crown owned copyright (2017) (UK Ministry of Defence)
 *
 * All rights reserved. This program and the accompanying materials are 
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      University of Southampton - Initial API and implementation
 *******************************************************************************/
package ac.soton.eventb.emf.components.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import ac.soton.eventb.emf.components.diagram.edit.parts.ConnectorEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.InPortEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.OutPortEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SubcomponentInPortEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SubcomponentOutPortEditPart;
import ac.soton.eventb.emf.components.diagram.providers.ComponentsElementTypes;
import ac.soton.eventb.emf.components.diagram.providers.ComponentsModelingAssistantProvider;

/**
 * @generated
 */
public class ComponentsModelingAssistantProviderOfConnectorEditPart extends
		ComponentsModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ConnectorEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(ConnectorEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ComponentsElementTypes.AbstractOutReceiverSource_4008);
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
		return doGetRelTypesOnSourceAndTarget(
				(ConnectorEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			ConnectorEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof OutPortEditPart) {
			types.add(ComponentsElementTypes.AbstractOutReceiverSource_4008);
		}
		if (targetEditPart instanceof SubcomponentOutPortEditPart) {
			types.add(ComponentsElementTypes.AbstractOutReceiverSource_4008);
		}
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
		return doGetTypesForTarget((ConnectorEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(ConnectorEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ComponentsElementTypes.AbstractOutReceiverSource_4008) {
			types.add(ComponentsElementTypes.OutPort_2008);
			types.add(ComponentsElementTypes.OutPort_3020);
		} else if (relationshipType == ComponentsElementTypes.AbstractInSenderDestinations_4009) {
			types.add(ComponentsElementTypes.InPort_2007);
			types.add(ComponentsElementTypes.InPort_3019);
		}
		return types;
	}

}
