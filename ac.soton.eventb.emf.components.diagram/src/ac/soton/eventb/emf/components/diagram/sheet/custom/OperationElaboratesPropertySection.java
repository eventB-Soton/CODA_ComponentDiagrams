/*
 * Copyright (c) 2015 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.components.diagram.sheet.custom;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eventb.emf.core.EventBElement;

import ac.soton.eventb.emf.components.AbstractComponentOperation;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.diagrams.sheet.ElaboratesPropertySection;
import ac.soton.eventb.emf.diagrams.util.custom.DiagramUtils;


/**
 * Elaborates property section for Component operation.
 * 
 * @author cfsnook
 *
 */
public class OperationElaboratesPropertySection extends ElaboratesPropertySection {

	/**
	 * Element Filter for this property section.
	 */
	public static final class Filter implements IFilter {
		@Override
		public boolean select(Object toTest) {
			return DiagramUtils.unwrap(toTest) instanceof AbstractComponentOperation;
		}
	}

	@Override
	protected EReference getFeature() {
		return ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__ELABORATES;
	}

	private Button morphButton;

	@Override
	protected FormAttachment moreButtons(FormAttachment buttonLeftData, FormAttachment buttonTopData, FormAttachment buttonBottomData){
		
		Control[] children = parent.getChildren();
		FormAttachment leftData = super.moreButtons(buttonLeftData, buttonTopData, buttonBottomData);
				
		// button to morph the owning operation to a different kind
		morphButton = getWidgetFactory().createButton((Composite) children[0], "Morph Operation", SWT.PUSH);
		FormData data = new FormData();
		data.left = leftData;
		data.bottom = buttonBottomData;
		data.top = buttonTopData;
		morphButton.setLayoutData(data);
		morphButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {	
				AbstractComponentOperation source = (AbstractComponentOperation)owner;
				MorphOperationDialog dialog = new MorphOperationDialog(getPart().getSite().getShell(), getEditingDomain(), source);
				if (Dialog.OK == dialog.open()) {
					ArrayList<EObject> replacement = new ArrayList<EObject>();
					replacement.add(dialog.getNewOperation());
					EObject container = source.eContainer();
					EStructuralFeature feature = source.eContainingFeature();
					ReplaceCommand repcmd = (ReplaceCommand) ReplaceCommand.create(getEditingDomain(), container, feature, owner, replacement);
					if (repcmd.canExecute()){
						getEditingDomain().getCommandStack().execute(repcmd);
						owner = dialog.getNewOperation();
						//Refresh the property sheet to reflect the new kind of owner
						updatePropertySheetSelection(owner);
					}
				}
			}
		});

		return new FormAttachment(morphButton, ITabbedPropertyConstants.VSPACE, SWT.BOTTOM);
	}

	private TabbedPropertySheetPage propertySheetPage = null;
    /* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#createControls(org.eclipse.swt.widgets.Composite, org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		propertySheetPage = aTabbedPropertySheetPage;
	}
	
	private void updatePropertySheetSelection(EventBElement newOwner){
		if (propertySheetPage==null)return;
		propertySheetPage.selectionChanged(getPart(), new StructuredSelection(newOwner));
		propertySheetPage.refresh();
	}

	
	@Override
	public void refresh() {
		super.refresh();
		morphButton.setEnabled(false);
	}
	
	@Override
	protected void rowSelectionAction(){
		super.rowSelectionAction();
		morphButton.setEnabled(true);
	}

}
