/*******************************************************************************
 *  (c) Crown owned copyright 2011, 2017 (UK Ministry of Defence)
 *  
 *  All rights reserved. This program and the accompanying materials  are 
 *  made available under the terms of the Eclipse Public License v1.0 which
 *  accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  This is to identify the UK Ministry of Defence as owners along with the
 *   license rights provided.
 *  
 *  Contributors:
 *  			University of Southampton - Initial implementation
 *******************************************************************************/
package ac.soton.eventb.emf.components.diagram.sheet.custom;

import org.eclipse.emf.ecore.EObject;

import ac.soton.eventb.emf.components.AbstractPort;
import ac.soton.eventb.emf.diagrams.sheet.AbstractTextPropertySection;

/**
 * Type property section for AbstractPort.
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
		assert object instanceof AbstractPort;
		((AbstractPort) object).setType((String)value);
	}

	@Override
	protected String getPropertyValueString() {
		return ((AbstractPort) getEObject()).getType();
	}

	@Override
	protected String getPropertyChangeCommandName() {
		return "change type";
	}

	protected boolean isRodinKeyboard(){
		return true;
	}
	
}
