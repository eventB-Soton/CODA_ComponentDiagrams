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
package ac.soton.eventb.emf.components.diagram.sheet.custom;

import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.fieldassist.ControlDecoration;

/**
 * @author vitaly
 *
 */
public abstract class DecoratedInputValidator implements IInputValidator {
	
	private final ControlDecoration controlDecoration;

	/**
	 * @param controlDecoration control decoration if required
	 */
	public DecoratedInputValidator(ControlDecoration controlDecoration) {
		this.controlDecoration = controlDecoration;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IInputValidator#isValid(java.lang.String)
	 */
	@Override
	public String isValid(String newText) {
		String message = isValidInput(newText);
		if (controlDecoration != null) {
			if (message == null) {
				controlDecoration.hide();
			} else {
				controlDecoration.setDescriptionText(message);
				controlDecoration.show();
			}
		}
		return message;
	}

	/**
	 * Returns validation result.
	 * 
	 * @param input validation input string
	 * @return validation error message or null
	 */
	public abstract String isValidInput(String input);

}
