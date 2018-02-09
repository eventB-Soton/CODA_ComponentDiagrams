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
package ac.soton.eventb.emf.components.generator.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EObject;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.eventb.decomposition.DecompositionPackage;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.WakeQueue;
import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.emf.translator.eventb.rules.AbstractEventBGeneratorRule;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.emf.translator.eventb.utils.Find;
import ac.soton.emf.translator.eventb.utils.Make;

public class WakeQueueRule extends AbstractEventBGeneratorRule implements IRule {

	protected static final EReference allocatedVariables = DecompositionPackage.Literals.ABSTRACT_REGION__ALLOCATED_VARIABLES;
	
	@Override
	public boolean enabled(EObject sourceElement) throws Exception{
		assert(sourceElement instanceof WakeQueue);
		return true;
	}
	
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));
		WakeQueue wq = (WakeQueue) sourceElement;
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();
		Machine machine = (Machine)wq.getContaining(MachinePackage.Literals.MACHINE);
		Component component = (Component)wq.getContaining(ComponentsPackage.Literals.COMPONENT);
		Event initialisation = (Event) Find.named(machine.getEvents(), "INITIALISATION");
		ret.add(Make.descriptor(machine,variables,Make.variable(Strings.WU_NAME(wq), "wakequeue"),3));
		ret.add(Make.descriptor(component, allocatedVariables, Make.variableProxyReference(machine, Strings.WU_NAME(wq)) , -10));
		
		ret.add(Make.descriptor(machine,variables,Make.variable(Strings.WU_MAX_NAME(wq), "wakequeue_max"),3));
		ret.add(Make.descriptor(component, allocatedVariables, Make.variableProxyReference(machine, Strings.WU_MAX_NAME(wq)) , -10));

		ret.add(Make.descriptor(initialisation,actions,Make.action(Strings.WU_INIT_NAME(wq), Strings.WU_INIT_EXPR(wq), ""),3));
		ret.add(Make.descriptor(initialisation,actions,Make.action(Strings.WU_MAX_INIT_NAME(wq), Strings.WU_MAX_INIT_EXPR(wq), ""),3));
		if (wq.getRefines() == null || !wq.getName().equals(wq.getRefines().getName())){
			ret.add(Make.descriptor(machine,invariants,Make.invariant(Strings.WU_TYPE_NAME(wq), Strings.WU_TYPE_PRED(wq),""),3));
			ret.add(Make.descriptor(machine,invariants,Make.invariant(Strings.WU_MAX_TYPE_NAME(wq), Strings.WU_MAX_TYPE_PRED(wq),""),3));
			ret.add(Make.descriptor(machine,invariants,Make.invariant(Strings.WU_HELPER_NAME(wq), Strings.WU_HELPER_PRED(wq),""),4)); //must be after the type
		}
		if (wq.getRefines() != null && !wq.getName().equals(wq.getRefines().getName())){
			//FIXME: Need to generate a gluing invariant here to express: min >= abstract min, refined max =< abstract max
		}
		return ret;
	}

}
