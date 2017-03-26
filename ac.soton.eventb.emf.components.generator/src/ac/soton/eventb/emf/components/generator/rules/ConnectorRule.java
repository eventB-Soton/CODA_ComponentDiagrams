/*******************************************************************************
 *  (c) Crown owned copyright 2011, 2017 (UK Ministry of Defence)
 *  
 *  All rights reserved. This program and the accompanying materials  are 
 *  made available under the terms of the Eclipse Public License v1.0 which
 *  accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  This is to identify the UK Ministry of Defence as owners along with the
 *   license rights provided.
 *  
 *  Contributors:
 *  			University of Southampton - Initial implementation
 *******************************************************************************/
package ac.soton.eventb.emf.components.generator.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.eventb.decomposition.DecompositionPackage;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.eventb.emf.diagrams.generator.AbstractRule;
import ac.soton.eventb.emf.diagrams.generator.GenerationDescriptor;
import ac.soton.eventb.emf.diagrams.generator.IRule;
import ac.soton.eventb.emf.diagrams.generator.utils.Find;
import ac.soton.eventb.emf.diagrams.generator.utils.Make;

public class ConnectorRule extends AbstractRule implements IRule {

	protected static final EReference allocatedVariables = DecompositionPackage.Literals.ABSTRACT_REGION__ALLOCATED_VARIABLES;
	protected static final EReference allocatedExtensions = DecompositionPackage.Literals.ABSTRACT_REGION__ALLOCATED_EXTENSIONS;
	protected static final EAttribute machineName = DecompositionPackage.Literals.ABSTRACT_REGION__MACHINE_NAME;
	
	@Override
	public boolean enabled(EventBElement sourceElement) throws Exception{
		assert(sourceElement instanceof Connector);
		return true;
	}
	
	@Override
	public List<GenerationDescriptor> fire(EventBElement sourceElement, List<GenerationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));
		Connector cn = (Connector) sourceElement;
		List<GenerationDescriptor> ret = new ArrayList<GenerationDescriptor>();
		
		Machine machine = (Machine)sourceElement.getContaining(MachinePackage.Literals.MACHINE);
		Event initialisation = (Event) Find.named(machine.getEvents(), "INITIALISATION");
		ret.add(Make.descriptor(machine,variables,Make.variable(cn.getName(), "connector"),3));
		ret.add(Make.descriptor(cn, allocatedVariables, Make.variableProxyReference(machine, cn.getName()) , -10));
		ret.add(Make.descriptor(initialisation,actions,Make.action(Strings.CN_INIT_NAME(cn), Strings.CN_INIT_EXPR(cn), ""),3));
		if (cn.getInherits() == null){
			ret.add(Make.descriptor(machine,invariants,Make.invariant(Strings.CN_TYPE_NAME(cn), Strings.CN_TYPE_PRED(cn),""),3));
			//ret.add(Make.descriptor(machine,invariants,Make.invariant(Strings.CN_HELPER_NAME(cn), Strings.CN_HELPER_PRED(cn),""),4)); //must be after the type
		}
		
		
		//set up the connectors decomposition region data
		ret.add(Make.descriptor(cn,machineName, cn.getName(), 0));
		ret.add(Make.descriptor(cn,allocatedExtensions, cn, -10));
		
		return ret;
	}

}
