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
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.eventb.emf.components.OutPort;
import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.eventb.emf.diagrams.generator.AbstractRule;
import ac.soton.eventb.emf.diagrams.generator.GenerationDescriptor;
import ac.soton.eventb.emf.diagrams.generator.IRule;
import ac.soton.eventb.emf.diagrams.generator.utils.Find;
import ac.soton.eventb.emf.diagrams.generator.utils.Make;

public class DisconnectedOutPortRule extends AbstractRule implements IRule {

	@Override
	public boolean enabled(EventBElement sourceElement) throws Exception{
		assert(sourceElement instanceof OutPort);
		return ((OutPort)sourceElement).getDestination() == null;
	}
	
	@Override
	public List<GenerationDescriptor> fire(EventBElement sourceElement, List<GenerationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));
		OutPort op = (OutPort) sourceElement;
		List<GenerationDescriptor> ret = new ArrayList<GenerationDescriptor>();
		Machine machine = (Machine)sourceElement.getContaining(MachinePackage.Literals.MACHINE);
		Event initialisation = (Event) Find.named(machine.getEvents(), "INITIALISATION");
		ret.add(Make.descriptor(machine,variables,Make.variable(op.getName(), "disconnected Out Port"),3));
		ret.add(Make.descriptor(initialisation,actions,Make.action(Strings.OP_INIT_NAME(op), Strings.OP_INIT_EXPR(op), ""),3));
		if (op.getInherits() == null){
			ret.add(Make.descriptor(machine,invariants,Make.invariant(Strings.OP_TYPE_NAME(op), Strings.OP_TYPE_PRED(op),""),3));
		}
		return ret;
	}

}
