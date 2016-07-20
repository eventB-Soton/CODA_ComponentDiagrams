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

import org.eventb.emf.core.EventBNamedCommentedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.components.AbstractPort#getType <em>Type</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.AbstractPort#getInherits <em>Inherits</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.AbstractPort#getConnector <em>Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.components.ComponentsPackage#getAbstractPort()
 * @model abstract="true"
 * @generated
 */
public interface AbstractPort extends EventBNamedCommentedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2011-2016\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

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
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getAbstractPort_Type()
	 * @model default="\u2115"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.components.AbstractPort#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Inherits</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherits</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherits</em>' reference.
	 * @see #setInherits(AbstractPort)
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getAbstractPort_Inherits()
	 * @model
	 * @generated
	 */
	AbstractPort getInherits();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.components.AbstractPort#getInherits <em>Inherits</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherits</em>' reference.
	 * @see #getInherits()
	 * @generated
	 */
	void setInherits(AbstractPort value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getAbstractPort_Connector()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Connector getConnector();

} // AbstractPort
