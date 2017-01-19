/*
 * Copyright (c) 2011-2014 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.components.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import ac.soton.eventb.emf.components.diagram.providers.ComponentsElementTypes;
import ac.soton.eventb.emf.components.diagram.providers.ComponentsModelingAssistantProvider;

/**
 * @generated
 */
public class ComponentsModelingAssistantProviderOfComponentDiagramEditPart
		extends ComponentsModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(13);
		types.add(ComponentsElementTypes.Component_2005);
		types.add(ComponentsElementTypes.Connector_2006);
		types.add(ComponentsElementTypes.InPort_2007);
		types.add(ComponentsElementTypes.OutPort_2008);
		types.add(ComponentsElementTypes.PortWake_2010);
		types.add(ComponentsElementTypes.SelfWake_2011);
		types.add(ComponentsElementTypes.Method_2012);
		types.add(ComponentsElementTypes.External_2013);
		types.add(ComponentsElementTypes.Transition_2014);
		types.add(ComponentsElementTypes.WakeQueue_2009);
		types.add(ComponentsElementTypes.Statemachine_2015);
		types.add(ComponentsElementTypes.Statemachine_2016);
		types.add(ComponentsElementTypes.Statemachine_2017);
		return types;
	}

}
