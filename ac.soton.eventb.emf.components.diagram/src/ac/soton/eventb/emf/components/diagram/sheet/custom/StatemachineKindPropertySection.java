/*
 * Copyright (c) 2010 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.components.diagram.sheet.custom;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
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
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eventb.emf.core.EventBElement;

import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.diagrams.sheet.AbstractIumlbPropertySection;
import ac.soton.eventb.emf.diagrams.util.custom.DiagramUtils;
import ac.soton.eventb.statemachines.Statemachine;

/**
 * Statemachine Kind property section for Statemachine.
 * 
 * @author cfs
 */
public class StatemachineKindPropertySection extends AbstractIumlbPropertySection {

	/**
	 * Element Filter for this property section.
	 */
	public static final class Filter implements IFilter {
		@Override
		public boolean select(Object toTest) {
			return DiagramUtils.unwrap(toTest) instanceof Statemachine;
		}
	}
	
	
	private Button morphButton;
	
	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		
		propertySheetPage = aTabbedPropertySheetPage;
		
		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		
		FormData data;
		int buttonHeight = 30;
		
		// button to morph the owning statemachine to a different kind
		morphButton = getWidgetFactory().createButton(composite, "Morph Statemachine", SWT.PUSH);
		data = new FormData();
		data.left = new FormAttachment(0, 100);
		data.top = new FormAttachment(100, -buttonHeight);
		data.bottom = new FormAttachment(100, 0);
		morphButton.setLayoutData(data);
		morphButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {	
				Statemachine source = (Statemachine)owner;
				MorphStatemachineDialog dialog = new MorphStatemachineDialog(getPart().getSite().getShell());
				if (Dialog.OK == dialog.open()) {
					EStructuralFeature newFeature = dialog.getNewKind(); 
					EObject container = source.eContainer();
					EStructuralFeature oldFeature = source.eContainingFeature();
					if (newFeature == oldFeature) return;
					RemoveCommand rem = (RemoveCommand) RemoveCommand.create(getEditingDomain(), container, oldFeature, owner);
					AddCommand add = (AddCommand) AddCommand.create(getEditingDomain(), container, newFeature, owner);

					if (rem.canExecute() && add.canExecute()){
						getEditingDomain().getCommandStack().execute(rem);
						getEditingDomain().getCommandStack().execute(add);
						//Refresh the property sheet to reflect the new kind of owner
						updatePropertySheetSelection(owner);
					}
				}
			}
		});
		
	}

	private TabbedPropertySheetPage propertySheetPage = null;
	
	private void updatePropertySheetSelection(EventBElement newOwner){
		propertySheetPage.selectionChanged(getPart(), new StructuredSelection(newOwner));
		propertySheetPage.refresh();
	}

	@Override
	protected String getLabelText() {
		return "State-machine Kind";
	}

	@Override
	protected EStructuralFeature getFeature() {
		return owner==null ? ComponentsPackage.Literals.COMPONENT__ASYNCHRONOUS_STATEMACHINES : owner.eContainingFeature();
	}
	

}
