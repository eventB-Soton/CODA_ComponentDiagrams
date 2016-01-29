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
 * Initial Value property section for Connector.
 * 
 * @author cfsnook
 *
 */
public class InitialValuePropertySection extends AbstractTextPropertySection {

	@Override
	protected String getPropertyNameLabel() {
		return "Initial:";
	}

	@Override
	protected void setPropertyValue(EObject object, Object value) {
		assert object instanceof Connector;
		((Connector) object).setInitialValue((String) value);
	}

	@Override
	protected String getPropertyValueString() {
		return ((Connector) getEObject()).getInitialValue();
	}

	@Override
	protected String getPropertyChangeCommandName() {
		return "change initial value";
	}

	protected boolean isRodinKeyboard(){
		return true;
	}
	
}
