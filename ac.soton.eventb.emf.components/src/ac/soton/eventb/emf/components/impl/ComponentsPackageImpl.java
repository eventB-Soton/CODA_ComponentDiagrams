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
package ac.soton.eventb.emf.components.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.eventb.emf.components.AbstractComponentModel;
import ac.soton.eventb.emf.components.AbstractComponentOperation;
import ac.soton.eventb.emf.components.AbstractPort;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentAxiom;
import ac.soton.eventb.emf.components.ComponentConstant;
import ac.soton.eventb.emf.components.ComponentInitialisation;
import ac.soton.eventb.emf.components.ComponentInvariant;
import ac.soton.eventb.emf.components.ComponentSet;
import ac.soton.eventb.emf.components.ComponentVariable;
import ac.soton.eventb.emf.components.ComponentsFactory;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.emf.components.DataPacket;
import ac.soton.eventb.emf.components.DelayedDataPacket;
import ac.soton.eventb.emf.components.External;
import ac.soton.eventb.emf.components.InPort;
import ac.soton.eventb.emf.components.Method;
import ac.soton.eventb.emf.components.OperationAction;
import ac.soton.eventb.emf.components.OperationGuard;
import ac.soton.eventb.emf.components.OperationWitness;
import ac.soton.eventb.emf.components.OutPort;
import ac.soton.eventb.emf.components.PortWake;
import ac.soton.eventb.emf.components.SelfWake;
import ac.soton.eventb.emf.components.Transition;
import ac.soton.eventb.emf.components.WakeEvent;
import ac.soton.eventb.emf.components.WakeKind;
import ac.soton.eventb.emf.components.WakeQueue;
import ac.soton.eventb.emf.components.util.ComponentsValidator;
import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;
import ac.soton.eventb.emf.diagrams.DiagramsPackage;
import ac.soton.eventb.statemachines.StatemachinesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentsPackageImpl extends EPackageImpl implements ComponentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011-2016\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractComponentModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractComponentOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portWakeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPacketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayedDataPacketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfWakeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wakeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationWitnessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInvariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInitialisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wakeQueueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wakeKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ac.soton.eventb.emf.components.ComponentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentsPackageImpl() {
		super(eNS_URI, ComponentsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ComponentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentsPackage init() {
		if (isInited) return (ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);

		// Obtain or create and register package
		ComponentsPackageImpl theComponentsPackage = (ComponentsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StatemachinesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentsPackage.createPackageContents();

		// Initialize created meta-data
		theComponentsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theComponentsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ComponentsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theComponentsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentsPackage.eNS_URI, theComponentsPackage);
		return theComponentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractComponentModel() {
		return abstractComponentModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponentModel_Components() {
		return (EReference)abstractComponentModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponentModel_Connectors() {
		return (EReference)abstractComponentModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Refines() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Operations() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_WakeQueues() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_AsynchronousStatemachines() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_SynchronousStatemachines() {
		return (EReference)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ProcessStatemachines() {
		return (EReference)componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Invariants() {
		return (EReference)componentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Variables() {
		return (EReference)componentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Initialisations() {
		return (EReference)componentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Sets() {
		return (EReference)componentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Axioms() {
		return (EReference)componentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Constants() {
		return (EReference)componentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_InPorts() {
		return (EReference)componentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_OutPorts() {
		return (EReference)componentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Sender() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Receivers() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Type() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_InitialValue() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Inherits() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractComponentOperation() {
		return abstractComponentOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponentOperation_Elaborates() {
		return (EReference)abstractComponentOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponentOperation_Calls() {
		return (EReference)abstractComponentOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponentOperation_Sends() {
		return (EReference)abstractComponentOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponentOperation_Parameters() {
		return (EReference)abstractComponentOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponentOperation_Wakes() {
		return (EReference)abstractComponentOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponentOperation_Actions() {
		return (EReference)abstractComponentOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponentOperation_Guards() {
		return (EReference)abstractComponentOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponentOperation_Witnesses() {
		return (EReference)abstractComponentOperationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractComponentOperation_Convergence() {
		return (EAttribute)abstractComponentOperationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractComponentOperation_Extended() {
		return (EAttribute)abstractComponentOperationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponentOperation_Refines() {
		return (EReference)abstractComponentOperationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortWake() {
		return portWakeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortWake_Receives() {
		return (EReference)portWakeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPacket() {
		return dataPacketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPacket_Connector() {
		return (EReference)dataPacketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPacket_Value() {
		return (EAttribute)dataPacketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelayedDataPacket() {
		return delayedDataPacketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelayedDataPacket_Delay() {
		return (EAttribute)delayedDataPacketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelfWake() {
		return selfWakeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelfWake_Queue() {
		return (EReference)selfWakeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternal() {
		return externalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWakeEvent() {
		return wakeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWakeEvent_Delay_min() {
		return (EAttribute)wakeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWakeEvent_WakeKind() {
		return (EAttribute)wakeEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWakeEvent_Delay_max() {
		return (EAttribute)wakeEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWakeEvent_Queue() {
		return (EReference)wakeEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationGuard() {
		return operationGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationAction() {
		return operationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationWitness() {
		return operationWitnessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInvariant() {
		return componentInvariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentVariable() {
		return componentVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInitialisation() {
		return componentInitialisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentSet() {
		return componentSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentConstant() {
		return componentConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentAxiom() {
		return componentAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWakeQueue() {
		return wakeQueueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWakeQueue_Refines() {
		return (EReference)wakeQueueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPort() {
		return abstractPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPort_Type() {
		return (EAttribute)abstractPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInPort() {
		return inPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInPort_InConnector() {
		return (EReference)inPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutPort() {
		return outPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutPort_OutConnector() {
		return (EReference)outPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWakeKind() {
		return wakeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsFactory getComponentsFactory() {
		return (ComponentsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractComponentModelEClass = createEClass(ABSTRACT_COMPONENT_MODEL);
		createEReference(abstractComponentModelEClass, ABSTRACT_COMPONENT_MODEL__COMPONENTS);
		createEReference(abstractComponentModelEClass, ABSTRACT_COMPONENT_MODEL__CONNECTORS);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__REFINES);
		createEReference(componentEClass, COMPONENT__OPERATIONS);
		createEReference(componentEClass, COMPONENT__WAKE_QUEUES);
		createEReference(componentEClass, COMPONENT__ASYNCHRONOUS_STATEMACHINES);
		createEReference(componentEClass, COMPONENT__SYNCHRONOUS_STATEMACHINES);
		createEReference(componentEClass, COMPONENT__PROCESS_STATEMACHINES);
		createEReference(componentEClass, COMPONENT__INVARIANTS);
		createEReference(componentEClass, COMPONENT__VARIABLES);
		createEReference(componentEClass, COMPONENT__INITIALISATIONS);
		createEReference(componentEClass, COMPONENT__SETS);
		createEReference(componentEClass, COMPONENT__AXIOMS);
		createEReference(componentEClass, COMPONENT__CONSTANTS);
		createEReference(componentEClass, COMPONENT__IN_PORTS);
		createEReference(componentEClass, COMPONENT__OUT_PORTS);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__SENDER);
		createEReference(connectorEClass, CONNECTOR__RECEIVERS);
		createEAttribute(connectorEClass, CONNECTOR__TYPE);
		createEAttribute(connectorEClass, CONNECTOR__INITIAL_VALUE);
		createEReference(connectorEClass, CONNECTOR__INHERITS);

		abstractComponentOperationEClass = createEClass(ABSTRACT_COMPONENT_OPERATION);
		createEReference(abstractComponentOperationEClass, ABSTRACT_COMPONENT_OPERATION__ELABORATES);
		createEReference(abstractComponentOperationEClass, ABSTRACT_COMPONENT_OPERATION__CALLS);
		createEReference(abstractComponentOperationEClass, ABSTRACT_COMPONENT_OPERATION__SENDS);
		createEReference(abstractComponentOperationEClass, ABSTRACT_COMPONENT_OPERATION__PARAMETERS);
		createEReference(abstractComponentOperationEClass, ABSTRACT_COMPONENT_OPERATION__WAKES);
		createEReference(abstractComponentOperationEClass, ABSTRACT_COMPONENT_OPERATION__ACTIONS);
		createEReference(abstractComponentOperationEClass, ABSTRACT_COMPONENT_OPERATION__GUARDS);
		createEReference(abstractComponentOperationEClass, ABSTRACT_COMPONENT_OPERATION__WITNESSES);
		createEAttribute(abstractComponentOperationEClass, ABSTRACT_COMPONENT_OPERATION__CONVERGENCE);
		createEAttribute(abstractComponentOperationEClass, ABSTRACT_COMPONENT_OPERATION__EXTENDED);
		createEReference(abstractComponentOperationEClass, ABSTRACT_COMPONENT_OPERATION__REFINES);

		methodEClass = createEClass(METHOD);

		portWakeEClass = createEClass(PORT_WAKE);
		createEReference(portWakeEClass, PORT_WAKE__RECEIVES);

		dataPacketEClass = createEClass(DATA_PACKET);
		createEReference(dataPacketEClass, DATA_PACKET__CONNECTOR);
		createEAttribute(dataPacketEClass, DATA_PACKET__VALUE);

		delayedDataPacketEClass = createEClass(DELAYED_DATA_PACKET);
		createEAttribute(delayedDataPacketEClass, DELAYED_DATA_PACKET__DELAY);

		selfWakeEClass = createEClass(SELF_WAKE);
		createEReference(selfWakeEClass, SELF_WAKE__QUEUE);

		externalEClass = createEClass(EXTERNAL);

		wakeEventEClass = createEClass(WAKE_EVENT);
		createEAttribute(wakeEventEClass, WAKE_EVENT__DELAY_MIN);
		createEAttribute(wakeEventEClass, WAKE_EVENT__WAKE_KIND);
		createEAttribute(wakeEventEClass, WAKE_EVENT__DELAY_MAX);
		createEReference(wakeEventEClass, WAKE_EVENT__QUEUE);

		transitionEClass = createEClass(TRANSITION);

		operationGuardEClass = createEClass(OPERATION_GUARD);

		operationActionEClass = createEClass(OPERATION_ACTION);

		operationWitnessEClass = createEClass(OPERATION_WITNESS);

		componentInvariantEClass = createEClass(COMPONENT_INVARIANT);

		componentVariableEClass = createEClass(COMPONENT_VARIABLE);

		componentInitialisationEClass = createEClass(COMPONENT_INITIALISATION);

		componentSetEClass = createEClass(COMPONENT_SET);

		componentConstantEClass = createEClass(COMPONENT_CONSTANT);

		componentAxiomEClass = createEClass(COMPONENT_AXIOM);

		wakeQueueEClass = createEClass(WAKE_QUEUE);
		createEReference(wakeQueueEClass, WAKE_QUEUE__REFINES);

		abstractPortEClass = createEClass(ABSTRACT_PORT);
		createEAttribute(abstractPortEClass, ABSTRACT_PORT__TYPE);

		inPortEClass = createEClass(IN_PORT);
		createEReference(inPortEClass, IN_PORT__IN_CONNECTOR);

		outPortEClass = createEClass(OUT_PORT);
		createEReference(outPortEClass, OUT_PORT__OUT_CONNECTOR);

		// Create enums
		wakeKindEEnum = createEEnum(WAKE_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		DiagramsPackage theDiagramsPackage = (DiagramsPackage)EPackage.Registry.INSTANCE.getEPackage(DiagramsPackage.eNS_URI);
		StatemachinesPackage theStatemachinesPackage = (StatemachinesPackage)EPackage.Registry.INSTANCE.getEPackage(StatemachinesPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CoreextensionPackage theCoreextensionPackage = (CoreextensionPackage)EPackage.Registry.INSTANCE.getEPackage(CoreextensionPackage.eNS_URI);
		MachinePackage theMachinePackage = (MachinePackage)EPackage.Registry.INSTANCE.getEPackage(MachinePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedElement());
		componentEClass.getESuperTypes().add(this.getAbstractComponentModel());
		componentEClass.getESuperTypes().add(theCorePackage.getAbstractExtension());
		componentEClass.getESuperTypes().add(theDiagramsPackage.getDiagram());
		connectorEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedElement());
		abstractComponentOperationEClass.getESuperTypes().add(theCorePackage.getEventBCommentedElement());
		abstractComponentOperationEClass.getESuperTypes().add(theCoreextensionPackage.getEventBLabeled());
		methodEClass.getESuperTypes().add(this.getAbstractComponentOperation());
		portWakeEClass.getESuperTypes().add(this.getAbstractComponentOperation());
		dataPacketEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedElement());
		delayedDataPacketEClass.getESuperTypes().add(this.getDataPacket());
		selfWakeEClass.getESuperTypes().add(this.getAbstractComponentOperation());
		externalEClass.getESuperTypes().add(this.getAbstractComponentOperation());
		wakeEventEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedElement());
		transitionEClass.getESuperTypes().add(this.getAbstractComponentOperation());
		operationGuardEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedDerivedPredicateElement());
		operationActionEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedActionElement());
		operationWitnessEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedPredicateElement());
		componentInvariantEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedDerivedPredicateElement());
		componentVariableEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedElement());
		componentInitialisationEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedActionElement());
		componentSetEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedElement());
		componentConstantEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedElement());
		componentAxiomEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedDerivedPredicateElement());
		wakeQueueEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedElement());
		abstractPortEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedElement());
		inPortEClass.getESuperTypes().add(this.getAbstractPort());
		outPortEClass.getESuperTypes().add(this.getAbstractPort());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractComponentModelEClass, AbstractComponentModel.class, "AbstractComponentModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractComponentModel_Components(), this.getComponent(), null, "components", null, 0, -1, AbstractComponentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractComponentModel_Connectors(), this.getConnector(), null, "connectors", null, 0, -1, AbstractComponentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Refines(), this.getComponent(), null, "refines", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Operations(), this.getAbstractComponentOperation(), null, "operations", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_WakeQueues(), this.getWakeQueue(), null, "wakeQueues", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_AsynchronousStatemachines(), theStatemachinesPackage.getStatemachine(), null, "asynchronousStatemachines", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_SynchronousStatemachines(), theStatemachinesPackage.getStatemachine(), null, "synchronousStatemachines", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ProcessStatemachines(), theStatemachinesPackage.getStatemachine(), null, "processStatemachines", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Invariants(), this.getComponentInvariant(), null, "Invariants", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Variables(), this.getComponentVariable(), null, "Variables", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Initialisations(), this.getComponentInitialisation(), null, "Initialisations", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Sets(), this.getComponentSet(), null, "Sets", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Axioms(), this.getComponentAxiom(), null, "Axioms", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Constants(), this.getComponentConstant(), null, "Constants", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_InPorts(), this.getInPort(), null, "inPorts", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_OutPorts(), this.getOutPort(), null, "outPorts", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_Sender(), this.getOutPort(), this.getOutPort_OutConnector(), "sender", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Receivers(), this.getInPort(), this.getInPort_InConnector(), "receivers", null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Type(), theEcorePackage.getEString(), "type", "\u2115", 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_InitialValue(), theEcorePackage.getEString(), "initialValue", "0", 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Inherits(), this.getConnector(), null, "inherits", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractComponentOperationEClass, AbstractComponentOperation.class, "AbstractComponentOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractComponentOperation_Elaborates(), theMachinePackage.getEvent(), null, "elaborates", null, 1, -1, AbstractComponentOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractComponentOperation_Calls(), this.getMethod(), null, "calls", null, 0, -1, AbstractComponentOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractComponentOperation_Sends(), this.getDelayedDataPacket(), null, "sends", null, 0, -1, AbstractComponentOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractComponentOperation_Parameters(), theCoreextensionPackage.getTypedParameter(), null, "parameters", null, 0, -1, AbstractComponentOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractComponentOperation_Wakes(), this.getWakeEvent(), null, "wakes", null, 0, -1, AbstractComponentOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractComponentOperation_Actions(), this.getOperationAction(), null, "actions", null, 0, -1, AbstractComponentOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractComponentOperation_Guards(), this.getOperationGuard(), null, "guards", null, 0, -1, AbstractComponentOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractComponentOperation_Witnesses(), this.getOperationWitness(), null, "witnesses", null, 0, -1, AbstractComponentOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractComponentOperation_Convergence(), theMachinePackage.getConvergence(), "convergence", null, 0, 1, AbstractComponentOperation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractComponentOperation_Extended(), theEcorePackage.getEBoolean(), "extended", null, 0, 1, AbstractComponentOperation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractComponentOperation_Refines(), this.getAbstractComponentOperation(), null, "refines", null, 0, 1, AbstractComponentOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portWakeEClass, PortWake.class, "PortWake", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortWake_Receives(), this.getDataPacket(), null, "receives", null, 0, -1, PortWake.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPacketEClass, DataPacket.class, "DataPacket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPacket_Connector(), this.getConnector(), null, "connector", null, 1, 1, DataPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataPacket_Value(), theEcorePackage.getEString(), "value", null, 1, 1, DataPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delayedDataPacketEClass, DelayedDataPacket.class, "DelayedDataPacket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelayedDataPacket_Delay(), ecorePackage.getEString(), "delay", "1", 1, 1, DelayedDataPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selfWakeEClass, SelfWake.class, "SelfWake", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelfWake_Queue(), this.getWakeQueue(), null, "queue", null, 1, 1, SelfWake.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalEClass, External.class, "External", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wakeEventEClass, WakeEvent.class, "WakeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWakeEvent_Delay_min(), ecorePackage.getEString(), "delay_min", "1", 1, 1, WakeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWakeEvent_WakeKind(), this.getWakeKind(), "wakeKind", null, 1, 1, WakeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWakeEvent_Delay_max(), theEcorePackage.getEString(), "delay_max", "1", 1, 1, WakeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWakeEvent_Queue(), this.getWakeQueue(), null, "queue", null, 1, 1, WakeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationGuardEClass, OperationGuard.class, "OperationGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationActionEClass, OperationAction.class, "OperationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationWitnessEClass, OperationWitness.class, "OperationWitness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentInvariantEClass, ComponentInvariant.class, "ComponentInvariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentVariableEClass, ComponentVariable.class, "ComponentVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentInitialisationEClass, ComponentInitialisation.class, "ComponentInitialisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentSetEClass, ComponentSet.class, "ComponentSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentConstantEClass, ComponentConstant.class, "ComponentConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentAxiomEClass, ComponentAxiom.class, "ComponentAxiom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wakeQueueEClass, WakeQueue.class, "WakeQueue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWakeQueue_Refines(), this.getWakeQueue(), null, "refines", null, 0, 1, WakeQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractPortEClass, AbstractPort.class, "AbstractPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractPort_Type(), theEcorePackage.getEString(), "type", "\u2115", 0, 1, AbstractPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inPortEClass, InPort.class, "InPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInPort_InConnector(), this.getConnector(), this.getConnector_Receivers(), "inConnector", null, 0, 1, InPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outPortEClass, OutPort.class, "OutPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutPort_OutConnector(), this.getConnector(), this.getConnector_Sender(), "outConnector", null, 0, 1, OutPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(wakeKindEEnum, WakeKind.class, "WakeKind");
		addEEnumLiteral(wakeKindEEnum, WakeKind.ADD_EVENT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// org.eventb.emf.core.extendedMetaClasses
		createOrgAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>org.eventb.emf.core.extendedMetaClasses</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.eventb.emf.core.extendedMetaClasses";		
		addAnnotation
		  (componentEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(CorePackage.eNS_URI).appendFragment("//machine/Machine")
		   });											
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";			
		addAnnotation
		  (componentEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasName"
		   });					
		addAnnotation
		  (connectorEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasName\nhasType\nhasInitialValue\nhasSender\nhasReceiver"
		   });		
		addAnnotation
		  (abstractComponentOperationEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasLabel\nhasElaborates\nsendScope\ncallScope\n"
		   });		
		addAnnotation
		  (portWakeEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasReceive\nreceiveScope"
		   });		
		addAnnotation
		  (dataPacketEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasName\nhasConnector\nhasValue"
		   });		
		addAnnotation
		  (delayedDataPacketEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasDelay"
		   });		
		addAnnotation
		  (wakeEventEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasName\nhasDelay\nhasWakeKind"
		   });		
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
			 "constraints", "hasCorrespondingStatemachineTransition"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";				
		addAnnotation
		  (getComponent_AsynchronousStatemachines(), 
		   source, 
		   new String[] {
			 "group", "#statemachines"
		   });		
		addAnnotation
		  (getComponent_SynchronousStatemachines(), 
		   source, 
		   new String[] {
			 "group", "#statemachines"
		   });		
		addAnnotation
		  (getComponent_ProcessStatemachines(), 
		   source, 
		   new String[] {
			 "group", "#statemachines"
		   });							
	}

} //ComponentsPackageImpl
