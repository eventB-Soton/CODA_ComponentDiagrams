/*******************************************************************************
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package ac.soton.eventb.emf.components.navigator.actions;

import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eventb.core.IMachineRoot;
import org.eventb.emf.core.machine.Machine;

import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentsFactory;
import ac.soton.eventb.emf.components.navigator.ComponentsNavigatorPlugin;


/**
 * Command handler for adding a new component to machine root.
 * 
 * @author vitaly
 *
 */
public class AddComponentHandler extends AbstractHandler {

	// name validator
	static final IInputValidator nameValidator = new IInputValidator(){

		@Override
		public String isValid(String name) {
			if (name.trim().isEmpty())
				return "";
			return null;
		}
	};
	
	/**
	 * EMF command for adding a component to a machine.
	 * 
	 * @author vitaly
	 *
	 */
	public class AddComponentCommand extends AbstractEMFOperation {

		private URI machineURI;
		private Component component;

		public AddComponentCommand(URI machineURI, Component component) {
			super(TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(), "Add Component");
			this.machineURI = machineURI;
			this.component = component;
		}

		@Override
		protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info)
				throws ExecutionException {
			monitor.beginTask("Creating component", IProgressMonitor.UNKNOWN);
			
			TransactionalEditingDomain editingDomain = getEditingDomain();
			
			try {
				Resource resource = editingDomain.getResourceSet().getResource(machineURI, true);
				
				if (resource != null && resource.isLoaded()) {
					Machine machine = (Machine) resource.getContents().get(0);
					machine.getExtensions().add(component);
					resource.save(Collections.emptyMap());
				}
			} catch (Exception e) {
				return new Status(Status.ERROR, ComponentsNavigatorPlugin.PLUGIN_ID, "Failed to add component", e);
			} finally {
				monitor.done();
			}
			return Status.OK_STATUS;
		}

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
		if (selection instanceof IStructuredSelection) {
			Object element = ((IStructuredSelection) selection).getFirstElement();
			if (element instanceof IMachineRoot) {
				IMachineRoot machineRoot = (IMachineRoot) element;
				IFile file = machineRoot.getResource();
					
				if (file != null && file.exists()) {
					InputDialog dialog = new InputDialog(Display.getCurrent().getActiveShell(), 
							"New Component", 
							"Enter component name: ",
							null, nameValidator);
					if (dialog.open() == InputDialog.CANCEL)
						return null;
					String name = dialog.getValue().trim();
					
					URI machineURI = URI.createPlatformResourceURI(file.getFullPath().toOSString(), true);
					Component component = ComponentsFactory.eINSTANCE.createComponent();
					component.setName(name);					
					try {
						AddComponentCommand command = new AddComponentCommand(machineURI, component);
						if (command.canExecute())
							command.execute(new NullProgressMonitor(), null);
					} catch (Exception e) {
						ComponentsNavigatorPlugin.getDefault().logError("Creating component failed", e);
					}
				}
			}
		}
		return null;
	}

}
