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
package ac.soton.eventb.emf.components.diagram.sheet.custom;

import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eventb.emf.core.CorePackage;

import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.diagrams.sheet.AbstractEditTableWithDefaultNamingPropertySection;


/**
 * Component invariants tab table property section.
 *
 * @author Colin Snook
 */


public class ComponentInvariantsPropertySection extends AbstractEditTableWithDefaultNamingPropertySection {

	@Override
	protected EReference getFeature() {
		return ComponentsPackage.eINSTANCE.getComponent_Invariants();
	}

	@Override
	protected EStructuralFeature getFeatureForCol(final int col) {
		switch (col) {
		case 0 : return CorePackage.eINSTANCE.getEventBNamed_Name();
		case 1 : return CorePackage.eINSTANCE.getEventBDerived_Theorem();
		case 2 : return CorePackage.eINSTANCE.getEventBPredicate_Predicate();
		case 3 : return CorePackage.eINSTANCE.getEventBCommented_Comment();
		default : return null;
		}
	}

	@Override
	protected boolean isRodinKeyboard(final int col) {
		return col==2 ? true : false;
	}
	
	@Override
	protected int columnWidth(final int col){
		switch (col) {
		case 0 : return 160;	//name
		case 1 : return 60;		//theorem field
		case 2 : return 600;	//predicate field
		case 3 : return 400;	//comment field
		default : return -1;	//unknown
		}
	}

	@Override
	protected String getLabelText() {
		return "invariants";
	}
	
	
	@Override
	protected List<String> getColumnLabelText(){
		List<String> labels = super.getColumnLabelText();
		return labels;
	}
		
		
	@Override
	protected List<?> getPossibleValues(final int col){
//		if (col==1){
//			Component container = (Component) owner.getContaining(ComponentsPackage.eINSTANCE.getComponent());
//			return container.getOutConnectors();
//		}else{
			return super.getPossibleValues(col);
//		}
	}

}
