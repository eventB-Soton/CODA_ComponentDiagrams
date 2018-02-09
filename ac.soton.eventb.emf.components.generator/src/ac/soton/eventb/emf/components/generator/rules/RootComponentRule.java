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
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.Attribute;
import org.eventb.emf.core.AttributeType;
import org.eventb.emf.core.CoreFactory;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.Project;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.ContextPackage;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.core.machine.Variable;
import ac.soton.eventb.decomposition.AbstractRegion;
import ac.soton.eventb.decomposition.DecompositionPackage;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.eventb.emf.components.util.ComponentsUtils;
import ac.soton.emf.translator.eventb.rules.AbstractEventBGeneratorRule;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.emf.translator.eventb.utils.Find;
import ac.soton.emf.translator.eventb.utils.Make;

public class RootComponentRule extends AbstractEventBGeneratorRule  implements IRule {

	protected static final EReference components = CorePackage.Literals.PROJECT__COMPONENTS;
	protected static final EReference sees = MachinePackage.Literals.MACHINE__SEES;
	protected static final EReference sets = ContextPackage.Literals.CONTEXT__SETS;
	protected static final EReference constants = ContextPackage.Literals.CONTEXT__CONSTANTS;
	protected static final EReference axioms = ContextPackage.Literals.CONTEXT__AXIOMS;
	protected static final EReference allocatedVariables = DecompositionPackage.Literals.ABSTRACT_REGION__ALLOCATED_VARIABLES;
	private static final String UNIVERSAL_VARIABLE_ATTRIBUTE_ID = "ac.soton.eventb.emf.decomposition.generator.universalVariable";
			
	@Override
	public boolean enabled(EObject sourceElement) throws Exception{
		assert(sourceElement instanceof Component);
		return sourceElement == ComponentsUtils.getRootComponent(sourceElement);	//!(sourceElement.eContainer().eClass().getEPackage().equals(ComponentsPackage.eINSTANCE)) ;
	}

	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));
		Component rootComponent = (Component) sourceElement;
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();
		
		Machine machine = (Machine)rootComponent.getContaining(MachinePackage.Literals.MACHINE);
		ret.addAll(removeAllocatedVariables(machine, rootComponent));
		
		Event initialisation = (Event) Find.named(machine.getEvents(), "INITIALISATION");
		//make the current time variable
		Variable currentTimeVar = Make.variable(Strings.CT_NAME(rootComponent), "current time for component");
		// add an attribute to indicate this is a variable that can be shared by components
		Attribute shared =   CoreFactory.eINSTANCE.createAttribute();
		shared.setValue(Strings.CT_NAME(rootComponent));
		shared.setType(AttributeType.STRING);
		currentTimeVar.getAttributes().put(UNIVERSAL_VARIABLE_ATTRIBUTE_ID ,shared);
		// add the current time variable to the machine
		ret.add(Make.descriptor(machine,variables,currentTimeVar,1));
		// allocate the current time variable to the root component and all sub component regions
		ret.add(Make.descriptor(rootComponent, allocatedVariables, Make.variableProxyReference(machine, Strings.CT_NAME(rootComponent)) , -10));
		ret.addAll(allocateVariableToAllRegions(machine, rootComponent,Strings.CT_NAME(rootComponent)));
		
		ret.add(Make.descriptor(machine,invariants,Make.invariant(Strings.CT_TYPE_NAME(rootComponent), Strings.CT_TYPE_PRED(rootComponent),""),1));
		ret.add(Make.descriptor(initialisation,actions,Make.action(Strings.CT_INIT_NAME(rootComponent), Strings.CT_INIT_EXPR(rootComponent), ""),1));
		
//		ret.add(Make.descriptor(machine,variables,Make.variable(Strings.ST_NAME(cp), "synch time for component"),10));
//		ret.add(Make.descriptor(machine,invariants,Make.invariant(Strings.ST_TYPE_NAME(cp), Strings.ST_TYPE_PRED(cp),""),10));
//		ret.add(Make.descriptor(initialisation, actions,Make.action(Strings.ST_INIT_NAME(cp), Strings.ST_INIT_EXPR(cp), ""),10));

		Event timerEvent = (Event)Make.event(Strings.TE_NAME(rootComponent));
		//if this root component refines one in an abstract machine, set timer event refines
		if (rootComponent.getRefines() != null){
			timerEvent.getRefinesNames().add(timerEvent.getName());
		}
		ret.add(Make.descriptor(machine, events, timerEvent,-10)); //-10 = near end
//		ret.add(Make.descriptor(timerEvent, parameters, Make.parameter(Strings.TE_PARAM_NAME(cp), ""),10));
//		ret.add(Make.descriptor(timerEvent, guards, Make.guard(Strings.TE_GD1_NAME(cp), Strings.TE_GD1_PRED(cp)),10));
//		ret.add(Make.descriptor(timerEvent, guards, Make.guard(Strings.TE_GD2_NAME(cp),Strings.TE_GD2_PRED(cp)),10));
		
		ret.add(Make.descriptor(timerEvent, actions, Make.action(Strings.TE_INC_TIME_NAME(rootComponent),Strings.TE_INC_TIME_EXPR(rootComponent), ""),1));
//		ret.add(Make.descriptor(timerEvent, actions, Make.action(Strings.TE_AC2_NAME(cp),Strings.TE_AC2_EXPR(cp), ""),10));

		// make a seen context and use it to define the enumerated set for Wake kinds
		Project project = Find.project(machine);
		Context context = (Context)Make.context(Strings.CTXT_NAME(rootComponent), "");
		ret.add(Make.descriptor(project, components, context,1));
		ret.add(Make.descriptor(machine, sees, context,1));
		
		//if this root component refines one in an abstract machine,
			// extend the corresponding context of the refined component
		if (rootComponent.getRefines() != null){
			ret.add(Make.descriptor(context, ContextPackage.Literals.CONTEXT__EXTENDS_NAMES, Strings.CTXT_NAME(rootComponent.getRefines()),1));
		}else{
			// most abstract component must define wake kinds in its context
			ret.add(Make.descriptor(context, sets, Make.set(Strings.WK_NAME(rootComponent), "wake up kinds"),1));
			ret.add(Make.descriptor(context, constants, Make.constant(Strings.WK_NULLEVENT_NAME(rootComponent), "wake up kind: nullEvent"),1));
			ret.add(Make.descriptor(context, constants, Make.constant(Strings.WK_ADDEVENT_NAME(rootComponent), "wake up kind: addEvent"),1));
			ret.add(Make.descriptor(context, axioms, Make.axiom(Strings.WK_ENUM_NAME(rootComponent), Strings.WK_ENUM_PRED(rootComponent), ""),1));			
		}
		return ret;
	}

	/**
	 * removes all the allocated variable references from abstract regions as they
	 * will not be deleted by the generator (i.e. references cannot be tagged with the generator id)
	 * 
	 * @param machine
	 * @param root
	 * @return
	 */
	private Collection<? extends TranslationDescriptor> removeAllocatedVariables(Machine machine, EventBObject root) {
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();
		for (EObject eObject : root.getAllContained(DecompositionPackage.Literals.ABSTRACT_REGION, false)){
			if (eObject instanceof AbstractRegion){
				AbstractRegion region =(AbstractRegion)eObject;
				for (Variable v : region.getAllocatedVariables()){
					ret.add(Make.descriptor(region, allocatedVariables, v, true));
				}
			}
		}
		return ret;
	}

	/**
	 * adds a specific variable reference to all contained abstractRegions
	 * 
	 * @param machine
	 * @param root
	 * @param variableName
	 * @return
	 */
	private Collection<? extends TranslationDescriptor> allocateVariableToAllRegions(Machine machine, EventBObject root, String variableName) {
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();
		for (EObject eObject : root.getAllContained(DecompositionPackage.Literals.ABSTRACT_REGION, false)){
			if (eObject instanceof AbstractRegion){
				AbstractRegion region =(AbstractRegion)eObject;
				ret.add(Make.descriptor(region, allocatedVariables, Make.variableProxyReference(machine, variableName), -10));
			}
		}
		return ret;
		
	}	
	
}
