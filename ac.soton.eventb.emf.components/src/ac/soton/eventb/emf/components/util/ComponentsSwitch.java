/*******************************************************************************
 * (c) Crown owned copyright (2017) (UK Ministry of Defence)
 *
 * All rights reserved. This program and the accompanying materials are 
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      University of Southampton - Initial API and implementation
 *******************************************************************************/
package ac.soton.eventb.emf.components.util;

import ac.soton.eventb.decomposition.AbstractRegion;
import ac.soton.eventb.emf.components.*;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.EventBAction;
import org.eventb.emf.core.EventBCommented;
import org.eventb.emf.core.EventBCommentedElement;
import org.eventb.emf.core.EventBDerived;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBNamed;
import org.eventb.emf.core.EventBNamedCommentedActionElement;
import org.eventb.emf.core.EventBNamedCommentedDerivedPredicateElement;
import org.eventb.emf.core.EventBNamedCommentedElement;
import org.eventb.emf.core.EventBNamedCommentedPredicateElement;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.EventBPredicate;

import ac.soton.eventb.emf.components.AbstractComponentModel;
import ac.soton.eventb.emf.components.AbstractComponentOperation;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentAxiom;
import ac.soton.eventb.emf.components.ComponentConstant;
import ac.soton.eventb.emf.components.ComponentInitialisation;
import ac.soton.eventb.emf.components.ComponentInvariant;
import ac.soton.eventb.emf.components.ComponentSet;
import ac.soton.eventb.emf.components.ComponentVariable;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.emf.components.DataPacket;
import ac.soton.eventb.emf.components.DelayedDataPacket;
import ac.soton.eventb.emf.components.External;
import ac.soton.eventb.emf.components.Method;
import ac.soton.eventb.emf.components.OperationAction;
import ac.soton.eventb.emf.components.OperationGuard;
import ac.soton.eventb.emf.components.OperationWitness;
import ac.soton.eventb.emf.components.PortWake;
import ac.soton.eventb.emf.components.SelfWake;
import ac.soton.eventb.emf.components.Transition;
import ac.soton.eventb.emf.components.WakeEvent;
import ac.soton.eventb.emf.components.WakeQueue;
import ac.soton.eventb.emf.core.extension.coreextension.EventBLabeled;
import ac.soton.eventb.emf.diagrams.Diagram;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ac.soton.eventb.emf.components.ComponentsPackage
 * @generated
 */
public class ComponentsSwitch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011-2017\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsSwitch() {
		if (modelPackage == null) {
			modelPackage = ComponentsPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ComponentsPackage.ABSTRACT_COMPONENT_MODEL: {
				AbstractComponentModel abstractComponentModel = (AbstractComponentModel)theEObject;
				T result = caseAbstractComponentModel(abstractComponentModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseEventBNamedCommentedElement(component);
				if (result == null) result = caseAbstractComponentModel(component);
				if (result == null) result = caseAbstractExtension(component);
				if (result == null) result = caseDiagram(component);
				if (result == null) result = caseAbstractRegion(component);
				if (result == null) result = caseEventBCommentedElement(component);
				if (result == null) result = caseEventBNamed(component);
				if (result == null) result = caseEventBElement(component);
				if (result == null) result = caseEventBCommented(component);
				if (result == null) result = caseEventBObject(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseAbstractExtension(connector);
				if (result == null) result = caseAbstractInSender(connector);
				if (result == null) result = caseAbstractOutReceiver(connector);
				if (result == null) result = caseAbstractRegion(connector);
				if (result == null) result = caseEventBCommentedElement(connector);
				if (result == null) result = caseEventBNamed(connector);
				if (result == null) result = caseAbstractPort(connector);
				if (result == null) result = caseEventBNamedCommentedElement(connector);
				if (result == null) result = caseEventBElement(connector);
				if (result == null) result = caseEventBCommented(connector);
				if (result == null) result = caseEventBObject(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION: {
				AbstractComponentOperation abstractComponentOperation = (AbstractComponentOperation)theEObject;
				T result = caseAbstractComponentOperation(abstractComponentOperation);
				if (result == null) result = caseEventBCommentedElement(abstractComponentOperation);
				if (result == null) result = caseEventBLabeled(abstractComponentOperation);
				if (result == null) result = caseEventBElement(abstractComponentOperation);
				if (result == null) result = caseEventBCommented(abstractComponentOperation);
				if (result == null) result = caseEventBObject(abstractComponentOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = caseAbstractComponentOperation(method);
				if (result == null) result = caseEventBCommentedElement(method);
				if (result == null) result = caseEventBLabeled(method);
				if (result == null) result = caseEventBElement(method);
				if (result == null) result = caseEventBCommented(method);
				if (result == null) result = caseEventBObject(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.PORT_WAKE: {
				PortWake portWake = (PortWake)theEObject;
				T result = casePortWake(portWake);
				if (result == null) result = caseAbstractComponentOperation(portWake);
				if (result == null) result = caseEventBCommentedElement(portWake);
				if (result == null) result = caseEventBLabeled(portWake);
				if (result == null) result = caseEventBElement(portWake);
				if (result == null) result = caseEventBCommented(portWake);
				if (result == null) result = caseEventBObject(portWake);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.DATA_PACKET: {
				DataPacket dataPacket = (DataPacket)theEObject;
				T result = caseDataPacket(dataPacket);
				if (result == null) result = caseAbstractDataPacket(dataPacket);
				if (result == null) result = caseEventBNamedCommentedElement(dataPacket);
				if (result == null) result = caseEventBCommentedElement(dataPacket);
				if (result == null) result = caseEventBNamed(dataPacket);
				if (result == null) result = caseEventBElement(dataPacket);
				if (result == null) result = caseEventBCommented(dataPacket);
				if (result == null) result = caseEventBObject(dataPacket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.DELAYED_DATA_PACKET: {
				DelayedDataPacket delayedDataPacket = (DelayedDataPacket)theEObject;
				T result = caseDelayedDataPacket(delayedDataPacket);
				if (result == null) result = caseAbstractDataPacket(delayedDataPacket);
				if (result == null) result = caseEventBNamedCommentedElement(delayedDataPacket);
				if (result == null) result = caseEventBCommentedElement(delayedDataPacket);
				if (result == null) result = caseEventBNamed(delayedDataPacket);
				if (result == null) result = caseEventBElement(delayedDataPacket);
				if (result == null) result = caseEventBCommented(delayedDataPacket);
				if (result == null) result = caseEventBObject(delayedDataPacket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.SELF_WAKE: {
				SelfWake selfWake = (SelfWake)theEObject;
				T result = caseSelfWake(selfWake);
				if (result == null) result = caseAbstractComponentOperation(selfWake);
				if (result == null) result = caseEventBCommentedElement(selfWake);
				if (result == null) result = caseEventBLabeled(selfWake);
				if (result == null) result = caseEventBElement(selfWake);
				if (result == null) result = caseEventBCommented(selfWake);
				if (result == null) result = caseEventBObject(selfWake);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.EXTERNAL: {
				External external = (External)theEObject;
				T result = caseExternal(external);
				if (result == null) result = caseAbstractComponentOperation(external);
				if (result == null) result = caseEventBCommentedElement(external);
				if (result == null) result = caseEventBLabeled(external);
				if (result == null) result = caseEventBElement(external);
				if (result == null) result = caseEventBCommented(external);
				if (result == null) result = caseEventBObject(external);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.WAKE_EVENT: {
				WakeEvent wakeEvent = (WakeEvent)theEObject;
				T result = caseWakeEvent(wakeEvent);
				if (result == null) result = caseEventBNamedCommentedElement(wakeEvent);
				if (result == null) result = caseEventBCommentedElement(wakeEvent);
				if (result == null) result = caseEventBNamed(wakeEvent);
				if (result == null) result = caseEventBElement(wakeEvent);
				if (result == null) result = caseEventBCommented(wakeEvent);
				if (result == null) result = caseEventBObject(wakeEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseAbstractComponentOperation(transition);
				if (result == null) result = caseEventBCommentedElement(transition);
				if (result == null) result = caseEventBLabeled(transition);
				if (result == null) result = caseEventBElement(transition);
				if (result == null) result = caseEventBCommented(transition);
				if (result == null) result = caseEventBObject(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.OPERATION_GUARD: {
				OperationGuard operationGuard = (OperationGuard)theEObject;
				T result = caseOperationGuard(operationGuard);
				if (result == null) result = caseEventBNamedCommentedDerivedPredicateElement(operationGuard);
				if (result == null) result = caseEventBNamedCommentedPredicateElement(operationGuard);
				if (result == null) result = caseEventBDerived(operationGuard);
				if (result == null) result = caseEventBNamedCommentedElement(operationGuard);
				if (result == null) result = caseEventBPredicate(operationGuard);
				if (result == null) result = caseEventBCommentedElement(operationGuard);
				if (result == null) result = caseEventBNamed(operationGuard);
				if (result == null) result = caseEventBElement(operationGuard);
				if (result == null) result = caseEventBCommented(operationGuard);
				if (result == null) result = caseEventBObject(operationGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.OPERATION_ACTION: {
				OperationAction operationAction = (OperationAction)theEObject;
				T result = caseOperationAction(operationAction);
				if (result == null) result = caseEventBNamedCommentedActionElement(operationAction);
				if (result == null) result = caseEventBNamedCommentedElement(operationAction);
				if (result == null) result = caseEventBAction(operationAction);
				if (result == null) result = caseEventBCommentedElement(operationAction);
				if (result == null) result = caseEventBNamed(operationAction);
				if (result == null) result = caseEventBElement(operationAction);
				if (result == null) result = caseEventBCommented(operationAction);
				if (result == null) result = caseEventBObject(operationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.OPERATION_WITNESS: {
				OperationWitness operationWitness = (OperationWitness)theEObject;
				T result = caseOperationWitness(operationWitness);
				if (result == null) result = caseEventBNamedCommentedPredicateElement(operationWitness);
				if (result == null) result = caseEventBNamedCommentedElement(operationWitness);
				if (result == null) result = caseEventBPredicate(operationWitness);
				if (result == null) result = caseEventBCommentedElement(operationWitness);
				if (result == null) result = caseEventBNamed(operationWitness);
				if (result == null) result = caseEventBElement(operationWitness);
				if (result == null) result = caseEventBCommented(operationWitness);
				if (result == null) result = caseEventBObject(operationWitness);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.COMPONENT_INVARIANT: {
				ComponentInvariant componentInvariant = (ComponentInvariant)theEObject;
				T result = caseComponentInvariant(componentInvariant);
				if (result == null) result = caseEventBNamedCommentedDerivedPredicateElement(componentInvariant);
				if (result == null) result = caseEventBNamedCommentedPredicateElement(componentInvariant);
				if (result == null) result = caseEventBDerived(componentInvariant);
				if (result == null) result = caseEventBNamedCommentedElement(componentInvariant);
				if (result == null) result = caseEventBPredicate(componentInvariant);
				if (result == null) result = caseEventBCommentedElement(componentInvariant);
				if (result == null) result = caseEventBNamed(componentInvariant);
				if (result == null) result = caseEventBElement(componentInvariant);
				if (result == null) result = caseEventBCommented(componentInvariant);
				if (result == null) result = caseEventBObject(componentInvariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.COMPONENT_VARIABLE: {
				ComponentVariable componentVariable = (ComponentVariable)theEObject;
				T result = caseComponentVariable(componentVariable);
				if (result == null) result = caseEventBNamedCommentedElement(componentVariable);
				if (result == null) result = caseEventBCommentedElement(componentVariable);
				if (result == null) result = caseEventBNamed(componentVariable);
				if (result == null) result = caseEventBElement(componentVariable);
				if (result == null) result = caseEventBCommented(componentVariable);
				if (result == null) result = caseEventBObject(componentVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.COMPONENT_INITIALISATION: {
				ComponentInitialisation componentInitialisation = (ComponentInitialisation)theEObject;
				T result = caseComponentInitialisation(componentInitialisation);
				if (result == null) result = caseEventBNamedCommentedActionElement(componentInitialisation);
				if (result == null) result = caseEventBNamedCommentedElement(componentInitialisation);
				if (result == null) result = caseEventBAction(componentInitialisation);
				if (result == null) result = caseEventBCommentedElement(componentInitialisation);
				if (result == null) result = caseEventBNamed(componentInitialisation);
				if (result == null) result = caseEventBElement(componentInitialisation);
				if (result == null) result = caseEventBCommented(componentInitialisation);
				if (result == null) result = caseEventBObject(componentInitialisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.COMPONENT_SET: {
				ComponentSet componentSet = (ComponentSet)theEObject;
				T result = caseComponentSet(componentSet);
				if (result == null) result = caseEventBNamedCommentedElement(componentSet);
				if (result == null) result = caseEventBCommentedElement(componentSet);
				if (result == null) result = caseEventBNamed(componentSet);
				if (result == null) result = caseEventBElement(componentSet);
				if (result == null) result = caseEventBCommented(componentSet);
				if (result == null) result = caseEventBObject(componentSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.COMPONENT_CONSTANT: {
				ComponentConstant componentConstant = (ComponentConstant)theEObject;
				T result = caseComponentConstant(componentConstant);
				if (result == null) result = caseEventBNamedCommentedElement(componentConstant);
				if (result == null) result = caseEventBCommentedElement(componentConstant);
				if (result == null) result = caseEventBNamed(componentConstant);
				if (result == null) result = caseEventBElement(componentConstant);
				if (result == null) result = caseEventBCommented(componentConstant);
				if (result == null) result = caseEventBObject(componentConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.COMPONENT_AXIOM: {
				ComponentAxiom componentAxiom = (ComponentAxiom)theEObject;
				T result = caseComponentAxiom(componentAxiom);
				if (result == null) result = caseEventBNamedCommentedDerivedPredicateElement(componentAxiom);
				if (result == null) result = caseEventBNamedCommentedPredicateElement(componentAxiom);
				if (result == null) result = caseEventBDerived(componentAxiom);
				if (result == null) result = caseEventBNamedCommentedElement(componentAxiom);
				if (result == null) result = caseEventBPredicate(componentAxiom);
				if (result == null) result = caseEventBCommentedElement(componentAxiom);
				if (result == null) result = caseEventBNamed(componentAxiom);
				if (result == null) result = caseEventBElement(componentAxiom);
				if (result == null) result = caseEventBCommented(componentAxiom);
				if (result == null) result = caseEventBObject(componentAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.WAKE_QUEUE: {
				WakeQueue wakeQueue = (WakeQueue)theEObject;
				T result = caseWakeQueue(wakeQueue);
				if (result == null) result = caseEventBNamedCommentedElement(wakeQueue);
				if (result == null) result = caseEventBCommentedElement(wakeQueue);
				if (result == null) result = caseEventBNamed(wakeQueue);
				if (result == null) result = caseEventBElement(wakeQueue);
				if (result == null) result = caseEventBCommented(wakeQueue);
				if (result == null) result = caseEventBObject(wakeQueue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.ABSTRACT_PORT: {
				AbstractPort abstractPort = (AbstractPort)theEObject;
				T result = caseAbstractPort(abstractPort);
				if (result == null) result = caseEventBNamedCommentedElement(abstractPort);
				if (result == null) result = caseEventBCommentedElement(abstractPort);
				if (result == null) result = caseEventBNamed(abstractPort);
				if (result == null) result = caseEventBElement(abstractPort);
				if (result == null) result = caseEventBCommented(abstractPort);
				if (result == null) result = caseEventBObject(abstractPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.IN_PORT: {
				InPort inPort = (InPort)theEObject;
				T result = caseInPort(inPort);
				if (result == null) result = caseAbstractInReceiver(inPort);
				if (result == null) result = caseAbstractInSender(inPort);
				if (result == null) result = caseAbstractPort(inPort);
				if (result == null) result = caseEventBNamedCommentedElement(inPort);
				if (result == null) result = caseEventBCommentedElement(inPort);
				if (result == null) result = caseEventBNamed(inPort);
				if (result == null) result = caseEventBElement(inPort);
				if (result == null) result = caseEventBCommented(inPort);
				if (result == null) result = caseEventBObject(inPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.OUT_PORT: {
				OutPort outPort = (OutPort)theEObject;
				T result = caseOutPort(outPort);
				if (result == null) result = caseAbstractOutSender(outPort);
				if (result == null) result = caseAbstractOutReceiver(outPort);
				if (result == null) result = caseAbstractPort(outPort);
				if (result == null) result = caseEventBNamedCommentedElement(outPort);
				if (result == null) result = caseEventBCommentedElement(outPort);
				if (result == null) result = caseEventBNamed(outPort);
				if (result == null) result = caseEventBElement(outPort);
				if (result == null) result = caseEventBCommented(outPort);
				if (result == null) result = caseEventBObject(outPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.ABSTRACT_DATA_PACKET: {
				AbstractDataPacket abstractDataPacket = (AbstractDataPacket)theEObject;
				T result = caseAbstractDataPacket(abstractDataPacket);
				if (result == null) result = caseEventBNamedCommentedElement(abstractDataPacket);
				if (result == null) result = caseEventBCommentedElement(abstractDataPacket);
				if (result == null) result = caseEventBNamed(abstractDataPacket);
				if (result == null) result = caseEventBElement(abstractDataPacket);
				if (result == null) result = caseEventBCommented(abstractDataPacket);
				if (result == null) result = caseEventBObject(abstractDataPacket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.ABSTRACT_IN_RECEIVER: {
				AbstractInReceiver abstractInReceiver = (AbstractInReceiver)theEObject;
				T result = caseAbstractInReceiver(abstractInReceiver);
				if (result == null) result = caseAbstractPort(abstractInReceiver);
				if (result == null) result = caseEventBNamedCommentedElement(abstractInReceiver);
				if (result == null) result = caseEventBCommentedElement(abstractInReceiver);
				if (result == null) result = caseEventBNamed(abstractInReceiver);
				if (result == null) result = caseEventBElement(abstractInReceiver);
				if (result == null) result = caseEventBCommented(abstractInReceiver);
				if (result == null) result = caseEventBObject(abstractInReceiver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.ABSTRACT_IN_SENDER: {
				AbstractInSender abstractInSender = (AbstractInSender)theEObject;
				T result = caseAbstractInSender(abstractInSender);
				if (result == null) result = caseAbstractPort(abstractInSender);
				if (result == null) result = caseEventBNamedCommentedElement(abstractInSender);
				if (result == null) result = caseEventBCommentedElement(abstractInSender);
				if (result == null) result = caseEventBNamed(abstractInSender);
				if (result == null) result = caseEventBElement(abstractInSender);
				if (result == null) result = caseEventBCommented(abstractInSender);
				if (result == null) result = caseEventBObject(abstractInSender);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.ABSTRACT_OUT_RECEIVER: {
				AbstractOutReceiver abstractOutReceiver = (AbstractOutReceiver)theEObject;
				T result = caseAbstractOutReceiver(abstractOutReceiver);
				if (result == null) result = caseAbstractPort(abstractOutReceiver);
				if (result == null) result = caseEventBNamedCommentedElement(abstractOutReceiver);
				if (result == null) result = caseEventBCommentedElement(abstractOutReceiver);
				if (result == null) result = caseEventBNamed(abstractOutReceiver);
				if (result == null) result = caseEventBElement(abstractOutReceiver);
				if (result == null) result = caseEventBCommented(abstractOutReceiver);
				if (result == null) result = caseEventBObject(abstractOutReceiver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComponentsPackage.ABSTRACT_OUT_SENDER: {
				AbstractOutSender abstractOutSender = (AbstractOutSender)theEObject;
				T result = caseAbstractOutSender(abstractOutSender);
				if (result == null) result = caseAbstractPort(abstractOutSender);
				if (result == null) result = caseEventBNamedCommentedElement(abstractOutSender);
				if (result == null) result = caseEventBCommentedElement(abstractOutSender);
				if (result == null) result = caseEventBNamed(abstractOutSender);
				if (result == null) result = caseEventBElement(abstractOutSender);
				if (result == null) result = caseEventBCommented(abstractOutSender);
				if (result == null) result = caseEventBObject(abstractOutSender);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Component Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Component Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractComponentModel(AbstractComponentModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Component Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Component Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractComponentOperation(AbstractComponentOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Wake</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Wake</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortWake(PortWake object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Packet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Packet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPacket(DataPacket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delayed Data Packet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delayed Data Packet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelayedDataPacket(DelayedDataPacket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Self Wake</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Self Wake</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelfWake(SelfWake object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternal(External object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wake Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wake Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWakeEvent(WakeEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationGuard(OperationGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationAction(OperationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Witness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Witness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationWitness(OperationWitness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Invariant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInvariant(ComponentInvariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentVariable(ComponentVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Initialisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Initialisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInitialisation(ComponentInitialisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentSet(ComponentSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentConstant(ComponentConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentAxiom(ComponentAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wake Queue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wake Queue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWakeQueue(WakeQueue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractPort(AbstractPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInPort(InPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutPort(OutPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Data Packet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Data Packet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDataPacket(AbstractDataPacket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract In Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract In Receiver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractInReceiver(AbstractInReceiver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract In Sender</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract In Sender</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractInSender(AbstractInSender object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Out Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Out Receiver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractOutReceiver(AbstractOutReceiver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Out Sender</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Out Sender</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractOutSender(AbstractOutSender object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBObject(EventBObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BElement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBElement(EventBElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BCommented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BCommented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBCommented(EventBCommented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BCommented Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BCommented Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBCommentedElement(EventBCommentedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BNamed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BNamed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBNamed(EventBNamed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BNamed Commented Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BNamed Commented Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBNamedCommentedElement(EventBNamedCommentedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractExtension(AbstractExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagram(Diagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * @since 6.0
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRegion(AbstractRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BLabeled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BLabeled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBLabeled(EventBLabeled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BPredicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BPredicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBPredicate(EventBPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BNamed Commented Predicate Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BNamed Commented Predicate Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBNamedCommentedPredicateElement(EventBNamedCommentedPredicateElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BDerived</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BDerived</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBDerived(EventBDerived object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BNamed Commented Derived Predicate Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BNamed Commented Derived Predicate Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBNamedCommentedDerivedPredicateElement(EventBNamedCommentedDerivedPredicateElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BAction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BAction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBAction(EventBAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BNamed Commented Action Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BNamed Commented Action Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBNamedCommentedActionElement(EventBNamedCommentedActionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //ComponentsSwitch
