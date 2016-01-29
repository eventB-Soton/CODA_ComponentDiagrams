/*******************************************************************************
 * Copyright (c) 2006,2007,2008 University of Southampton and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package ac.soton.eventb.emf.components.diagram.sheet.custom;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eventb.emf.core.CorePackage;

import ac.soton.eventb.emf.components.ComponentConstant;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.diagrams.sheet.AbstractEditTablePropertySection;


/**
 * Component constants tab table property section.
 *
 * @author Colin Snook
 */

public class ComponentConstantsPropertySection extends AbstractEditTablePropertySection {



	@Override
	protected EReference getFeature() {
		return ComponentsPackage.eINSTANCE.getComponent_Constants();
	}

	@Override
	protected EStructuralFeature getFeatureForCol(final int col) {
		switch (col) {
		case 0 : return CorePackage.eINSTANCE.getEventBNamed_Name();
		case 1 : return CorePackage.eINSTANCE.getEventBCommented_Comment();
		default : return null;
		}
	}

	@Override
	protected int columnWidth(final int col){
		switch (col) {
		case 0 : return 150;	//name field
		case 1 : return 400;	//comment field
		default : return -1;	//unknown
		}
	}

	@Override
	protected String getLabelText() {
		return "constants";
	}

	/**
	 * This is overridden so that when a new constant is added it has a default name.
	 * Otherwise it appears like nothing happens when a new constant is added since all its fields are blank.
	 */
	
	protected Object getNewValue(){
		ComponentConstant newC = (ComponentConstant) super.getNewValue();
		newC.setName("<changeMe>");
		return newC;
	}
	
}