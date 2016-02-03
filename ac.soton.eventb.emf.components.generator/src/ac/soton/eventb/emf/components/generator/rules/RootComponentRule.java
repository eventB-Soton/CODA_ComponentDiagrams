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
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.Project;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.ContextPackage;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.eventb.emf.components.util.ComponentsUtils;
import ac.soton.eventb.emf.diagrams.generator.AbstractRule;
import ac.soton.eventb.emf.diagrams.generator.GenerationDescriptor;
import ac.soton.eventb.emf.diagrams.generator.IRule;
import ac.soton.eventb.emf.diagrams.generator.utils.Find;
import ac.soton.eventb.emf.diagrams.generator.utils.Make;

public class RootComponentRule extends AbstractRule  implements IRule {

	protected static final EReference components = CorePackage.Literals.PROJECT__COMPONENTS;
	protected static final EReference sees = MachinePackage.Literals.MACHINE__SEES;
	protected static final EReference sets = ContextPackage.Literals.CONTEXT__SETS;
	protected static final EReference constants = ContextPackage.Literals.CONTEXT__CONSTANTS;
	protected static final EReference axioms = ContextPackage.Literals.CONTEXT__AXIOMS;
			
	@Override
	public boolean enabled(EventBElement sourceElement) throws Exception{
		assert(sourceElement instanceof Component);
		return sourceElement == ComponentsUtils.getRootComponent(sourceElement);	//!(sourceElement.eContainer().eClass().getEPackage().equals(ComponentsPackage.eINSTANCE)) ;
	}

	@Override
	public List<GenerationDescriptor> fire(EventBElement sourceElement, List<GenerationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));
		Component rootComponent = (Component) sourceElement;
		List<GenerationDescriptor> ret = new ArrayList<GenerationDescriptor>();
		
		
		Machine machine = (Machine)sourceElement.getContaining(MachinePackage.Literals.MACHINE);
		Event initialisation = (Event) Find.named(machine.getEvents(), "INITIALISATION");
		ret.add(Make.descriptor(machine,variables,Make.variable(Strings.CT_NAME(rootComponent), "current time for component"),1));
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
	
}
