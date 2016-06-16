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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
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
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getReceivers <em>Receivers</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getInherits <em>Inherits</em>}</li>
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
	public static final String copyright = "Copyright (c) 2011\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected OutPort sender;

	/**
	 * The cached value of the '{@link #getReceivers() <em>Receivers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<InPort> receivers;

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
	public OutPort getSender() {
		if (sender != null && sender.eIsProxy()) {
			InternalEObject oldSender = (InternalEObject)sender;
			sender = (OutPort)eResolveProxy(oldSender);
			if (sender != oldSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.CONNECTOR__SENDER, oldSender, sender));
			}
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort basicGetSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSender(OutPort newSender, NotificationChain msgs) {
		OutPort oldSender = sender;
		sender = newSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__SENDER, oldSender, newSender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(OutPort newSender) {
		if (newSender != sender) {
			NotificationChain msgs = null;
			if (sender != null)
				msgs = ((InternalEObject)sender).eInverseRemove(this, ComponentsPackage.OUT_PORT__OUT_CONNECTOR, OutPort.class, msgs);
			if (newSender != null)
				msgs = ((InternalEObject)newSender).eInverseAdd(this, ComponentsPackage.OUT_PORT__OUT_CONNECTOR, OutPort.class, msgs);
			msgs = basicSetSender(newSender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__SENDER, newSender, newSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InPort> getReceivers() {
		if (receivers == null) {
			receivers = new EObjectWithInverseResolvingEList<InPort>(InPort.class, this, ComponentsPackage.CONNECTOR__RECEIVERS, ComponentsPackage.IN_PORT__IN_CONNECTOR);
		}
		return receivers;
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
	 * 	 * if inherits is set, the initial value cannot be changed and is always set to the same as the inherited connector
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
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.CONNECTOR__SENDER:
				if (sender != null)
					msgs = ((InternalEObject)sender).eInverseRemove(this, ComponentsPackage.OUT_PORT__OUT_CONNECTOR, OutPort.class, msgs);
				return basicSetSender((OutPort)otherEnd, msgs);
			case ComponentsPackage.CONNECTOR__RECEIVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceivers()).basicAdd(otherEnd, msgs);
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
			case ComponentsPackage.CONNECTOR__SENDER:
				return basicSetSender(null, msgs);
			case ComponentsPackage.CONNECTOR__RECEIVERS:
				return ((InternalEList<?>)getReceivers()).basicRemove(otherEnd, msgs);
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
			case ComponentsPackage.CONNECTOR__SENDER:
				if (resolve) return getSender();
				return basicGetSender();
			case ComponentsPackage.CONNECTOR__RECEIVERS:
				return getReceivers();
			case ComponentsPackage.CONNECTOR__TYPE:
				return getType();
			case ComponentsPackage.CONNECTOR__INITIAL_VALUE:
				return getInitialValue();
			case ComponentsPackage.CONNECTOR__INHERITS:
				if (resolve) return getInherits();
				return basicGetInherits();
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
			case ComponentsPackage.CONNECTOR__SENDER:
				setSender((OutPort)newValue);
				return;
			case ComponentsPackage.CONNECTOR__RECEIVERS:
				getReceivers().clear();
				getReceivers().addAll((Collection<? extends InPort>)newValue);
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
			case ComponentsPackage.CONNECTOR__SENDER:
				setSender((OutPort)null);
				return;
			case ComponentsPackage.CONNECTOR__RECEIVERS:
				getReceivers().clear();
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
			case ComponentsPackage.CONNECTOR__SENDER:
				return sender != null;
			case ComponentsPackage.CONNECTOR__RECEIVERS:
				return receivers != null && !receivers.isEmpty();
			case ComponentsPackage.CONNECTOR__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ComponentsPackage.CONNECTOR__INITIAL_VALUE:
				return INITIAL_VALUE_EDEFAULT == null ? initialValue != null : !INITIAL_VALUE_EDEFAULT.equals(initialValue);
			case ComponentsPackage.CONNECTOR__INHERITS:
				return isSetInherits();
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
