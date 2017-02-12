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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ac.soton.eventb.emf.components.ComponentsFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentsPackage extends EPackage {
	
	/**
	 * Components extension ID, assigned to Component extensions of Event-B,
	 * as well as used by transformation to Event-B.
	 */
	String COMPONENTS_EXTENSION_ID = "ac.soton.eventb.components";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2011-2017\rUniversity of Southampton.\rAll rights reserved. This program and the accompanying materials  are made\ravailable under the terms of the Eclipse Public License v1.0 which accompanies this \rdistribution, and is available at http://www.eclipse.org/legal/epl-v10.html\n";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "components";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://soton.ac.uk/models/eventb/components/2016";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "components";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentsPackage eINSTANCE = ac.soton.eventb.emf.components.impl.ComponentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.AbstractComponentModelImpl <em>Abstract Component Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.AbstractComponentModelImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getAbstractComponentModel()
	 * @generated
	 */
	int ABSTRACT_COMPONENT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_MODEL__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_MODEL__CONNECTORS = 1;

	/**
	 * The number of structural features of the '<em>Abstract Component Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.ComponentImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENTS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONNECTORS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extension Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__EXTENSION_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ready</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__READY = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROJECT_NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Context Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONTEXT_NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Allocated Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ALLOCATED_VARIABLES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Allocated Extensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ALLOCATED_EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Machine Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MACHINE_NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REFINES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OPERATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Wake Queues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__WAKE_QUEUES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Asynchronous Statemachines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ASYNCHRONOUS_STATEMACHINES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Synchronous Statemachines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SYNCHRONOUS_STATEMACHINES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Process Statemachines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROCESS_STATEMACHINES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Invariants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INVARIANTS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__VARIABLES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Initialisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INITIALISATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SETS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Axioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__AXIOMS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONSTANTS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IN_PORTS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OUT_PORTS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>In Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IN_CONNECTORS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Out Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OUT_CONNECTORS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 25;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.ConnectorImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TYPE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__INHERITS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONNECTOR = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Destinations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DESTINATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ready</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__READY = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PROJECT_NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Context Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONTEXT_NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Allocated Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ALLOCATED_VARIABLES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Allocated Extensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ALLOCATED_EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Machine Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__MACHINE_NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__INITIAL_VALUE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__RECEIVERS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SENDER = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.AbstractComponentOperationImpl <em>Abstract Component Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.AbstractComponentOperationImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getAbstractComponentOperation()
	 * @generated
	 */
	int ABSTRACT_COMPONENT_OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION__ANNOTATIONS = CorePackage.EVENT_BCOMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION__EXTENSIONS = CorePackage.EVENT_BCOMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION__ATTRIBUTES = CorePackage.EVENT_BCOMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION__REFERENCE = CorePackage.EVENT_BCOMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION__GENERATED = CorePackage.EVENT_BCOMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION__LOCAL_GENERATED = CorePackage.EVENT_BCOMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION__INTERNAL_ID = CorePackage.EVENT_BCOMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION__COMMENT = CorePackage.EVENT_BCOMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION__LABEL = CorePackage.EVENT_BCOMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elaborates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION__ELABORATES = CorePackage.EVENT_BCOMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION__CALLS = CorePackage.EVENT_BCOMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION__SENDS = CorePackage.EVENT_BCOMMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION__PARAMETERS = CorePackage.EVENT_BCOMMENTED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Wakes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION__WAKES = CorePackage.EVENT_BCOMMENTED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION__ACTIONS = CorePackage.EVENT_BCOMMENTED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION__GUARDS = CorePackage.EVENT_BCOMMENTED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Witnesses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION__WITNESSES = CorePackage.EVENT_BCOMMENTED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Convergence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION__CONVERGENCE = CorePackage.EVENT_BCOMMENTED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Extended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION__EXTENDED = CorePackage.EVENT_BCOMMENTED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION__REFINES = CorePackage.EVENT_BCOMMENTED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Abstract Component Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION_FEATURE_COUNT = CorePackage.EVENT_BCOMMENTED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.MethodImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ANNOTATIONS = ABSTRACT_COMPONENT_OPERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__EXTENSIONS = ABSTRACT_COMPONENT_OPERATION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ATTRIBUTES = ABSTRACT_COMPONENT_OPERATION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__REFERENCE = ABSTRACT_COMPONENT_OPERATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__GENERATED = ABSTRACT_COMPONENT_OPERATION__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__LOCAL_GENERATED = ABSTRACT_COMPONENT_OPERATION__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__INTERNAL_ID = ABSTRACT_COMPONENT_OPERATION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__COMMENT = ABSTRACT_COMPONENT_OPERATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__LABEL = ABSTRACT_COMPONENT_OPERATION__LABEL;

	/**
	 * The feature id for the '<em><b>Elaborates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ELABORATES = ABSTRACT_COMPONENT_OPERATION__ELABORATES;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CALLS = ABSTRACT_COMPONENT_OPERATION__CALLS;

	/**
	 * The feature id for the '<em><b>Sends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__SENDS = ABSTRACT_COMPONENT_OPERATION__SENDS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMETERS = ABSTRACT_COMPONENT_OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Wakes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__WAKES = ABSTRACT_COMPONENT_OPERATION__WAKES;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ACTIONS = ABSTRACT_COMPONENT_OPERATION__ACTIONS;

	/**
	 * The feature id for the '<em><b>Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__GUARDS = ABSTRACT_COMPONENT_OPERATION__GUARDS;

	/**
	 * The feature id for the '<em><b>Witnesses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__WITNESSES = ABSTRACT_COMPONENT_OPERATION__WITNESSES;

	/**
	 * The feature id for the '<em><b>Convergence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CONVERGENCE = ABSTRACT_COMPONENT_OPERATION__CONVERGENCE;

	/**
	 * The feature id for the '<em><b>Extended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__EXTENDED = ABSTRACT_COMPONENT_OPERATION__EXTENDED;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__REFINES = ABSTRACT_COMPONENT_OPERATION__REFINES;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = ABSTRACT_COMPONENT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.PortWakeImpl <em>Port Wake</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.PortWakeImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getPortWake()
	 * @generated
	 */
	int PORT_WAKE = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__ANNOTATIONS = ABSTRACT_COMPONENT_OPERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__EXTENSIONS = ABSTRACT_COMPONENT_OPERATION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__ATTRIBUTES = ABSTRACT_COMPONENT_OPERATION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__REFERENCE = ABSTRACT_COMPONENT_OPERATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__GENERATED = ABSTRACT_COMPONENT_OPERATION__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__LOCAL_GENERATED = ABSTRACT_COMPONENT_OPERATION__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__INTERNAL_ID = ABSTRACT_COMPONENT_OPERATION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__COMMENT = ABSTRACT_COMPONENT_OPERATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__LABEL = ABSTRACT_COMPONENT_OPERATION__LABEL;

	/**
	 * The feature id for the '<em><b>Elaborates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__ELABORATES = ABSTRACT_COMPONENT_OPERATION__ELABORATES;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__CALLS = ABSTRACT_COMPONENT_OPERATION__CALLS;

	/**
	 * The feature id for the '<em><b>Sends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__SENDS = ABSTRACT_COMPONENT_OPERATION__SENDS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__PARAMETERS = ABSTRACT_COMPONENT_OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Wakes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__WAKES = ABSTRACT_COMPONENT_OPERATION__WAKES;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__ACTIONS = ABSTRACT_COMPONENT_OPERATION__ACTIONS;

	/**
	 * The feature id for the '<em><b>Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__GUARDS = ABSTRACT_COMPONENT_OPERATION__GUARDS;

	/**
	 * The feature id for the '<em><b>Witnesses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__WITNESSES = ABSTRACT_COMPONENT_OPERATION__WITNESSES;

	/**
	 * The feature id for the '<em><b>Convergence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__CONVERGENCE = ABSTRACT_COMPONENT_OPERATION__CONVERGENCE;

	/**
	 * The feature id for the '<em><b>Extended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__EXTENDED = ABSTRACT_COMPONENT_OPERATION__EXTENDED;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__REFINES = ABSTRACT_COMPONENT_OPERATION__REFINES;

	/**
	 * The feature id for the '<em><b>Receives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE__RECEIVES = ABSTRACT_COMPONENT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Wake</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_WAKE_FEATURE_COUNT = ABSTRACT_COMPONENT_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.AbstractDataPacketImpl <em>Abstract Data Packet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.AbstractDataPacketImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getAbstractDataPacket()
	 * @generated
	 */
	int ABSTRACT_DATA_PACKET = 25;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_PACKET__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_PACKET__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_PACKET__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_PACKET__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_PACKET__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_PACKET__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_PACKET__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_PACKET__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_PACKET__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_PACKET__CONNECTOR = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_PACKET__VALUE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_PACKET__PORT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Data Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_PACKET_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.DataPacketImpl <em>Data Packet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.DataPacketImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getDataPacket()
	 * @generated
	 */
	int DATA_PACKET = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PACKET__ANNOTATIONS = ABSTRACT_DATA_PACKET__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PACKET__EXTENSIONS = ABSTRACT_DATA_PACKET__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PACKET__ATTRIBUTES = ABSTRACT_DATA_PACKET__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PACKET__REFERENCE = ABSTRACT_DATA_PACKET__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PACKET__GENERATED = ABSTRACT_DATA_PACKET__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PACKET__LOCAL_GENERATED = ABSTRACT_DATA_PACKET__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PACKET__INTERNAL_ID = ABSTRACT_DATA_PACKET__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PACKET__COMMENT = ABSTRACT_DATA_PACKET__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PACKET__NAME = ABSTRACT_DATA_PACKET__NAME;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PACKET__CONNECTOR = ABSTRACT_DATA_PACKET__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PACKET__VALUE = ABSTRACT_DATA_PACKET__VALUE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PACKET__PORT = ABSTRACT_DATA_PACKET__PORT;

	/**
	 * The number of structural features of the '<em>Data Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PACKET_FEATURE_COUNT = ABSTRACT_DATA_PACKET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.DelayedDataPacketImpl <em>Delayed Data Packet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.DelayedDataPacketImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getDelayedDataPacket()
	 * @generated
	 */
	int DELAYED_DATA_PACKET = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_DATA_PACKET__ANNOTATIONS = ABSTRACT_DATA_PACKET__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_DATA_PACKET__EXTENSIONS = ABSTRACT_DATA_PACKET__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_DATA_PACKET__ATTRIBUTES = ABSTRACT_DATA_PACKET__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_DATA_PACKET__REFERENCE = ABSTRACT_DATA_PACKET__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_DATA_PACKET__GENERATED = ABSTRACT_DATA_PACKET__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_DATA_PACKET__LOCAL_GENERATED = ABSTRACT_DATA_PACKET__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_DATA_PACKET__INTERNAL_ID = ABSTRACT_DATA_PACKET__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_DATA_PACKET__COMMENT = ABSTRACT_DATA_PACKET__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_DATA_PACKET__NAME = ABSTRACT_DATA_PACKET__NAME;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_DATA_PACKET__CONNECTOR = ABSTRACT_DATA_PACKET__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_DATA_PACKET__VALUE = ABSTRACT_DATA_PACKET__VALUE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_DATA_PACKET__PORT = ABSTRACT_DATA_PACKET__PORT;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_DATA_PACKET__DELAY = ABSTRACT_DATA_PACKET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delayed Data Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_DATA_PACKET_FEATURE_COUNT = ABSTRACT_DATA_PACKET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.SelfWakeImpl <em>Self Wake</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.SelfWakeImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getSelfWake()
	 * @generated
	 */
	int SELF_WAKE = 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__ANNOTATIONS = ABSTRACT_COMPONENT_OPERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__EXTENSIONS = ABSTRACT_COMPONENT_OPERATION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__ATTRIBUTES = ABSTRACT_COMPONENT_OPERATION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__REFERENCE = ABSTRACT_COMPONENT_OPERATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__GENERATED = ABSTRACT_COMPONENT_OPERATION__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__LOCAL_GENERATED = ABSTRACT_COMPONENT_OPERATION__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__INTERNAL_ID = ABSTRACT_COMPONENT_OPERATION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__COMMENT = ABSTRACT_COMPONENT_OPERATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__LABEL = ABSTRACT_COMPONENT_OPERATION__LABEL;

	/**
	 * The feature id for the '<em><b>Elaborates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__ELABORATES = ABSTRACT_COMPONENT_OPERATION__ELABORATES;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__CALLS = ABSTRACT_COMPONENT_OPERATION__CALLS;

	/**
	 * The feature id for the '<em><b>Sends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__SENDS = ABSTRACT_COMPONENT_OPERATION__SENDS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__PARAMETERS = ABSTRACT_COMPONENT_OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Wakes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__WAKES = ABSTRACT_COMPONENT_OPERATION__WAKES;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__ACTIONS = ABSTRACT_COMPONENT_OPERATION__ACTIONS;

	/**
	 * The feature id for the '<em><b>Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__GUARDS = ABSTRACT_COMPONENT_OPERATION__GUARDS;

	/**
	 * The feature id for the '<em><b>Witnesses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__WITNESSES = ABSTRACT_COMPONENT_OPERATION__WITNESSES;

	/**
	 * The feature id for the '<em><b>Convergence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__CONVERGENCE = ABSTRACT_COMPONENT_OPERATION__CONVERGENCE;

	/**
	 * The feature id for the '<em><b>Extended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__EXTENDED = ABSTRACT_COMPONENT_OPERATION__EXTENDED;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__REFINES = ABSTRACT_COMPONENT_OPERATION__REFINES;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE__QUEUE = ABSTRACT_COMPONENT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Self Wake</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_WAKE_FEATURE_COUNT = ABSTRACT_COMPONENT_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.ExternalImpl <em>External</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.ExternalImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getExternal()
	 * @generated
	 */
	int EXTERNAL = 9;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__ANNOTATIONS = ABSTRACT_COMPONENT_OPERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__EXTENSIONS = ABSTRACT_COMPONENT_OPERATION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__ATTRIBUTES = ABSTRACT_COMPONENT_OPERATION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__REFERENCE = ABSTRACT_COMPONENT_OPERATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__GENERATED = ABSTRACT_COMPONENT_OPERATION__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__LOCAL_GENERATED = ABSTRACT_COMPONENT_OPERATION__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__INTERNAL_ID = ABSTRACT_COMPONENT_OPERATION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__COMMENT = ABSTRACT_COMPONENT_OPERATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__LABEL = ABSTRACT_COMPONENT_OPERATION__LABEL;

	/**
	 * The feature id for the '<em><b>Elaborates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__ELABORATES = ABSTRACT_COMPONENT_OPERATION__ELABORATES;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__CALLS = ABSTRACT_COMPONENT_OPERATION__CALLS;

	/**
	 * The feature id for the '<em><b>Sends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__SENDS = ABSTRACT_COMPONENT_OPERATION__SENDS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__PARAMETERS = ABSTRACT_COMPONENT_OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Wakes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__WAKES = ABSTRACT_COMPONENT_OPERATION__WAKES;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__ACTIONS = ABSTRACT_COMPONENT_OPERATION__ACTIONS;

	/**
	 * The feature id for the '<em><b>Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__GUARDS = ABSTRACT_COMPONENT_OPERATION__GUARDS;

	/**
	 * The feature id for the '<em><b>Witnesses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__WITNESSES = ABSTRACT_COMPONENT_OPERATION__WITNESSES;

	/**
	 * The feature id for the '<em><b>Convergence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__CONVERGENCE = ABSTRACT_COMPONENT_OPERATION__CONVERGENCE;

	/**
	 * The feature id for the '<em><b>Extended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__EXTENDED = ABSTRACT_COMPONENT_OPERATION__EXTENDED;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL__REFINES = ABSTRACT_COMPONENT_OPERATION__REFINES;

	/**
	 * The number of structural features of the '<em>External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_FEATURE_COUNT = ABSTRACT_COMPONENT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.WakeEventImpl <em>Wake Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.WakeEventImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getWakeEvent()
	 * @generated
	 */
	int WAKE_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_EVENT__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_EVENT__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_EVENT__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_EVENT__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_EVENT__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_EVENT__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_EVENT__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_EVENT__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_EVENT__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Delay min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_EVENT__DELAY_MIN = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wake Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_EVENT__WAKE_KIND = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delay max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_EVENT__DELAY_MAX = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_EVENT__QUEUE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Wake Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_EVENT_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.TransitionImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 11;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ANNOTATIONS = ABSTRACT_COMPONENT_OPERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EXTENSIONS = ABSTRACT_COMPONENT_OPERATION__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ATTRIBUTES = ABSTRACT_COMPONENT_OPERATION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__REFERENCE = ABSTRACT_COMPONENT_OPERATION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GENERATED = ABSTRACT_COMPONENT_OPERATION__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LOCAL_GENERATED = ABSTRACT_COMPONENT_OPERATION__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INTERNAL_ID = ABSTRACT_COMPONENT_OPERATION__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__COMMENT = ABSTRACT_COMPONENT_OPERATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LABEL = ABSTRACT_COMPONENT_OPERATION__LABEL;

	/**
	 * The feature id for the '<em><b>Elaborates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ELABORATES = ABSTRACT_COMPONENT_OPERATION__ELABORATES;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CALLS = ABSTRACT_COMPONENT_OPERATION__CALLS;

	/**
	 * The feature id for the '<em><b>Sends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SENDS = ABSTRACT_COMPONENT_OPERATION__SENDS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PARAMETERS = ABSTRACT_COMPONENT_OPERATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Wakes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__WAKES = ABSTRACT_COMPONENT_OPERATION__WAKES;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTIONS = ABSTRACT_COMPONENT_OPERATION__ACTIONS;

	/**
	 * The feature id for the '<em><b>Guards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARDS = ABSTRACT_COMPONENT_OPERATION__GUARDS;

	/**
	 * The feature id for the '<em><b>Witnesses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__WITNESSES = ABSTRACT_COMPONENT_OPERATION__WITNESSES;

	/**
	 * The feature id for the '<em><b>Convergence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONVERGENCE = ABSTRACT_COMPONENT_OPERATION__CONVERGENCE;

	/**
	 * The feature id for the '<em><b>Extended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EXTENDED = ABSTRACT_COMPONENT_OPERATION__EXTENDED;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__REFINES = ABSTRACT_COMPONENT_OPERATION__REFINES;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = ABSTRACT_COMPONENT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.OperationGuardImpl <em>Operation Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.OperationGuardImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getOperationGuard()
	 * @generated
	 */
	int OPERATION_GUARD = 12;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_GUARD__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_GUARD__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_GUARD__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_GUARD__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_GUARD__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_GUARD__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_GUARD__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_GUARD__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_GUARD__NAME = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_GUARD__PREDICATE = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__PREDICATE;

	/**
	 * The feature id for the '<em><b>Theorem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_GUARD__THEOREM = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__THEOREM;

	/**
	 * The number of structural features of the '<em>Operation Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_GUARD_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.OperationActionImpl <em>Operation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.OperationActionImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getOperationAction()
	 * @generated
	 */
	int OPERATION_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION__ACTION = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT__ACTION;

	/**
	 * The number of structural features of the '<em>Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACTION_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.OperationWitnessImpl <em>Operation Witness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.OperationWitnessImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getOperationWitness()
	 * @generated
	 */
	int OPERATION_WITNESS = 14;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_WITNESS__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_PREDICATE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_WITNESS__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_PREDICATE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_WITNESS__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_PREDICATE_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_WITNESS__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_PREDICATE_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_WITNESS__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_PREDICATE_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_WITNESS__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_PREDICATE_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_WITNESS__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_PREDICATE_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_WITNESS__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_PREDICATE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_WITNESS__NAME = CorePackage.EVENT_BNAMED_COMMENTED_PREDICATE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_WITNESS__PREDICATE = CorePackage.EVENT_BNAMED_COMMENTED_PREDICATE_ELEMENT__PREDICATE;

	/**
	 * The number of structural features of the '<em>Operation Witness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_WITNESS_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_PREDICATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.ComponentInvariantImpl <em>Component Invariant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.ComponentInvariantImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getComponentInvariant()
	 * @generated
	 */
	int COMPONENT_INVARIANT = 15;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INVARIANT__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INVARIANT__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INVARIANT__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INVARIANT__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INVARIANT__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INVARIANT__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INVARIANT__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INVARIANT__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INVARIANT__NAME = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INVARIANT__PREDICATE = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__PREDICATE;

	/**
	 * The feature id for the '<em><b>Theorem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INVARIANT__THEOREM = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__THEOREM;

	/**
	 * The number of structural features of the '<em>Component Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INVARIANT_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.ComponentVariableImpl <em>Component Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.ComponentVariableImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getComponentVariable()
	 * @generated
	 */
	int COMPONENT_VARIABLE = 16;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Component Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VARIABLE_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.ComponentInitialisationImpl <em>Component Initialisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.ComponentInitialisationImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getComponentInitialisation()
	 * @generated
	 */
	int COMPONENT_INITIALISATION = 17;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INITIALISATION__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INITIALISATION__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INITIALISATION__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INITIALISATION__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INITIALISATION__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INITIALISATION__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INITIALISATION__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INITIALISATION__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INITIALISATION__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INITIALISATION__ACTION = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT__ACTION;

	/**
	 * The number of structural features of the '<em>Component Initialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INITIALISATION_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ACTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.ComponentSetImpl <em>Component Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.ComponentSetImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getComponentSet()
	 * @generated
	 */
	int COMPONENT_SET = 18;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Component Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.ComponentConstantImpl <em>Component Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.ComponentConstantImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getComponentConstant()
	 * @generated
	 */
	int COMPONENT_CONSTANT = 19;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONSTANT__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONSTANT__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONSTANT__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONSTANT__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONSTANT__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONSTANT__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONSTANT__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONSTANT__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONSTANT__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Component Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONSTANT_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.ComponentAxiomImpl <em>Component Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.ComponentAxiomImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getComponentAxiom()
	 * @generated
	 */
	int COMPONENT_AXIOM = 20;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_AXIOM__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_AXIOM__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_AXIOM__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_AXIOM__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_AXIOM__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_AXIOM__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_AXIOM__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_AXIOM__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_AXIOM__NAME = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_AXIOM__PREDICATE = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__PREDICATE;

	/**
	 * The feature id for the '<em><b>Theorem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_AXIOM__THEOREM = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__THEOREM;

	/**
	 * The number of structural features of the '<em>Component Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_AXIOM_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.WakeQueueImpl <em>Wake Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.WakeQueueImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getWakeQueue()
	 * @generated
	 */
	int WAKE_QUEUE = 21;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_QUEUE__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_QUEUE__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_QUEUE__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_QUEUE__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_QUEUE__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_QUEUE__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_QUEUE__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_QUEUE__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_QUEUE__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_QUEUE__REFINES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wake Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAKE_QUEUE_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.AbstractPortImpl <em>Abstract Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.AbstractPortImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getAbstractPort()
	 * @generated
	 */
	int ABSTRACT_PORT = 22;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__TYPE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__INHERITS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__CONNECTOR = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.AbstractInReceiverImpl <em>Abstract In Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.AbstractInReceiverImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getAbstractInReceiver()
	 * @generated
	 */
	int ABSTRACT_IN_RECEIVER = 26;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_RECEIVER__ANNOTATIONS = ABSTRACT_PORT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_RECEIVER__EXTENSIONS = ABSTRACT_PORT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_RECEIVER__ATTRIBUTES = ABSTRACT_PORT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_RECEIVER__REFERENCE = ABSTRACT_PORT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_RECEIVER__GENERATED = ABSTRACT_PORT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_RECEIVER__LOCAL_GENERATED = ABSTRACT_PORT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_RECEIVER__INTERNAL_ID = ABSTRACT_PORT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_RECEIVER__COMMENT = ABSTRACT_PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_RECEIVER__NAME = ABSTRACT_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_RECEIVER__TYPE = ABSTRACT_PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_RECEIVER__INHERITS = ABSTRACT_PORT__INHERITS;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_RECEIVER__CONNECTOR = ABSTRACT_PORT__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_RECEIVER__SOURCE = ABSTRACT_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract In Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_RECEIVER_FEATURE_COUNT = ABSTRACT_PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.InPortImpl <em>In Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.InPortImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getInPort()
	 * @generated
	 */
	int IN_PORT = 23;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__ANNOTATIONS = ABSTRACT_IN_RECEIVER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__EXTENSIONS = ABSTRACT_IN_RECEIVER__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__ATTRIBUTES = ABSTRACT_IN_RECEIVER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__REFERENCE = ABSTRACT_IN_RECEIVER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__GENERATED = ABSTRACT_IN_RECEIVER__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__LOCAL_GENERATED = ABSTRACT_IN_RECEIVER__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__INTERNAL_ID = ABSTRACT_IN_RECEIVER__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__COMMENT = ABSTRACT_IN_RECEIVER__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__NAME = ABSTRACT_IN_RECEIVER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__TYPE = ABSTRACT_IN_RECEIVER__TYPE;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__INHERITS = ABSTRACT_IN_RECEIVER__INHERITS;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__CONNECTOR = ABSTRACT_IN_RECEIVER__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__SOURCE = ABSTRACT_IN_RECEIVER__SOURCE;

	/**
	 * The feature id for the '<em><b>Destinations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__DESTINATIONS = ABSTRACT_IN_RECEIVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>In Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_FEATURE_COUNT = ABSTRACT_IN_RECEIVER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.AbstractOutSenderImpl <em>Abstract Out Sender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.AbstractOutSenderImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getAbstractOutSender()
	 * @generated
	 */
	int ABSTRACT_OUT_SENDER = 29;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_SENDER__ANNOTATIONS = ABSTRACT_PORT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_SENDER__EXTENSIONS = ABSTRACT_PORT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_SENDER__ATTRIBUTES = ABSTRACT_PORT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_SENDER__REFERENCE = ABSTRACT_PORT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_SENDER__GENERATED = ABSTRACT_PORT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_SENDER__LOCAL_GENERATED = ABSTRACT_PORT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_SENDER__INTERNAL_ID = ABSTRACT_PORT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_SENDER__COMMENT = ABSTRACT_PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_SENDER__NAME = ABSTRACT_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_SENDER__TYPE = ABSTRACT_PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_SENDER__INHERITS = ABSTRACT_PORT__INHERITS;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_SENDER__CONNECTOR = ABSTRACT_PORT__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_SENDER__DESTINATION = ABSTRACT_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Out Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_SENDER_FEATURE_COUNT = ABSTRACT_PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.OutPortImpl <em>Out Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.OutPortImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getOutPort()
	 * @generated
	 */
	int OUT_PORT = 24;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__ANNOTATIONS = ABSTRACT_OUT_SENDER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__EXTENSIONS = ABSTRACT_OUT_SENDER__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__ATTRIBUTES = ABSTRACT_OUT_SENDER__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__REFERENCE = ABSTRACT_OUT_SENDER__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__GENERATED = ABSTRACT_OUT_SENDER__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__LOCAL_GENERATED = ABSTRACT_OUT_SENDER__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__INTERNAL_ID = ABSTRACT_OUT_SENDER__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__COMMENT = ABSTRACT_OUT_SENDER__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__NAME = ABSTRACT_OUT_SENDER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__TYPE = ABSTRACT_OUT_SENDER__TYPE;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__INHERITS = ABSTRACT_OUT_SENDER__INHERITS;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__CONNECTOR = ABSTRACT_OUT_SENDER__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__DESTINATION = ABSTRACT_OUT_SENDER__DESTINATION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__SOURCE = ABSTRACT_OUT_SENDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_FEATURE_COUNT = ABSTRACT_OUT_SENDER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.AbstractInSenderImpl <em>Abstract In Sender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.AbstractInSenderImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getAbstractInSender()
	 * @generated
	 */
	int ABSTRACT_IN_SENDER = 27;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_SENDER__ANNOTATIONS = ABSTRACT_PORT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_SENDER__EXTENSIONS = ABSTRACT_PORT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_SENDER__ATTRIBUTES = ABSTRACT_PORT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_SENDER__REFERENCE = ABSTRACT_PORT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_SENDER__GENERATED = ABSTRACT_PORT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_SENDER__LOCAL_GENERATED = ABSTRACT_PORT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_SENDER__INTERNAL_ID = ABSTRACT_PORT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_SENDER__COMMENT = ABSTRACT_PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_SENDER__NAME = ABSTRACT_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_SENDER__TYPE = ABSTRACT_PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_SENDER__INHERITS = ABSTRACT_PORT__INHERITS;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_SENDER__CONNECTOR = ABSTRACT_PORT__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Destinations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_SENDER__DESTINATIONS = ABSTRACT_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract In Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IN_SENDER_FEATURE_COUNT = ABSTRACT_PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.impl.AbstractOutReceiverImpl <em>Abstract Out Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.impl.AbstractOutReceiverImpl
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getAbstractOutReceiver()
	 * @generated
	 */
	int ABSTRACT_OUT_RECEIVER = 28;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_RECEIVER__ANNOTATIONS = ABSTRACT_PORT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_RECEIVER__EXTENSIONS = ABSTRACT_PORT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_RECEIVER__ATTRIBUTES = ABSTRACT_PORT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_RECEIVER__REFERENCE = ABSTRACT_PORT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_RECEIVER__GENERATED = ABSTRACT_PORT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_RECEIVER__LOCAL_GENERATED = ABSTRACT_PORT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_RECEIVER__INTERNAL_ID = ABSTRACT_PORT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_RECEIVER__COMMENT = ABSTRACT_PORT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_RECEIVER__NAME = ABSTRACT_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_RECEIVER__TYPE = ABSTRACT_PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_RECEIVER__INHERITS = ABSTRACT_PORT__INHERITS;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_RECEIVER__CONNECTOR = ABSTRACT_PORT__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_RECEIVER__SOURCE = ABSTRACT_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Out Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OUT_RECEIVER_FEATURE_COUNT = ABSTRACT_PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.components.WakeKind <em>Wake Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.components.WakeKind
	 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getWakeKind()
	 * @generated
	 */
	int WAKE_KIND = 30;


	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.AbstractComponentModel <em>Abstract Component Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component Model</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractComponentModel
	 * @generated
	 */
	EClass getAbstractComponentModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.AbstractComponentModel#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractComponentModel#getComponents()
	 * @see #getAbstractComponentModel()
	 * @generated
	 */
	EReference getAbstractComponentModel_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.AbstractComponentModel#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractComponentModel#getConnectors()
	 * @see #getAbstractComponentModel()
	 * @generated
	 */
	EReference getAbstractComponentModel_Connectors();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see ac.soton.eventb.emf.components.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.emf.components.Component#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refines</em>'.
	 * @see ac.soton.eventb.emf.components.Component#getRefines()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Refines();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.Component#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see ac.soton.eventb.emf.components.Component#getOperations()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.Component#getWakeQueues <em>Wake Queues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wake Queues</em>'.
	 * @see ac.soton.eventb.emf.components.Component#getWakeQueues()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_WakeQueues();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.Component#getAsynchronousStatemachines <em>Asynchronous Statemachines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asynchronous Statemachines</em>'.
	 * @see ac.soton.eventb.emf.components.Component#getAsynchronousStatemachines()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_AsynchronousStatemachines();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.Component#getSynchronousStatemachines <em>Synchronous Statemachines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronous Statemachines</em>'.
	 * @see ac.soton.eventb.emf.components.Component#getSynchronousStatemachines()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_SynchronousStatemachines();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.Component#getProcessStatemachines <em>Process Statemachines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Statemachines</em>'.
	 * @see ac.soton.eventb.emf.components.Component#getProcessStatemachines()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ProcessStatemachines();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.Component#getInvariants <em>Invariants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invariants</em>'.
	 * @see ac.soton.eventb.emf.components.Component#getInvariants()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Invariants();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.Component#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see ac.soton.eventb.emf.components.Component#getVariables()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.Component#getInitialisations <em>Initialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initialisations</em>'.
	 * @see ac.soton.eventb.emf.components.Component#getInitialisations()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Initialisations();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.Component#getSets <em>Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sets</em>'.
	 * @see ac.soton.eventb.emf.components.Component#getSets()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Sets();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.Component#getAxioms <em>Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Axioms</em>'.
	 * @see ac.soton.eventb.emf.components.Component#getAxioms()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Axioms();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.Component#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constants</em>'.
	 * @see ac.soton.eventb.emf.components.Component#getConstants()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Constants();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.Component#getInPorts <em>In Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Ports</em>'.
	 * @see ac.soton.eventb.emf.components.Component#getInPorts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_InPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.Component#getOutPorts <em>Out Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Ports</em>'.
	 * @see ac.soton.eventb.emf.components.Component#getOutPorts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_OutPorts();

	/**
	 * Returns the meta object for the reference list '{@link ac.soton.eventb.emf.components.Component#getInConnectors <em>In Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Connectors</em>'.
	 * @see ac.soton.eventb.emf.components.Component#getInConnectors()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_InConnectors();

	/**
	 * Returns the meta object for the reference list '{@link ac.soton.eventb.emf.components.Component#getOutConnectors <em>Out Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Connectors</em>'.
	 * @see ac.soton.eventb.emf.components.Component#getOutConnectors()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_OutConnectors();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see ac.soton.eventb.emf.components.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.emf.components.Connector#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see ac.soton.eventb.emf.components.Connector#getSender()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Sender();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.components.Connector#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see ac.soton.eventb.emf.components.Connector#getInitialValue()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_InitialValue();

	/**
	 * Returns the meta object for the reference list '{@link ac.soton.eventb.emf.components.Connector#getReceivers <em>Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receivers</em>'.
	 * @see ac.soton.eventb.emf.components.Connector#getReceivers()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Receivers();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.AbstractComponentOperation <em>Abstract Component Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component Operation</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractComponentOperation
	 * @generated
	 */
	EClass getAbstractComponentOperation();

	/**
	 * Returns the meta object for the reference list '{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getElaborates <em>Elaborates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elaborates</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractComponentOperation#getElaborates()
	 * @see #getAbstractComponentOperation()
	 * @generated
	 */
	EReference getAbstractComponentOperation_Elaborates();

	/**
	 * Returns the meta object for the reference list '{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calls</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractComponentOperation#getCalls()
	 * @see #getAbstractComponentOperation()
	 * @generated
	 */
	EReference getAbstractComponentOperation_Calls();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getSends <em>Sends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sends</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractComponentOperation#getSends()
	 * @see #getAbstractComponentOperation()
	 * @generated
	 */
	EReference getAbstractComponentOperation_Sends();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractComponentOperation#getParameters()
	 * @see #getAbstractComponentOperation()
	 * @generated
	 */
	EReference getAbstractComponentOperation_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getWakes <em>Wakes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wakes</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractComponentOperation#getWakes()
	 * @see #getAbstractComponentOperation()
	 * @generated
	 */
	EReference getAbstractComponentOperation_Wakes();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractComponentOperation#getActions()
	 * @see #getAbstractComponentOperation()
	 * @generated
	 */
	EReference getAbstractComponentOperation_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getGuards <em>Guards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guards</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractComponentOperation#getGuards()
	 * @see #getAbstractComponentOperation()
	 * @generated
	 */
	EReference getAbstractComponentOperation_Guards();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getWitnesses <em>Witnesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Witnesses</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractComponentOperation#getWitnesses()
	 * @see #getAbstractComponentOperation()
	 * @generated
	 */
	EReference getAbstractComponentOperation_Witnesses();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getConvergence <em>Convergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Convergence</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractComponentOperation#getConvergence()
	 * @see #getAbstractComponentOperation()
	 * @generated
	 */
	EAttribute getAbstractComponentOperation_Convergence();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.components.AbstractComponentOperation#isExtended <em>Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extended</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractComponentOperation#isExtended()
	 * @see #getAbstractComponentOperation()
	 * @generated
	 */
	EAttribute getAbstractComponentOperation_Extended();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.emf.components.AbstractComponentOperation#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refines</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractComponentOperation#getRefines()
	 * @see #getAbstractComponentOperation()
	 * @generated
	 */
	EReference getAbstractComponentOperation_Refines();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see ac.soton.eventb.emf.components.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.PortWake <em>Port Wake</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Wake</em>'.
	 * @see ac.soton.eventb.emf.components.PortWake
	 * @generated
	 */
	EClass getPortWake();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.components.PortWake#getReceives <em>Receives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Receives</em>'.
	 * @see ac.soton.eventb.emf.components.PortWake#getReceives()
	 * @see #getPortWake()
	 * @generated
	 */
	EReference getPortWake_Receives();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.DataPacket <em>Data Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Packet</em>'.
	 * @see ac.soton.eventb.emf.components.DataPacket
	 * @generated
	 */
	EClass getDataPacket();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.DelayedDataPacket <em>Delayed Data Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delayed Data Packet</em>'.
	 * @see ac.soton.eventb.emf.components.DelayedDataPacket
	 * @generated
	 */
	EClass getDelayedDataPacket();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.components.DelayedDataPacket#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see ac.soton.eventb.emf.components.DelayedDataPacket#getDelay()
	 * @see #getDelayedDataPacket()
	 * @generated
	 */
	EAttribute getDelayedDataPacket_Delay();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.SelfWake <em>Self Wake</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self Wake</em>'.
	 * @see ac.soton.eventb.emf.components.SelfWake
	 * @generated
	 */
	EClass getSelfWake();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.emf.components.SelfWake#getQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Queue</em>'.
	 * @see ac.soton.eventb.emf.components.SelfWake#getQueue()
	 * @see #getSelfWake()
	 * @generated
	 */
	EReference getSelfWake_Queue();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.External <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External</em>'.
	 * @see ac.soton.eventb.emf.components.External
	 * @generated
	 */
	EClass getExternal();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.WakeEvent <em>Wake Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wake Event</em>'.
	 * @see ac.soton.eventb.emf.components.WakeEvent
	 * @generated
	 */
	EClass getWakeEvent();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.components.WakeEvent#getDelay_min <em>Delay min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay min</em>'.
	 * @see ac.soton.eventb.emf.components.WakeEvent#getDelay_min()
	 * @see #getWakeEvent()
	 * @generated
	 */
	EAttribute getWakeEvent_Delay_min();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.components.WakeEvent#getWakeKind <em>Wake Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wake Kind</em>'.
	 * @see ac.soton.eventb.emf.components.WakeEvent#getWakeKind()
	 * @see #getWakeEvent()
	 * @generated
	 */
	EAttribute getWakeEvent_WakeKind();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.components.WakeEvent#getDelay_max <em>Delay max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay max</em>'.
	 * @see ac.soton.eventb.emf.components.WakeEvent#getDelay_max()
	 * @see #getWakeEvent()
	 * @generated
	 */
	EAttribute getWakeEvent_Delay_max();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.emf.components.WakeEvent#getQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Queue</em>'.
	 * @see ac.soton.eventb.emf.components.WakeEvent#getQueue()
	 * @see #getWakeEvent()
	 * @generated
	 */
	EReference getWakeEvent_Queue();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ac.soton.eventb.emf.components.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.OperationGuard <em>Operation Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Guard</em>'.
	 * @see ac.soton.eventb.emf.components.OperationGuard
	 * @generated
	 */
	EClass getOperationGuard();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.OperationAction <em>Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Action</em>'.
	 * @see ac.soton.eventb.emf.components.OperationAction
	 * @generated
	 */
	EClass getOperationAction();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.OperationWitness <em>Operation Witness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Witness</em>'.
	 * @see ac.soton.eventb.emf.components.OperationWitness
	 * @generated
	 */
	EClass getOperationWitness();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.ComponentInvariant <em>Component Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Invariant</em>'.
	 * @see ac.soton.eventb.emf.components.ComponentInvariant
	 * @generated
	 */
	EClass getComponentInvariant();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.ComponentVariable <em>Component Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Variable</em>'.
	 * @see ac.soton.eventb.emf.components.ComponentVariable
	 * @generated
	 */
	EClass getComponentVariable();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.ComponentInitialisation <em>Component Initialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Initialisation</em>'.
	 * @see ac.soton.eventb.emf.components.ComponentInitialisation
	 * @generated
	 */
	EClass getComponentInitialisation();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.ComponentSet <em>Component Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Set</em>'.
	 * @see ac.soton.eventb.emf.components.ComponentSet
	 * @generated
	 */
	EClass getComponentSet();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.ComponentConstant <em>Component Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Constant</em>'.
	 * @see ac.soton.eventb.emf.components.ComponentConstant
	 * @generated
	 */
	EClass getComponentConstant();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.ComponentAxiom <em>Component Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Axiom</em>'.
	 * @see ac.soton.eventb.emf.components.ComponentAxiom
	 * @generated
	 */
	EClass getComponentAxiom();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.WakeQueue <em>Wake Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wake Queue</em>'.
	 * @see ac.soton.eventb.emf.components.WakeQueue
	 * @generated
	 */
	EClass getWakeQueue();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.emf.components.WakeQueue#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refines</em>'.
	 * @see ac.soton.eventb.emf.components.WakeQueue#getRefines()
	 * @see #getWakeQueue()
	 * @generated
	 */
	EReference getWakeQueue_Refines();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.AbstractPort <em>Abstract Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Port</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractPort
	 * @generated
	 */
	EClass getAbstractPort();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.components.AbstractPort#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractPort#getType()
	 * @see #getAbstractPort()
	 * @generated
	 */
	EAttribute getAbstractPort_Type();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.emf.components.AbstractPort#getInherits <em>Inherits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inherits</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractPort#getInherits()
	 * @see #getAbstractPort()
	 * @generated
	 */
	EReference getAbstractPort_Inherits();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.emf.components.AbstractPort#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractPort#getConnector()
	 * @see #getAbstractPort()
	 * @generated
	 */
	EReference getAbstractPort_Connector();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.InPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Port</em>'.
	 * @see ac.soton.eventb.emf.components.InPort
	 * @generated
	 */
	EClass getInPort();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.OutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Port</em>'.
	 * @see ac.soton.eventb.emf.components.OutPort
	 * @generated
	 */
	EClass getOutPort();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.AbstractDataPacket <em>Abstract Data Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Data Packet</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractDataPacket
	 * @generated
	 */
	EClass getAbstractDataPacket();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.emf.components.AbstractDataPacket#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractDataPacket#getConnector()
	 * @see #getAbstractDataPacket()
	 * @generated
	 */
	EReference getAbstractDataPacket_Connector();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.components.AbstractDataPacket#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractDataPacket#getValue()
	 * @see #getAbstractDataPacket()
	 * @generated
	 */
	EAttribute getAbstractDataPacket_Value();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.emf.components.AbstractDataPacket#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractDataPacket#getPort()
	 * @see #getAbstractDataPacket()
	 * @generated
	 */
	EReference getAbstractDataPacket_Port();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.AbstractInReceiver <em>Abstract In Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract In Receiver</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractInReceiver
	 * @generated
	 */
	EClass getAbstractInReceiver();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.emf.components.AbstractInReceiver#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractInReceiver#getSource()
	 * @see #getAbstractInReceiver()
	 * @generated
	 */
	EReference getAbstractInReceiver_Source();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.AbstractInSender <em>Abstract In Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract In Sender</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractInSender
	 * @generated
	 */
	EClass getAbstractInSender();

	/**
	 * Returns the meta object for the reference list '{@link ac.soton.eventb.emf.components.AbstractInSender#getDestinations <em>Destinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Destinations</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractInSender#getDestinations()
	 * @see #getAbstractInSender()
	 * @generated
	 */
	EReference getAbstractInSender_Destinations();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.AbstractOutReceiver <em>Abstract Out Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Out Receiver</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractOutReceiver
	 * @generated
	 */
	EClass getAbstractOutReceiver();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.emf.components.AbstractOutReceiver#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractOutReceiver#getSource()
	 * @see #getAbstractOutReceiver()
	 * @generated
	 */
	EReference getAbstractOutReceiver_Source();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.components.AbstractOutSender <em>Abstract Out Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Out Sender</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractOutSender
	 * @generated
	 */
	EClass getAbstractOutSender();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.emf.components.AbstractOutSender#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see ac.soton.eventb.emf.components.AbstractOutSender#getDestination()
	 * @see #getAbstractOutSender()
	 * @generated
	 */
	EReference getAbstractOutSender_Destination();

	/**
	 * Returns the meta object for enum '{@link ac.soton.eventb.emf.components.WakeKind <em>Wake Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wake Kind</em>'.
	 * @see ac.soton.eventb.emf.components.WakeKind
	 * @generated
	 */
	EEnum getWakeKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentsFactory getComponentsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.AbstractComponentModelImpl <em>Abstract Component Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.AbstractComponentModelImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getAbstractComponentModel()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT_MODEL = eINSTANCE.getAbstractComponentModel();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT_MODEL__COMPONENTS = eINSTANCE.getAbstractComponentModel_Components();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT_MODEL__CONNECTORS = eINSTANCE.getAbstractComponentModel_Connectors();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.ComponentImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Refines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REFINES = eINSTANCE.getComponent_Refines();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OPERATIONS = eINSTANCE.getComponent_Operations();

		/**
		 * The meta object literal for the '<em><b>Wake Queues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__WAKE_QUEUES = eINSTANCE.getComponent_WakeQueues();

		/**
		 * The meta object literal for the '<em><b>Asynchronous Statemachines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ASYNCHRONOUS_STATEMACHINES = eINSTANCE.getComponent_AsynchronousStatemachines();

		/**
		 * The meta object literal for the '<em><b>Synchronous Statemachines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SYNCHRONOUS_STATEMACHINES = eINSTANCE.getComponent_SynchronousStatemachines();

		/**
		 * The meta object literal for the '<em><b>Process Statemachines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROCESS_STATEMACHINES = eINSTANCE.getComponent_ProcessStatemachines();

		/**
		 * The meta object literal for the '<em><b>Invariants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INVARIANTS = eINSTANCE.getComponent_Invariants();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__VARIABLES = eINSTANCE.getComponent_Variables();

		/**
		 * The meta object literal for the '<em><b>Initialisations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INITIALISATIONS = eINSTANCE.getComponent_Initialisations();

		/**
		 * The meta object literal for the '<em><b>Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SETS = eINSTANCE.getComponent_Sets();

		/**
		 * The meta object literal for the '<em><b>Axioms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__AXIOMS = eINSTANCE.getComponent_Axioms();

		/**
		 * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONSTANTS = eINSTANCE.getComponent_Constants();

		/**
		 * The meta object literal for the '<em><b>In Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__IN_PORTS = eINSTANCE.getComponent_InPorts();

		/**
		 * The meta object literal for the '<em><b>Out Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OUT_PORTS = eINSTANCE.getComponent_OutPorts();

		/**
		 * The meta object literal for the '<em><b>In Connectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__IN_CONNECTORS = eINSTANCE.getComponent_InConnectors();

		/**
		 * The meta object literal for the '<em><b>Out Connectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OUT_CONNECTORS = eINSTANCE.getComponent_OutConnectors();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.ConnectorImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SENDER = eINSTANCE.getConnector_Sender();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__INITIAL_VALUE = eINSTANCE.getConnector_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Receivers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__RECEIVERS = eINSTANCE.getConnector_Receivers();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.AbstractComponentOperationImpl <em>Abstract Component Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.AbstractComponentOperationImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getAbstractComponentOperation()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT_OPERATION = eINSTANCE.getAbstractComponentOperation();

		/**
		 * The meta object literal for the '<em><b>Elaborates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT_OPERATION__ELABORATES = eINSTANCE.getAbstractComponentOperation_Elaborates();

		/**
		 * The meta object literal for the '<em><b>Calls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT_OPERATION__CALLS = eINSTANCE.getAbstractComponentOperation_Calls();

		/**
		 * The meta object literal for the '<em><b>Sends</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT_OPERATION__SENDS = eINSTANCE.getAbstractComponentOperation_Sends();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT_OPERATION__PARAMETERS = eINSTANCE.getAbstractComponentOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Wakes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT_OPERATION__WAKES = eINSTANCE.getAbstractComponentOperation_Wakes();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT_OPERATION__ACTIONS = eINSTANCE.getAbstractComponentOperation_Actions();

		/**
		 * The meta object literal for the '<em><b>Guards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT_OPERATION__GUARDS = eINSTANCE.getAbstractComponentOperation_Guards();

		/**
		 * The meta object literal for the '<em><b>Witnesses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT_OPERATION__WITNESSES = eINSTANCE.getAbstractComponentOperation_Witnesses();

		/**
		 * The meta object literal for the '<em><b>Convergence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMPONENT_OPERATION__CONVERGENCE = eINSTANCE.getAbstractComponentOperation_Convergence();

		/**
		 * The meta object literal for the '<em><b>Extended</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMPONENT_OPERATION__EXTENDED = eINSTANCE.getAbstractComponentOperation_Extended();

		/**
		 * The meta object literal for the '<em><b>Refines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT_OPERATION__REFINES = eINSTANCE.getAbstractComponentOperation_Refines();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.MethodImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.PortWakeImpl <em>Port Wake</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.PortWakeImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getPortWake()
		 * @generated
		 */
		EClass PORT_WAKE = eINSTANCE.getPortWake();

		/**
		 * The meta object literal for the '<em><b>Receives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_WAKE__RECEIVES = eINSTANCE.getPortWake_Receives();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.DataPacketImpl <em>Data Packet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.DataPacketImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getDataPacket()
		 * @generated
		 */
		EClass DATA_PACKET = eINSTANCE.getDataPacket();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.DelayedDataPacketImpl <em>Delayed Data Packet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.DelayedDataPacketImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getDelayedDataPacket()
		 * @generated
		 */
		EClass DELAYED_DATA_PACKET = eINSTANCE.getDelayedDataPacket();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAYED_DATA_PACKET__DELAY = eINSTANCE.getDelayedDataPacket_Delay();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.SelfWakeImpl <em>Self Wake</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.SelfWakeImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getSelfWake()
		 * @generated
		 */
		EClass SELF_WAKE = eINSTANCE.getSelfWake();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELF_WAKE__QUEUE = eINSTANCE.getSelfWake_Queue();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.ExternalImpl <em>External</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.ExternalImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getExternal()
		 * @generated
		 */
		EClass EXTERNAL = eINSTANCE.getExternal();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.WakeEventImpl <em>Wake Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.WakeEventImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getWakeEvent()
		 * @generated
		 */
		EClass WAKE_EVENT = eINSTANCE.getWakeEvent();

		/**
		 * The meta object literal for the '<em><b>Delay min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAKE_EVENT__DELAY_MIN = eINSTANCE.getWakeEvent_Delay_min();

		/**
		 * The meta object literal for the '<em><b>Wake Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAKE_EVENT__WAKE_KIND = eINSTANCE.getWakeEvent_WakeKind();

		/**
		 * The meta object literal for the '<em><b>Delay max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAKE_EVENT__DELAY_MAX = eINSTANCE.getWakeEvent_Delay_max();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAKE_EVENT__QUEUE = eINSTANCE.getWakeEvent_Queue();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.TransitionImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.OperationGuardImpl <em>Operation Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.OperationGuardImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getOperationGuard()
		 * @generated
		 */
		EClass OPERATION_GUARD = eINSTANCE.getOperationGuard();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.OperationActionImpl <em>Operation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.OperationActionImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getOperationAction()
		 * @generated
		 */
		EClass OPERATION_ACTION = eINSTANCE.getOperationAction();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.OperationWitnessImpl <em>Operation Witness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.OperationWitnessImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getOperationWitness()
		 * @generated
		 */
		EClass OPERATION_WITNESS = eINSTANCE.getOperationWitness();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.ComponentInvariantImpl <em>Component Invariant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.ComponentInvariantImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getComponentInvariant()
		 * @generated
		 */
		EClass COMPONENT_INVARIANT = eINSTANCE.getComponentInvariant();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.ComponentVariableImpl <em>Component Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.ComponentVariableImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getComponentVariable()
		 * @generated
		 */
		EClass COMPONENT_VARIABLE = eINSTANCE.getComponentVariable();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.ComponentInitialisationImpl <em>Component Initialisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.ComponentInitialisationImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getComponentInitialisation()
		 * @generated
		 */
		EClass COMPONENT_INITIALISATION = eINSTANCE.getComponentInitialisation();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.ComponentSetImpl <em>Component Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.ComponentSetImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getComponentSet()
		 * @generated
		 */
		EClass COMPONENT_SET = eINSTANCE.getComponentSet();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.ComponentConstantImpl <em>Component Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.ComponentConstantImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getComponentConstant()
		 * @generated
		 */
		EClass COMPONENT_CONSTANT = eINSTANCE.getComponentConstant();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.ComponentAxiomImpl <em>Component Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.ComponentAxiomImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getComponentAxiom()
		 * @generated
		 */
		EClass COMPONENT_AXIOM = eINSTANCE.getComponentAxiom();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.WakeQueueImpl <em>Wake Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.WakeQueueImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getWakeQueue()
		 * @generated
		 */
		EClass WAKE_QUEUE = eINSTANCE.getWakeQueue();

		/**
		 * The meta object literal for the '<em><b>Refines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAKE_QUEUE__REFINES = eINSTANCE.getWakeQueue_Refines();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.AbstractPortImpl <em>Abstract Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.AbstractPortImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getAbstractPort()
		 * @generated
		 */
		EClass ABSTRACT_PORT = eINSTANCE.getAbstractPort();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PORT__TYPE = eINSTANCE.getAbstractPort_Type();

		/**
		 * The meta object literal for the '<em><b>Inherits</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PORT__INHERITS = eINSTANCE.getAbstractPort_Inherits();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PORT__CONNECTOR = eINSTANCE.getAbstractPort_Connector();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.InPortImpl <em>In Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.InPortImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getInPort()
		 * @generated
		 */
		EClass IN_PORT = eINSTANCE.getInPort();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.OutPortImpl <em>Out Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.OutPortImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getOutPort()
		 * @generated
		 */
		EClass OUT_PORT = eINSTANCE.getOutPort();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.AbstractDataPacketImpl <em>Abstract Data Packet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.AbstractDataPacketImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getAbstractDataPacket()
		 * @generated
		 */
		EClass ABSTRACT_DATA_PACKET = eINSTANCE.getAbstractDataPacket();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_DATA_PACKET__CONNECTOR = eINSTANCE.getAbstractDataPacket_Connector();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_DATA_PACKET__VALUE = eINSTANCE.getAbstractDataPacket_Value();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_DATA_PACKET__PORT = eINSTANCE.getAbstractDataPacket_Port();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.AbstractInReceiverImpl <em>Abstract In Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.AbstractInReceiverImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getAbstractInReceiver()
		 * @generated
		 */
		EClass ABSTRACT_IN_RECEIVER = eINSTANCE.getAbstractInReceiver();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_IN_RECEIVER__SOURCE = eINSTANCE.getAbstractInReceiver_Source();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.AbstractInSenderImpl <em>Abstract In Sender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.AbstractInSenderImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getAbstractInSender()
		 * @generated
		 */
		EClass ABSTRACT_IN_SENDER = eINSTANCE.getAbstractInSender();

		/**
		 * The meta object literal for the '<em><b>Destinations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_IN_SENDER__DESTINATIONS = eINSTANCE.getAbstractInSender_Destinations();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.AbstractOutReceiverImpl <em>Abstract Out Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.AbstractOutReceiverImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getAbstractOutReceiver()
		 * @generated
		 */
		EClass ABSTRACT_OUT_RECEIVER = eINSTANCE.getAbstractOutReceiver();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_OUT_RECEIVER__SOURCE = eINSTANCE.getAbstractOutReceiver_Source();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.impl.AbstractOutSenderImpl <em>Abstract Out Sender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.impl.AbstractOutSenderImpl
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getAbstractOutSender()
		 * @generated
		 */
		EClass ABSTRACT_OUT_SENDER = eINSTANCE.getAbstractOutSender();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_OUT_SENDER__DESTINATION = eINSTANCE.getAbstractOutSender_Destination();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.components.WakeKind <em>Wake Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.components.WakeKind
		 * @see ac.soton.eventb.emf.components.impl.ComponentsPackageImpl#getWakeKind()
		 * @generated
		 */
		EEnum WAKE_KIND = eINSTANCE.getWakeKind();

	}

} //ComponentsPackage
