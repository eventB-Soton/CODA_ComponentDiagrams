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
 * A representation of the model object '<em><b>In Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.components.InPort#getInConnector <em>In Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.components.ComponentsPackage#getInPort()
 * @model
 * @generated
 */
public interface InPort extends AbstractPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2011-2016\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * Returns the value of the '<em><b>In Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ac.soton.eventb.emf.components.Connector#getReceivePorts <em>Receive Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Connector</em>' reference.
	 * @see #setInConnector(Connector)
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getInPort_InConnector()
	 * @see ac.soton.eventb.emf.components.Connector#getReceivePorts
	 * @model opposite="receivePorts"
	 * @generated
	 */
	Connector getInConnector();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.components.InPort#getInConnector <em>In Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Connector</em>' reference.
	 * @see #getInConnector()
	 * @generated
	 */
	void setInConnector(Connector value);

} // InPort
