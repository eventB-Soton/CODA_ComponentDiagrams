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
import ac.soton.eventb.emf.components.Method;
import ac.soton.eventb.emf.components.generator.strings.Strings;
import ac.soton.eventb.emf.components.util.ComponentsUtils;
import ac.soton.emf.translator.eventb.rules.AbstractEventBGeneratorRule;
import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.emf.translator.eventb.utils.Find;
import ac.soton.emf.translator.eventb.utils.Make;

public class MethodRule extends AbstractEventBGeneratorRule implements IRule {

	private Event timerEvent = null;

	@Override
	public boolean enabled(EObject sourceElement) throws Exception{
		assert(sourceElement instanceof Method);
		return true;
	}

	@Override
	public boolean dependenciesOK(EObject sourceElement, List<TranslationDescriptor> generatedElements) throws Exception{
		Machine machine = (Machine)((Method)sourceElement).getContaining(MachinePackage.Literals.MACHINE);
		Component root = (Component) ComponentsUtils.getRootComponent(sourceElement);
		timerEvent = (Event) Find.generatedElement(generatedElements,machine,events,Strings.TE_NAME(root));
		return timerEvent!=null;
	}
	
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> generatedElements) throws Exception {
		assert(enabled(sourceElement));
		if (!dependenciesOK(sourceElement,generatedElements)) throw new Exception("rule fired before dependencies available (sourceElement:"+sourceElement+", rule:"+MethodRule.class+")");
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();

		Method md = (Method) sourceElement;
		
		//guard in timer event ensures method events finished
		ret.add(Make.descriptor(timerEvent,guards,Make.guard(Strings.TE_MD_DONE_GUARD_NAME(md), Strings.TE_MD_DONE_GUARD_PRED(md)),4));

		////////		
		return ret;
	}

}
