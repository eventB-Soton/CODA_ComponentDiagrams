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
public class ComponentsModelingAssistantProviderOfComponentEditPart extends
		ComponentsModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(12);
		types.add(ComponentsElementTypes.InPort_3019);
		types.add(ComponentsElementTypes.OutPort_3020);
		types.add(ComponentsElementTypes.Statemachine_3015);
		types.add(ComponentsElementTypes.Statemachine_3016);
		types.add(ComponentsElementTypes.Statemachine_3017);
		types.add(ComponentsElementTypes.PortWake_3008);
		types.add(ComponentsElementTypes.SelfWake_3009);
		types.add(ComponentsElementTypes.Method_3010);
		types.add(ComponentsElementTypes.External_3013);
		types.add(ComponentsElementTypes.Transition_3014);
		types.add(ComponentsElementTypes.Component_3012);
		types.add(ComponentsElementTypes.WakeQueue_3018);
		return types;
	}

}
