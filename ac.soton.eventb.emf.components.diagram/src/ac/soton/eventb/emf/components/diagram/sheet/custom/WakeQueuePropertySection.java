/*
 * Copyright (c) 2014 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.components.diagram.sheet.custom;

import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.IFilter;
import org.eventb.emf.core.EventBNamed;

import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.SelfWake;
import ac.soton.eventb.emf.components.WakeQueue;
import ac.soton.eventb.emf.diagrams.sheet.AbstractEnumerationPropertySection;
import ac.soton.eventb.emf.diagrams.util.custom.DiagramUtils;

/**
 * Wake Queue property section.
 * 
 * @author cfs
 *
 */
public class WakeQueuePropertySection extends AbstractEnumerationPropertySection {

	/**
	 * Element Filter for this property section.
	 */
	public static final class Filter implements IFilter {
		@Override
		public boolean select(Object toTest) {
			return DiagramUtils.unwrap(toTest) instanceof SelfWake;
		}
	}
	
	@Override
	protected EStructuralFeature getFeature() {
		return ComponentsPackage.Literals.SELF_WAKE__QUEUE;
	}

	@Override
	protected String[] getEnumerationFeatureValues() {
		EList<WakeQueue> queues = getQueues(eObject);
		String[] values = new String[queues.size()];
		int i = 0;
		for (EObject eObject : queues) {
			values[i++] = eObject instanceof EventBNamed ? ((EventBNamed) eObject).getName() : "";
		}
		return values;
	}

	@SuppressWarnings("unchecked")
	private EList<WakeQueue> getQueues(EObject cp){
		if (cp == null) return (EList<WakeQueue>) ECollections.EMPTY_ELIST;
		if (cp instanceof Component){
			return ((Component)cp).getWakeQueues();
		}
		return getQueues(cp.eContainer());
	}
	
	@Override
	protected String getFeatureAsText() {
		Object queue = eObject.eGet(getFeature(), true);
		return queue instanceof WakeQueue ? ((WakeQueue)queue).getName() : "<invalid queue>";
	}

	@Override
	protected String getLabelText() {
		return "Wake Queue:";
	}

	@Override
	protected List<? extends Object> getAvailableDataElements() {
		return getQueues(eObject);
	}

}
