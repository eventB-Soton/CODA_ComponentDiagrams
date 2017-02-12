/**
 * (c) Crown owned copyright (2015) (UK Ministry of Defence)
 * This work is licensed under a Creative Commons Attribution-NonCommercial-ShareAlike 4.0
 * International License
 *  
 * This is to identify the UK Ministry of Defence as owners along with the license rights provided. The
 * URL of the CC BY NC SA 4.0 International License is 
 * http://creativecommons.org/licenses/by-nc-sa/4.0/legalcode (Accessed 02-NOV-15).
 * 
 * Contributors:
 * 	University of Southampton - Initial implementation
 *  
*/
package ac.soton.eventb.emf.components.generator.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.eventb.decomposition.DecompositionPackage;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.WakeQueue;
import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.eventb.emf.diagrams.generator.AbstractRule;
import ac.soton.eventb.emf.diagrams.generator.GenerationDescriptor;
import ac.soton.eventb.emf.diagrams.generator.IRule;
import ac.soton.eventb.emf.diagrams.generator.utils.Find;
import ac.soton.eventb.emf.diagrams.generator.utils.Make;

public class WakeQueueRule extends AbstractRule implements IRule {

	protected static final EReference allocatedVariables = DecompositionPackage.Literals.ABSTRACT_REGION__ALLOCATED_EXTENSIONS;
	
	@Override
	public boolean enabled(EventBElement sourceElement) throws Exception{
		assert(sourceElement instanceof WakeQueue);
		return true;
	}
	
	@Override
	public List<GenerationDescriptor> fire(EventBElement sourceElement, List<GenerationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));
		WakeQueue wq = (WakeQueue) sourceElement;
		List<GenerationDescriptor> ret = new ArrayList<GenerationDescriptor>();
		Machine machine = (Machine)sourceElement.getContaining(MachinePackage.Literals.MACHINE);
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
