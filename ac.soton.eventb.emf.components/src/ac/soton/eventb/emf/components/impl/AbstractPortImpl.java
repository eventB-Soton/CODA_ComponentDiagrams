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

import ac.soton.eventb.emf.components.AbstractPort;
import ac.soton.eventb.emf.components.ComponentsPackage;

import ac.soton.eventb.emf.components.Connector;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eventb.emf.core.impl.EventBNamedCommentedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.components.impl.AbstractPortImpl#getType <em>Type</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.AbstractPortImpl#getInherits <em>Inherits</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.AbstractPortImpl#getConnector <em>Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractPortImpl extends EventBNamedCommentedElementImpl implements AbstractPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011-2017\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.ABSTRACT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * if inherits is set and not a proxy (getInherits will have tried to resolve it but may have failed)
	 * 		copies the type of the inherited Port to the local type field
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
				if (oldType != type) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.ABSTRACT_PORT__TYPE, oldType, type));

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
			if (oldType != type) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.ABSTRACT_PORT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * if inherits is a proxy try to resolve it
	 * if inherits is now resolved set the local type from the inherited type
	 * return inherits
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPort getInherits() {
		String oldType = type;
		String oldName = name;
		AbstractPort oldInherits = inherits;
		if (inherits!=null && inherits.eIsProxy()) {
			inherits = (AbstractPort)eResolveProxy((InternalEObject) inherits);
		}
		if (inherits!=null && !inherits.eIsProxy()){
			type = inherits.getType();
			name = inherits.getName();
		}
		if (eNotificationRequired()) {
			if (oldInherits != inherits) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.ABSTRACT_PORT__INHERITS, oldInherits, inherits));
			if (oldType != type) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.ABSTRACT_PORT__TYPE, oldType, type));
			if (oldName != name) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.ABSTRACT_PORT__NAME, oldName, name));
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
	 * when inherits is set, the local value of the type and name attributes are
	 * automatically set to the corresponding attribute value from the inherited Port.
	 * notification is given of changes to all the things that are inherited as well as inherits
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setInherits(AbstractPort newInherits) {
		String oldType = type;
		String oldName = name;
		AbstractPort oldInherits = inherits;
		inherits = newInherits;
		type = getType();
		name = getName();
		if (eNotificationRequired()) {
			if (oldInherits != inherits) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.ABSTRACT_PORT__INHERITS, oldInherits, inherits));
			if (oldType != type) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.ABSTRACT_PORT__TYPE, oldType, type));
			if (oldName != name) eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.ABSTRACT_PORT__NAME, oldName, name));
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
	 * This should be overridden by extenders..
	 * .. It is not implemented here
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetConnector() {
		// TODO: implement this method to return the 'Connector' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.ABSTRACT_PORT__TYPE:
				return getType();
			case ComponentsPackage.ABSTRACT_PORT__INHERITS:
				if (resolve) return getInherits();
				return basicGetInherits();
			case ComponentsPackage.ABSTRACT_PORT__CONNECTOR:
				if (resolve) return getConnector();
				return basicGetConnector();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentsPackage.ABSTRACT_PORT__TYPE:
				setType((String)newValue);
				return;
			case ComponentsPackage.ABSTRACT_PORT__INHERITS:
				setInherits((AbstractPort)newValue);
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
			case ComponentsPackage.ABSTRACT_PORT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ComponentsPackage.ABSTRACT_PORT__INHERITS:
				setInherits((AbstractPort)null);
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
			case ComponentsPackage.ABSTRACT_PORT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ComponentsPackage.ABSTRACT_PORT__INHERITS:
				return inherits != null;
			case ComponentsPackage.ABSTRACT_PORT__CONNECTOR:
				return basicGetConnector() != null;
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
	
} //AbstractPortImpl
