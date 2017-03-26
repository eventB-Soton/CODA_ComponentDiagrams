/*******************************************************************************
 *  (c) Crown owned copyright 2011, 2017 (UK Ministry of Defence)
 *  
 *  All rights reserved. This program and the accompanying materials  are 
 *  made available under the terms of the Eclipse Public License v1.0 which
 *  accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  This is to identify the UK Ministry of Defence as owners along with the
 *   license rights provided.
 *  
 *  Contributors:
 *  			University of Southampton - Initial implementation
 *******************************************************************************/
package ac.soton.eventb.emf.components;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Self Wake</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.components.SelfWake#getQueue <em>Queue</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.components.ComponentsPackage#getSelfWake()
 * @model
 * @generated
 */
public interface SelfWake extends AbstractComponentOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2011-2017\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * Returns the value of the '<em><b>Queue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue</em>' reference.
	 * @see #setQueue(WakeQueue)
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getSelfWake_Queue()
	 * @model required="true"
	 * @generated
	 */
	WakeQueue getQueue();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.components.SelfWake#getQueue <em>Queue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue</em>' reference.
	 * @see #getQueue()
	 * @generated
	 */
	void setQueue(WakeQueue value);

} // SelfWake
