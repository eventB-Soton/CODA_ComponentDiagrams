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
package ac.soton.eventb.emf.components.impl;

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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eventb.emf.core.impl.EventBNamedCommentedElementImpl;

import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.emf.components.InPort;
import ac.soton.eventb.emf.components.OutPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getSendPort <em>Send Port</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getReceivePorts <em>Receive Ports</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getInherits <em>Inherits</em>}</li>
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
	public static final String copyright = "Copyright (c) 2011-2016\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * The cached value of the '{@link #getSendPort() <em>Send Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendPort()
	 * @generated
	 * @ordered
	 */
	protected OutPort sendPort;

	/**
	 * The cached value of the '{@link #getReceivePorts() <em>Receive Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivePorts()
	 * @generated
	 * @ordered
	 */
	protected EList<InPort> receivePorts;

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
	 * The cached value of the '{@link #getInherits() <em>Inherits</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInherits()
	 * @generated
	 * @ordered
	 */
	protected Connector inherits;

	/**
	 * This is true if the Inherits reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inheritsESet;

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
	public OutPort getSendPort() {
		if (sendPort != null && sendPort.eIsProxy()) {
			InternalEObject oldSendPort = (InternalEObject)sendPort;
			sendPort = (OutPort)eResolveProxy(oldSendPort);
			if (sendPort != oldSendPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.CONNECTOR__SEND_PORT, oldSendPort, sendPort));
			}
		}
		return sendPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort basicGetSendPort() {
		return sendPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendPort(OutPort newSendPort, NotificationChain msgs) {
		OutPort oldSendPort = sendPort;
		sendPort = newSendPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__SEND_PORT, oldSendPort, newSendPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendPort(OutPort newSendPort) {
		if (newSendPort != sendPort) {
			NotificationChain msgs = null;
			if (sendPort != null)
				msgs = ((InternalEObject)sendPort).eInverseRemove(this, ComponentsPackage.OUT_PORT__OUT_CONNECTOR, OutPort.class, msgs);
			if (newSendPort != null)
				msgs = ((InternalEObject)newSendPort).eInverseAdd(this, ComponentsPackage.OUT_PORT__OUT_CONNECTOR, OutPort.class, msgs);
			msgs = basicSetSendPort(newSendPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__SEND_PORT, newSendPort, newSendPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InPort> getReceivePorts() {
		if (receivePorts == null) {
			receivePorts = new EObjectWithInverseResolvingEList<InPort>(InPort.class, this, ComponentsPackage.CONNECTOR__RECEIVE_PORTS, ComponentsPackage.IN_PORT__IN_CONNECTOR);
		}
		return receivePorts;
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
		return (Component) (getSendPort() == null? null : getSendPort().eContainer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getType() {
		if (getInherits() instanceof Connector)	return inherits.getType();
		else return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * if inherits is set, the type cannot be changed and is always set to the same type as the inherited connector
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setType(String newType) {
		String oldType = type;
		type = (getInherits() instanceof Connector)? inherits.getType() : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getInitialValue() {
		if (getInherits() instanceof Connector)	return inherits.getInitialValue();
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 	if inherits is set, the initial value cannot be changed and is always set to the same as the inherited connector
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setInitialValue(String newInitialValue) {
		String oldInitialValue = initialValue;
		initialValue = (getInherits() instanceof Connector)? inherits.getInitialValue() : newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__INITIAL_VALUE, oldInitialValue, initialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getInherits() {
		if (inherits != null && inherits.eIsProxy()) {
			InternalEObject oldInherits = (InternalEObject)inherits;
			inherits = (Connector)eResolveProxy(oldInherits);
			if (inherits != oldInherits) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.CONNECTOR__INHERITS, oldInherits, inherits));
			}
		}
		return inherits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetInherits() {
		return inherits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * the name of this connector is set to be the same as the name of the connector it inherits from
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setInherits(Connector newInherits) {
		
		if (newInherits==null) unsetInherits();
		
		Connector oldInherits = inherits;
		inherits = newInherits;
		inheritsESet = true;								//custom - setting these attributes ensures they are updated in UI
		super.setName(inherits.getName()); 					//custom - as the set will generate notifications
		setType(inherits.getType());  						//custom
		setInitialValue(inherits.getInitialValue());		//custom
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__INHERITS, oldInherits, inherits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInherits() {
		Connector oldInherits = inherits;
		boolean oldInheritsESet = inheritsESet;
		inherits = null;
		inheritsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentsPackage.CONNECTOR__INHERITS, oldInherits, null, oldInheritsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInherits() {
		return inheritsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * returns an unmodifiable list of the components that own the InPorts connected to this connector via the ReceivePorts association
	 * 	 (Receivers is a derived, volatile, transient, unmodifiable relationship)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Component> getReceivers() {
		ArrayList<Component> receivers = new ArrayList<Component>();
		for (InPort inp : this.getReceivePorts()){
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
			case ComponentsPackage.CONNECTOR__SEND_PORT:
				if (sendPort != null)
					msgs = ((InternalEObject)sendPort).eInverseRemove(this, ComponentsPackage.OUT_PORT__OUT_CONNECTOR, OutPort.class, msgs);
				return basicSetSendPort((OutPort)otherEnd, msgs);
			case ComponentsPackage.CONNECTOR__RECEIVE_PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceivePorts()).basicAdd(otherEnd, msgs);
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
			case ComponentsPackage.CONNECTOR__SEND_PORT:
				return basicSetSendPort(null, msgs);
			case ComponentsPackage.CONNECTOR__RECEIVE_PORTS:
				return ((InternalEList<?>)getReceivePorts()).basicRemove(otherEnd, msgs);
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
			case ComponentsPackage.CONNECTOR__SEND_PORT:
				if (resolve) return getSendPort();
				return basicGetSendPort();
			case ComponentsPackage.CONNECTOR__RECEIVE_PORTS:
				return getReceivePorts();
			case ComponentsPackage.CONNECTOR__TYPE:
				return getType();
			case ComponentsPackage.CONNECTOR__INITIAL_VALUE:
				return getInitialValue();
			case ComponentsPackage.CONNECTOR__INHERITS:
				if (resolve) return getInherits();
				return basicGetInherits();
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
			case ComponentsPackage.CONNECTOR__SEND_PORT:
				setSendPort((OutPort)newValue);
				return;
			case ComponentsPackage.CONNECTOR__RECEIVE_PORTS:
				getReceivePorts().clear();
				getReceivePorts().addAll((Collection<? extends InPort>)newValue);
				return;
			case ComponentsPackage.CONNECTOR__TYPE:
				setType((String)newValue);
				return;
			case ComponentsPackage.CONNECTOR__INITIAL_VALUE:
				setInitialValue((String)newValue);
				return;
			case ComponentsPackage.CONNECTOR__INHERITS:
				setInherits((Connector)newValue);
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
			case ComponentsPackage.CONNECTOR__SEND_PORT:
				setSendPort((OutPort)null);
				return;
			case ComponentsPackage.CONNECTOR__RECEIVE_PORTS:
				getReceivePorts().clear();
				return;
			case ComponentsPackage.CONNECTOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ComponentsPackage.CONNECTOR__INITIAL_VALUE:
				setInitialValue(INITIAL_VALUE_EDEFAULT);
				return;
			case ComponentsPackage.CONNECTOR__INHERITS:
				unsetInherits();
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
			case ComponentsPackage.CONNECTOR__SEND_PORT:
				return sendPort != null;
			case ComponentsPackage.CONNECTOR__RECEIVE_PORTS:
				return receivePorts != null && !receivePorts.isEmpty();
			case ComponentsPackage.CONNECTOR__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ComponentsPackage.CONNECTOR__INITIAL_VALUE:
				return INITIAL_VALUE_EDEFAULT == null ? initialValue != null : !INITIAL_VALUE_EDEFAULT.equals(initialValue);
			case ComponentsPackage.CONNECTOR__INHERITS:
				return isSetInherits();
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", initialValue: ");
		result.append(initialValue);
		result.append(')');
		return result.toString();
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * if inherits is set this copies the name from the inherited element
	 * otherwise set the name of this component.
	 * <!-- end-user-doc -->
	 * @custom
	 */
	@Override
	public void setName(String name) {
		if (getInherits() instanceof Connector)	super.setName(inherits.getName()); 
		else super.setName(name);
	}
	
	
} //ConnectorImpl
