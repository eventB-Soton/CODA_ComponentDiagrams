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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
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

import ac.soton.eventb.emf.components.AbstractComponentOperation;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.util.ComponentsUtils;

/**
 * Morph Operation dialog.
 * Dialog to choose a new kind and make a new 'morph' of the given operation 
 * 
 * @author cfs
 *
 */
public class MorphOperationDialog extends Dialog {
	
	private TransactionalEditingDomain domain;
	private Combo newClassCombo;
	private AbstractComponentOperation source;
	private AbstractComponentOperation operation;
	private String[] items = {"External","Method","PortWake","SelfWake","Transition"};
	private EClass[] kinds = {
			ComponentsPackage.eINSTANCE.getExternal(),
			ComponentsPackage.eINSTANCE.getMethod(),
			ComponentsPackage.eINSTANCE.getPortWake(),
			ComponentsPackage.eINSTANCE.getSelfWake(),
			ComponentsPackage.eINSTANCE.getTransition()
		};
	
	/**
	 * @param parentShell
	 */
	protected MorphOperationDialog(Shell parentShell, TransactionalEditingDomain domain, AbstractComponentOperation source) {
		super(parentShell);
		this.source = source;
		this.domain = domain;
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Morph Operation to a different Kind");
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		Group group = new Group(composite, SWT.SHADOW_ETCHED_IN);
		group.setText("Choose New Operation Kind");
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
			button.setEnabled(true); //morphValid);
		}
	}
	
	/**
	 * Returns operation created by this dialog.
	 * 
	 * @return new operation
	 */
	public AbstractComponentOperation getNewOperation() {
		return operation;
	}

	@Override
	protected void okPressed() {
		Command morphCommand = new RecordingCommand(domain, "Morph Operation Command") {
			protected void doExecute() {
				operation = ComponentsUtils.MorphAbstractOperation(domain, source, kinds[newClassCombo.getSelectionIndex()]);
				//EcoreUtil.delete(source);
			}
		};
		if (morphCommand.canExecute()){
		domain.getCommandStack().execute(morphCommand);
		}
		super.okPressed();
	}
	
}
