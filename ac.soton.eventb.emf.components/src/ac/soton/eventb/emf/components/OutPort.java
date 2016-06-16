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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.components.OutPort#getOutConnector <em>Out Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.components.ComponentsPackage#getOutPort()
 * @model
 * @generated
 */
public interface OutPort extends AbstractPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2011-2016\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * Returns the value of the '<em><b>Out Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ac.soton.eventb.emf.components.Connector#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Connector</em>' reference.
	 * @see #setOutConnector(Connector)
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getOutPort_OutConnector()
	 * @see ac.soton.eventb.emf.components.Connector#getSender
	 * @model opposite="sender"
	 * @generated
	 */
	Connector getOutConnector();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.components.OutPort#getOutConnector <em>Out Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Connector</em>' reference.
	 * @see #getOutConnector()
	 * @generated
	 */
	void setOutConnector(Connector value);

} // OutPort
