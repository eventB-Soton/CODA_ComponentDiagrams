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

import org.eventb.emf.core.EventBElement;

import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.diagrams.generator.AbstractRule;
import ac.soton.eventb.emf.diagrams.generator.IRule;

public class ChildComponentRule extends AbstractRule implements IRule {

	/**
	 * NO LONGER DOES ANYTHING - wake queues are generated from WakeQueue children of component
	 *	Adds the Wake up queue to a non-root component IFF it is needed
	 */
	
	@Override
	public boolean enabled(EventBElement sourceElement) throws Exception{
		assert(sourceElement instanceof Component);
		return false;
//		(sourceElement != ComponentsUtils.getRootComponent(sourceElement) &&
//				needsWUqueue((Component)sourceElement));
	}
	

//
//	@Override
//	public List<GenerationDescriptor> fire(EventBElement sourceElement, List<GenerationDescriptor> generatedElements) throws Exception {
//		assert(enabled(sourceElement));
//		Component cp = (Component) sourceElement;
//		List<GenerationDescriptor> ret = new ArrayList<GenerationDescriptor>();
//		
////		Machine machine = (Machine)sourceElement.getContaining(MachinePackage.Literals.MACHINE);
////		Event initialisation = (Event) Find.named(machine.getEvents(), "INITIALISATION");
////		ret.add(Make.descriptor(machine,variables,Make.variable(Strings.WU_NAME(cp), "wake up queue for component"),2));
////		ret.add(Make.descriptor(machine,invariants,Make.invariant(Strings.WU_TYPE_NAME(cp), Strings.WU_TYPE_PRED(cp),""),2));
////		ret.add(Make.descriptor(initialisation,actions,Make.action(Strings.WU_INIT_NAME(cp), Strings.WU_INIT_EXPR(cp), ""),2));
//
//		return ret;
//	}
//
//	private boolean needsWUqueue(Component cmp) {
////		for (EObject op : cmp.getAllContained(ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION, true)){
////			if (op instanceof SelfWake) return true;
////			if (op instanceof AbstractComponentOperation){
////				AbstractComponentOperation aco = (AbstractComponentOperation) op;
////				if (aco.getWakes().size() >0) return true;
////			}
////		}
//		return false;
//	}
	
}
