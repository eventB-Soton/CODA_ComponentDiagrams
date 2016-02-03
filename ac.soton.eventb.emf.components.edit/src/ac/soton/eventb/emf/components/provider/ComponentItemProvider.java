/**
 * Copyright (c) 2011
 * University of Southampton.
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 *
 * $Id$
 */
package ac.soton.eventb.emf.components.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.provider.EventBNamedCommentedElementItemProvider;

import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentsFactory;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.statemachines.StatemachinesFactory;

/**
 * This is the item provider adapter for a {@link ac.soton.eventb.emf.components.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider
	extends EventBNamedCommentedElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		ITableItemLabelProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addExtensionIdPropertyDescriptor(object);
			addRefinesPropertyDescriptor(object);
			addInConnectorsPropertyDescriptor(object);
			addOutConnectorsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Extension Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtensionIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractExtension_extensionId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractExtension_extensionId_feature", "_UI_AbstractExtension_type"),
				 CorePackage.Literals.ABSTRACT_EXTENSION__EXTENSION_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Refines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefinesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_refines_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_refines_feature", "_UI_Component_type"),
				 ComponentsPackage.Literals.COMPONENT__REFINES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the In Connectors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInConnectorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_inConnectors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_inConnectors_feature", "_UI_Component_type"),
				 ComponentsPackage.Literals.COMPONENT__IN_CONNECTORS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Out Connectors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutConnectorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_outConnectors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_outConnectors_feature", "_UI_Component_type"),
				 ComponentsPackage.Literals.COMPONENT__OUT_CONNECTORS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ComponentsPackage.Literals.ABSTRACT_COMPONENT_MODEL__COMPONENTS);
			childrenFeatures.add(ComponentsPackage.Literals.ABSTRACT_COMPONENT_MODEL__CONNECTORS);
			childrenFeatures.add(ComponentsPackage.Literals.COMPONENT__OPERATIONS);
			childrenFeatures.add(ComponentsPackage.Literals.COMPONENT__WAKE_QUEUES);
			childrenFeatures.add(ComponentsPackage.Literals.COMPONENT__ASYNCHRONOUS_STATEMACHINES);
			childrenFeatures.add(ComponentsPackage.Literals.COMPONENT__SYNCHRONOUS_STATEMACHINES);
			childrenFeatures.add(ComponentsPackage.Literals.COMPONENT__PROCESS_STATEMACHINES);
			childrenFeatures.add(ComponentsPackage.Literals.COMPONENT__INVARIANTS);
			childrenFeatures.add(ComponentsPackage.Literals.COMPONENT__VARIABLES);
			childrenFeatures.add(ComponentsPackage.Literals.COMPONENT__INITIALISATIONS);
			childrenFeatures.add(ComponentsPackage.Literals.COMPONENT__SETS);
			childrenFeatures.add(ComponentsPackage.Literals.COMPONENT__AXIOMS);
			childrenFeatures.add(ComponentsPackage.Literals.COMPONENT__CONSTANTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Component.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Component"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Component)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Component_type") :
			getString("_UI_Component_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Component.class)) {
			case ComponentsPackage.COMPONENT__EXTENSION_ID:
			case ComponentsPackage.COMPONENT__REFINES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ComponentsPackage.COMPONENT__COMPONENTS:
			case ComponentsPackage.COMPONENT__CONNECTORS:
			case ComponentsPackage.COMPONENT__OPERATIONS:
			case ComponentsPackage.COMPONENT__WAKE_QUEUES:
			case ComponentsPackage.COMPONENT__ASYNCHRONOUS_STATEMACHINES:
			case ComponentsPackage.COMPONENT__SYNCHRONOUS_STATEMACHINES:
			case ComponentsPackage.COMPONENT__PROCESS_STATEMACHINES:
			case ComponentsPackage.COMPONENT__INVARIANTS:
			case ComponentsPackage.COMPONENT__VARIABLES:
			case ComponentsPackage.COMPONENT__INITIALISATIONS:
			case ComponentsPackage.COMPONENT__SETS:
			case ComponentsPackage.COMPONENT__AXIOMS:
			case ComponentsPackage.COMPONENT__CONSTANTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS,
				 ComponentsFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS,
				 StatemachinesFactory.eINSTANCE.createStatemachine()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.ABSTRACT_COMPONENT_MODEL__COMPONENTS,
				 ComponentsFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.ABSTRACT_COMPONENT_MODEL__CONNECTORS,
				 ComponentsFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.COMPONENT__OPERATIONS,
				 ComponentsFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.COMPONENT__OPERATIONS,
				 ComponentsFactory.eINSTANCE.createPortWake()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.COMPONENT__OPERATIONS,
				 ComponentsFactory.eINSTANCE.createSelfWake()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.COMPONENT__OPERATIONS,
				 ComponentsFactory.eINSTANCE.createExternal()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.COMPONENT__OPERATIONS,
				 ComponentsFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.COMPONENT__WAKE_QUEUES,
				 ComponentsFactory.eINSTANCE.createWakeQueue()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.COMPONENT__ASYNCHRONOUS_STATEMACHINES,
				 StatemachinesFactory.eINSTANCE.createStatemachine()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.COMPONENT__SYNCHRONOUS_STATEMACHINES,
				 StatemachinesFactory.eINSTANCE.createStatemachine()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.COMPONENT__PROCESS_STATEMACHINES,
				 StatemachinesFactory.eINSTANCE.createStatemachine()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.COMPONENT__INVARIANTS,
				 ComponentsFactory.eINSTANCE.createComponentInvariant()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.COMPONENT__VARIABLES,
				 ComponentsFactory.eINSTANCE.createComponentVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.COMPONENT__INITIALISATIONS,
				 ComponentsFactory.eINSTANCE.createComponentInitialisation()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.COMPONENT__SETS,
				 ComponentsFactory.eINSTANCE.createComponentSet()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.COMPONENT__AXIOMS,
				 ComponentsFactory.eINSTANCE.createComponentAxiom()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.COMPONENT__CONSTANTS,
				 ComponentsFactory.eINSTANCE.createComponentConstant()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS ||
			childFeature == ComponentsPackage.Literals.ABSTRACT_COMPONENT_MODEL__COMPONENTS ||
			childFeature == ComponentsPackage.Literals.COMPONENT__ASYNCHRONOUS_STATEMACHINES ||
			childFeature == ComponentsPackage.Literals.COMPONENT__SYNCHRONOUS_STATEMACHINES ||
			childFeature == ComponentsPackage.Literals.COMPONENT__PROCESS_STATEMACHINES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
