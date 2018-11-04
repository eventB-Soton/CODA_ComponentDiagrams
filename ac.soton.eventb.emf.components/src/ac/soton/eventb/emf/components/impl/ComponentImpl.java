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
package ac.soton.eventb.emf.components.impl;

import ac.soton.eventb.decomposition.AbstractRegion;
import ac.soton.eventb.decomposition.DecompositionPackage;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.impl.EventBNamedCommentedElementImpl;

import org.eventb.emf.core.machine.Variable;
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
import ac.soton.eventb.emf.components.InPort;
import ac.soton.eventb.emf.components.OutPort;
import ac.soton.eventb.emf.components.WakeQueue;
import ac.soton.eventb.emf.diagrams.Diagram;
import ac.soton.eventb.statemachines.Statemachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getExtensionId <em>Extension Id</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#isReady <em>Ready</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getContextName <em>Context Name</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getAllocatedVariables <em>Allocated Variables</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getAllocatedExtensions <em>Allocated Extensions</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getMachineName <em>Machine Name</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getWakeQueues <em>Wake Queues</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getAsynchronousStatemachines <em>Asynchronous Statemachines</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getSynchronousStatemachines <em>Synchronous Statemachines</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getProcessStatemachines <em>Process Statemachines</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getInitialisations <em>Initialisations</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getSets <em>Sets</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getAxioms <em>Axioms</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getConstants <em>Constants</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getInPorts <em>In Ports</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getOutPorts <em>Out Ports</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getInConnectors <em>In Connectors</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.components.impl.ComponentImpl#getOutConnectors <em>Out Connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends EventBNamedCommentedElementImpl implements Component {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011-2017\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

	/**
	 * The default value of the '{@link #getExtensionId() <em>Extension Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionId()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String EXTENSION_ID_EDEFAULT = ComponentsPackage.COMPONENTS_EXTENSION_ID;

	/**
	 * The cached value of the '{@link #getExtensionId() <em>Extension Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionId()
	 * @generated NOT
	 * @ordered
	 */
	protected String extensionId = EXTENSION_ID_EDEFAULT+"."+EcoreUtil.generateUUID();

	/**
	 * The default value of the '{@link #isReady() <em>Ready</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 6.0
	 * <!-- end-user-doc -->
	 * @see #isReady()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReady() <em>Ready</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 6.0
	 * <!-- end-user-doc -->
	 * @see #isReady()
	 * @generated
	 * @ordered
	 */
	protected boolean ready = READY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 6.0
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 6.0
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContextName() <em>Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 6.0
	 * <!-- end-user-doc -->
	 * @see #getContextName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextName() <em>Context Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 6.0
	 * <!-- end-user-doc -->
	 * @see #getContextName()
	 * @generated
	 * @ordered
	 */
	protected String contextName = CONTEXT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllocatedVariables() <em>Allocated Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * @since 6.0
	 * <!-- end-user-doc -->
	 * @see #getAllocatedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> allocatedVariables;

	/**
	 * The cached value of the '{@link #getAllocatedExtensions() <em>Allocated Extensions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * @since 6.0
	 * <!-- end-user-doc -->
	 * @see #getAllocatedExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractExtension> allocatedExtensions;

	/**
	 * The default value of the '{@link #getMachineName() <em>Machine Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 6.0
	 * <!-- end-user-doc -->
	 * @see #getMachineName()
	 * @generated
	 * @ordered
	 */
	protected static final String MACHINE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMachineName() <em>Machine Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 6.0
	 * <!-- end-user-doc -->
	 * @see #getMachineName()
	 * @generated
	 * @ordered
	 */
	protected String machineName = MACHINE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected Component refines;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractComponentOperation> operations;

	/**
	 * The cached value of the '{@link #getWakeQueues() <em>Wake Queues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWakeQueues()
	 * @generated
	 * @ordered
	 */
	protected EList<WakeQueue> wakeQueues;

	/**
	 * The cached value of the '{@link #getAsynchronousStatemachines() <em>Asynchronous Statemachines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsynchronousStatemachines()
	 * @generated
	 * @ordered
	 */
	protected EList<Statemachine> asynchronousStatemachines;

	/**
	 * The cached value of the '{@link #getSynchronousStatemachines() <em>Synchronous Statemachines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronousStatemachines()
	 * @generated
	 * @ordered
	 */
	protected EList<Statemachine> synchronousStatemachines;

	/**
	 * The cached value of the '{@link #getProcessStatemachines() <em>Process Statemachines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessStatemachines()
	 * @generated
	 * @ordered
	 */
	protected EList<Statemachine> processStatemachines;

	/**
	 * The cached value of the '{@link #getInvariants() <em>Invariants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariants()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInvariant> invariants;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentVariable> variables;

	/**
	 * The cached value of the '{@link #getInitialisations() <em>Initialisations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialisations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInitialisation> initialisations;

	/**
	 * The cached value of the '{@link #getSets() <em>Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentSet> sets;

	/**
	 * The cached value of the '{@link #getAxioms() <em>Axioms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxioms()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentAxiom> axioms;

	/**
	 * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstants()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentConstant> constants;

	/**
	 * The cached value of the '{@link #getInPorts() <em>In Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<InPort> inPorts;

	/**
	 * The cached value of the '{@link #getOutPorts() <em>Out Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<OutPort> outPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, ComponentsPackage.COMPONENT__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList.Resolving<Connector>(Connector.class, this, ComponentsPackage.COMPONENT__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensionId() {
		return extensionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionId(String newExtensionId) {
		String oldExtensionId = extensionId;
		extensionId = newExtensionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.COMPONENT__EXTENSION_ID, oldExtensionId, extensionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReady() {
		return ready;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReady(boolean newReady) {
		boolean oldReady = ready;
		ready = newReady;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.COMPONENT__READY, oldReady, ready));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.COMPONENT__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContextName() {
		return contextName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextName(String newContextName) {
		String oldContextName = contextName;
		contextName = newContextName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.COMPONENT__CONTEXT_NAME, oldContextName, contextName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getAllocatedVariables() {
		if (allocatedVariables == null) {
			allocatedVariables = new EObjectResolvingEList<Variable>(Variable.class, this, ComponentsPackage.COMPONENT__ALLOCATED_VARIABLES);
		}
		return allocatedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractExtension> getAllocatedExtensions() {
		if (allocatedExtensions == null) {
			allocatedExtensions = new EObjectResolvingEList<AbstractExtension>(AbstractExtension.class, this, ComponentsPackage.COMPONENT__ALLOCATED_EXTENSIONS);
		}
		return allocatedExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMachineName() {
		return machineName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachineName(String newMachineName) {
		String oldMachineName = machineName;
		machineName = newMachineName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.COMPONENT__MACHINE_NAME, oldMachineName, machineName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getRefines() {
		if (refines != null && refines.eIsProxy()) {
			InternalEObject oldRefines = (InternalEObject)refines;
			refines = (Component)eResolveProxy(oldRefines);
			if (refines != oldRefines) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.COMPONENT__REFINES, oldRefines, refines));
			}
		}
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetRefines() {
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefines(Component newRefines) {
		Component oldRefines = refines;
		refines = newRefines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.COMPONENT__REFINES, oldRefines, refines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractComponentOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList.Resolving<AbstractComponentOperation>(AbstractComponentOperation.class, this, ComponentsPackage.COMPONENT__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WakeQueue> getWakeQueues() {
		if (wakeQueues == null) {
			wakeQueues = new EObjectContainmentEList.Resolving<WakeQueue>(WakeQueue.class, this, ComponentsPackage.COMPONENT__WAKE_QUEUES);
		}
		return wakeQueues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statemachine> getAsynchronousStatemachines() {
		if (asynchronousStatemachines == null) {
			asynchronousStatemachines = new EObjectContainmentEList.Resolving<Statemachine>(Statemachine.class, this, ComponentsPackage.COMPONENT__ASYNCHRONOUS_STATEMACHINES);
		}
		return asynchronousStatemachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statemachine> getSynchronousStatemachines() {
		if (synchronousStatemachines == null) {
			synchronousStatemachines = new EObjectContainmentEList.Resolving<Statemachine>(Statemachine.class, this, ComponentsPackage.COMPONENT__SYNCHRONOUS_STATEMACHINES);
		}
		return synchronousStatemachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statemachine> getProcessStatemachines() {
		if (processStatemachines == null) {
			processStatemachines = new EObjectContainmentEList.Resolving<Statemachine>(Statemachine.class, this, ComponentsPackage.COMPONENT__PROCESS_STATEMACHINES);
		}
		return processStatemachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInvariant> getInvariants() {
		if (invariants == null) {
			invariants = new EObjectContainmentEList.Resolving<ComponentInvariant>(ComponentInvariant.class, this, ComponentsPackage.COMPONENT__INVARIANTS);
		}
		return invariants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentVariable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList.Resolving<ComponentVariable>(ComponentVariable.class, this, ComponentsPackage.COMPONENT__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInitialisation> getInitialisations() {
		if (initialisations == null) {
			initialisations = new EObjectContainmentEList.Resolving<ComponentInitialisation>(ComponentInitialisation.class, this, ComponentsPackage.COMPONENT__INITIALISATIONS);
		}
		return initialisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentSet> getSets() {
		if (sets == null) {
			sets = new EObjectContainmentEList.Resolving<ComponentSet>(ComponentSet.class, this, ComponentsPackage.COMPONENT__SETS);
		}
		return sets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentAxiom> getAxioms() {
		if (axioms == null) {
			axioms = new EObjectContainmentEList.Resolving<ComponentAxiom>(ComponentAxiom.class, this, ComponentsPackage.COMPONENT__AXIOMS);
		}
		return axioms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentConstant> getConstants() {
		if (constants == null) {
			constants = new EObjectContainmentEList.Resolving<ComponentConstant>(ComponentConstant.class, this, ComponentsPackage.COMPONENT__CONSTANTS);
		}
		return constants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InPort> getInPorts() {
		if (inPorts == null) {
			inPorts = new EObjectContainmentEList.Resolving<InPort>(InPort.class, this, ComponentsPackage.COMPONENT__IN_PORTS);
		}
		return inPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutPort> getOutPorts() {
		if (outPorts == null) {
			outPorts = new EObjectContainmentEList.Resolving<OutPort>(OutPort.class, this, ComponentsPackage.COMPONENT__OUT_PORTS);
		}
		return outPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * returns an unmodifiable list of the connectors that connect to the InPorts of this component
	 * 	 (InConnectors is a derived, volatile, transient, unmodifiable relationship)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Connector> getInConnectors() {
		ArrayList<Connector> inConnectors = new ArrayList<Connector>();
		for (InPort inp : getInPorts()){
			if (inp.getConnector()!= null){
				inConnectors.add(inp.getConnector());
			}
		}
		return new BasicEList.UnmodifiableEList<Connector>(inConnectors.size(), inConnectors.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * 	 returns an unmodifiable list of the connectors that connect to the OutPorts of this component
	 * 	 (OutConnectors is a derived, volatile, transient, unmodifiable relationship)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Connector> getOutConnectors() {
		ArrayList<Connector> outConnectors = new ArrayList<Connector>();
		for (OutPort outp : getOutPorts()){
			if (outp.getConnector() != null){
				outConnectors.add(outp.getConnector());
			}
		}
		return new BasicEList.UnmodifiableEList<Connector>(outConnectors.size(), outConnectors.toArray());
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.COMPONENT__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.COMPONENT__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.COMPONENT__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.COMPONENT__WAKE_QUEUES:
				return ((InternalEList<?>)getWakeQueues()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.COMPONENT__ASYNCHRONOUS_STATEMACHINES:
				return ((InternalEList<?>)getAsynchronousStatemachines()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.COMPONENT__SYNCHRONOUS_STATEMACHINES:
				return ((InternalEList<?>)getSynchronousStatemachines()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.COMPONENT__PROCESS_STATEMACHINES:
				return ((InternalEList<?>)getProcessStatemachines()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.COMPONENT__INVARIANTS:
				return ((InternalEList<?>)getInvariants()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.COMPONENT__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.COMPONENT__INITIALISATIONS:
				return ((InternalEList<?>)getInitialisations()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.COMPONENT__SETS:
				return ((InternalEList<?>)getSets()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.COMPONENT__AXIOMS:
				return ((InternalEList<?>)getAxioms()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.COMPONENT__CONSTANTS:
				return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.COMPONENT__IN_PORTS:
				return ((InternalEList<?>)getInPorts()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.COMPONENT__OUT_PORTS:
				return ((InternalEList<?>)getOutPorts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.COMPONENT__COMPONENTS:
				return getComponents();
			case ComponentsPackage.COMPONENT__CONNECTORS:
				return getConnectors();
			case ComponentsPackage.COMPONENT__EXTENSION_ID:
				return getExtensionId();
			case ComponentsPackage.COMPONENT__READY:
				return isReady();
			case ComponentsPackage.COMPONENT__PROJECT_NAME:
				return getProjectName();
			case ComponentsPackage.COMPONENT__CONTEXT_NAME:
				return getContextName();
			case ComponentsPackage.COMPONENT__ALLOCATED_VARIABLES:
				return getAllocatedVariables();
			case ComponentsPackage.COMPONENT__ALLOCATED_EXTENSIONS:
				return getAllocatedExtensions();
			case ComponentsPackage.COMPONENT__MACHINE_NAME:
				return getMachineName();
			case ComponentsPackage.COMPONENT__REFINES:
				if (resolve) return getRefines();
				return basicGetRefines();
			case ComponentsPackage.COMPONENT__OPERATIONS:
				return getOperations();
			case ComponentsPackage.COMPONENT__WAKE_QUEUES:
				return getWakeQueues();
			case ComponentsPackage.COMPONENT__ASYNCHRONOUS_STATEMACHINES:
				return getAsynchronousStatemachines();
			case ComponentsPackage.COMPONENT__SYNCHRONOUS_STATEMACHINES:
				return getSynchronousStatemachines();
			case ComponentsPackage.COMPONENT__PROCESS_STATEMACHINES:
				return getProcessStatemachines();
			case ComponentsPackage.COMPONENT__INVARIANTS:
				return getInvariants();
			case ComponentsPackage.COMPONENT__VARIABLES:
				return getVariables();
			case ComponentsPackage.COMPONENT__INITIALISATIONS:
				return getInitialisations();
			case ComponentsPackage.COMPONENT__SETS:
				return getSets();
			case ComponentsPackage.COMPONENT__AXIOMS:
				return getAxioms();
			case ComponentsPackage.COMPONENT__CONSTANTS:
				return getConstants();
			case ComponentsPackage.COMPONENT__IN_PORTS:
				return getInPorts();
			case ComponentsPackage.COMPONENT__OUT_PORTS:
				return getOutPorts();
			case ComponentsPackage.COMPONENT__IN_CONNECTORS:
				return getInConnectors();
			case ComponentsPackage.COMPONENT__OUT_CONNECTORS:
				return getOutConnectors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentsPackage.COMPONENT__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case ComponentsPackage.COMPONENT__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case ComponentsPackage.COMPONENT__EXTENSION_ID:
				setExtensionId((String)newValue);
				return;
			case ComponentsPackage.COMPONENT__READY:
				setReady((Boolean)newValue);
				return;
			case ComponentsPackage.COMPONENT__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
			case ComponentsPackage.COMPONENT__CONTEXT_NAME:
				setContextName((String)newValue);
				return;
			case ComponentsPackage.COMPONENT__ALLOCATED_VARIABLES:
				getAllocatedVariables().clear();
				getAllocatedVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case ComponentsPackage.COMPONENT__ALLOCATED_EXTENSIONS:
				getAllocatedExtensions().clear();
				getAllocatedExtensions().addAll((Collection<? extends AbstractExtension>)newValue);
				return;
			case ComponentsPackage.COMPONENT__MACHINE_NAME:
				setMachineName((String)newValue);
				return;
			case ComponentsPackage.COMPONENT__REFINES:
				setRefines((Component)newValue);
				return;
			case ComponentsPackage.COMPONENT__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends AbstractComponentOperation>)newValue);
				return;
			case ComponentsPackage.COMPONENT__WAKE_QUEUES:
				getWakeQueues().clear();
				getWakeQueues().addAll((Collection<? extends WakeQueue>)newValue);
				return;
			case ComponentsPackage.COMPONENT__ASYNCHRONOUS_STATEMACHINES:
				getAsynchronousStatemachines().clear();
				getAsynchronousStatemachines().addAll((Collection<? extends Statemachine>)newValue);
				return;
			case ComponentsPackage.COMPONENT__SYNCHRONOUS_STATEMACHINES:
				getSynchronousStatemachines().clear();
				getSynchronousStatemachines().addAll((Collection<? extends Statemachine>)newValue);
				return;
			case ComponentsPackage.COMPONENT__PROCESS_STATEMACHINES:
				getProcessStatemachines().clear();
				getProcessStatemachines().addAll((Collection<? extends Statemachine>)newValue);
				return;
			case ComponentsPackage.COMPONENT__INVARIANTS:
				getInvariants().clear();
				getInvariants().addAll((Collection<? extends ComponentInvariant>)newValue);
				return;
			case ComponentsPackage.COMPONENT__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends ComponentVariable>)newValue);
				return;
			case ComponentsPackage.COMPONENT__INITIALISATIONS:
				getInitialisations().clear();
				getInitialisations().addAll((Collection<? extends ComponentInitialisation>)newValue);
				return;
			case ComponentsPackage.COMPONENT__SETS:
				getSets().clear();
				getSets().addAll((Collection<? extends ComponentSet>)newValue);
				return;
			case ComponentsPackage.COMPONENT__AXIOMS:
				getAxioms().clear();
				getAxioms().addAll((Collection<? extends ComponentAxiom>)newValue);
				return;
			case ComponentsPackage.COMPONENT__CONSTANTS:
				getConstants().clear();
				getConstants().addAll((Collection<? extends ComponentConstant>)newValue);
				return;
			case ComponentsPackage.COMPONENT__IN_PORTS:
				getInPorts().clear();
				getInPorts().addAll((Collection<? extends InPort>)newValue);
				return;
			case ComponentsPackage.COMPONENT__OUT_PORTS:
				getOutPorts().clear();
				getOutPorts().addAll((Collection<? extends OutPort>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComponentsPackage.COMPONENT__COMPONENTS:
				getComponents().clear();
				return;
			case ComponentsPackage.COMPONENT__CONNECTORS:
				getConnectors().clear();
				return;
			case ComponentsPackage.COMPONENT__EXTENSION_ID:
				setExtensionId(EXTENSION_ID_EDEFAULT);
				return;
			case ComponentsPackage.COMPONENT__READY:
				setReady(READY_EDEFAULT);
				return;
			case ComponentsPackage.COMPONENT__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
			case ComponentsPackage.COMPONENT__CONTEXT_NAME:
				setContextName(CONTEXT_NAME_EDEFAULT);
				return;
			case ComponentsPackage.COMPONENT__ALLOCATED_VARIABLES:
				getAllocatedVariables().clear();
				return;
			case ComponentsPackage.COMPONENT__ALLOCATED_EXTENSIONS:
				getAllocatedExtensions().clear();
				return;
			case ComponentsPackage.COMPONENT__MACHINE_NAME:
				setMachineName(MACHINE_NAME_EDEFAULT);
				return;
			case ComponentsPackage.COMPONENT__REFINES:
				setRefines((Component)null);
				return;
			case ComponentsPackage.COMPONENT__OPERATIONS:
				getOperations().clear();
				return;
			case ComponentsPackage.COMPONENT__WAKE_QUEUES:
				getWakeQueues().clear();
				return;
			case ComponentsPackage.COMPONENT__ASYNCHRONOUS_STATEMACHINES:
				getAsynchronousStatemachines().clear();
				return;
			case ComponentsPackage.COMPONENT__SYNCHRONOUS_STATEMACHINES:
				getSynchronousStatemachines().clear();
				return;
			case ComponentsPackage.COMPONENT__PROCESS_STATEMACHINES:
				getProcessStatemachines().clear();
				return;
			case ComponentsPackage.COMPONENT__INVARIANTS:
				getInvariants().clear();
				return;
			case ComponentsPackage.COMPONENT__VARIABLES:
				getVariables().clear();
				return;
			case ComponentsPackage.COMPONENT__INITIALISATIONS:
				getInitialisations().clear();
				return;
			case ComponentsPackage.COMPONENT__SETS:
				getSets().clear();
				return;
			case ComponentsPackage.COMPONENT__AXIOMS:
				getAxioms().clear();
				return;
			case ComponentsPackage.COMPONENT__CONSTANTS:
				getConstants().clear();
				return;
			case ComponentsPackage.COMPONENT__IN_PORTS:
				getInPorts().clear();
				return;
			case ComponentsPackage.COMPONENT__OUT_PORTS:
				getOutPorts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComponentsPackage.COMPONENT__COMPONENTS:
				return components != null && !components.isEmpty();
			case ComponentsPackage.COMPONENT__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case ComponentsPackage.COMPONENT__EXTENSION_ID:
				return EXTENSION_ID_EDEFAULT == null ? extensionId != null : !EXTENSION_ID_EDEFAULT.equals(extensionId);
			case ComponentsPackage.COMPONENT__READY:
				return ready != READY_EDEFAULT;
			case ComponentsPackage.COMPONENT__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
			case ComponentsPackage.COMPONENT__CONTEXT_NAME:
				return CONTEXT_NAME_EDEFAULT == null ? contextName != null : !CONTEXT_NAME_EDEFAULT.equals(contextName);
			case ComponentsPackage.COMPONENT__ALLOCATED_VARIABLES:
				return allocatedVariables != null && !allocatedVariables.isEmpty();
			case ComponentsPackage.COMPONENT__ALLOCATED_EXTENSIONS:
				return allocatedExtensions != null && !allocatedExtensions.isEmpty();
			case ComponentsPackage.COMPONENT__MACHINE_NAME:
				return MACHINE_NAME_EDEFAULT == null ? machineName != null : !MACHINE_NAME_EDEFAULT.equals(machineName);
			case ComponentsPackage.COMPONENT__REFINES:
				return refines != null;
			case ComponentsPackage.COMPONENT__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case ComponentsPackage.COMPONENT__WAKE_QUEUES:
				return wakeQueues != null && !wakeQueues.isEmpty();
			case ComponentsPackage.COMPONENT__ASYNCHRONOUS_STATEMACHINES:
				return asynchronousStatemachines != null && !asynchronousStatemachines.isEmpty();
			case ComponentsPackage.COMPONENT__SYNCHRONOUS_STATEMACHINES:
				return synchronousStatemachines != null && !synchronousStatemachines.isEmpty();
			case ComponentsPackage.COMPONENT__PROCESS_STATEMACHINES:
				return processStatemachines != null && !processStatemachines.isEmpty();
			case ComponentsPackage.COMPONENT__INVARIANTS:
				return invariants != null && !invariants.isEmpty();
			case ComponentsPackage.COMPONENT__VARIABLES:
				return variables != null && !variables.isEmpty();
			case ComponentsPackage.COMPONENT__INITIALISATIONS:
				return initialisations != null && !initialisations.isEmpty();
			case ComponentsPackage.COMPONENT__SETS:
				return sets != null && !sets.isEmpty();
			case ComponentsPackage.COMPONENT__AXIOMS:
				return axioms != null && !axioms.isEmpty();
			case ComponentsPackage.COMPONENT__CONSTANTS:
				return constants != null && !constants.isEmpty();
			case ComponentsPackage.COMPONENT__IN_PORTS:
				return inPorts != null && !inPorts.isEmpty();
			case ComponentsPackage.COMPONENT__OUT_PORTS:
				return outPorts != null && !outPorts.isEmpty();
			case ComponentsPackage.COMPONENT__IN_CONNECTORS:
				return !getInConnectors().isEmpty();
			case ComponentsPackage.COMPONENT__OUT_CONNECTORS:
				return !getOutConnectors().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractComponentModel.class) {
			switch (derivedFeatureID) {
				case ComponentsPackage.COMPONENT__COMPONENTS: return ComponentsPackage.ABSTRACT_COMPONENT_MODEL__COMPONENTS;
				case ComponentsPackage.COMPONENT__CONNECTORS: return ComponentsPackage.ABSTRACT_COMPONENT_MODEL__CONNECTORS;
				default: return -1;
			}
		}
		if (baseClass == AbstractExtension.class) {
			switch (derivedFeatureID) {
				case ComponentsPackage.COMPONENT__EXTENSION_ID: return CorePackage.ABSTRACT_EXTENSION__EXTENSION_ID;
				default: return -1;
			}
		}
		if (baseClass == Diagram.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractRegion.class) {
			switch (derivedFeatureID) {
				case ComponentsPackage.COMPONENT__READY: return DecompositionPackage.ABSTRACT_REGION__READY;
				case ComponentsPackage.COMPONENT__PROJECT_NAME: return DecompositionPackage.ABSTRACT_REGION__PROJECT_NAME;
				case ComponentsPackage.COMPONENT__CONTEXT_NAME: return DecompositionPackage.ABSTRACT_REGION__CONTEXT_NAME;
				case ComponentsPackage.COMPONENT__ALLOCATED_VARIABLES: return DecompositionPackage.ABSTRACT_REGION__ALLOCATED_VARIABLES;
				case ComponentsPackage.COMPONENT__ALLOCATED_EXTENSIONS: return DecompositionPackage.ABSTRACT_REGION__ALLOCATED_EXTENSIONS;
				case ComponentsPackage.COMPONENT__MACHINE_NAME: return DecompositionPackage.ABSTRACT_REGION__MACHINE_NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractComponentModel.class) {
			switch (baseFeatureID) {
				case ComponentsPackage.ABSTRACT_COMPONENT_MODEL__COMPONENTS: return ComponentsPackage.COMPONENT__COMPONENTS;
				case ComponentsPackage.ABSTRACT_COMPONENT_MODEL__CONNECTORS: return ComponentsPackage.COMPONENT__CONNECTORS;
				default: return -1;
			}
		}
		if (baseClass == AbstractExtension.class) {
			switch (baseFeatureID) {
				case CorePackage.ABSTRACT_EXTENSION__EXTENSION_ID: return ComponentsPackage.COMPONENT__EXTENSION_ID;
				default: return -1;
			}
		}
		if (baseClass == Diagram.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractRegion.class) {
			switch (baseFeatureID) {
				case DecompositionPackage.ABSTRACT_REGION__READY: return ComponentsPackage.COMPONENT__READY;
				case DecompositionPackage.ABSTRACT_REGION__PROJECT_NAME: return ComponentsPackage.COMPONENT__PROJECT_NAME;
				case DecompositionPackage.ABSTRACT_REGION__CONTEXT_NAME: return ComponentsPackage.COMPONENT__CONTEXT_NAME;
				case DecompositionPackage.ABSTRACT_REGION__ALLOCATED_VARIABLES: return ComponentsPackage.COMPONENT__ALLOCATED_VARIABLES;
				case DecompositionPackage.ABSTRACT_REGION__ALLOCATED_EXTENSIONS: return ComponentsPackage.COMPONENT__ALLOCATED_EXTENSIONS;
				case DecompositionPackage.ABSTRACT_REGION__MACHINE_NAME: return ComponentsPackage.COMPONENT__MACHINE_NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (extensionId: ");
		result.append(extensionId);
		result.append(", ready: ");
		result.append(ready);
		result.append(", projectName: ");
		result.append(projectName);
		result.append(", contextName: ");
		result.append(contextName);
		result.append(", machineName: ");
		result.append(machineName);
		result.append(')');
		return result.toString();
	}
	
//	/**
//	 * 
//	 * Overriden so that the MachineName of a region reflects the component name
//	 * 
//	 * @custom
//	 */
//	@Override
//	public void setName(String newName){
//		super.setName(newName);
//		setMachineName(newName);
//	}
//
//	
//	private void updateRegionDetails(){
//		getAllocatedExtensions().add(this);
//		EList<Variable> allocatedVariables = getAllocatedVariables();
//		for 
//		allocatedVariables.add(e);
//		
//	}
} //ComponentImpl
