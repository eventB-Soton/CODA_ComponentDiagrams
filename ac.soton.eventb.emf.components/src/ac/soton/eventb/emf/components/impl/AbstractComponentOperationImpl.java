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

import ac.soton.eventb.emf.components.AbstractComponentOperation;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.DelayedDataPacket;
import ac.soton.eventb.emf.components.Method;
import ac.soton.eventb.emf.components.OperationAction;
import ac.soton.eventb.emf.components.OperationGuard;
import ac.soton.eventb.emf.components.OperationWitness;
import ac.soton.eventb.emf.components.WakeEvent;

import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;
import ac.soton.eventb.emf.core.extension.coreextension.EventBLabeled;
import ac.soton.eventb.emf.core.extension.coreextension.TypedParameter;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eventb.emf.core.impl.EventBCommentedElementImpl;

import org.eventb.emf.core.machine.Convergence;
import org.eventb.emf.core.machine.Event;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Component Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.components.impl.AbstractComponentOperationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.AbstractComponentOperationImpl#getElaborates <em>Elaborates</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.AbstractComponentOperationImpl#getCalls <em>Calls</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.AbstractComponentOperationImpl#getSends <em>Sends</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.AbstractComponentOperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.AbstractComponentOperationImpl#getWakes <em>Wakes</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.AbstractComponentOperationImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.AbstractComponentOperationImpl#getGuards <em>Guards</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.AbstractComponentOperationImpl#getWitnesses <em>Witnesses</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.AbstractComponentOperationImpl#getConvergence <em>Convergence</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.AbstractComponentOperationImpl#isExtended <em>Extended</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.AbstractComponentOperationImpl#getRefines <em>Refines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractComponentOperationImpl extends EventBCommentedElementImpl implements AbstractComponentOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011-2016\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getElaborates() <em>Elaborates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElaborates()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> elaborates;

	/**
	 * The cached value of the '{@link #getCalls() <em>Calls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<Method> calls;

	/**
	 * The cached value of the '{@link #getSends() <em>Sends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSends()
	 * @generated
	 * @ordered
	 */
	protected EList<DelayedDataPacket> sends;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TypedParameter> parameters;

	/**
	 * The cached value of the '{@link #getWakes() <em>Wakes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWakes()
	 * @generated
	 * @ordered
	 */
	protected EList<WakeEvent> wakes;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationAction> actions;

	/**
	 * The cached value of the '{@link #getGuards() <em>Guards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuards()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationGuard> guards;

	/**
	 * The cached value of the '{@link #getWitnesses() <em>Witnesses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWitnesses()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationWitness> witnesses;

	/**
	 * The default value of the '{@link #getConvergence() <em>Convergence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvergence()
	 * @generated
	 * @ordered
	 */
	protected static final Convergence CONVERGENCE_EDEFAULT = Convergence.ORDINARY;

	/**
	 * The default value of the '{@link #isExtended() <em>Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtended()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTENDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected AbstractComponentOperation refines;

	/**
	 * This is true if the Refines reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean refinesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractComponentOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLabel() {
		EList<Event> events = getElaborates();
		if (events.isEmpty())	return "";//"<no name - fix elaborates>";
		ArrayList<String> result = new ArrayList<String>(getElaborates().size());
		for (Event event : getElaborates())
			result.add(event.getName());
		return result.toString().replaceAll("(^.)|(.$)", "");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getElaborates() {
		if (elaborates == null) {
			elaborates = new EObjectResolvingEList<Event>(Event.class, this, ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__ELABORATES);
		}
		return elaborates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Method> getCalls() {
		if (calls == null) {
			calls = new EObjectResolvingEList<Method>(Method.class, this, ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__CALLS);
		}
		return calls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelayedDataPacket> getSends() {
		if (sends == null) {
			sends = new EObjectContainmentEList.Resolving<DelayedDataPacket>(DelayedDataPacket.class, this, ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__SENDS);
		}
		return sends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypedParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList.Resolving<TypedParameter>(TypedParameter.class, this, ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WakeEvent> getWakes() {
		if (wakes == null) {
			wakes = new EObjectContainmentEList.Resolving<WakeEvent>(WakeEvent.class, this, ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__WAKES);
		}
		return wakes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList.Resolving<OperationAction>(OperationAction.class, this, ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationGuard> getGuards() {
		if (guards == null) {
			guards = new EObjectContainmentEList.Resolving<OperationGuard>(OperationGuard.class, this, ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__GUARDS);
		}
		return guards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationWitness> getWitnesses() {
		if (witnesses == null) {
			witnesses = new EObjectContainmentEList.Resolving<OperationWitness>(OperationWitness.class, this, ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__WITNESSES);
		}
		return witnesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * convergence is derived from the elaborated events
	 * if there is at least one elaborated event and all the 
	 * elaborated events have the same convergence then that convergence
	 * is returned. Otherwise null is returned.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Convergence getConvergence() {
		Convergence convergence;
		if (getElaborates().isEmpty()) convergence = null;
		else {
			convergence = getElaborates().get(0).getConvergence();
			for (Event e : getElaborates()){
				if (convergence != e.getConvergence()){
					convergence = null;
				}
			}
		}
		return convergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * This sets the convergence of all the elaborated events
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setConvergence(Convergence newConvergence) {
		for (Event e : getElaborates()){
			e.setConvergence(newConvergence);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Does nothing. Convergence is derived from the elaborated events
	 * and cannot be un set
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void unsetConvergence() {

	}

	/**
	 * <!-- begin-user-doc -->
	 * convergence is derived from the elaborated events
	 * if there is at least one elaborated event and all the 
	 * elaborated events have the same convergence then the convergence
	 * is considered to be set. Otherwise it is considered un-set.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetConvergence() {
		return getConvergence()!= null;
	}

	
	private boolean extended;
	
	/**
	 * <!-- begin-user-doc -->
	 * 	if Extended is considered set, it is returned, otherwise null
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isExtended() {
		return isSetExtended() ?
				extended
				:
				null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * This sets the extended of all the elaborated events
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setExtended(boolean newExtended) {
		for (Event e : getElaborates()){
			e.setExtended(newExtended);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Does nothing. Extended is derived from the elaborated events
	 * and cannot be un-set
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void unsetExtended() {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * extended is derived from the elaborated events
	 * if there is at least one elaborated event and all the 
	 * elaborated events have the same extended then the extended
	 * is considered to be set. Otherwise it is considered un-set.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetExtended() {
		if (elaborates.isEmpty()) return false;
		else {
			extended = elaborates.get(0).isExtended();
			for (Event e : elaborates){
				if (extended != e.isExtended()){
					return false;
				}
			}
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractComponentOperation getRefines() {
		if (refines != null && refines.eIsProxy()) {
			InternalEObject oldRefines = (InternalEObject)refines;
			refines = (AbstractComponentOperation)eResolveProxy(oldRefines);
			if (refines != oldRefines) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__REFINES, oldRefines, refines));
			}
		}
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractComponentOperation basicGetRefines() {
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefines(AbstractComponentOperation newRefines) {
		AbstractComponentOperation oldRefines = refines;
		refines = newRefines;
		boolean oldRefinesESet = refinesESet;
		refinesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__REFINES, oldRefines, refines, !oldRefinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefines() {
		AbstractComponentOperation oldRefines = refines;
		boolean oldRefinesESet = refinesESet;
		refines = null;
		refinesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__REFINES, oldRefines, null, oldRefinesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefines() {
		return refinesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__SENDS:
				return ((InternalEList<?>)getSends()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__WAKES:
				return ((InternalEList<?>)getWakes()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__GUARDS:
				return ((InternalEList<?>)getGuards()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__WITNESSES:
				return ((InternalEList<?>)getWitnesses()).basicRemove(otherEnd, msgs);
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
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__LABEL:
				return getLabel();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__ELABORATES:
				return getElaborates();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__CALLS:
				return getCalls();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__SENDS:
				return getSends();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__PARAMETERS:
				return getParameters();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__WAKES:
				return getWakes();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__ACTIONS:
				return getActions();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__GUARDS:
				return getGuards();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__WITNESSES:
				return getWitnesses();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__CONVERGENCE:
				return getConvergence();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__EXTENDED:
				return isExtended();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__REFINES:
				if (resolve) return getRefines();
				return basicGetRefines();
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
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__ELABORATES:
				getElaborates().clear();
				getElaborates().addAll((Collection<? extends Event>)newValue);
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__CALLS:
				getCalls().clear();
				getCalls().addAll((Collection<? extends Method>)newValue);
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__SENDS:
				getSends().clear();
				getSends().addAll((Collection<? extends DelayedDataPacket>)newValue);
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends TypedParameter>)newValue);
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__WAKES:
				getWakes().clear();
				getWakes().addAll((Collection<? extends WakeEvent>)newValue);
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends OperationAction>)newValue);
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__GUARDS:
				getGuards().clear();
				getGuards().addAll((Collection<? extends OperationGuard>)newValue);
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__WITNESSES:
				getWitnesses().clear();
				getWitnesses().addAll((Collection<? extends OperationWitness>)newValue);
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__CONVERGENCE:
				setConvergence((Convergence)newValue);
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__EXTENDED:
				setExtended((Boolean)newValue);
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__REFINES:
				setRefines((AbstractComponentOperation)newValue);
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
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__ELABORATES:
				getElaborates().clear();
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__CALLS:
				getCalls().clear();
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__SENDS:
				getSends().clear();
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__PARAMETERS:
				getParameters().clear();
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__WAKES:
				getWakes().clear();
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__ACTIONS:
				getActions().clear();
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__GUARDS:
				getGuards().clear();
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__WITNESSES:
				getWitnesses().clear();
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__CONVERGENCE:
				unsetConvergence();
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__EXTENDED:
				unsetExtended();
				return;
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__REFINES:
				unsetRefines();
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
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__ELABORATES:
				return elaborates != null && !elaborates.isEmpty();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__CALLS:
				return calls != null && !calls.isEmpty();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__SENDS:
				return sends != null && !sends.isEmpty();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__WAKES:
				return wakes != null && !wakes.isEmpty();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__ACTIONS:
				return actions != null && !actions.isEmpty();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__GUARDS:
				return guards != null && !guards.isEmpty();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__WITNESSES:
				return witnesses != null && !witnesses.isEmpty();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__CONVERGENCE:
				return isSetConvergence();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__EXTENDED:
				return isSetExtended();
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__REFINES:
				return isSetRefines();
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
		if (baseClass == EventBLabeled.class) {
			switch (derivedFeatureID) {
				case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__LABEL: return CoreextensionPackage.EVENT_BLABELED__LABEL;
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
		if (baseClass == EventBLabeled.class) {
			switch (baseFeatureID) {
				case CoreextensionPackage.EVENT_BLABELED__LABEL: return ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__LABEL;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/* 
	 * Customised to fix problem with notification of label change on EReference 'elaborates' change.
	 */
	@Override
	public void eNotify(Notification notification) {
		super.eNotify(notification);
		
		int type = notification.getEventType();
		Object feature = notification.getFeature();
		if (ComponentsPackage.Literals.ABSTRACT_COMPONENT_OPERATION__ELABORATES.equals(feature)
				&& (type == Notification.ADD || type == Notification.ADD_MANY
						|| type == Notification.REMOVE || type == Notification.REMOVE_MANY))
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.ABSTRACT_COMPONENT_OPERATION__LABEL, notification.getOldValue(), notification.getNewValue()));
			
	}
	
} //AbstractComponentOperationImpl
