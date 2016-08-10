/*
 * Copyright (c) 2010 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.components.diagram.sheet.custom;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IFilter;
import org.eventb.emf.core.EventBCommented;
import org.eventb.emf.core.EventBNamed;

import ac.soton.eventb.emf.components.AbstractComponentOperation;
import ac.soton.eventb.emf.components.AbstractPort;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.emf.components.External;
import ac.soton.eventb.emf.components.PortWake;
import ac.soton.eventb.emf.components.SelfWake;
import ac.soton.eventb.emf.components.Transition;
import ac.soton.eventb.emf.core.extension.coreextension.EventBLabeled;


/**
 * Custom property sheet filter collection.
 * Contains filters for properties of different component diagram elements.
 * 
 * @author cfs (adapted from state machines version)
 *
 */
public class ComponentsSheetPropertyFilter {
	
	/**
	 * Unwraps eobject from passed diagram object.
	 * 
	 * @param object
	 * @return
	 */
	public static EObject unwrap(Object object) {
		if (object instanceof EObject)
			return (EObject) object;
		if (object instanceof EditPart) {
			Object model = ((EditPart) object).getModel();
			return model instanceof View ? ((View) model).getElement() : null;
		}
		if (object instanceof View) {
			return ((View) object).getElement();
		}
		if (object instanceof IAdaptable) {
			View view = (View) ((IAdaptable) object).getAdapter(View.class);
			if (view != null) {
				return view.getElement();
			}
		}
		return null;
	}
	
	/**
	 * Filter for properties of named element.
	 */
	public static final class NamedElementFilter implements IFilter {
		@Override
		public boolean select(Object toTest) {
			return unwrap(toTest) instanceof EventBNamed;
		}
	}
	
	/**
	 * Filter for properties of named element.
	 */
	public static final class ConnectorElementFilter implements IFilter {
		@Override
		public boolean select(Object toTest) {
			return unwrap(toTest) instanceof Connector;
		}
	}
	
	/**
	 * Filter for properties of named element.
	 */
	public static final class AbstractPortElementFilter implements IFilter {
		@Override
		public boolean select(Object toTest) {
			return unwrap(toTest) instanceof AbstractPort;
		}
	}
	
	/**
	 * Filter for properties of labelled element.
	 */
	public static final class LabeledElementFilter implements IFilter {
		@Override
		public boolean select(Object toTest) {
			return unwrap(toTest) instanceof EventBLabeled;
		}
	}
	
	/**
	 * Filter for comment property of commented element.
	 */
	public static final class CommentedElementFilter implements IFilter {
		@Override
		public boolean select(Object toTest) {
			return unwrap(toTest) instanceof EventBCommented;
		}
	}

	/**
	 * Filter for properties of component element.
	 */
	public static final class ComponentFilter implements IFilter {
		@Override
		public boolean select(Object toTest) {
			return unwrap(toTest) instanceof Component;
		}
	}
	
	/**
	 * Filter for properties of abstractComonentOperaiton element.
	 */
	public static final class AbstractComponentOperationFilter implements IFilter {
		@Override
		public boolean select(Object toTest) {
			return unwrap(toTest) instanceof AbstractComponentOperation;
		}
	}

	
	/**
	 * Filter for properties of SelfWake element.
	 */
	public static final class SelfWakeFilter implements IFilter {
		@Override
		public boolean select(Object toTest) {
			return unwrap(toTest) instanceof SelfWake;
		}
	}
	
	/**
	 * Filter for properties of PortWake element.
	 */
	public static final class PortWakeFilter implements IFilter {
		@Override
		public boolean select(Object toTest) {
			return unwrap(toTest) instanceof PortWake;
		}
	}

	/**
	 * Filter for properties of External element.
	 */
	public static final class ExternalFilter implements IFilter {
		@Override
		public boolean select(Object toTest) {
			return unwrap(toTest) instanceof External;
		}
	}
	
	/**
	 * Filter for properties of Transition element.
	 */
	public static final class TransitionFilter implements IFilter {
		@Override
		public boolean select(Object toTest) {
			return unwrap(toTest) instanceof Transition;
		}
	}


}
