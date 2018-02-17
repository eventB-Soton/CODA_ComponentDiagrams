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

import org.eclipse.emf.ecore.EObject;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.DataPacket;
import ac.soton.eventb.emf.components.PortWake;
import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.eventb.emf.components.util.ComponentsUtils;
import ac.soton.emf.translator.eventb.rules.AbstractEventBGeneratorRule;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.emf.translator.eventb.utils.Find;
import ac.soton.emf.translator.eventb.utils.Make;

/**
 * This rule deals with port wakes that receive on inports that are connected to connectors.
 * This involves generating synchronisation with the timer event as well as guarding
 * elaborated events to make sure the inport value has arrived on the connector
 * 
 * Note that generation of parameters representing inports are dealt with elsewhere
 * <p>
 * 
 * </p>
 * 
 * @author cfs
 * @version
 * @see
 * @since
 */
public class ConnectedPortWakeRule extends AbstractEventBGeneratorRule  implements IRule {

	private Event timerEvent = null;
	
	/**
	 * only if inport is connected
	 */
	@Override
	public boolean enabled(EObject sourceElement) throws Exception{
		assert(sourceElement instanceof PortWake);
		for (DataPacket r : ((PortWake)sourceElement).getReceives()){
			if (r.getConnector()!=null){
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> generatedElements) throws Exception{
		Machine machine = (Machine)((PortWake) sourceElement).getContaining(MachinePackage.Literals.MACHINE);
		Component root = (Component) ComponentsUtils.getRootComponent(sourceElement);
		timerEvent = (Event) Find.generatedElement(generatedElements,machine,events,Strings.TE_NAME(root));
		return timerEvent!=null;
	}
	
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));
		if (!dependenciesOK(sourceElement,generatedElements)) throw new Exception("rule fired before dependencies available (sourceElement:"+sourceElement+", rule:"+ConnectedPortWakeRule.class+")");
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();
		
		PortWake pw = (PortWake)sourceElement;
		
		for (Event elaboratedEvent : pw.getElaborates()){	
 			//guard for value on connector for each received connector
			for (DataPacket r : pw.getReceives()){
				
				//if connected, generate guard for reading connector
				if (r.getConnector()!=null){					
					ret.add(Make.descriptor(elaboratedEvent,guards,Make.guard(Strings.CN_RECV_GUARD_NAME(r), Strings.CN_RECV_GUARD_PRED(r, r.getPort().getName())),6));
				}
			}
			ret.add(Make.descriptor(elaboratedEvent,guards,Make.guard(Strings.CN_NEWV_GUARD_NAME(), Strings.CN_NEWV_GUARD_PRED(pw)),1));		
		}
	
		//guard in timer event to parameterize condition of having a current value (this is to allow for decomposition)
		ret.add(Make.descriptor(timerEvent,parameters,Make.parameter(Strings.TE_PW_READY_PARAM_NAME(pw), ""),4));
		ret.add(Make.descriptor(timerEvent,guards,Make.guard(Strings.TE_PW_READY_GUARD_NAME(pw), Strings.TE_PW_READY_GUARD_PRED(pw)),4));
		//guard in timer event ensures PW events finished or no current value available
		ret.add(Make.descriptor(timerEvent,guards,Make.guard(Strings.TE_PW_DONE_GUARD_NAME(pw), Strings.TE_PW_DONE_GUARD_PRED(pw)),4));
		
		//reset operations synch in timer event
		ret.add(Make.descriptor(timerEvent,actions,Make.action(Strings.OS_ACTION_NAME(pw), Strings.OS_FALSE_EXPR(pw)),4));
		
		////////
		return ret;
	}

}
