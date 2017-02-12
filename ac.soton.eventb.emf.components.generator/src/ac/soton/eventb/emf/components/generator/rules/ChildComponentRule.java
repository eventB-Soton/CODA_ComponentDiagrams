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
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.eventb.decomposition.DecompositionPackage;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.util.ComponentsUtils;
import ac.soton.eventb.emf.diagrams.generator.AbstractRule;
import ac.soton.eventb.emf.diagrams.generator.GenerationDescriptor;
import ac.soton.eventb.emf.diagrams.generator.IRule;
import ac.soton.eventb.emf.diagrams.generator.utils.Make;
import ac.soton.eventb.statemachines.State;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.StatemachinesPackage;
import ac.soton.eventb.statemachines.TranslationKind;

public class ChildComponentRule extends AbstractRule implements IRule {

	protected static final EReference allocatedVariables = DecompositionPackage.Literals.ABSTRACT_REGION__ALLOCATED_EXTENSIONS;
	protected static final EReference allocatedExtensions = DecompositionPackage.Literals.ABSTRACT_REGION__ALLOCATED_EXTENSIONS;
	protected static final EAttribute machineName = DecompositionPackage.Literals.ABSTRACT_REGION__MACHINE_NAME;

	/**
	 * This rule updates the region details of a component
	 * Currently it just sets the machine name and adds the component to the Allocated Extensions
	 * In future it could set the project name and/or context name
	 * Allocated variables are done as the variables are created by other rules
	 *	
	 */
	
	@Override
	public boolean enabled(EventBElement sourceElement) throws Exception{
		assert(sourceElement instanceof Component);
		return sourceElement != ComponentsUtils.getRootComponent(sourceElement);
	}
	
	@Override
	public List<GenerationDescriptor> fire(EventBElement sourceElement, List<GenerationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));
		Component cp = (Component) sourceElement;
		Machine machine = (Machine)sourceElement.getContaining(MachinePackage.Literals.MACHINE);
		List<GenerationDescriptor> ret = new ArrayList<GenerationDescriptor>();
		
		//set up the components decomposition region data	
		ret.add(Make.descriptor(cp,machineName, cp.getName(), 0));
		ret.add(Make.descriptor(cp,allocatedExtensions, cp, -10));
		
		//allocate variables for any contained statemachines (as these are not allocated by the state-machine generator rules
		for (EObject eo : cp.eContents()){
			if (eo instanceof Statemachine){
				Statemachine rootsm = (Statemachine)eo;
				TranslationKind tk = rootsm.getTranslation();
				ret.addAll(getStatemachineVariables(cp, machine, rootsm, tk));
			}
		}
		return ret;
	}

	private Collection<? extends GenerationDescriptor> getStatemachineVariables(Component cp, Machine machine, Statemachine sm, TranslationKind tk) {
		List<GenerationDescriptor> ret = new ArrayList<GenerationDescriptor>();
		if (tk == TranslationKind.SINGLEVAR){
			ret.add(Make.descriptor(cp, allocatedVariables, Make.variableProxyReference(machine, sm.getName()) , -10));
		}else{
			for (EObject state : sm.getAllContained(StatemachinesPackage.Literals.STATE, true)){
				if (state instanceof State){
					ret.add(Make.descriptor(cp, allocatedVariables, Make.variableProxyReference(machine, ((State)state).getName()) , -10));							
				}
			}
		}
		for (EObject eo : sm.eContents()){
			if (eo instanceof Statemachine){
				ret.addAll(getStatemachineVariables(cp, machine, (Statemachine)eo, tk));
			}
		}
		return ret;
	}
	
}
