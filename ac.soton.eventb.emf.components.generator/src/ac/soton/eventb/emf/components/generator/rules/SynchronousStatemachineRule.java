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
import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.eventb.emf.components.util.ComponentsUtils;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.emf.translator.eventb.utils.Find;
import ac.soton.emf.translator.eventb.utils.Make;
import ac.soton.eventb.statemachines.Statemachine;

public class SynchronousStatemachineRule extends AbstractSynchronousStatemachineRule  implements IRule {

	protected static final EReference allocatedVariables = DecompositionPackage.Literals.ABSTRACT_REGION__ALLOCATED_VARIABLES;

	private Event timerEvent = null;
	
	@Override
	public boolean enabled(EObject sourceElement) throws Exception {
		assert(sourceElement instanceof Statemachine);
		return super.enabled(sourceElement) &&
				rootSm == sourceElement;		//a top level synchronous state machine of a component
	}
		
	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> generatedElements) throws Exception{
		Machine machine = (Machine)((Statemachine)sourceElement).getContaining(MachinePackage.Literals.MACHINE);
		Component root = (Component) ComponentsUtils.getRootComponent(sourceElement);
		timerEvent = (Event) Find.generatedElement(generatedElements,machine,events,Strings.TE_NAME(root));
		return timerEvent!=null;
	}
	
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));
		if (!dependenciesOK(sourceElement,generatedElements)) throw new Exception("rule fired before dependencies available (sourceElement:"+sourceElement+", rule:"+SynchronousStatemachineRule.class+")");
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();

		//find the machine 
		Machine machine = (Machine)((Statemachine)sourceElement).getContaining(MachinePackage.Literals.MACHINE);
		Component component = (Component)((Statemachine)sourceElement).getContaining(ComponentsPackage.Literals.COMPONENT);
		Event initialisation = (Event) Find.named(machine.getEvents(), "INITIALISATION");
		
		//create the enabler flag for this state-machine
		ret.add(Make.descriptor(machine,variables,Make.variable(Strings.ENBLSM_NAME(rootSm), "enable flag for statemachine"),5));
		ret.add(Make.descriptor(component, allocatedVariables, Make.variableProxyReference(machine, Strings.ENBLSM_NAME(rootSm)) , -10));

		ret.add(Make.descriptor(machine,invariants,Make.invariant(Strings.ENBLSM_TYPE_NAME(rootSm), Strings.ENBLSM_TYPE_PRED(rootSm),""),5));
		ret.add(Make.descriptor(initialisation,actions,Make.action(Strings.ENBLSM_ACTION_NAME(rootSm), Strings.ENBLSM_FALSE_EXPR(rootSm)),5));
		
		
		//create the synch flag for this state-machine
		ret.add(Make.descriptor(machine,variables,Make.variable(Strings.SYNCSM_NAME(rootSm), "synch flag for statemachine"),5));
		ret.add(Make.descriptor(component, allocatedVariables, Make.variableProxyReference(machine, Strings.SYNCSM_NAME(rootSm)) , -10));

		ret.add(Make.descriptor(machine,invariants,Make.invariant(Strings.SYNCSM_TYPE_NAME(rootSm), Strings.SYNCSM_TYPE_PRED(rootSm),""),5));
		ret.add(Make.descriptor(initialisation,actions,Make.action(Strings.SYNCSM_ACTION_NAME(rootSm), Strings.SYNCSM_FALSE_EXPR(rootSm)),5));
		
		//guard for state-machine enabled => synch in timer event
		ret.add(Make.descriptor(timerEvent,guards,Make.guard(Strings.TIMER_SYNCHSM_GUARD_NAME(rootSm), Strings.TIMER_SYNCHSM_GUARD_PRED(rootSm)),5));	
		//reset state-machine synch in timer event
		ret.add(Make.descriptor(timerEvent,actions,Make.action(Strings.SYNCSM_ACTION_NAME(rootSm), Strings.SYNCSM_FALSE_EXPR(rootSm)),5));		
		
		//finished
		return ret;
	}


}
