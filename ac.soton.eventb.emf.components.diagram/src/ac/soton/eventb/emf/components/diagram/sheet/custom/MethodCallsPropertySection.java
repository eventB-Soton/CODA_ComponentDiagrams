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

import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.IFilter;

import ac.soton.eventb.emf.components.AbstractComponentOperation;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;
import ac.soton.eventb.emf.diagrams.sheet.AbstractEditTablePropertySection;
import ac.soton.eventb.emf.diagrams.util.custom.DiagramUtils;

/**
 * Calls property section for Operations.
 * 
 * @author cfs
 *
 */
public class MethodCallsPropertySection extends AbstractEditTablePropertySection {
	
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
		return ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__CALLS;
	}
	
	@Override
	protected Object getFeatureForCol(int col) {
		switch (col) {
		case 0 : return CoreextensionPackage.Literals.EVENT_BLABELED__LABEL;
		default : return null;
		}
	}
	
	@Override
	protected String getButtonLabelText() {
		return "Method";
	}

	
	
	/////////////////////////////
	
//	private static ILabelProvider methodLabelProvider = new LabelProvider() {
//
//		@Override
//		public String getText(Object element) {
//			return ((Method) element).getLabel();
//		}};
//
//
//
//	@Override
//	protected List<String> getColumnLabelText() {
//		return Collections.singletonList("Method");
//	}
//
//	@Override
//	protected Object getNewChild() {
//		Component component = (Component) owner.getContaining(ComponentsPackage.eINSTANCE.getComponent());
//		List<Method> allmethods = new ArrayList<Method>();
//		for (AbstractComponentOperation op : component.getOperations()){
//			if (op instanceof Method && op!=owner){
//				allmethods.add((Method)op);
//			}
//			allmethods.removeAll(((AbstractComponentOperation)owner).getCalls());
//		}
//		PopupDialog methodsDialog = new PopupDialog(getPart().getSite().getShell(), allmethods, methodLabelProvider);
//		methodsDialog.setTitle( "Methods");
//		methodsDialog.setMessage("Please select methods for this operation to call");
//		if (Dialog.OK == methodsDialog.open()) {
//			Object[] result = methodsDialog.getResult();
//			if (result.length > 0) {
//				List<Method> methods = new ArrayList<Method>();
//				for (Object obj : result)
//					methods.add((Method) obj);
//				return methods;
//			}
//		}
//		return null;
//	}
//
//	@Override
//	protected String getLabelText() {
//		return null;
//	}
//
//
//	@Override
//	public void createControls(Composite parent,
//			TabbedPropertySheetPage aTabbedPropertySheetPage) {
//		super.createControls(parent, aTabbedPropertySheetPage);
//		
////		Control[] children = parent.getChildren();
////		FormData data;
//		
//		// overriding "Delete" label
//		removeButton.setText("Remove Method");
//		
////		// a new button to create eventB event and add it to elaborates
////		newButton = getWidgetFactory().createButton((Composite) children[0], "Create && Add", SWT.PUSH);
////		data = new FormData();
////		data.left = new FormAttachment(removeButton, 0);
////		data.bottom = new FormAttachment(100, 0);
////		newButton.setLayoutData(data);
////		newButton.addSelectionListener(new SelectionAdapter() {
////
////			public void widgetSelected(SelectionEvent event) {
////				// remember selection
////				int idx = table.getSelectionIndex();
////				
////				// create and add new event
////				EObject container = EcoreUtil.getRootContainer(eObject);
////				Machine machine = (Machine) container;
////				NewEventDialog dialog = new NewEventDialog(getPart().getSite().getShell(), machine.getEvents(), null);
////				if (Dialog.OK == dialog.open()) {
////					EObject newChild = dialog.getEvent();
////					if (newChild == null)
////						return;
////					EditingDomain editingDomain = ((ComponentsDiagramEditor) getPart())
////						.getEditingDomain();
////					CompoundCommand cc = new CompoundCommand("Add new event for elaborates");
////					// new event
////					cc.append(AddCommand.create(editingDomain, machine, MachinePackage.Literals.MACHINE__EVENTS, newChild));
////					// elaborate
////					cc.append(AddCommand.create(editingDomain, eObject, getFeature(), newChild));
////					editingDomain.getCommandStack().execute(cc);
////					
////					refresh();
////					
////					// restore selection
////					table.select(idx);
////					table.notifyListeners(SWT.Selection, new org.eclipse.swt.widgets.Event());
////				}
////				
////			}
////		});
//	}
//

}
