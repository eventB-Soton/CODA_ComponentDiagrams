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

import ac.soton.eventb.emf.core.extension.coreextension.EventBLabeled;
import ac.soton.eventb.emf.core.extension.coreextension.TypedParameter;

import org.eclipse.emf.common.util.EList;

import org.eventb.emf.core.EventBCommentedElement;

import org.eventb.emf.core.machine.Convergence;
import org.eventb.emf.core.machine.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Component Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getElaborates <em>Elaborates</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getCalls <em>Calls</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getSends <em>Sends</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getWakes <em>Wakes</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getActions <em>Actions</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getGuards <em>Guards</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getWitnesses <em>Witnesses</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getConvergence <em>Convergence</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.AbstractComponentOperation#isExtended <em>Extended</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getRefines <em>Refines</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.components.ComponentsPackage#getAbstractComponentOperation()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasLabel\nhasElaborates\nsendScope\ncallScope\n'"
 * @generated
 */
public interface AbstractComponentOperation extends EventBCommentedElement, EventBLabeled {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2011-2016\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * Returns the value of the '<em><b>Elaborates</b></em>' reference list.
	 * The list contents are of type {@link org.eventb.emf.core.machine.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elaborates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elaborates</em>' reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getAbstractComponentOperation_Elaborates()
	 * @model required="true"
	 * @generated
	 */
	EList<Event> getElaborates();

	/**
	 * Returns the value of the '<em><b>Calls</b></em>' reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.components.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls</em>' reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getAbstractComponentOperation_Calls()
	 * @model
	 * @generated
	 */
	EList<Method> getCalls();

	/**
	 * Returns the value of the '<em><b>Sends</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.components.DelayedDataPacket}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends</em>' containment reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getAbstractComponentOperation_Sends()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<DelayedDataPacket> getSends();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.core.extension.coreextension.TypedParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getAbstractComponentOperation_Parameters()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<TypedParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Wakes</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.components.WakeEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wakes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wakes</em>' containment reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getAbstractComponentOperation_Wakes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<WakeEvent> getWakes();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.components.OperationAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getAbstractComponentOperation_Actions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<OperationAction> getActions();

	/**
	 * Returns the value of the '<em><b>Guards</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.components.OperationGuard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guards</em>' containment reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getAbstractComponentOperation_Guards()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<OperationGuard> getGuards();

	/**
	 * Returns the value of the '<em><b>Witnesses</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.components.OperationWitness}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Witnesses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Witnesses</em>' containment reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getAbstractComponentOperation_Witnesses()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<OperationWitness> getWitnesses();

	/**
	 * Returns the value of the '<em><b>Convergence</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eventb.emf.core.machine.Convergence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Convergence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Convergence</em>' attribute.
	 * @see org.eventb.emf.core.machine.Convergence
	 * @see #isSetConvergence()
	 * @see #unsetConvergence()
	 * @see #setConvergence(Convergence)
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getAbstractComponentOperation_Convergence()
	 * @model unsettable="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	Convergence getConvergence();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getConvergence <em>Convergence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Convergence</em>' attribute.
	 * @see org.eventb.emf.core.machine.Convergence
	 * @see #isSetConvergence()
	 * @see #unsetConvergence()
	 * @see #getConvergence()
	 * @generated
	 */
	void setConvergence(Convergence value);

	/**
	 * Unsets the value of the '{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getConvergence <em>Convergence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConvergence()
	 * @see #getConvergence()
	 * @see #setConvergence(Convergence)
	 * @generated
	 */
	void unsetConvergence();

	/**
	 * Returns whether the value of the '{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getConvergence <em>Convergence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Convergence</em>' attribute is set.
	 * @see #unsetConvergence()
	 * @see #getConvergence()
	 * @see #setConvergence(Convergence)
	 * @generated
	 */
	boolean isSetConvergence();

	/**
	 * Returns the value of the '<em><b>Extended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended</em>' attribute.
	 * @see #isSetExtended()
	 * @see #unsetExtended()
	 * @see #setExtended(boolean)
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getAbstractComponentOperation_Extended()
	 * @model unsettable="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isExtended();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.components.AbstractComponentOperation#isExtended <em>Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended</em>' attribute.
	 * @see #isSetExtended()
	 * @see #unsetExtended()
	 * @see #isExtended()
	 * @generated
	 */
	void setExtended(boolean value);

	/**
	 * Unsets the value of the '{@link ac.soton.eventb.emf.components.AbstractComponentOperation#isExtended <em>Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtended()
	 * @see #isExtended()
	 * @see #setExtended(boolean)
	 * @generated
	 */
	void unsetExtended();

	/**
	 * Returns whether the value of the '{@link ac.soton.eventb.emf.components.AbstractComponentOperation#isExtended <em>Extended</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extended</em>' attribute is set.
	 * @see #unsetExtended()
	 * @see #isExtended()
	 * @see #setExtended(boolean)
	 * @generated
	 */
	boolean isSetExtended();

	/**
	 * Returns the value of the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refines</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refines</em>' reference.
	 * @see #isSetRefines()
	 * @see #unsetRefines()
	 * @see #setRefines(AbstractComponentOperation)
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getAbstractComponentOperation_Refines()
	 * @model unsettable="true"
	 * @generated
	 */
	AbstractComponentOperation getRefines();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getRefines <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refines</em>' reference.
	 * @see #isSetRefines()
	 * @see #unsetRefines()
	 * @see #getRefines()
	 * @generated
	 */
	void setRefines(AbstractComponentOperation value);

	/**
	 * Unsets the value of the '{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getRefines <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefines()
	 * @see #getRefines()
	 * @see #setRefines(AbstractComponentOperation)
	 * @generated
	 */
	void unsetRefines();

	/**
	 * Returns whether the value of the '{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getRefines <em>Refines</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refines</em>' reference is set.
	 * @see #unsetRefines()
	 * @see #getRefines()
	 * @see #setRefines(AbstractComponentOperation)
	 * @generated
	 */
	boolean isSetRefines();

} // AbstractComponentOperation
