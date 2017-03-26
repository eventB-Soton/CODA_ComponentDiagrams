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
package ac.soton.eventb.emf.components.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBNamed;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.machine.Machine;

import ac.soton.eventb.emf.components.AbstractComponentOperation;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.StatemachinesPackage;

public class ComponentsUtils {

	public static String getUniqueName(EventBElement parent,
			EReference reference, String name) {
		int i = 0;
		while (checkForNameClash(parent, reference, name + i))
			i++;
		return name + i;
	}

	@SuppressWarnings("unchecked")
	private static Boolean checkForNameClash(EventBElement parent,
			EReference reference, String name) {
		Object referenceValues = parent.eGet(reference);
		if (referenceValues instanceof EList<?> && name != null) {
			for (EObject dp : (EList<EObject>) referenceValues) {
				if (dp instanceof EventBNamed
						&& name.equals(((EventBNamed) dp).getName())) {
					return true;
				}
			}
			return false;
		} else
			return null;
	}

	public static Component getRootComponent(EObject element) {
		if (!(element instanceof EventBObject))
			return null;
		return (Component) getRootContainerOfType(
				ComponentsPackage.Literals.COMPONENT, (EventBElement) element);

		// if (element != null &&
		// element.eClass().getEPackage().equals(ComponentsPackage.eINSTANCE)){
		// EObject potentialRoot = element;
		// while (potentialRoot.eContainer() instanceof EObject &&
		// (potentialRoot.eContainer().eClass().getEPackage().equals(ComponentsPackage.eINSTANCE))){
		// potentialRoot = potentialRoot.eContainer();
		// }
		// return potentialRoot;
		// }else return null;
	}

	public static Statemachine getRootStatemachine(EObject element) {
		if (!(element instanceof EventBObject))
			return null;
		return (Statemachine) getRootContainerOfType(
				StatemachinesPackage.Literals.STATEMACHINE,
				(EventBElement) element);
	}

	public static EventBObject getRootContainerOfType(EClass eClass,
			EObject element) {
		if (!(element instanceof EventBObject))
			return null;
		EventBObject root = (EventBObject) element;
		while (getContainerofType(eClass, root) != null) {
			root = getContainerofType(eClass, root);
		}
		return root;
	}

	private static EventBObject getContainerofType(EClass eClass,
			EventBObject el) {
		if (el.eClass() == eClass)
			el = (EventBObject) el.eContainer();
		return el.getContaining(eClass);
	}

	public static AbstractComponentOperation MorphAbstractOperation(
			EditingDomain domain, AbstractComponentOperation source,
			EClass newClass) {
		if (newClass.getEAllSuperTypes().contains(
				ComponentsPackage.eINSTANCE.getAbstractComponentOperation())) {
			AbstractComponentOperation target = (AbstractComponentOperation) EcoreUtil
					.create(newClass);
			target.setComment(source.getComment());
			target.setGenerated(source.isGenerated());
			if (source.isSetLocalGenerated())
				target.setLocalGenerated(source.isLocalGenerated());
			if (source.isSetConvergence())
				target.setConvergence(source.getConvergence());
			if (source.isSetExtended())
				target.setExtended(source.isExtended());
			if (source.isSetInternalId())
				target.setInternalId(source.getInternalId());
			if (source.isSetRefines())
				target.setRefines(source.getRefines());
			target.getActions().addAll(source.getActions());
			target.getGuards().addAll(source.getGuards());
			target.getWitnesses().addAll(source.getWitnesses());
			target.getAnnotations().addAll(source.getAnnotations());
			target.getAttributes().addAll(source.getAttributes());
			target.getCalls().addAll(source.getCalls());
			target.getElaborates().addAll(source.getElaborates());
			target.getExtensions().addAll(source.getExtensions());
			target.getParameters().addAll(source.getParameters());
			target.getSends().addAll(source.getSends());
			target.getWakes().addAll(source.getWakes());
			return target;
		}
		return null;
	}

	/**
	 * @param mch
	 * @param component
	 * @return
	 */
	public static Connector[] getConnectors(Machine mch) {
		List<Connector> result = new ArrayList<Connector>();
		EList<AbstractExtension> extensions = mch.getExtensions();
		for (AbstractExtension extension : extensions) {
			if (extension instanceof Component) {
				List<Connector> connectors = getConnectors((Component) extension);
				result.addAll(connectors);
			}
		}

		return result.toArray(new Connector[result.size()]);
	}

	/**
	 * @param extension
	 * @return
	 */
	private static List<Connector> getConnectors(Component component) {
		List<Connector> result = new ArrayList<Connector>();
		result.addAll(component.getConnectors());
		EList<Component> subComponents = component.getComponents();
		for (Component subComponent : subComponents) {
			List<Connector> connectors = getConnectors(subComponent);
			result.addAll(connectors);
		}
		return result;
	}

	/**
	 * returns a subset of the given connectors that are also inputs to the given component
	 * the component is not assumed to be loaded in the same resource as the list of connectors
	 * 
	 * @param component
	 * @param connectors
	 * @return
	 */
	public static Connector[] getInputConnector(Component component,
			Connector[] connectors) {
		List<Connector> result = new ArrayList<Connector>();

		for (Connector connector : connectors) {
			EList<Component> receivers = connector.getReceivers();
			if (isContains(receivers, component)) {
				result.add(connector);
			}
		}

		return result.toArray(new Connector[result.size()]);
	}

	/**
	 * returns a subset of the given connectors that are also outputs from the given component
	 * the component is not assumed to be loaded in the same resource as the list of connectors
	 * 
	 * @param component
	 * @param connectors
	 * @return
	 */
	public static Connector[] getOutputConnector(Component component,
			Connector[] connectors) {
		List<Connector> result = new ArrayList<Connector>();
		
		for (Connector connector : connectors) {
			Component sender = connector.getSender();
			if (isSame(sender, component)) {
				result.add(connector);
			}
		}
		
		return result.toArray(new Connector[result.size()]);
	}

	/**
	 * @param receivers
	 * @param component
	 * @return
	 */
	private static boolean isContains(Collection<Component> components,
			Component component) {
		for (Component comp : components) {
			if (isSame(comp, component))
				return true;
		}
		return false;
	}

	/**
	 * @param comp
	 * @param component
	 * @return
	 */
	private static boolean isSame(Component component1, Component component2) {
		URI uri1 = EcoreUtil.getURI(component1);
		URI uri2 = EcoreUtil.getURI(component2);
		return uri1.equals(uri2);
	}

}
