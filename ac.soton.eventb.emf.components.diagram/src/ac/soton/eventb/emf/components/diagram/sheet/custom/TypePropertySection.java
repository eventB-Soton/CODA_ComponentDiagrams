/*
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.components.diagram.sheet.custom;

import org.eclipse.emf.ecore.EObject;

import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.emf.diagrams.sheet.AbstractTextPropertySection;

/**
 * Type property section for Connector.
 * 
 * @author cfsnook
 *
 */
public class TypePropertySection extends AbstractTextPropertySection {

	@Override
	protected String getPropertyNameLabel() {
		return "Type:";
	}

	@Override
	protected void setPropertyValue(EObject object, Object value) {
		assert object instanceof Connector;
		((Connector) object).setType((String)value);
	}

	@Override
	protected String getPropertyValueString() {
		return ((Connector) getEObject()).getType();
	}

	@Override
	protected String getPropertyChangeCommandName() {
		return "change type";
	}

	protected boolean isRodinKeyboard(){
		return true;
	}
	
}
