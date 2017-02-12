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
 * A representation of the model object '<em><b>Wake Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.components.WakeEvent#getDelay_min <em>Delay min</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.WakeEvent#getWakeKind <em>Wake Kind</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.WakeEvent#getDelay_max <em>Delay max</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.WakeEvent#getQueue <em>Queue</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.components.ComponentsPackage#getWakeEvent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasName\nhasDelay\nhasWakeKind'"
 * @generated
 */
public interface WakeEvent extends EventBNamedCommentedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2011-2017\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * Returns the value of the '<em><b>Delay min</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay min</em>' attribute.
	 * @see #setDelay_min(String)
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getWakeEvent_Delay_min()
	 * @model default="1" required="true"
	 * @generated
	 */
	String getDelay_min();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.components.WakeEvent#getDelay_min <em>Delay min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay min</em>' attribute.
	 * @see #getDelay_min()
	 * @generated
	 */
	void setDelay_min(String value);

	/**
	 * Returns the value of the '<em><b>Wake Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link ac.soton.eventb.emf.components.WakeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wake Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wake Kind</em>' attribute.
	 * @see ac.soton.eventb.emf.components.WakeKind
	 * @see #setWakeKind(WakeKind)
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getWakeEvent_WakeKind()
	 * @model required="true"
	 * @generated
	 */
	WakeKind getWakeKind();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.components.WakeEvent#getWakeKind <em>Wake Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wake Kind</em>' attribute.
	 * @see ac.soton.eventb.emf.components.WakeKind
	 * @see #getWakeKind()
	 * @generated
	 */
	void setWakeKind(WakeKind value);

	/**
	 * Returns the value of the '<em><b>Delay max</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay max</em>' attribute.
	 * @see #setDelay_max(String)
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getWakeEvent_Delay_max()
	 * @model default="1" required="true"
	 * @generated
	 */
	String getDelay_max();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.components.WakeEvent#getDelay_max <em>Delay max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay max</em>' attribute.
	 * @see #getDelay_max()
	 * @generated
	 */
	void setDelay_max(String value);

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
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getWakeEvent_Queue()
	 * @model required="true"
	 * @generated
	 */
	WakeQueue getQueue();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.components.WakeEvent#getQueue <em>Queue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue</em>' reference.
	 * @see #getQueue()
	 * @generated
	 */
	void setQueue(WakeQueue value);

} // WakeEvent
