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
	public static final String copyright = "Copyright (c) 2011-2016\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

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
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.ABSTRACT_PORT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPort getInherits() {
		if (inherits != null && inherits.eIsProxy()) {
			InternalEObject oldInherits = (InternalEObject)inherits;
			inherits = (AbstractPort)eResolveProxy(oldInherits);
			if (inherits != oldInherits) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.ABSTRACT_PORT__INHERITS, oldInherits, inherits));
			}
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
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInherits(AbstractPort newInherits) {
		AbstractPort oldInherits = inherits;
		inherits = newInherits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.ABSTRACT_PORT__INHERITS, oldInherits, inherits));
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

} //AbstractPortImpl
