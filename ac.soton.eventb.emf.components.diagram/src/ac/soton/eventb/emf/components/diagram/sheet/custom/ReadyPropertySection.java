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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.IFilter;

import ac.soton.eventb.decomposition.AbstractRegion;
import ac.soton.eventb.decomposition.DecompositionPackage;
import ac.soton.eventb.emf.diagrams.sheet.AbstractBooleanEnumerationPropertySection;
import ac.soton.eventb.emf.diagrams.util.custom.DiagramUtils;

/**
 * Ready property section.
 * This property section will work for any AbstractRegion element 
 * 
 * @author cfs
 *
 */
public class ReadyPropertySection extends AbstractBooleanEnumerationPropertySection {

	/**
	 * Element Filter for this property section.
	 */
	public static final class Filter implements IFilter {
		@Override
		public boolean select(Object toTest) {
			return DiagramUtils.unwrap(toTest) instanceof AbstractRegion;
		}
	}

	@Override
	protected String getFeatureAsText() {
		return Boolean.toString(((AbstractRegion)(eObject)).isReady());
	}

	@Override
	protected String getLabelText() {
		return "Decompose:";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return DecompositionPackage.Literals.ABSTRACT_REGION__READY;
	}

}
