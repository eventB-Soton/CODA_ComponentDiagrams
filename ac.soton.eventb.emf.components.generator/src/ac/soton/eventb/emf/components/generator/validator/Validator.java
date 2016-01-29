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
