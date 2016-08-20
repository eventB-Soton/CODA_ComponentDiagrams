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

import ac.soton.eventb.emf.components.DataPacket;
import ac.soton.eventb.emf.components.InPort;
import ac.soton.eventb.emf.components.PortWake;
import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.eventb.emf.diagrams.generator.AbstractRule;
import ac.soton.eventb.emf.diagrams.generator.GenerationDescriptor;
import ac.soton.eventb.emf.diagrams.generator.IRule;
import ac.soton.eventb.emf.diagrams.generator.utils.Make;

/**
 * This rule deals with portwakes that have disconnected receive links.
 * I.e. they are linked to an input port that does not connect to a connector.
 * In this case (for each elaborated event)
 * the receive link generates a parameter to represent the input port
 * and a guard that the parameter has the specified value  (which may be another parameter)
 * If the port-wake belongs to a subcomponent and it is the parent component that is disconnected,
 * the parameter is named after the outermost (parent's) input port.
 * <p>
 * 
 * </p>
 * 
 * @author cfs
 * @version
 * @see
 * @since
 */
public class DisconnectedPortWakeRule extends AbstractRule  implements IRule {
	
	@Override
	public boolean enabled(EventBElement sourceElement) throws Exception{
		assert(sourceElement instanceof PortWake);
		for (DataPacket r : ((PortWake)sourceElement).getReceives()){
			if (r.getConnector()==null){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public List<GenerationDescriptor> fire(EventBElement sourceElement, List<GenerationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));
		List<GenerationDescriptor> ret = new ArrayList<GenerationDescriptor>();
		
		PortWake pw = (PortWake) sourceElement;
		
		for (Event elaboratedEvent : pw.getElaborates()){	
 			//parameter and guard for value on input port for each received connector
			for (DataPacket r : pw.getReceives()){
				if (r.getConnector()==null){
					//find disconnected port
					InPort ip = (InPort) r.getPort();
					while (ip.getSource()!=null){
						ip = (InPort) ip.getSource();
					}
					//generate parameter and guard
					ret.add(Make.descriptor(elaboratedEvent,parameters,Make.parameter(ip.getName(), "disconnected input port"),4));					
					ret.add(Make.descriptor(elaboratedEvent,guards,Make.guard(Strings.CN_DRECV_GUARD_NAME(ip.getName()), Strings.CN_DRECV_GUARD_PRED(ip.getName(),r.getValue())),4));
				}
			}
		}
	
		////////
		return ret;
	}

}
