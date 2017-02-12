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

import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentAxiom;
import ac.soton.eventb.emf.components.ComponentConstant;
import ac.soton.eventb.emf.components.ComponentInitialisation;
import ac.soton.eventb.emf.components.ComponentInvariant;
import ac.soton.eventb.emf.components.ComponentSet;
import ac.soton.eventb.emf.components.ComponentVariable;
import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.eventb.emf.components.util.ComponentsUtils;
import ac.soton.eventb.emf.diagrams.generator.AbstractRule;
import ac.soton.eventb.emf.diagrams.generator.GenerationDescriptor;
import ac.soton.eventb.emf.diagrams.generator.IRule;
import ac.soton.eventb.emf.diagrams.generator.utils.Find;
import ac.soton.eventb.emf.diagrams.generator.utils.Make;

public class ComponentRule extends AbstractRule implements IRule {

	private Context context = null;
	
	@Override
	public boolean enabled(EventBElement sourceElement) throws Exception{
		assert(sourceElement instanceof Component);
		return true;
	}

	@Override
	public boolean dependenciesOK(EventBElement sourceElement, List<GenerationDescriptor> generatedElements) throws Exception{
		Machine machine = (Machine)sourceElement.getContaining(MachinePackage.Literals.MACHINE);
		Component rootComponent = (Component) ComponentsUtils.getRootComponent(sourceElement);
		context = (Context) Find.generatedElement(generatedElements,Find.project(machine),components,Strings.CTXT_NAME(rootComponent));
		return context!=null;
	}
	
	@Override
	public List<GenerationDescriptor> fire(EventBElement sourceElement, List<GenerationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));
		Component cp = (Component) sourceElement;
		List<GenerationDescriptor> ret = new ArrayList<GenerationDescriptor>();
		
		Machine machine = (Machine)sourceElement.getContaining(MachinePackage.Literals.MACHINE);
		
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
