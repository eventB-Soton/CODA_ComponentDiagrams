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
package ac.soton.eventb.emf.components;

import org.eclipse.emf.common.util.EList;
import org.eventb.emf.core.EventBNamedCommentedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.components.Connector#getSendPort <em>Send Port</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Connector#getReceivePorts <em>Receive Ports</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Connector#getType <em>Type</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Connector#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Connector#getInherits <em>Inherits</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Connector#getReceivers <em>Receivers</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Connector#getSender <em>Sender</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.components.ComponentsPackage#getConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasName\nhasType\nhasInitialValue\nhasSender\nhasReceiver'"
 * @generated
 */
public interface Connector extends EventBNamedCommentedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2011-2016\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * Returns the value of the '<em><b>Send Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ac.soton.eventb.emf.components.OutPort#getOutConnector <em>Out Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Port</em>' reference.
	 * @see #setSendPort(OutPort)
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getConnector_SendPort()
	 * @see ac.soton.eventb.emf.components.OutPort#getOutConnector
	 * @model opposite="outConnector"
	 * @generated
	 */
	OutPort getSendPort();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.components.Connector#getSendPort <em>Send Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Port</em>' reference.
	 * @see #getSendPort()
	 * @generated
	 */
	void setSendPort(OutPort value);

	/**
	 * Returns the value of the '<em><b>Receive Ports</b></em>' reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.components.InPort}.
	 * It is bidirectional and its opposite is '{@link ac.soton.eventb.emf.components.InPort#getInConnector <em>In Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Ports</em>' reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getConnector_ReceivePorts()
	 * @see ac.soton.eventb.emf.components.InPort#getInConnector
	 * @model opposite="inConnector"
	 * @generated
	 */
	EList<InPort> getReceivePorts();

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getConnector_Sender()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Component getSender();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"\u2115"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getConnector_Type()
	 * @model default="\u2115"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.components.Connector#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(String)
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getConnector_InitialValue()
	 * @model default="0"
	 * @generated
	 */
	String getInitialValue();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.components.Connector#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(String value);

	/**
	 * Returns the value of the '<em><b>Inherits</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherits</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherits</em>' reference.
	 * @see #isSetInherits()
	 * @see #unsetInherits()
	 * @see #setInherits(Connector)
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getConnector_Inherits()
	 * @model unsettable="true"
	 * @generated
	 */
	Connector getInherits();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.components.Connector#getInherits <em>Inherits</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherits</em>' reference.
	 * @see #isSetInherits()
	 * @see #unsetInherits()
	 * @see #getInherits()
	 * @generated
	 */
	void setInherits(Connector value);

	/**
	 * Unsets the value of the '{@link ac.soton.eventb.emf.components.Connector#getInherits <em>Inherits</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInherits()
	 * @see #getInherits()
	 * @see #setInherits(Connector)
	 * @generated
	 */
	void unsetInherits();

	/**
	 * Returns whether the value of the '{@link ac.soton.eventb.emf.components.Connector#getInherits <em>Inherits</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inherits</em>' reference is set.
	 * @see #unsetInherits()
	 * @see #getInherits()
	 * @see #setInherits(Connector)
	 * @generated
	 */
	boolean isSetInherits();

	/**
	 * Returns the value of the '<em><b>Receivers</b></em>' reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.components.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receivers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receivers</em>' reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getConnector_Receivers()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Component> getReceivers();

} // Connector
