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
package ac.soton.eventb.emf.components.provider;


import ac.soton.eventb.decomposition.DecompositionFactory;
import ac.soton.eventb.decomposition.DecompositionPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
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

import ac.soton.eventb.emf.components.ComponentsFactory;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.statemachines.StatemachinesFactory;
import ac.soton.eventb.statemachines.StatemachinesPackage;

/**
 * This is the item provider adapter for a {@link ac.soton.eventb.emf.components.Connector} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectorItemProvider
	extends EventBNamedCommentedElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		ITableItemLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorItemProvider(AdapterFactory adapterFactory) {
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
			addTypePropertyDescriptor(object);
			addInheritsPropertyDescriptor(object);
			addConnectorPropertyDescriptor(object);
			addDestinationsPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addReadyPropertyDescriptor(object);
			addProjectNamePropertyDescriptor(object);
			addContextNamePropertyDescriptor(object);
			addAllocatedVariablesPropertyDescriptor(object);
			addAllocatedExtensionsPropertyDescriptor(object);
			addMachineNamePropertyDescriptor(object);
			addInitialValuePropertyDescriptor(object);
			addReceiversPropertyDescriptor(object);
			addSenderPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Extension Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @since 6.0
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
	 * This adds a property descriptor for the Sender feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSenderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connector_sender_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connector_sender_feature", "_UI_Connector_type"),
				 ComponentsPackage.Literals.CONNECTOR__SENDER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Receivers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReceiversPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connector_receivers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connector_receivers_feature", "_UI_Connector_type"),
				 ComponentsPackage.Literals.CONNECTOR__RECEIVERS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractPort_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractPort_type_feature", "_UI_AbstractPort_type"),
				 ComponentsPackage.Literals.ABSTRACT_PORT__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initial Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Connector_initialValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Connector_initialValue_feature", "_UI_Connector_type"),
				 ComponentsPackage.Literals.CONNECTOR__INITIAL_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inherits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractPort_inherits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractPort_inherits_feature", "_UI_AbstractPort_type"),
				 ComponentsPackage.Literals.ABSTRACT_PORT__INHERITS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractPort_connector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractPort_connector_feature", "_UI_AbstractPort_type"),
				 ComponentsPackage.Literals.ABSTRACT_PORT__CONNECTOR,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Destinations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDestinationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractInSender_destinations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractInSender_destinations_feature", "_UI_AbstractInSender_type"),
				 ComponentsPackage.Literals.ABSTRACT_IN_SENDER__DESTINATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractOutReceiver_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractOutReceiver_source_feature", "_UI_AbstractOutReceiver_type"),
				 ComponentsPackage.Literals.ABSTRACT_OUT_RECEIVER__SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ready feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @since 6.0
	 */
	protected void addReadyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractRegion_ready_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractRegion_ready_feature", "_UI_AbstractRegion_type"),
				 DecompositionPackage.Literals.ABSTRACT_REGION__READY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Project Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @since 6.0
	 */
	protected void addProjectNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractRegion_projectName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractRegion_projectName_feature", "_UI_AbstractRegion_type"),
				 DecompositionPackage.Literals.ABSTRACT_REGION__PROJECT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Context Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @since 6.0
	 */
	protected void addContextNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractRegion_contextName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractRegion_contextName_feature", "_UI_AbstractRegion_type"),
				 DecompositionPackage.Literals.ABSTRACT_REGION__CONTEXT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allocated Variables feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @since 6.0
	 */
	protected void addAllocatedVariablesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractRegion_allocatedVariables_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractRegion_allocatedVariables_feature", "_UI_AbstractRegion_type"),
				 DecompositionPackage.Literals.ABSTRACT_REGION__ALLOCATED_VARIABLES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allocated Extensions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @since 6.0
	 */
	protected void addAllocatedExtensionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractRegion_allocatedExtensions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractRegion_allocatedExtensions_feature", "_UI_AbstractRegion_type"),
				 DecompositionPackage.Literals.ABSTRACT_REGION__ALLOCATED_EXTENSIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Machine Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @since 6.0
	 */
	protected void addMachineNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractRegion_machineName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractRegion_machineName_feature", "_UI_AbstractRegion_type"),
				 DecompositionPackage.Literals.ABSTRACT_REGION__MACHINE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Connector.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Connector"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Connector)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Connector_type") :
			getString("_UI_Connector_type") + " " + label;
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

		switch (notification.getFeatureID(Connector.class)) {
			case ComponentsPackage.CONNECTOR__EXTENSION_ID:
			case ComponentsPackage.CONNECTOR__TYPE:
			case ComponentsPackage.CONNECTOR__READY:
			case ComponentsPackage.CONNECTOR__PROJECT_NAME:
			case ComponentsPackage.CONNECTOR__CONTEXT_NAME:
			case ComponentsPackage.CONNECTOR__MACHINE_NAME:
			case ComponentsPackage.CONNECTOR__INITIAL_VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
		
			
		if (object instanceof EObject && 
			ComponentsPackage.Literals.COMPONENT.getEAnnotation("org.eventb.emf.core.extendedMetaClasses") == null  || 
			ComponentsPackage.Literals.COMPONENT.getEAnnotation("org.eventb.emf.core.extendedMetaClasses").getReferences().contains(((EObject)object).eClass()))
		
			newChildDescriptors.add
				(createChildParameter
					(CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS,
				 	ComponentsFactory.eINSTANCE.createComponent()));
		
			
		if (object instanceof EObject && 
			ComponentsPackage.Literals.CONNECTOR.getEAnnotation("org.eventb.emf.core.extendedMetaClasses") == null  || 
			ComponentsPackage.Literals.CONNECTOR.getEAnnotation("org.eventb.emf.core.extendedMetaClasses").getReferences().contains(((EObject)object).eClass()))
		
			newChildDescriptors.add
				(createChildParameter
					(CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS,
				 	ComponentsFactory.eINSTANCE.createConnector()));
		
			
		if (object instanceof EObject && 
			DecompositionPackage.Literals.REGION.getEAnnotation("org.eventb.emf.core.extendedMetaClasses") == null  || 
			DecompositionPackage.Literals.REGION.getEAnnotation("org.eventb.emf.core.extendedMetaClasses").getReferences().contains(((EObject)object).eClass()))
		
			newChildDescriptors.add
				(createChildParameter
					(CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS,
				 	DecompositionFactory.eINSTANCE.createRegion()));
		
			
		if (object instanceof EObject && 
			StatemachinesPackage.Literals.STATEMACHINE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses") == null  || 
			StatemachinesPackage.Literals.STATEMACHINE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses").getReferences().contains(((EObject)object).eClass()))
		
			newChildDescriptors.add
				(createChildParameter
					(CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS,
				 	StatemachinesFactory.eINSTANCE.createStatemachine()));
	}

}
