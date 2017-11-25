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
package ac.soton.eventb.emf.components.generator.validator;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.action.Action;

import ac.soton.eventb.emf.components.diagram.part.ValidateAction;
import ac.soton.eventb.emf.components.diagram.providers.ComponentsMarkerNavigationProvider;
import ac.soton.eventb.emf.diagrams.generator.AbstractValidator;
import ac.soton.eventb.emf.diagrams.generator.IValidator;

/**
 * <p>
 * Wrapper for CODA Components diagram validator
 * </p>
 * 
 * @author cfs
 * @version 0.1
 * @see
 * @since
 */
public class Validator extends AbstractValidator implements IValidator {

	/* (non-Javadoc)
	 * @see ac.soton.eventb.emf.diagrams.generator.AbstractValidator#getValidateAction(org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor)
	 */
	@Override
	protected String getMarkerType() {
		return ComponentsMarkerNavigationProvider.MARKER_TYPE;
	}
	
	/* (non-Javadoc)
	 * @see ac.soton.eventb.emf.diagrams.generator.AbstractValidator#getValidateAction(org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor)
	 */
	@Override
	protected Action getValidateAction(DiagramEditor diagramDocumentEditor){
		return new ValidateAction(diagramDocumentEditor.getSite().getPage());
	}
}
