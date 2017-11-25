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
package ac.soton.eventb.emf.components.impl;

import ac.soton.eventb.decomposition.AbstractRegion;
import ac.soton.eventb.decomposition.DecompositionPackage;
import ac.soton.eventb.emf.components.AbstractInReceiver;
import ac.soton.eventb.emf.components.AbstractInSender;
import ac.soton.eventb.emf.components.AbstractOutReceiver;
import ac.soton.eventb.emf.components.AbstractOutSender;
import ac.soton.eventb.emf.components.AbstractPort;
import ac.soton.eventb.emf.components.Component;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.impl.EventBNamedCommentedElementImpl;

import org.eventb.emf.core.machine.Variable;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.Connector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getExtensionId <em>Extension Id</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getInherits <em>Inherits</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getDestinations <em>Destinations</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#isReady <em>Ready</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getContextName <em>Context Name</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getAllocatedVariables <em>Allocated Variables</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getAllocatedExtensions <em>Allocated Extensions</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getMachineName <em>Machine Name</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getReceivers <em>Receivers</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getSender <em>Sender</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends EventBNamedCommentedElementImpl implements Connector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011-2017\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * The default value of the '{@link #getExtensionId() <em>Extension Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionId()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String EXTENSION_ID_EDEFAULT = ComponentsPackage.COMPONENTS_EXTENSION_ID;

	/**
	 * The cached value of the '{@link #getExtensionId() <em>Extension Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionId()
	 * @generated NOT
	 * @ordered
	 */
	protected String extensionId = EXTENSION_ID_EDEFAULT+"."+EcoreUtil.generateUUID();

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "\u2115";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInherits() <em>Inherits</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInherits()
	 * @generated
	 * @ordered
	 */
	protected AbstractPort inherits;

	/**
	 * The cached value of the '{@link #getDestinations() <em>Destinations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinations()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInReceiver> destinations;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected AbstractOutSender source;

	/**
	 * The default value of the '{@link #isReady() <em>Ready</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReady()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReady() <em>Ready</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReady()
	 * @generated
	 * @ordered
	 */
	protected boolean ready = READY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContextName() <em>Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextName() <em>Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextName()
	 * @generated
	 * @ordered
	 */
	protected String contextName = CONTEXT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllocatedVariables() <em>Allocated Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> allocatedVariables;

	/**
	 * The cached value of the '{@link #getAllocatedExtensions() <em>Allocated Extensions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractExtension> allocatedExtensions;

	/**
	 * The default value of the '{@link #getMachineName() <em>Machine Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineName()
	 * @generated
	 * @ordered
	 */
	protected static final String MACHINE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMachineName() <em>Machine Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachineName()
	 * @generated
	 * @ordered
	 */
	protected String machineName = MACHINE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_VALUE_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected String initialValue = INITIAL_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensionId() {
		return extensionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionId(String newExtensionId) {
		String oldExtensionId = extensionId;
		extensionId = newExtensionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__EXTENSION_ID, oldExtensionId, extensionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * returns the component that owns the OutPort connected to this connector via the SendPort association,
	 * or null if that connection does not exist
	 * 	 (sender is a derived, volatile, transient, unmodifiable relationship)
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getSender() {
		Component sender = basicGetSender();
		return sender != null && sender.eIsProxy() ? (Component)eResolveProxy((InternalEObject)sender) : sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * returns the component that owns the OutPort connected to this connector via the SendPort association,
	 * or null if that connection does not exist
	 * 	 (sender is a derived, volatile, transient, unmodifiable relationship)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Component basicGetSender() {
		return (Component) (getSource() == null? null : getSource().eContainer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * if inherits is set and not a proxy (getInherits will have tried to resolve it but may have failed)
	 * 		copies the type of the inherited connector to the local type field
	 * 		and then returns the type
	 *	otherwise just returns the type	 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getType() {
		inherits = getInherits();
		if (inherits!=null && !inherits.eIsProxy()) {
			String oldType = type;
			type = getInherits().getType();
			if (eNotificationRequired())
				if (oldType != type) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__TYPE, oldType, type));

		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * setting type is disabled if inherits
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setType(String newType) {
		if (inherits!=null)	return;
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			if (oldType != type) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * if inherits is set and not a proxy (getInherits will have tried to resolve it but may have failed)
	 * 		copies the initialValue of the inherited connector to the local initialValue field
	 * 		and then returns the initialValue
	 *	otherwise just returns the initialValue	 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getInitialValue() {
		inherits = getInherits();
		if (inherits!=null && !inherits.eIsProxy()) {
			String oldInitialValue = initialValue;
			initialValue = ((Connector)getInherits()).getInitialValue();
			if (eNotificationRequired())
				if (oldInitialValue != initialValue) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__INITIAL_VALUE, oldInitialValue, initialValue));

		}
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * setting initialValue is disabled if inherits
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setInitialValue(String newinitialValue) {
		if (inherits!=null)	return;
		String oldInitialValue = initialValue;
		initialValue = newinitialValue;
		if (eNotificationRequired())
			if (oldInitialValue != initialValue) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__INITIAL_VALUE, oldInitialValue, initialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPort getInherits() {
		String oldInitialValue = initialValue;
		String oldType = type;
		String oldName = name;
		Connector oldInherits = (Connector)inherits;
		if (inherits!=null && inherits.eIsProxy()) {
			inherits = (AbstractPort)eResolveProxy((InternalEObject) inherits);
		}
		if (inherits!=null && !inherits.eIsProxy()){
			type = inherits.getType();
			name = inherits.getName();
			initialValue =  ((Connector)inherits).getInitialValue();
		}
		if (eNotificationRequired()) {
			if (oldInherits != inherits) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__INHERITS, oldInherits, inherits));
			if (oldType != type) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__TYPE, oldType, type));
			if (oldName != name) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__NAME, oldName, name));
			if (oldInitialValue != initialValue) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__INITIAL_VALUE, oldInitialValue, initialValue));	
		}
		return inherits;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPort basicGetInherits() {
		return inherits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOTE: newInherits must be a Connector
	 * when inherits is set, the local values of the name, type and initialValue attributes are
	 *  automatically set to the corresponding attribute value from the inherited Connector
	 * notification is given of changes to all the things that are inherited as well as inherits
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setInherits(AbstractPort newInherits) {
		if (newInherits == null || newInherits instanceof Connector){
			AbstractPort oldInherits = inherits;
			String oldName = name;
			String oldType = type;
			String oldInitialValue = initialValue;
			inherits = newInherits;
			name = getName();
			type = getType();
			initialValue = getInitialValue();
			if (eNotificationRequired()) {
				if (oldInherits != inherits) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__INHERITS, oldInherits, inherits));
				if (oldName != name) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__NAME, oldName, getName()));
				if (oldType != type) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__TYPE, oldType, getType()));
				if (oldInitialValue != initialValue) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__INITIAL_VALUE, oldInitialValue, getInitialValue()));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnector() {
		Connector connector = basicGetConnector();
		return connector != null && connector.eIsProxy() ? (Connector)eResolveProxy((InternalEObject)connector) : connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * return itself
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Connector basicGetConnector() {
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractInReceiver> getDestinations() {
		if (destinations == null) {
			destinations = new EObjectWithInverseResolvingEList<AbstractInReceiver>(AbstractInReceiver.class, this, ComponentsPackage.CONNECTOR__DESTINATIONS, ComponentsPackage.ABSTRACT_IN_RECEIVER__SOURCE);
		}
		return destinations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractOutSender getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (AbstractOutSender)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.CONNECTOR__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractOutSender basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(AbstractOutSender newSource, NotificationChain msgs) {
		AbstractOutSender oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(AbstractOutSender newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, ComponentsPackage.ABSTRACT_OUT_SENDER__DESTINATION, AbstractOutSender.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, ComponentsPackage.ABSTRACT_OUT_SENDER__DESTINATION, AbstractOutSender.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__SOURCE, newSource, newSource));
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReady() {
		return ready;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReady(boolean newReady) {
		boolean oldReady = ready;
		ready = newReady;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__READY, oldReady, ready));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContextName() {
		return contextName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextName(String newContextName) {
		String oldContextName = contextName;
		contextName = newContextName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__CONTEXT_NAME, oldContextName, contextName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getAllocatedVariables() {
		if (allocatedVariables == null) {
			allocatedVariables = new EObjectResolvingEList<Variable>(Variable.class, this, ComponentsPackage.CONNECTOR__ALLOCATED_VARIABLES);
		}
		return allocatedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractExtension> getAllocatedExtensions() {
		if (allocatedExtensions == null) {
			allocatedExtensions = new EObjectResolvingEList<AbstractExtension>(AbstractExtension.class, this, ComponentsPackage.CONNECTOR__ALLOCATED_EXTENSIONS);
		}
		return allocatedExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMachineName() {
		return machineName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachineName(String newMachineName) {
		String oldMachineName = machineName;
		machineName = newMachineName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__MACHINE_NAME, oldMachineName, machineName));
	}

	//	/**
//	 * <!-- begin-user-doc -->
//	 * the name of this connector is set to be the same as the name of the connector it inherits from
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	public void setInherits(Connector newInherits) {
//		
//		//if (newInherits==null) unsetInherits();
//		
//		AbstractPort oldInherits = inherits;
//		inherits = newInherits;
//		//inheritsESet = true;								//custom - setting these attributes ensures they are updated in UI
//		super.setName(inherits.getName()); 					//custom - as the set will generate notifications
//		setType(inherits.getType());  						//custom
//		setInitialValue(((Connector)inherits).getInitialValue());		//custom
//		if (eNotificationRequired())
//			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__INHERITS, oldInherits, inherits));
//	}

	/**
	 * <!-- begin-user-doc -->
	 * returns an unmodifiable list of the components that own the InPorts connected to this connector via the ReceivePorts association
	 * 	 (Receivers is a derived, volatile, transient, unmodifiable relationship)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Component> getReceivers() {
		ArrayList<Component> receivers = new ArrayList<Component>();
		for (AbstractInReceiver inp : this.getDestinations()){
			if (inp.eContainer() instanceof Component){
				receivers.add((Component) inp.eContainer());
			}
		}
		return new BasicEList.UnmodifiableEList<Component>(receivers.size(), receivers.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.CONNECTOR__DESTINATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDestinations()).basicAdd(otherEnd, msgs);
			case ComponentsPackage.CONNECTOR__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, ComponentsPackage.ABSTRACT_OUT_SENDER__DESTINATION, AbstractOutSender.class, msgs);
				return basicSetSource((AbstractOutSender)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.CONNECTOR__DESTINATIONS:
				return ((InternalEList<?>)getDestinations()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.CONNECTOR__SOURCE:
				return basicSetSource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.CONNECTOR__EXTENSION_ID:
				return getExtensionId();
			case ComponentsPackage.CONNECTOR__TYPE:
				return getType();
			case ComponentsPackage.CONNECTOR__INHERITS:
				if (resolve) return getInherits();
				return basicGetInherits();
			case ComponentsPackage.CONNECTOR__CONNECTOR:
				if (resolve) return getConnector();
				return basicGetConnector();
			case ComponentsPackage.CONNECTOR__DESTINATIONS:
				return getDestinations();
			case ComponentsPackage.CONNECTOR__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ComponentsPackage.CONNECTOR__READY:
				return isReady();
			case ComponentsPackage.CONNECTOR__PROJECT_NAME:
				return getProjectName();
			case ComponentsPackage.CONNECTOR__CONTEXT_NAME:
				return getContextName();
			case ComponentsPackage.CONNECTOR__ALLOCATED_VARIABLES:
				return getAllocatedVariables();
			case ComponentsPackage.CONNECTOR__ALLOCATED_EXTENSIONS:
				return getAllocatedExtensions();
			case ComponentsPackage.CONNECTOR__MACHINE_NAME:
				return getMachineName();
			case ComponentsPackage.CONNECTOR__INITIAL_VALUE:
				return getInitialValue();
			case ComponentsPackage.CONNECTOR__RECEIVERS:
				return getReceivers();
			case ComponentsPackage.CONNECTOR__SENDER:
				if (resolve) return getSender();
				return basicGetSender();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentsPackage.CONNECTOR__EXTENSION_ID:
				setExtensionId((String)newValue);
				return;
			case ComponentsPackage.CONNECTOR__TYPE:
				setType((String)newValue);
				return;
			case ComponentsPackage.CONNECTOR__INHERITS:
				setInherits((AbstractPort)newValue);
				return;
			case ComponentsPackage.CONNECTOR__DESTINATIONS:
				getDestinations().clear();
				getDestinations().addAll((Collection<? extends AbstractInReceiver>)newValue);
				return;
			case ComponentsPackage.CONNECTOR__SOURCE:
				setSource((AbstractOutSender)newValue);
				return;
			case ComponentsPackage.CONNECTOR__READY:
				setReady((Boolean)newValue);
				return;
			case ComponentsPackage.CONNECTOR__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
			case ComponentsPackage.CONNECTOR__CONTEXT_NAME:
				setContextName((String)newValue);
				return;
			case ComponentsPackage.CONNECTOR__ALLOCATED_VARIABLES:
				getAllocatedVariables().clear();
				getAllocatedVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case ComponentsPackage.CONNECTOR__ALLOCATED_EXTENSIONS:
				getAllocatedExtensions().clear();
				getAllocatedExtensions().addAll((Collection<? extends AbstractExtension>)newValue);
				return;
			case ComponentsPackage.CONNECTOR__MACHINE_NAME:
				setMachineName((String)newValue);
				return;
			case ComponentsPackage.CONNECTOR__INITIAL_VALUE:
				setInitialValue((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComponentsPackage.CONNECTOR__EXTENSION_ID:
				setExtensionId(EXTENSION_ID_EDEFAULT);
				return;
			case ComponentsPackage.CONNECTOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ComponentsPackage.CONNECTOR__INHERITS:
				setInherits((AbstractPort)null);
				return;
			case ComponentsPackage.CONNECTOR__DESTINATIONS:
				getDestinations().clear();
				return;
			case ComponentsPackage.CONNECTOR__SOURCE:
				setSource((AbstractOutSender)null);
				return;
			case ComponentsPackage.CONNECTOR__READY:
				setReady(READY_EDEFAULT);
				return;
			case ComponentsPackage.CONNECTOR__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
			case ComponentsPackage.CONNECTOR__CONTEXT_NAME:
				setContextName(CONTEXT_NAME_EDEFAULT);
				return;
			case ComponentsPackage.CONNECTOR__ALLOCATED_VARIABLES:
				getAllocatedVariables().clear();
				return;
			case ComponentsPackage.CONNECTOR__ALLOCATED_EXTENSIONS:
				getAllocatedExtensions().clear();
				return;
			case ComponentsPackage.CONNECTOR__MACHINE_NAME:
				setMachineName(MACHINE_NAME_EDEFAULT);
				return;
			case ComponentsPackage.CONNECTOR__INITIAL_VALUE:
				setInitialValue(INITIAL_VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComponentsPackage.CONNECTOR__EXTENSION_ID:
				return EXTENSION_ID_EDEFAULT == null ? extensionId != null : !EXTENSION_ID_EDEFAULT.equals(extensionId);
			case ComponentsPackage.CONNECTOR__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ComponentsPackage.CONNECTOR__INHERITS:
				return inherits != null;
			case ComponentsPackage.CONNECTOR__CONNECTOR:
				return basicGetConnector() != null;
			case ComponentsPackage.CONNECTOR__DESTINATIONS:
				return destinations != null && !destinations.isEmpty();
			case ComponentsPackage.CONNECTOR__SOURCE:
				return source != null;
			case ComponentsPackage.CONNECTOR__READY:
				return ready != READY_EDEFAULT;
			case ComponentsPackage.CONNECTOR__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
			case ComponentsPackage.CONNECTOR__CONTEXT_NAME:
				return CONTEXT_NAME_EDEFAULT == null ? contextName != null : !CONTEXT_NAME_EDEFAULT.equals(contextName);
			case ComponentsPackage.CONNECTOR__ALLOCATED_VARIABLES:
				return allocatedVariables != null && !allocatedVariables.isEmpty();
			case ComponentsPackage.CONNECTOR__ALLOCATED_EXTENSIONS:
				return allocatedExtensions != null && !allocatedExtensions.isEmpty();
			case ComponentsPackage.CONNECTOR__MACHINE_NAME:
				return MACHINE_NAME_EDEFAULT == null ? machineName != null : !MACHINE_NAME_EDEFAULT.equals(machineName);
			case ComponentsPackage.CONNECTOR__INITIAL_VALUE:
				return INITIAL_VALUE_EDEFAULT == null ? initialValue != null : !INITIAL_VALUE_EDEFAULT.equals(initialValue);
			case ComponentsPackage.CONNECTOR__RECEIVERS:
				return !getReceivers().isEmpty();
			case ComponentsPackage.CONNECTOR__SENDER:
				return basicGetSender() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractExtension.class) {
			switch (derivedFeatureID) {
				case ComponentsPackage.CONNECTOR__EXTENSION_ID: return CorePackage.ABSTRACT_EXTENSION__EXTENSION_ID;
				default: return -1;
			}
		}
		if (baseClass == AbstractPort.class) {
			switch (derivedFeatureID) {
				case ComponentsPackage.CONNECTOR__TYPE: return ComponentsPackage.ABSTRACT_PORT__TYPE;
				case ComponentsPackage.CONNECTOR__INHERITS: return ComponentsPackage.ABSTRACT_PORT__INHERITS;
				case ComponentsPackage.CONNECTOR__CONNECTOR: return ComponentsPackage.ABSTRACT_PORT__CONNECTOR;
				default: return -1;
			}
		}
		if (baseClass == AbstractInSender.class) {
			switch (derivedFeatureID) {
				case ComponentsPackage.CONNECTOR__DESTINATIONS: return ComponentsPackage.ABSTRACT_IN_SENDER__DESTINATIONS;
				default: return -1;
			}
		}
		if (baseClass == AbstractOutReceiver.class) {
			switch (derivedFeatureID) {
				case ComponentsPackage.CONNECTOR__SOURCE: return ComponentsPackage.ABSTRACT_OUT_RECEIVER__SOURCE;
				default: return -1;
			}
		}
		if (baseClass == AbstractRegion.class) {
			switch (derivedFeatureID) {
				case ComponentsPackage.CONNECTOR__READY: return DecompositionPackage.ABSTRACT_REGION__READY;
				case ComponentsPackage.CONNECTOR__PROJECT_NAME: return DecompositionPackage.ABSTRACT_REGION__PROJECT_NAME;
				case ComponentsPackage.CONNECTOR__CONTEXT_NAME: return DecompositionPackage.ABSTRACT_REGION__CONTEXT_NAME;
				case ComponentsPackage.CONNECTOR__ALLOCATED_VARIABLES: return DecompositionPackage.ABSTRACT_REGION__ALLOCATED_VARIABLES;
				case ComponentsPackage.CONNECTOR__ALLOCATED_EXTENSIONS: return DecompositionPackage.ABSTRACT_REGION__ALLOCATED_EXTENSIONS;
				case ComponentsPackage.CONNECTOR__MACHINE_NAME: return DecompositionPackage.ABSTRACT_REGION__MACHINE_NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractExtension.class) {
			switch (baseFeatureID) {
				case CorePackage.ABSTRACT_EXTENSION__EXTENSION_ID: return ComponentsPackage.CONNECTOR__EXTENSION_ID;
				default: return -1;
			}
		}
		if (baseClass == AbstractPort.class) {
			switch (baseFeatureID) {
				case ComponentsPackage.ABSTRACT_PORT__TYPE: return ComponentsPackage.CONNECTOR__TYPE;
				case ComponentsPackage.ABSTRACT_PORT__INHERITS: return ComponentsPackage.CONNECTOR__INHERITS;
				case ComponentsPackage.ABSTRACT_PORT__CONNECTOR: return ComponentsPackage.CONNECTOR__CONNECTOR;
				default: return -1;
			}
		}
		if (baseClass == AbstractInSender.class) {
			switch (baseFeatureID) {
				case ComponentsPackage.ABSTRACT_IN_SENDER__DESTINATIONS: return ComponentsPackage.CONNECTOR__DESTINATIONS;
				default: return -1;
			}
		}
		if (baseClass == AbstractOutReceiver.class) {
			switch (baseFeatureID) {
				case ComponentsPackage.ABSTRACT_OUT_RECEIVER__SOURCE: return ComponentsPackage.CONNECTOR__SOURCE;
				default: return -1;
			}
		}
		if (baseClass == AbstractRegion.class) {
			switch (baseFeatureID) {
				case DecompositionPackage.ABSTRACT_REGION__READY: return ComponentsPackage.CONNECTOR__READY;
				case DecompositionPackage.ABSTRACT_REGION__PROJECT_NAME: return ComponentsPackage.CONNECTOR__PROJECT_NAME;
				case DecompositionPackage.ABSTRACT_REGION__CONTEXT_NAME: return ComponentsPackage.CONNECTOR__CONTEXT_NAME;
				case DecompositionPackage.ABSTRACT_REGION__ALLOCATED_VARIABLES: return ComponentsPackage.CONNECTOR__ALLOCATED_VARIABLES;
				case DecompositionPackage.ABSTRACT_REGION__ALLOCATED_EXTENSIONS: return ComponentsPackage.CONNECTOR__ALLOCATED_EXTENSIONS;
				case DecompositionPackage.ABSTRACT_REGION__MACHINE_NAME: return ComponentsPackage.CONNECTOR__MACHINE_NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (extensionId: ");
		result.append(extensionId);
		result.append(", type: ");
		result.append(type);
		result.append(", ready: ");
		result.append(ready);
		result.append(", projectName: ");
		result.append(projectName);
		result.append(", contextName: ");
		result.append(contextName);
		result.append(", machineName: ");
		result.append(machineName);
		result.append(", initialValue: ");
		result.append(initialValue);
		result.append(')');
		return result.toString();
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * 	if inherits is set, the name cannot be changed and 
	 * is always set to the same as the inherited port
	 * <!-- end-user-doc -->
	 * @custom
	 */
	@Override
	public void setName(String name) {
		if (inherits!=null)	return;
		else super.setName(name);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * if inherits is set, 
	 * 		copies the name of the inherited Port to the local name field
	 * 		and then returns the name
	 *	otherwise just returns the name
	 * <!-- end-user-doc -->
	 * @custom
	 */
	@Override
	public String getName(){
		inherits = getInherits();
		if (inherits!=null && !inherits.eIsProxy()) {
			String oldName = name;
			name = getInherits().getName();
			if (eNotificationRequired())
				if (oldName != name) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.ABSTRACT_PORT__NAME, oldName, name));

		}
		return super.getName();
	}
	
} //ConnectorImpl
