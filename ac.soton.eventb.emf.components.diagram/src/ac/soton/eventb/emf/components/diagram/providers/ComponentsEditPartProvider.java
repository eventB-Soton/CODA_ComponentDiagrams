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
package ac.soton.eventb.emf.components.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentDiagramEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentsEditPartFactory;
import ac.soton.eventb.emf.components.diagram.part.ComponentsVisualIDRegistry;

/**
 * @generated
 */
public class ComponentsEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public ComponentsEditPartProvider() {
		super(new ComponentsEditPartFactory(),
				ComponentsVisualIDRegistry.TYPED_INSTANCE,
				ComponentDiagramEditPart.MODEL_ID);
	}
}
