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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.eventb.emf.components.AbstractComponentOperation;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.emf.components.DataPacket;
import ac.soton.eventb.emf.components.PortWake;
import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.eventb.emf.components.util.ComponentsUtils;
import ac.soton.emf.translator.eventb.rules.AbstractEventBGeneratorRule;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.emf.translator.eventb.utils.Find;
import ac.soton.emf.translator.eventb.utils.Make;

public class PortWake_ConditionallyResetOtherFlagsRule extends AbstractEventBGeneratorRule  implements IRule {

	private Machine machine = null;
	private Event timerEvent = null;

	/**
	 * This rule needs to be fired LATE because it conditionally generates actions to reset the synch flags of other 
	 * operations which are waiting to receive on a subset of the connectors received by this one. If there are no such
	 * operations (and no such synch flags in the generatedElements) it does nothing.
	 */
	@Override
	public boolean fireLate(){
		return true;
	}
	
	/**
	 * enables for a PortWake operation that has more than one received connector
	 */
	@Override
	public boolean enabled(EObject sourceElement) throws Exception {
		assert(sourceElement instanceof AbstractComponentOperation);
		return sourceElement instanceof PortWake && ((PortWake)sourceElement).getReceives().size()>1;
	}

	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> generatedElements) throws Exception{
		PortWake pw = (PortWake) sourceElement;
		machine = (Machine)pw.getContaining(MachinePackage.Literals.MACHINE);
		Component root = (Component) ComponentsUtils.getRootComponent(sourceElement);
		timerEvent = (Event) Find.generatedElement(generatedElements,machine,events,Strings.TE_NAME(root));
		Guard timerPWGuard= (Guard) Find.generatedElement(generatedElements,timerEvent,guards,Strings.TE_PW_DONE_GUARD_NAME(pw)); //ensures that the main PortWake rule has fired for this pw
		return timerEvent!=null && timerPWGuard!=null;
	}
	
		
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));
		if (!dependenciesOK(sourceElement,generatedElements)) throw new Exception("rule fired before dependencies available (sourceElement:"+sourceElement+", rule:"+PortWake_ConditionallyResetOtherFlagsRule.class+")");
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();

		PortWake pw = (PortWake) sourceElement;
		Component cp = (Component)pw.getContaining(ComponentsPackage.Literals.COMPONENT);		
		EList<EObject> pws = cp.getAllContained(ComponentsPackage.Literals.PORT_WAKE, true);
		
		Set<Connector> receivedConnectors = new HashSet<Connector>();
		for (DataPacket r : pw.getReceives()){
			receivedConnectors.add(r.getConnector());
		}
		
		Set<Set<Connector>> subsets = getSubsets(receivedConnectors);
		for  (Set<Connector> s : subsets){
			for (List<Connector> p : getPermutations(s)){
				PortWake opw = findOtherPortWake(cp, pws,p);
				if (opw!=null){
					//in all elaborated events of this op
					for (Event elaboratedEvent : pw.getElaborates()){					
						ret.add(Make.descriptor(elaboratedEvent,actions,Make.action(Strings.OS_ACTION_NAME(opw), Strings.OS_TRUE_EXPR(opw)),1));
					}
				}
			}
		}
		
		//finished
		return ret;
	}

	private PortWake findOtherPortWake(Component cp, EList<EObject> pws, List<Connector> p) {
		String lookForName = Strings.OS_NAME(cp,p);
		for (EObject obj : pws){
			if (obj instanceof PortWake && lookForName.equals(Strings.OS_NAME((PortWake)obj))){
				return (PortWake)obj;
			}
		}
		return null;
	}

	private Set<List<Connector>> getPermutations(Set<Connector> connectors) {
		Set<List<Connector>> permutations = new HashSet<List<Connector>>();
		for (Connector c : connectors){
			Set<Connector> rem = new HashSet<Connector>(connectors);
			rem.remove(c);
			if (rem.size()>0){
				for (List<Connector>perm : getPermutations(rem)){
					perm.add(c);
					permutations.add(perm);
				}
			}else{
				ArrayList<Connector> singleton = new ArrayList<Connector>();
				singleton.add(c);
				permutations.add(singleton);
			}
		}
		return permutations;

	}

	private Set<Set<Connector>> getSubsets(Set<Connector> connectors) {
		Set<Set<Connector>> subsets = new HashSet<Set<Connector>>();
		for (Connector c : connectors){
			Set<Connector> s = new HashSet<Connector>(connectors);
			s.remove(c);
			if (s.size()>0){
				subsets.add(s);
				subsets.addAll(getSubsets(s));
			}
		}
		return subsets;
	}


}
