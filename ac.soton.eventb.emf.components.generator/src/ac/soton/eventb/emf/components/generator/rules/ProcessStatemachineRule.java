/*******************************************************************************
 *  (c) Crown owned copyright 2011, 2017 (UK Ministry of Defence)
 *  
 *  All rights reserved. This program and the accompanying materials  are 
 *  made available under the terms of the Eclipse Public License v1.0 which
 *  accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  This is to identify the UK Ministry of Defence as owners along with the
 *   license rights provided.
 *  
 *  Contributors:
 *  			University of Southampton - Initial implementation
 *******************************************************************************/
package ac.soton.eventb.emf.components.generator.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.eventb.decomposition.DecompositionPackage;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.eventb.emf.components.util.ComponentsUtils;
import ac.soton.eventb.emf.diagrams.generator.GenerationDescriptor;
import ac.soton.eventb.emf.diagrams.generator.IRule;
import ac.soton.eventb.emf.diagrams.generator.utils.Find;
import ac.soton.eventb.emf.diagrams.generator.utils.Make;
import ac.soton.eventb.statemachines.Statemachine;

public class ProcessStatemachineRule extends AbstractProcessStatemachineRule  implements IRule {
	
	protected static final EReference allocatedVariables = DecompositionPackage.Literals.ABSTRACT_REGION__ALLOCATED_VARIABLES;
	
	protected static final EClass component = ComponentsPackage.Literals.COMPONENT;
	
	private Event timerEvent = null;
	
	@Override
	public boolean enabled(EventBElement sourceElement) throws Exception {
		assert(sourceElement instanceof Statemachine);
		return super.enabled(sourceElement) &&
				rootSm == sourceElement;		//a top level process state machine of a component
	}
		
	@Override
	public boolean dependenciesOK(EventBElement sourceElement, List<GenerationDescriptor> generatedElements) throws Exception{
		Machine machine = (Machine)sourceElement.getContaining(MachinePackage.Literals.MACHINE);
		Component root = (Component) ComponentsUtils.getRootComponent(sourceElement);
		timerEvent = (Event) Find.generatedElement(generatedElements,machine,events,Strings.TE_NAME(root));
		return timerEvent!=null;
	}
	
	@Override
	public List<GenerationDescriptor> fire(EventBElement sourceElement, List<GenerationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));
		if (!dependenciesOK(sourceElement,generatedElements)) throw new Exception("rule fired before dependencies available (sourceElement:"+sourceElement+", rule:"+ProcessStatemachineRule.class+")");
		List<GenerationDescriptor> ret = new ArrayList<GenerationDescriptor>();

		//find the machine 
		Machine machine = (Machine)sourceElement.getContaining(MachinePackage.Literals.MACHINE);
		Event initialisation = (Event) Find.named(machine.getEvents(), "INITIALISATION");
		
		//create the enabler flag for this state-machine
		ret.add(Make.descriptor(machine,variables,Make.variable(Strings.ENBLSM_NAME(rootSm), "enable flag for statemachine"),5));
		ret.add(Make.descriptor((Component)rootSm.getContaining(component), allocatedVariables, Make.variableProxyReference(machine, Strings.ENBLSM_NAME(rootSm)) , -10));

		ret.add(Make.descriptor(machine,invariants,Make.invariant(Strings.ENBLSM_TYPE_NAME(rootSm), Strings.ENBLSM_TYPE_PRED(rootSm),""),5));
		ret.add(Make.descriptor(initialisation,actions,Make.action(Strings.ENBLSM_ACTION_NAME(rootSm), Strings.ENBLSM_FALSE_EXPR(rootSm)),5));
		
		//guard for state-machine enabled in timer event
		ret.add(Make.descriptor(timerEvent,guards,Make.guard(Strings.ENBLSM_GUARD_NAME(rootSm), Strings.ENBLSM_FALSE_PRED(rootSm)),5));	
		
		//finished
		return ret;
	}


}
