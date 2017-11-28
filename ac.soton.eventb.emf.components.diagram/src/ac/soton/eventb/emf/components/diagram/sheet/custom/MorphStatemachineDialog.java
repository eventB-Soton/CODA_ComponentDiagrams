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
package ac.soton.eventb.emf.components.diagram.sheet.custom;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;

import ac.soton.eventb.emf.components.ComponentsPackage;

/**
 * Morph Statemachine dialog.
 * Dialog to choose a new kind for the given statemachine.
 * Since statemachine kinds only differ by their containment in components,
 * this merely needs to move the statemachine to a different eContainer.
 * 
 * @author cfs
 *
 */
public class MorphStatemachineDialog extends Dialog {
	
	private Combo newClassCombo;
	private String[] items = {"Asynchronous", "Synchronous", "Process"};
	private EReference[] kinds = {
			ComponentsPackage.Literals.COMPONENT__ASYNCHRONOUS_STATEMACHINES,
			ComponentsPackage.Literals.COMPONENT__SYNCHRONOUS_STATEMACHINES,
			ComponentsPackage.Literals.COMPONENT__PROCESS_STATEMACHINES
		};
	private EStructuralFeature newKind;
	
	/**
	 * @param parentShell
	 */
	protected MorphStatemachineDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Morph Statemachine to a different Kind");
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		Group group = new Group(composite, SWT.SHADOW_ETCHED_IN);
		group.setText("Choose New Statemachine Kind");
		GridLayout layout = new GridLayout(2, false);
		group.setLayout(layout);
		GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		gd.widthHint = 300;
		group.setLayoutData(gd);
		newClassCombo = new Combo(group, SWT.DROP_DOWN | SWT.READ_ONLY);
		newClassCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		newClassCombo.setItems(items);
		newClassCombo.select(0);
		return composite;
	}

	@Override
	protected Control createContents(Composite parent) {
		Control contents = super.createContents(parent);
		// only here the buttons are available, so that's where OK can be disabled for initial state
		update();
		return contents;
	}

	private void update() {
		Control button = getButton(IDialogConstants.OK_ID);
		if (button != null) {
			button.setEnabled(true);
		}
	}
	
	public EStructuralFeature getNewKind(){
		return newKind;
	}

	@Override
	protected void okPressed() {
		newKind = kinds[newClassCombo.getSelectionIndex()];
		super.okPressed();
	}

}
