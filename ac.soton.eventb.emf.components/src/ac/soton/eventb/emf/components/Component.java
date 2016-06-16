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
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.EventBNamedCommentedElement;

import ac.soton.eventb.emf.diagrams.Diagram;
import ac.soton.eventb.statemachines.Statemachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.components.Component#getRefines <em>Refines</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Component#getOperations <em>Operations</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Component#getWakeQueues <em>Wake Queues</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Component#getAsynchronousStatemachines <em>Asynchronous Statemachines</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Component#getSynchronousStatemachines <em>Synchronous Statemachines</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Component#getProcessStatemachines <em>Process Statemachines</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Component#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Component#getVariables <em>Variables</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Component#getInitialisations <em>Initialisations</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Component#getSets <em>Sets</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Component#getAxioms <em>Axioms</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Component#getConstants <em>Constants</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Component#getInPorts <em>In Ports</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Component#getOutPorts <em>Out Ports</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Component#getInConnectors <em>In Connectors</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.Component#getOutConnectors <em>Out Connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.components.ComponentsPackage#getComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='hasName'"
 * @generated
 */
public interface Component extends EventBNamedCommentedElement, AbstractComponentModel, AbstractExtension, Diagram {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2011-2016\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * Returns the value of the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refines</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refines</em>' reference.
	 * @see #setRefines(Component)
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getComponent_Refines()
	 * @model
	 * @generated
	 */
	Component getRefines();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.components.Component#getRefines <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refines</em>' reference.
	 * @see #getRefines()
	 * @generated
	 */
	void setRefines(Component value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.components.AbstractComponentOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getComponent_Operations()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<AbstractComponentOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Wake Queues</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.components.WakeQueue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wake Queues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wake Queues</em>' containment reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getComponent_WakeQueues()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<WakeQueue> getWakeQueues();

	/**
	 * Returns the value of the '<em><b>Asynchronous Statemachines</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.statemachines.Statemachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asynchronous Statemachines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asynchronous Statemachines</em>' containment reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getComponent_AsynchronousStatemachines()
	 * @model containment="true" resolveProxies="true"
	 *        extendedMetaData="group='#statemachines'"
	 * @generated
	 */
	EList<Statemachine> getAsynchronousStatemachines();

	/**
	 * Returns the value of the '<em><b>Synchronous Statemachines</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.statemachines.Statemachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronous Statemachines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronous Statemachines</em>' containment reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getComponent_SynchronousStatemachines()
	 * @model containment="true" resolveProxies="true"
	 *        extendedMetaData="group='#statemachines'"
	 * @generated
	 */
	EList<Statemachine> getSynchronousStatemachines();

	/**
	 * Returns the value of the '<em><b>Process Statemachines</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.statemachines.Statemachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Statemachines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Statemachines</em>' containment reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getComponent_ProcessStatemachines()
	 * @model containment="true" resolveProxies="true"
	 *        extendedMetaData="group='#statemachines'"
	 * @generated
	 */
	EList<Statemachine> getProcessStatemachines();

	/**
	 * Returns the value of the '<em><b>Invariants</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.components.ComponentInvariant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariants</em>' containment reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getComponent_Invariants()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ComponentInvariant> getInvariants();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.components.ComponentVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getComponent_Variables()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ComponentVariable> getVariables();

	/**
	 * Returns the value of the '<em><b>Initialisations</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.components.ComponentInitialisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialisations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialisations</em>' containment reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getComponent_Initialisations()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ComponentInitialisation> getInitialisations();

	/**
	 * Returns the value of the '<em><b>Sets</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.components.ComponentSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sets</em>' containment reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getComponent_Sets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ComponentSet> getSets();

	/**
	 * Returns the value of the '<em><b>Axioms</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.components.ComponentAxiom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axioms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axioms</em>' containment reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getComponent_Axioms()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ComponentAxiom> getAxioms();

	/**
	 * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.components.ComponentConstant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constants</em>' containment reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getComponent_Constants()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ComponentConstant> getConstants();

	/**
	 * Returns the value of the '<em><b>In Ports</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.components.InPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Ports</em>' containment reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getComponent_InPorts()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<InPort> getInPorts();

	/**
	 * Returns the value of the '<em><b>Out Ports</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.components.OutPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Ports</em>' containment reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getComponent_OutPorts()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<OutPort> getOutPorts();

	/**
	 * Returns the value of the '<em><b>In Connectors</b></em>' reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.components.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Connectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Connectors</em>' reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getComponent_InConnectors()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Connector> getInConnectors();

	/**
	 * Returns the value of the '<em><b>Out Connectors</b></em>' reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.components.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Connectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Connectors</em>' reference list.
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#getComponent_OutConnectors()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Connector> getOutConnectors();

} // Component
