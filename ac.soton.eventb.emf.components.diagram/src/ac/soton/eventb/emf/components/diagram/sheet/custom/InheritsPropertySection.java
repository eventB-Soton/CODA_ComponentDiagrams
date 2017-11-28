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

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.IFilter;
import org.eventb.emf.core.EventBNamed;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.eventb.emf.diagrams.sheet.AbstractEnumerationPropertySection;
import ac.soton.eventb.emf.diagrams.util.custom.DiagramUtils;

/**
 * Inherits property section.
 * This property section will work for any EventBNamed EventBObject element that has a feature called inherits.
 * (Nb. the inherits feature should be a function to the same meta class)
 * 
 * @author cfs
 *
 */
public class InheritsPropertySection extends AbstractEnumerationPropertySection {

	/**
	 * Element Filter for this property section.
	 */
	public static final class Filter implements IFilter {
		@Override
		public boolean select(Object toTest) {
			EObject unwrapped = DiagramUtils.unwrap(toTest);
			if (unwrapped instanceof EventBNamed && unwrapped instanceof EventBObject){
				return ((EventBObject)unwrapped).eClass().getEStructuralFeature("inherits") != null;
			}
			return false;
		}
	}

	@Override
	protected EStructuralFeature getFeature() {
		return eObject.eClass().getEStructuralFeature("inherits");
	}

	@Override
	protected String[] getEnumerationFeatureValues() {
		EList<EObject> elementsToInherit = getElementsToInherit();
		String[] values = new String[elementsToInherit.size()];
		int i = 0;
		for (EObject eObject : elementsToInherit) {
			values[i++] = eObject instanceof EventBNamed ? 
					 ((EventBNamed) eObject).getName() : "<unnamed>";
		}
		return values;
	}

	@Override
	protected String getFeatureAsText() {
		Object inheritedElement = eObject.eGet(getFeature(), true);
		return inheritedElement instanceof EventBNamed ? ((EventBNamed)inheritedElement).getName() : "";
	}

	@Override
	protected String getLabelText() {
		return "Inherits:";
	}

	@Override
	protected List<? extends Object> getAvailableDataElements() {
		return getElementsToInherit();
	}

	@SuppressWarnings("unchecked")
	private EList<EObject> getElementsToInherit(){
		if (eObject instanceof EventBObject){
			EventBObject container = ((EventBObject)eObject).getContaining(MachinePackage.Literals.MACHINE); //EcoreUtil.getRootContainer(eObject);
			if (container instanceof Machine) {
				EList<Machine> abstractMachines = ((Machine) container).getRefines();
				if (abstractMachines.size() > 0) {
					return abstractMachines.get(0).getAllContained(eObject.eClass(), true);
				}
			}
		}
		return (EList<EObject>) ECollections.EMPTY_ELIST;
	}

}
