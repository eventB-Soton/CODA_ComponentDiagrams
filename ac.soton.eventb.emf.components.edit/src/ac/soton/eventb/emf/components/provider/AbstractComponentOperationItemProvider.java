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


import ac.soton.eventb.decomposition.DecompositionFactory;
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
import org.eventb.emf.core.provider.EventBCommentedElementItemProvider;

import ac.soton.eventb.emf.components.AbstractComponentOperation;
import ac.soton.eventb.emf.components.ComponentsFactory;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionFactory;
import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;
import ac.soton.eventb.statemachines.StatemachinesFactory;

/**
 * This is the item provider adapter for a {@link ac.soton.eventb.emf.components.AbstractComponentOperation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractComponentOperationItemProvider
	extends EventBCommentedElementItemProvider
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
	public static final String copyright = "Copyright (c) 2011-2017\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractComponentOperationItemProvider(AdapterFactory adapterFactory) {
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

			addLabelPropertyDescriptor(object);
			addElaboratesPropertyDescriptor(object);
			addConvergencePropertyDescriptor(object);
			addExtendedPropertyDescriptor(object);
			addRefinesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EventBLabeled_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EventBLabeled_label_feature", "_UI_EventBLabeled_type"),
				 CoreextensionPackage.Literals.EVENT_BLABELED__LABEL,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Elaborates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElaboratesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractComponentOperation_elaborates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractComponentOperation_elaborates_feature", "_UI_AbstractComponentOperation_type"),
				 ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__ELABORATES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Convergence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConvergencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractComponentOperation_convergence_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractComponentOperation_convergence_feature", "_UI_AbstractComponentOperation_type"),
				 ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__CONVERGENCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extended feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractComponentOperation_extended_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractComponentOperation_extended_feature", "_UI_AbstractComponentOperation_type"),
				 ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__EXTENDED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_AbstractComponentOperation_refines_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractComponentOperation_refines_feature", "_UI_AbstractComponentOperation_type"),
				 ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__REFINES,
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
			childrenFeatures.add(ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__CALLS);
			childrenFeatures.add(ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__SENDS);
			childrenFeatures.add(ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__PARAMETERS);
			childrenFeatures.add(ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__WAKES);
			childrenFeatures.add(ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__ACTIONS);
			childrenFeatures.add(ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__GUARDS);
			childrenFeatures.add(ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__WITNESSES);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = crop(((AbstractComponentOperation)object).getLabel());
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractComponentOperation_type") :
			getString("_UI_AbstractComponentOperation_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractComponentOperation.class)) {
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__LABEL:
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__ELABORATES:
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__CONVERGENCE:
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__EXTENDED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__CALLS:
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__SENDS:
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__PARAMETERS:
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__WAKES:
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__ACTIONS:
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__GUARDS:
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__WITNESSES:
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
				 DecompositionFactory.eINSTANCE.createRegion()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS,
				 StatemachinesFactory.eINSTANCE.createStatemachine()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__CALLS,
				 ComponentsFactory.eINSTANCE.createMethod()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__SENDS,
				 ComponentsFactory.eINSTANCE.createDelayedDataPacket()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__PARAMETERS,
				 CoreextensionFactory.eINSTANCE.createTypedParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__WAKES,
				 ComponentsFactory.eINSTANCE.createWakeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__ACTIONS,
				 ComponentsFactory.eINSTANCE.createOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__GUARDS,
				 ComponentsFactory.eINSTANCE.createOperationGuard()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__WITNESSES,
				 ComponentsFactory.eINSTANCE.createOperationWitness()));
	}

}
