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

import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Event;

import ac.soton.eventb.emf.components.AbstractPort;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.DataPacket;
import ac.soton.eventb.emf.components.InPort;
import ac.soton.eventb.emf.components.PortWake;
import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.eventb.emf.diagrams.generator.AbstractRule;
import ac.soton.eventb.emf.diagrams.generator.GenerationDescriptor;
import ac.soton.eventb.emf.diagrams.generator.IRule;
import ac.soton.eventb.emf.diagrams.generator.utils.Make;

/**
 * 
 * This rule deals with generating a parameter for the input port of a portwakes.receive
 * For each elaborated event, the receive link generates a parameter to represent the input port
 * and a guard that the parameter has the specified value as well as a type guard.
 * <p>
 * 
 * </p>
 * 
 * @author cfs
 * @version
 * @see
 * @since
 */
public class PortWakeRule extends AbstractRule  implements IRule {
	
	
	@Override
	public List<GenerationDescriptor> fire(EventBElement sourceElement, List<GenerationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));
		List<GenerationDescriptor> ret = new ArrayList<GenerationDescriptor>();
		
		PortWake pw = (PortWake) sourceElement;
		
		for (Event elaboratedEvent : pw.getElaborates()){	
			
 			//parameter and guard for value on input port for each received connector
			for (DataPacket r : pw.getReceives()){

				//generate parameters for the complete chain of input ports
				AbstractPort ip = r.getPort();
				String value = r.getValue();

				while (ip instanceof InPort ){
					//generate parameter and guards for connection to input port
					ret.add(Make.descriptor(elaboratedEvent,parameters,Make.parameter(ip.getName(), "input port of "+ ((Component)ip.getContaining(ComponentsPackage.Literals.COMPONENT)).getName()),4));	
					ret.add(Make.descriptor(elaboratedEvent,guards,Make.guard(Strings.IPT_GUARD_NAME(ip.getName()), Strings.IPT_GUARD_PRED(ip.getName(),value)),4));
					ret.add(Make.descriptor(elaboratedEvent,guards,Make.guard(Strings.IPT_TYPE_NAME(ip.getName()), Strings.IPT_TYPE_PRED(ip.getName(),ip.getType())),5));

					value = ip.getName();
					ip = ((InPort)ip).getSource();

				}
			}
		}
		return ret;
	}

}
