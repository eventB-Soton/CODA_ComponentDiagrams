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
import ac.soton.eventb.emf.components.WakeEvent;
import ac.soton.eventb.emf.components.WakeQueue;
import ac.soton.eventb.statemachines.StatemachinesFactory;
import ac.soton.eventb.statemachines.StatemachinesPackage;

/**
 * This is the item provider adapter for a {@link ac.soton.eventb.emf.components.WakeEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WakeEventItemProvider
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
	public WakeEventItemProvider(AdapterFactory adapterFactory) {
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

			addDelay_minPropertyDescriptor(object);
			addWakeKindPropertyDescriptor(object);
			addDelay_maxPropertyDescriptor(object);
			addQueuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Delay min feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDelay_minPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WakeEvent_delay_min_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WakeEvent_delay_min_feature", "_UI_WakeEvent_type"),
				 ComponentsPackage.Literals.WAKE_EVENT__DELAY_MIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wake Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWakeKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WakeEvent_wakeKind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WakeEvent_wakeKind_feature", "_UI_WakeEvent_type"),
				 ComponentsPackage.Literals.WAKE_EVENT__WAKE_KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delay max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDelay_maxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WakeEvent_delay_max_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WakeEvent_delay_max_feature", "_UI_WakeEvent_type"),
				 ComponentsPackage.Literals.WAKE_EVENT__DELAY_MAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Queue feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WakeEvent_queue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WakeEvent_queue_feature", "_UI_WakeEvent_type"),
				 ComponentsPackage.Literals.WAKE_EVENT__QUEUE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns WakeEvent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WakeEvent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((WakeEvent)object).getName();
		WakeQueue queue = ((WakeEvent)object).getQueue();
		String qname = queue==null? "<wakeQueue?>" : queue.getName();
		return label == null || label.length() == 0 ?
			getString("_UI_WakeEvent_type") :
			getString("_UI_WakeEvent_type") + " "+label+": "+qname+"("+((WakeEvent)object).getDelay_min()+".."+((WakeEvent)object).getDelay_max()+")";
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

		switch (notification.getFeatureID(WakeEvent.class)) {
			case ComponentsPackage.WAKE_EVENT__DELAY_MIN:
			case ComponentsPackage.WAKE_EVENT__WAKE_KIND:
			case ComponentsPackage.WAKE_EVENT__DELAY_MAX:
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
