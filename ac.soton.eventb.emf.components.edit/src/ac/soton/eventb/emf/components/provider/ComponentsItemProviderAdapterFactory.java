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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eventb.emf.core.Annotation;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.util.CoreSwitch;

import ac.soton.eventb.emf.components.ComponentsFactory;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.util.ComponentsAdapterFactory;
import ac.soton.eventb.emf.diagrams.DiagramOwner;
import ac.soton.eventb.emf.diagrams.DiagramsPackage;
import ac.soton.eventb.emf.diagrams.util.DiagramsSwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentsItemProviderAdapterFactory extends ComponentsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011-2017\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(ComponentsEditPlugin.INSTANCE, ComponentsPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(ITableItemLabelProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.Connector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorItemProvider connectorItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectorAdapter() {
		if (connectorItemProvider == null) {
			connectorItemProvider = new ConnectorItemProvider(this);
		}

		return connectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.Method} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodItemProvider methodItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.Method}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMethodAdapter() {
		if (methodItemProvider == null) {
			methodItemProvider = new MethodItemProvider(this);
		}

		return methodItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.PortWake} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortWakeItemProvider portWakeItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.PortWake}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortWakeAdapter() {
		if (portWakeItemProvider == null) {
			portWakeItemProvider = new PortWakeItemProvider(this);
		}

		return portWakeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.DataPacket} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPacketItemProvider dataPacketItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.DataPacket}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataPacketAdapter() {
		if (dataPacketItemProvider == null) {
			dataPacketItemProvider = new DataPacketItemProvider(this);
		}

		return dataPacketItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.DelayedDataPacket} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelayedDataPacketItemProvider delayedDataPacketItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.DelayedDataPacket}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDelayedDataPacketAdapter() {
		if (delayedDataPacketItemProvider == null) {
			delayedDataPacketItemProvider = new DelayedDataPacketItemProvider(this);
		}

		return delayedDataPacketItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.SelfWake} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelfWakeItemProvider selfWakeItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.SelfWake}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelfWakeAdapter() {
		if (selfWakeItemProvider == null) {
			selfWakeItemProvider = new SelfWakeItemProvider(this);
		}

		return selfWakeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.External} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalItemProvider externalItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.External}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalAdapter() {
		if (externalItemProvider == null) {
			externalItemProvider = new ExternalItemProvider(this);
		}

		return externalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.WakeEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WakeEventItemProvider wakeEventItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.WakeEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWakeEventAdapter() {
		if (wakeEventItemProvider == null) {
			wakeEventItemProvider = new WakeEventItemProvider(this);
		}

		return wakeEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.Transition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionItemProvider transitionItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionItemProvider(this);
		}

		return transitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.OperationGuard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationGuardItemProvider operationGuardItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.OperationGuard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationGuardAdapter() {
		if (operationGuardItemProvider == null) {
			operationGuardItemProvider = new OperationGuardItemProvider(this);
		}

		return operationGuardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.OperationAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationActionItemProvider operationActionItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.OperationAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationActionAdapter() {
		if (operationActionItemProvider == null) {
			operationActionItemProvider = new OperationActionItemProvider(this);
		}

		return operationActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.OperationWitness} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationWitnessItemProvider operationWitnessItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.OperationWitness}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationWitnessAdapter() {
		if (operationWitnessItemProvider == null) {
			operationWitnessItemProvider = new OperationWitnessItemProvider(this);
		}

		return operationWitnessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.ComponentInvariant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInvariantItemProvider componentInvariantItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.ComponentInvariant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentInvariantAdapter() {
		if (componentInvariantItemProvider == null) {
			componentInvariantItemProvider = new ComponentInvariantItemProvider(this);
		}

		return componentInvariantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.ComponentVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentVariableItemProvider componentVariableItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.ComponentVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentVariableAdapter() {
		if (componentVariableItemProvider == null) {
			componentVariableItemProvider = new ComponentVariableItemProvider(this);
		}

		return componentVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.ComponentInitialisation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInitialisationItemProvider componentInitialisationItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.ComponentInitialisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentInitialisationAdapter() {
		if (componentInitialisationItemProvider == null) {
			componentInitialisationItemProvider = new ComponentInitialisationItemProvider(this);
		}

		return componentInitialisationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.ComponentSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentSetItemProvider componentSetItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.ComponentSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentSetAdapter() {
		if (componentSetItemProvider == null) {
			componentSetItemProvider = new ComponentSetItemProvider(this);
		}

		return componentSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.ComponentConstant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentConstantItemProvider componentConstantItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.ComponentConstant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentConstantAdapter() {
		if (componentConstantItemProvider == null) {
			componentConstantItemProvider = new ComponentConstantItemProvider(this);
		}

		return componentConstantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.ComponentAxiom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentAxiomItemProvider componentAxiomItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.ComponentAxiom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAxiomAdapter() {
		if (componentAxiomItemProvider == null) {
			componentAxiomItemProvider = new ComponentAxiomItemProvider(this);
		}

		return componentAxiomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.WakeQueue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WakeQueueItemProvider wakeQueueItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.WakeQueue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWakeQueueAdapter() {
		if (wakeQueueItemProvider == null) {
			wakeQueueItemProvider = new WakeQueueItemProvider(this);
		}

		return wakeQueueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.InPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InPortItemProvider inPortItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.InPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInPortAdapter() {
		if (inPortItemProvider == null) {
			inPortItemProvider = new InPortItemProvider(this);
		}

		return inPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.OutPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutPortItemProvider outPortItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.OutPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutPortAdapter() {
		if (outPortItemProvider == null) {
			outPortItemProvider = new OutPortItemProvider(this);
		}

		return outPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ac.soton.eventb.emf.components.AbstractDataPacket} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractDataPacketItemProvider abstractDataPacketItemProvider;

	/**
	 * This creates an adapter for a {@link ac.soton.eventb.emf.components.AbstractDataPacket}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAbstractDataPacketAdapter() {
		if (abstractDataPacketItemProvider == null) {
			abstractDataPacketItemProvider = new AbstractDataPacketItemProvider(this);
		}

		return abstractDataPacketItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (componentItemProvider != null) componentItemProvider.dispose();
		if (connectorItemProvider != null) connectorItemProvider.dispose();
		if (methodItemProvider != null) methodItemProvider.dispose();
		if (portWakeItemProvider != null) portWakeItemProvider.dispose();
		if (dataPacketItemProvider != null) dataPacketItemProvider.dispose();
		if (delayedDataPacketItemProvider != null) delayedDataPacketItemProvider.dispose();
		if (selfWakeItemProvider != null) selfWakeItemProvider.dispose();
		if (externalItemProvider != null) externalItemProvider.dispose();
		if (wakeEventItemProvider != null) wakeEventItemProvider.dispose();
		if (transitionItemProvider != null) transitionItemProvider.dispose();
		if (operationGuardItemProvider != null) operationGuardItemProvider.dispose();
		if (operationActionItemProvider != null) operationActionItemProvider.dispose();
		if (operationWitnessItemProvider != null) operationWitnessItemProvider.dispose();
		if (componentInvariantItemProvider != null) componentInvariantItemProvider.dispose();
		if (componentVariableItemProvider != null) componentVariableItemProvider.dispose();
		if (componentInitialisationItemProvider != null) componentInitialisationItemProvider.dispose();
		if (componentSetItemProvider != null) componentSetItemProvider.dispose();
		if (componentConstantItemProvider != null) componentConstantItemProvider.dispose();
		if (componentAxiomItemProvider != null) componentAxiomItemProvider.dispose();
		if (wakeQueueItemProvider != null) wakeQueueItemProvider.dispose();
		if (inPortItemProvider != null) inPortItemProvider.dispose();
		if (outPortItemProvider != null) outPortItemProvider.dispose();
		if (abstractDataPacketItemProvider != null) abstractDataPacketItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link DiagramsPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class DiagramsChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends DiagramsSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseDiagramOwner(DiagramOwner object) {
			
			EAnnotation annotation = null;
				
				annotation = ComponentsPackage.Literals.COMPONENT.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(DiagramsPackage.Literals.DIAGRAM_OWNER__DIAGRAMS,
							 ComponentsFactory.eINSTANCE.createComponent()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
		   new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
		   return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return ComponentsEditPlugin.INSTANCE;
		}
	}

	/**
	 * A child creation extender for the {@link CorePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class CoreChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends CoreSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseEventBElement(EventBElement object) {
			
			EAnnotation annotation = null;
				
				annotation = ComponentsPackage.Literals.COMPONENT.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS,
							 ComponentsFactory.eINSTANCE.createComponent()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseAnnotation(Annotation object) {
			
			EAnnotation annotation = null;
				
				annotation = ComponentsPackage.Literals.COMPONENT.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createComponent()));

				
				annotation = ComponentsPackage.Literals.CONNECTOR.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createConnector()));

				
				annotation = ComponentsPackage.Literals.METHOD.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createMethod()));

				
				annotation = ComponentsPackage.Literals.PORT_WAKE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createPortWake()));

				
				annotation = ComponentsPackage.Literals.ABSTRACT_DATA_PACKET.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createAbstractDataPacket()));

				
				annotation = ComponentsPackage.Literals.DATA_PACKET.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createDataPacket()));

				
				annotation = ComponentsPackage.Literals.DELAYED_DATA_PACKET.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createDelayedDataPacket()));

				
				annotation = ComponentsPackage.Literals.SELF_WAKE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createSelfWake()));

				
				annotation = ComponentsPackage.Literals.EXTERNAL.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createExternal()));

				
				annotation = ComponentsPackage.Literals.WAKE_EVENT.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createWakeEvent()));

				
				annotation = ComponentsPackage.Literals.TRANSITION.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createTransition()));

				
				annotation = ComponentsPackage.Literals.OPERATION_GUARD.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createOperationGuard()));

				
				annotation = ComponentsPackage.Literals.OPERATION_ACTION.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createOperationAction()));

				
				annotation = ComponentsPackage.Literals.OPERATION_WITNESS.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createOperationWitness()));

				
				annotation = ComponentsPackage.Literals.COMPONENT_INVARIANT.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createComponentInvariant()));

				
				annotation = ComponentsPackage.Literals.COMPONENT_VARIABLE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createComponentVariable()));

				
				annotation = ComponentsPackage.Literals.COMPONENT_INITIALISATION.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createComponentInitialisation()));

				
				annotation = ComponentsPackage.Literals.COMPONENT_SET.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createComponentSet()));

				
				annotation = ComponentsPackage.Literals.COMPONENT_CONSTANT.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createComponentConstant()));

				
				annotation = ComponentsPackage.Literals.COMPONENT_AXIOM.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createComponentAxiom()));

				
				annotation = ComponentsPackage.Literals.WAKE_QUEUE.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createWakeQueue()));

				
				annotation = ComponentsPackage.Literals.IN_PORT.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createInPort()));

				
				annotation = ComponentsPackage.Literals.OUT_PORT.getEAnnotation("org.eventb.emf.core.extendedMetaClasses");
				if (annotation == null  || annotation.getReferences().contains(object.eClass()))
					newChildDescriptors.add
						(createChildParameter
							(CorePackage.Literals.ANNOTATION__CONTENTS,
							 ComponentsFactory.eINSTANCE.createOutPort()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
		   new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
		   return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return ComponentsEditPlugin.INSTANCE;
		}
	}

}
