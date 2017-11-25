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
import org.eclipse.jface.viewers.IFilter;
import org.eventb.emf.core.CorePackage;

import ac.soton.eventb.emf.components.AbstractComponentOperation;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.diagrams.sheet.AbstractEditTableWithDefaultNamingPropertySection;
import ac.soton.eventb.emf.diagrams.util.custom.DiagramUtils;


/**
 * Wakes tab table property section.
 *
 * @author cfs
 */

public class WakesPropertySection extends AbstractEditTableWithDefaultNamingPropertySection  {
	
	/**
	 * Element Filter for this property section.
	 */
	public static final class Filter implements IFilter {
		@Override
		public boolean select(Object toTest) {
			return DiagramUtils.unwrap(toTest) instanceof AbstractComponentOperation;
		}
	}
	
	@Override
	protected EReference getFeature() {
		return ComponentsPackage.eINSTANCE.getAbstractComponentOperation_Wakes();
	}

	@Override
	protected EStructuralFeature getFeatureForCol(final int col) {
		switch (col) {
		case 0 : return CorePackage.Literals.EVENT_BNAMED__NAME;
		case 1 : return ComponentsPackage.Literals.WAKE_EVENT__QUEUE;
		case 2 : return ComponentsPackage.Literals.WAKE_EVENT__DELAY_MIN;
		case 3 : return ComponentsPackage.Literals.WAKE_EVENT__DELAY_MAX;
		case 4 : return ComponentsPackage.Literals.WAKE_EVENT__WAKE_KIND;
		case 5 : return CorePackage.Literals.EVENT_BCOMMENTED__COMMENT;
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
		case 1 : return 100;	//queue
		case 2 : return 100;	//delay min
		case 3 : return 100;	//delay max
		case 4 : return 100;	//kind
		case 5 : return 400;	//comment
		default : return -1;	//unknown
		}
	}

	@Override
	protected List<String> getColumnLabelText(){
		List<String> labels = super.getColumnLabelText();
		labels.set(0, "Label");
		return labels;
	}
		
	@Override
	protected String getLabelText() {
		return "wake events";
	}
	
	@Override
	protected List<?> getPossibleValues(final int col){
		if (col==4){		
			return ComponentsPackage.eINSTANCE.getWakeKind().getELiterals();
		}else{
			return super.getPossibleValues(col);
		}
	}

}