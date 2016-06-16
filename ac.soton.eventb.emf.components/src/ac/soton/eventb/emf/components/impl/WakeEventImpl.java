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

import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.WakeEvent;
import ac.soton.eventb.emf.components.WakeKind;
import ac.soton.eventb.emf.components.WakeQueue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eventb.emf.core.impl.EventBNamedCommentedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wake Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.components.impl.WakeEventImpl#getDelay_min <em>Delay min</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.WakeEventImpl#getWakeKind <em>Wake Kind</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.WakeEventImpl#getDelay_max <em>Delay max</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.WakeEventImpl#getQueue <em>Queue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WakeEventImpl extends EventBNamedCommentedElementImpl implements WakeEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * The default value of the '{@link #getDelay_min() <em>Delay min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_min()
	 * @generated
	 * @ordered
	 */
	protected static final String DELAY_MIN_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getDelay_min() <em>Delay min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_min()
	 * @generated
	 * @ordered
	 */
	protected String delay_min = DELAY_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getWakeKind() <em>Wake Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWakeKind()
	 * @generated
	 * @ordered
	 */
	protected static final WakeKind WAKE_KIND_EDEFAULT = WakeKind.ADD_EVENT;

	/**
	 * The cached value of the '{@link #getWakeKind() <em>Wake Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWakeKind()
	 * @generated
	 * @ordered
	 */
	protected WakeKind wakeKind = WAKE_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelay_max() <em>Delay max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_max()
	 * @generated
	 * @ordered
	 */
	protected static final String DELAY_MAX_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getDelay_max() <em>Delay max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_max()
	 * @generated
	 * @ordered
	 */
	protected String delay_max = DELAY_MAX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQueue() <em>Queue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueue()
	 * @generated
	 * @ordered
	 */
	protected WakeQueue queue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WakeEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.WAKE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelay_min() {
		return delay_min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay_min(String newDelay_min) {
		String oldDelay_min = delay_min;
		delay_min = newDelay_min;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.WAKE_EVENT__DELAY_MIN, oldDelay_min, delay_min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WakeKind getWakeKind() {
		return wakeKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWakeKind(WakeKind newWakeKind) {
		WakeKind oldWakeKind = wakeKind;
		wakeKind = newWakeKind == null ? WAKE_KIND_EDEFAULT : newWakeKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.WAKE_EVENT__WAKE_KIND, oldWakeKind, wakeKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelay_max() {
		return delay_max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay_max(String newDelay_max) {
		String oldDelay_max = delay_max;
		delay_max = newDelay_max;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.WAKE_EVENT__DELAY_MAX, oldDelay_max, delay_max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WakeQueue getQueue() {
		if (queue != null && queue.eIsProxy()) {
			InternalEObject oldQueue = (InternalEObject)queue;
			queue = (WakeQueue)eResolveProxy(oldQueue);
			if (queue != oldQueue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.WAKE_EVENT__QUEUE, oldQueue, queue));
			}
		}
		return queue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WakeQueue basicGetQueue() {
		return queue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueue(WakeQueue newQueue) {
		WakeQueue oldQueue = queue;
		queue = newQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.WAKE_EVENT__QUEUE, oldQueue, queue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.WAKE_EVENT__DELAY_MIN:
				return getDelay_min();
			case ComponentsPackage.WAKE_EVENT__WAKE_KIND:
				return getWakeKind();
			case ComponentsPackage.WAKE_EVENT__DELAY_MAX:
				return getDelay_max();
			case ComponentsPackage.WAKE_EVENT__QUEUE:
				if (resolve) return getQueue();
				return basicGetQueue();
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
			case ComponentsPackage.WAKE_EVENT__DELAY_MIN:
				setDelay_min((String)newValue);
				return;
			case ComponentsPackage.WAKE_EVENT__WAKE_KIND:
				setWakeKind((WakeKind)newValue);
				return;
			case ComponentsPackage.WAKE_EVENT__DELAY_MAX:
				setDelay_max((String)newValue);
				return;
			case ComponentsPackage.WAKE_EVENT__QUEUE:
				setQueue((WakeQueue)newValue);
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
			case ComponentsPackage.WAKE_EVENT__DELAY_MIN:
				setDelay_min(DELAY_MIN_EDEFAULT);
				return;
			case ComponentsPackage.WAKE_EVENT__WAKE_KIND:
				setWakeKind(WAKE_KIND_EDEFAULT);
				return;
			case ComponentsPackage.WAKE_EVENT__DELAY_MAX:
				setDelay_max(DELAY_MAX_EDEFAULT);
				return;
			case ComponentsPackage.WAKE_EVENT__QUEUE:
				setQueue((WakeQueue)null);
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
			case ComponentsPackage.WAKE_EVENT__DELAY_MIN:
				return DELAY_MIN_EDEFAULT == null ? delay_min != null : !DELAY_MIN_EDEFAULT.equals(delay_min);
			case ComponentsPackage.WAKE_EVENT__WAKE_KIND:
				return wakeKind != WAKE_KIND_EDEFAULT;
			case ComponentsPackage.WAKE_EVENT__DELAY_MAX:
				return DELAY_MAX_EDEFAULT == null ? delay_max != null : !DELAY_MAX_EDEFAULT.equals(delay_max);
			case ComponentsPackage.WAKE_EVENT__QUEUE:
				return queue != null;
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
		result.append(" (delay_min: ");
		result.append(delay_min);
		result.append(", wakeKind: ");
		result.append(wakeKind);
		result.append(", delay_max: ");
		result.append(delay_max);
		result.append(')');
		return result.toString();
	}

} //WakeEventImpl
