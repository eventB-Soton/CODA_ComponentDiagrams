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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.emf.translator.eventb.rules.AbstractEventBGeneratorRule;
import ac.soton.emf.translator.eventb.utils.Find;
import ac.soton.emf.translator.eventb.utils.Make;
import ac.soton.eventb.decomposition.DecompositionPackage;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentAxiom;
import ac.soton.eventb.emf.components.ComponentConstant;
import ac.soton.eventb.emf.components.ComponentInitialisation;
import ac.soton.eventb.emf.components.ComponentInvariant;
import ac.soton.eventb.emf.components.ComponentSet;
import ac.soton.eventb.emf.components.ComponentVariable;
import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.eventb.emf.components.util.ComponentsUtils;

public class ComponentRule extends AbstractEventBGeneratorRule implements IRule {

	protected static final EReference allocatedVariables = DecompositionPackage.Literals.ABSTRACT_REGION__ALLOCATED_VARIABLES;
	protected static final EReference allocatedExtensions = DecompositionPackage.Literals.ABSTRACT_REGION__ALLOCATED_EXTENSIONS;
	protected static final EAttribute machineName = DecompositionPackage.Literals.ABSTRACT_REGION__MACHINE_NAME;
	
	private Context context = null;
	
	@Override
	public boolean enabled(EObject sourceElement) throws Exception{
		assert(sourceElement instanceof Component);
		return true;
	}

	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> generatedElements) throws Exception{
		Machine machine = (Machine)((Component) sourceElement).getContaining(MachinePackage.Literals.MACHINE);
		Component rootComponent = (Component) ComponentsUtils.getRootComponent(sourceElement);
		context = (Context) Find.generatedElement(generatedElements,Find.project(machine),components,Strings.CTXT_NAME(rootComponent));
		return context!=null;
	}
	
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));
		Component cp = (Component) sourceElement;
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();
		
		Machine machine = (Machine)cp.getContaining(MachinePackage.Literals.MACHINE);
		
		//set up the components decomposition region data	
		ret.add(Make.descriptor(cp,machineName, cp.getName(), 0));
		ret.add(Make.descriptor(cp,allocatedExtensions, cp, -10));
		
		//generate users component variables 
		for (ComponentVariable v : cp.getVariables()){
			ret.add(Make.descriptor(machine,variables,Make.variable(Strings.USER_VARIABLE_NAME(v), v.getComment()),10));
			ret.add(Make.descriptor(cp, allocatedVariables, Make.variableProxyReference(machine, Strings.USER_VARIABLE_NAME(v)) , -10));
		}
		//generate users component invariants
		for (ComponentInvariant i : cp.getInvariants()){
			ret.add(Make.descriptor(machine,invariants,Make.invariant(Strings.USER_INVARIANT_NAME(i), i.isTheorem(), Strings.USER_INVARIANT_PRED(i), i.getComment()),10));				
		}		

		//generate users initialisation actions
		Event initialisationEvent = (Event) Find.named(machine.getEvents(), "INITIALISATION");
		for (ComponentInitialisation a : cp.getInitialisations()){
			ret.add(Make.descriptor(initialisationEvent,actions,Make.action(Strings.USER_INITIALISATION_NAME(a), Strings.USER_INITIALISATION_EXPR(a),a.getComment()),10));				
		}
		
		//generate users component sets 
		for (ComponentSet s : cp.getSets()){
			ret.add(Make.descriptor(context,sets,Make.set(Strings.USER_SET_NAME(s), s.getComment()),10));				
		}
		//generate users component constants 
		for (ComponentConstant c : cp.getConstants()){
			ret.add(Make.descriptor(context,constants,Make.constant(Strings.USER_CONSTANT_NAME(c), c.getComment()),10));				
		}
		//generate users component axioms
		for (ComponentAxiom a : cp.getAxioms()){
			ret.add(Make.descriptor(context,axioms,Make.axiom(Strings.USER_AXIOM_NAME(a), a.isTheorem(), Strings.USER_AXIOM_PRED(a), a.getComment()),10));				
		}	
		
		return ret;
	}

}
