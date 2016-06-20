/*******************************************************************************
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package ac.soton.eventb.emf.components.navigator.refiner;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.statemachines.navigator.refiner.StatemachineElementRefiner;

/**
 * Component Element Refiner 
 * 
 * @author cfsnook
 *
 */
public class ComponentElementRefiner extends StatemachineElementRefiner {

	/**
	 * populate the given list with the meta-classes that the refiner needs to filter out
	 *  from the copy for component refinement.
	 * These are the sets, constants, axioms, invariants and witnesses
	 */
	@Override
	protected void populateFilterByTypeList(final List<EClass> filterList){
		super.populateFilterByTypeList(filterList);
		filterList.add(ComponentsPackage.Literals.COMPONENT_SET);
		filterList.add(ComponentsPackage.Literals.COMPONENT_CONSTANT);
		filterList.add(ComponentsPackage.Literals.COMPONENT_AXIOM);
		filterList.add(ComponentsPackage.Literals.COMPONENT_INVARIANT);
		filterList.add(ComponentsPackage.Literals.OPERATION_WITNESS);
	}
	
	/**
	 * populate the given map with the reference features that the refiner needs to copy for component refinement.
	 * This is refines, inherits (as references to their abstract counterparts) and
	 * elaborates, sender, receivers and connector (as intra-level references) 
	 */
	@Override
	protected void populateReferenceMap(final Map<EReference,RefHandling> referencemap){
		super.populateReferenceMap(referencemap);
		referencemap.put(ComponentsPackage.Literals.COMPONENT__REFINES, RefHandling.CHAIN);
		referencemap.put(ComponentsPackage.Literals.CONNECTOR__INHERITS, RefHandling.CHAIN);	
		referencemap.put(ComponentsPackage.Literals.ABSTRACT_PORT__INHERITS, RefHandling.CHAIN);
		referencemap.put(ComponentsPackage.Literals.WAKE_QUEUE__REFINES, RefHandling.CHAIN);
		referencemap.put(ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__REFINES, RefHandling.CHAIN);	
		referencemap.put(ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__ELABORATES, RefHandling.EQUIV);
		referencemap.put(ComponentsPackage.Literals.CONNECTOR__SEND_PORT, RefHandling.EQUIV);
		referencemap.put(ComponentsPackage.Literals.CONNECTOR__RECEIVE_PORTS, RefHandling.EQUIV);
		referencemap.put(ComponentsPackage.Literals.IN_PORT__IN_CONNECTOR, RefHandling.EQUIV);
		referencemap.put(ComponentsPackage.Literals.OUT_PORT__OUT_CONNECTOR, RefHandling.EQUIV);
		referencemap.put(ComponentsPackage.Literals.ABSTRACT_DATA_PACKET__PORT, RefHandling.EQUIV);
		referencemap.put(ComponentsPackage.Literals.SELF_WAKE__QUEUE, RefHandling.EQUIV);
		referencemap.put(ComponentsPackage.Literals.WAKE_EVENT__QUEUE, RefHandling.EQUIV);
	}
	
}
