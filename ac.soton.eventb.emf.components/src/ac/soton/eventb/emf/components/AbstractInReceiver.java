/**
 * Copyright (c) 2011-2016
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
 * A representation of the model object '<em><b>Abstract In Receiver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.components.AbstractInReceiver#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.components.ComponentsPackage#getAbstractInReceiver()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='isSourceValid'"
 * @generated
 */
public interface AbstractInReceiver extends AbstractPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2011-2016\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ac.soton.eventb.emf.components.AbstractInSender#getDestinations <em>Destinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(AbstractInSender)
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getAbstractInReceiver_Source()
	 * @see ac.soton.eventb.emf.components.AbstractInSender#getDestinations
	 * @model opposite="destinations"
	 * @generated
	 */
	AbstractInSender getSource();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.components.AbstractInReceiver#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AbstractInSender value);

} // AbstractInReceiver
