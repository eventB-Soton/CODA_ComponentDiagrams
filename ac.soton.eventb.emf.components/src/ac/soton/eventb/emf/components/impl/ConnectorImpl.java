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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eventb.emf.core.impl.EventBNamedCommentedElementImpl;

import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.Connector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getInherits <em>Inherits</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getDestinations <em>Destinations</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ConnectorImpl#getSource <em>Source</em>}</li>
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
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getType() {
		if (getInherits() instanceof Connector)	return ((Connector)getInherits()).getType();
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
		type = (getInherits() instanceof Connector)? ((Connector)getInherits()).getType() : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getInitialValue() {
		if (getInherits() instanceof Connector)	return ((Connector)getInherits()).getInitialValue();
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
		initialValue = (getInherits() instanceof Connector)? ((Connector)getInherits()).getInitialValue() : newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__INITIAL_VALUE, oldInitialValue, initialValue));
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
	public AbstractPort basicGetInherits() {
		return inherits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * changed to notify changes to all the things that are inherited (name, type, initialValue)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setInherits(AbstractPort newInherits) {
		AbstractPort oldInherits = inherits;
		String oldName = this.getName();
		String oldType = getType();
		String oldInitialValue = this.getInitialValue();
		inherits = newInherits;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__INHERITS, oldInherits, inherits));
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__NAME, oldName, getName()));
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__TYPE, oldType, getType()));
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.CONNECTOR__INITIAL_VALUE, oldInitialValue, getInitialValue()));
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
	 * <!-- end-user-doc -->
	 * @generated
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
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
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
	 * otherwise set the name of this element.
	 * <!-- end-user-doc -->
	 * @custom
	 */
	@Override
	public void setName(String name) {
		if (getInherits() instanceof Connector)	super.setName(inherits.getName()); 
		else super.setName(name);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * if inherits is set this gets the name from the inherited element
	 * otherwise gets the name of this element.
	 * <!-- end-user-doc -->
	 * @custom
	 */
	@Override
	public String getName(){
		if (getInherits() instanceof Connector) return inherits.getName();
		else return super.getName();
	}
	
	
} //ConnectorImpl
