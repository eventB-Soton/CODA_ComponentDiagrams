/*******************************************************************************
 * Copyright (c) 2011 University of Southampton and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package ac.soton.eventb.emf.components.diagram.sheet.custom;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBObject;

import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.emf.diagrams.sheet.AbstractEditTableWithDefaultNamingPropertySection;


/**
 * Port Sends tab table property section.
 *
 * @author cfs
 */

public class PortSendsPropertySection extends AbstractEditTableWithDefaultNamingPropertySection {

	@Override
	protected EReference getFeature() {
		return ComponentsPackage.eINSTANCE.getAbstractComponentOperation_Sends();
	}

	@Override
	protected EStructuralFeature getFeatureForCol(final int col) {
		switch (col) {
		case 0 : return CorePackage.eINSTANCE.getEventBNamed_Name();
		case 1 : return ComponentsPackage.eINSTANCE.getDataPacket_Connector();
		case 2 : return ComponentsPackage.eINSTANCE.getDataPacket_Value();
		case 3 : return ComponentsPackage.eINSTANCE.getDelayedDataPacket_Delay();
		case 4 : return CorePackage.eINSTANCE.getEventBCommented_Comment();
		default : return null;
		}
	}

	@Override
	protected boolean isRodinKeyboard(final int col) {
		return col==2 || col==3 ? true : false;
	}
	
	@Override
	protected int columnWidth(final int col){
		switch (col) {
		case 0 : return 160;	//name
		case 1 : return 100;	//connector field
		case 2 : return 100;	//value field
		case 3 : return 50;		//delay field
		case 4 : return 400;	//comment field
		default : return -1;	//unknown
		}
	}

	@Override
	protected String getLabelText() {
		return "sends";
	}
	
	
	@Override
	protected List<String> getColumnLabelText(){
		List<String> labels = super.getColumnLabelText();
		labels.set(0, "Label");
		return labels;
	}
		
		
	@Override
	protected List<?> getPossibleValues(final int col){
		if (col==1){
			List<Connector> validOutConnectors = new ArrayList<Connector>();
			EventBObject container = owner.getContaining(ComponentsPackage.eINSTANCE.getComponent());
			while (container instanceof Component){
				validOutConnectors.addAll(((Component) container).getOutConnectors());
				container = ((EventBObject)container.eContainer()).getContaining(ComponentsPackage.eINSTANCE.getComponent());
			}
			return validOutConnectors;
		}else{
			return super.getPossibleValues(col);
		}
	}

}