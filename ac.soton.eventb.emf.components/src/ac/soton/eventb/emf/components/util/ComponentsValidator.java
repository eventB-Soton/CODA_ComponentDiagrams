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
package ac.soton.eventb.emf.components.util;

import ac.soton.eventb.emf.components.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.machine.Event;

import ac.soton.eventb.emf.components.AbstractComponentModel;
import ac.soton.eventb.emf.components.AbstractComponentOperation;
import ac.soton.eventb.emf.components.AbstractInReceiver;
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
import ac.soton.eventb.emf.components.WakeKind;
import ac.soton.eventb.emf.components.WakeQueue;
import ac.soton.eventb.statemachines.StatemachinesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ac.soton.eventb.emf.components.ComponentsPackage
 * @generated
 */
public class ComponentsValidator extends EObjectValidator {
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
	public static final ComponentsValidator INSTANCE = new ComponentsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ac.soton.eventb.emf.components";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ComponentsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ComponentsPackage.ABSTRACT_COMPONENT_MODEL:
				return validateAbstractComponentModel((AbstractComponentModel)value, diagnostics, context);
			case ComponentsPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case ComponentsPackage.CONNECTOR:
				return validateConnector((Connector)value, diagnostics, context);
			case ComponentsPackage.ABSTRACT_COMPONENT_OPERATION:
				return validateAbstractComponentOperation((AbstractComponentOperation)value, diagnostics, context);
			case ComponentsPackage.METHOD:
				return validateMethod((Method)value, diagnostics, context);
			case ComponentsPackage.PORT_WAKE:
				return validatePortWake((PortWake)value, diagnostics, context);
			case ComponentsPackage.DATA_PACKET:
				return validateDataPacket((DataPacket)value, diagnostics, context);
			case ComponentsPackage.DELAYED_DATA_PACKET:
				return validateDelayedDataPacket((DelayedDataPacket)value, diagnostics, context);
			case ComponentsPackage.SELF_WAKE:
				return validateSelfWake((SelfWake)value, diagnostics, context);
			case ComponentsPackage.EXTERNAL:
				return validateExternal((External)value, diagnostics, context);
			case ComponentsPackage.WAKE_EVENT:
				return validateWakeEvent((WakeEvent)value, diagnostics, context);
			case ComponentsPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case ComponentsPackage.OPERATION_GUARD:
				return validateOperationGuard((OperationGuard)value, diagnostics, context);
			case ComponentsPackage.OPERATION_ACTION:
				return validateOperationAction((OperationAction)value, diagnostics, context);
			case ComponentsPackage.OPERATION_WITNESS:
				return validateOperationWitness((OperationWitness)value, diagnostics, context);
			case ComponentsPackage.COMPONENT_INVARIANT:
				return validateComponentInvariant((ComponentInvariant)value, diagnostics, context);
			case ComponentsPackage.COMPONENT_VARIABLE:
				return validateComponentVariable((ComponentVariable)value, diagnostics, context);
			case ComponentsPackage.COMPONENT_INITIALISATION:
				return validateComponentInitialisation((ComponentInitialisation)value, diagnostics, context);
			case ComponentsPackage.COMPONENT_SET:
				return validateComponentSet((ComponentSet)value, diagnostics, context);
			case ComponentsPackage.COMPONENT_CONSTANT:
				return validateComponentConstant((ComponentConstant)value, diagnostics, context);
			case ComponentsPackage.COMPONENT_AXIOM:
				return validateComponentAxiom((ComponentAxiom)value, diagnostics, context);
			case ComponentsPackage.WAKE_QUEUE:
				return validateWakeQueue((WakeQueue)value, diagnostics, context);
			case ComponentsPackage.ABSTRACT_PORT:
				return validateAbstractPort((AbstractPort)value, diagnostics, context);
			case ComponentsPackage.IN_PORT:
				return validateInPort((InPort)value, diagnostics, context);
			case ComponentsPackage.OUT_PORT:
				return validateOutPort((OutPort)value, diagnostics, context);
			case ComponentsPackage.ABSTRACT_DATA_PACKET:
				return validateAbstractDataPacket((AbstractDataPacket)value, diagnostics, context);
			case ComponentsPackage.ABSTRACT_IN_RECEIVER:
				return validateAbstractInReceiver((AbstractInReceiver)value, diagnostics, context);
			case ComponentsPackage.ABSTRACT_IN_SENDER:
				return validateAbstractInSender((AbstractInSender)value, diagnostics, context);
			case ComponentsPackage.ABSTRACT_OUT_RECEIVER:
				return validateAbstractOutReceiver((AbstractOutReceiver)value, diagnostics, context);
			case ComponentsPackage.ABSTRACT_OUT_SENDER:
				return validateAbstractOutSender((AbstractOutSender)value, diagnostics, context);
			case ComponentsPackage.WAKE_KIND:
				return validateWakeKind((WakeKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	// This can be added to the above validate to stop it from giving a validation ok message when there is an exception
	// (Have not set generated NOT as this will prevent  new elements from being validated)
//try{
	//<switch>
//}catch (Exception e){
//	if (diagnostics != null) {
//		diagnostics.add
//			(createDiagnostic
//				(Diagnostic.ERROR,
//				 DIAGNOSTIC_SOURCE,
//				 0,
//				"_UI_GenericConstraint_diagnostic",
//				 new Object[] { "AN EXCEPTION OCCURRED WHILE RUNNING THE VALIDATOR"},
//				 new Object[] { value },
//				 context));
//	}
//	return false;
//}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractComponentModel(AbstractComponentModel abstractComponentModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractComponentModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(component, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_hasName(component, diagnostics, context);
		return result;
	}
	  
	/**
	 * Validates the hasName constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * 	check that the component name is not null and not equal to ""
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateComponent_hasName(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (component.getName()==null || "".equals(component.getName())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasName", getObjectLabel(component, context) },
						 new Object[] { component },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->  
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_hasName(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_hasType(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractInSender_areDestinationsValid(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractOutReceiver_isSourceValid(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_hasInitialValue(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_hasSender(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_hasReceiver(connector, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasName constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * 	check that the connector name is not null and not equal to ""
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConnector_hasName(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (connector.getName()==null || "".equals(connector.getName())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasName", getObjectLabel(connector, context) },
						 new Object[] { connector },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the hasType constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * 	check that the connector type is not null and not equal to ""
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConnector_hasType(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (connector.getType() == null || "".equals(connector.getType())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasType", getObjectLabel(connector, context) },
						 new Object[] { connector },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the hasInitialValue constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * 	check that the connector initalValue is not null and not equal to ""
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConnector_hasInitialValue(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (connector.getInitialValue() == null || "".equals(connector.getInitialValue())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasInitialValue", getObjectLabel(connector, context) },
						 new Object[] { connector },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the hasSender constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * 	check that the connector sender is not null
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConnector_hasSender(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (connector.getSender()==null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasSender", getObjectLabel(connector, context) },
						 new Object[] { connector },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the hasReceiver constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * 	check that the connector receivers is not null and is not empty
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConnector_hasReceiver(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (connector.getReceivers()==null || connector.getReceivers().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasReceiver", getObjectLabel(connector, context) },
						 new Object[] { connector },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractComponentOperation(AbstractComponentOperation abstractComponentOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(abstractComponentOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(abstractComponentOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractComponentOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractComponentOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractComponentOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractComponentOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractComponentOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractComponentOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractComponentOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_hasLabel(abstractComponentOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_hasElaborates(abstractComponentOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_sendScope(abstractComponentOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_callScope(abstractComponentOperation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasLabel constraint of '<em>Abstract Component Operation</em>'.
	 * <!-- begin-user-doc -->
	 * 	check that the operation label is not null and not equal to ""
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAbstractComponentOperation_hasLabel(AbstractComponentOperation abstractComponentOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (abstractComponentOperation.getLabel()==null || "".equals(abstractComponentOperation.getLabel())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasLabel", getObjectLabel(abstractComponentOperation, context) },
						 new Object[] { abstractComponentOperation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the hasElaborates constraint of '<em>Abstract Component Operation</em>'.
	 * <!-- begin-user-doc -->
	 * 	check that the operation elaborates is not null and is not empty
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAbstractComponentOperation_hasElaborates(AbstractComponentOperation abstractComponentOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (abstractComponentOperation.getElaborates()==null || abstractComponentOperation.getElaborates().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasElaborates", getObjectLabel(abstractComponentOperation, context) },
						 new Object[] { abstractComponentOperation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the sendScope constraint of '<em>Abstract Component Operation</em>'.
	 * <!-- begin-user-doc -->
	 * 	check that the operation does not send to any connectors except those that are outgoing from its component (or parent of)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAbstractComponentOperation_sendScope(AbstractComponentOperation abstractComponentOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		Component owner = (Component) abstractComponentOperation.getContaining(ComponentsPackage.Literals.COMPONENT);
		for (DelayedDataPacket delayedDataPacket : abstractComponentOperation.getSends()){
			if (delayedDataPacket.getConnector()==null) continue; //will be reported elsewhere
			//if (delayedDataPacket.getConnector().getSender() != owner){
			if (!isParentComponentOf(delayedDataPacket.getConnector().getSender(), owner)){
				if (diagnostics != null) {
					diagnostics.add
						(createDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "_UI_GenericConstraint_diagnostic",
							 new Object[] { "sendScope", getObjectLabel(abstractComponentOperation, context) },
							 new Object[] { abstractComponentOperation },
							 context));
				}
				result=false;
			}
		}
		return result;
	}

	private boolean isParentComponentOf(Component component, Component target){
		if (component == target){
			return true;
		} else {
			EventBObject parent = ((EventBObject)target.eContainer()).getContaining(ComponentsPackage.eINSTANCE.getComponent());
			if (parent instanceof Component)
				return isParentComponentOf(component, (Component)parent);
			else return false;
		}
	}

	/**
	 * Validates the callScope constraint of '<em>Abstract Component Operation</em>'.
	 * <!-- begin-user-doc -->
	 * 	check that the operation does not call any methods except those that are contained in its component or its subcomponents
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAbstractComponentOperation_callScope(AbstractComponentOperation abstractComponentOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		Component owner = (Component) abstractComponentOperation.getContaining(ComponentsPackage.Literals.COMPONENT);
		EList<EObject> validMethodOwners = owner.getAllContained(ComponentsPackage.Literals.COMPONENT, true);
		validMethodOwners.add(owner);
		for (Method method : abstractComponentOperation.getCalls()){
			if (!validMethodOwners.contains((Component) method.getContaining(ComponentsPackage.Literals.COMPONENT))){
				if (diagnostics != null) {
					diagnostics.add
						(createDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "_UI_GenericConstraint_diagnostic",
							 new Object[] { "callScope", getObjectLabel(abstractComponentOperation, context) },
							 new Object[] { abstractComponentOperation },
							 context));
				}
				result=false;
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethod(Method method, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(method, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(method, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_hasLabel(method, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_hasElaborates(method, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_sendScope(method, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_callScope(method, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortWake(PortWake portWake, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(portWake, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(portWake, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(portWake, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(portWake, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(portWake, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(portWake, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(portWake, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(portWake, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(portWake, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_hasLabel(portWake, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_hasElaborates(portWake, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_sendScope(portWake, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_callScope(portWake, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortWake_hasReceive(portWake, diagnostics, context);
		if (result || diagnostics != null) result &= validatePortWake_receiveScope(portWake, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasReceive constraint of '<em>Port Wake</em>'.
	 * <!-- begin-user-doc -->
	 * 	check that the port wake operation receives is not null and is not empty
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePortWake_hasReceive(PortWake portWake, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (portWake.getReceives()==null || portWake.getReceives().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasReceive", getObjectLabel(portWake, context) },
						 new Object[] { portWake },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the receiveScope constraint of '<em>Port Wake</em>'.
	 * <!-- begin-user-doc -->
	 * 	check that the port wake operation does not receive from any connectors except those that are incoming to its component (or parents of)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePortWake_receiveScope(PortWake portWake, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		Component owner = (Component) portWake.getContaining(ComponentsPackage.Literals.COMPONENT);
		for (DataPacket dataPacket : portWake.getReceives()){
			if (dataPacket.getConnector()==null || dataPacket.getConnector().getReceivers()==null) continue; //will be reported elsewhere
			//if (!dataPacket.getConnector().getReceivers().contains(owner)){
			if (!isParentComponentOf(dataPacket.getConnector().getReceivers(),owner)){
				if (diagnostics != null) {
					diagnostics.add
						(createDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "_UI_GenericConstraint_diagnostic",
							 new Object[] { "receiveScope", getObjectLabel(portWake, context) },
							 new Object[] { portWake },
							 context));
				}
				result=false;
			}
		}
		return result;
	}

	private boolean isParentComponentOf(EList<Component> components, Component target){
		if (components.contains(target)){
			return true;
		} else {
			EventBObject parent = ((EventBObject)target.eContainer()).getContaining(ComponentsPackage.eINSTANCE.getComponent());
			if (parent instanceof Component)
				return isParentComponentOf(components, (Component)parent);
			else return false;
		}
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataPacket(DataPacket dataPacket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(dataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(dataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataPacket_hasName(dataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataPacket_hasPort(dataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataPacket_hasValue(dataPacket, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasName constraint of '<em>Data Packet</em>'.
	 * <!-- begin-user-doc -->
	 * check that the data packet name is not null and not equal to ""
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateDataPacket_hasName(DataPacket dataPacket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (dataPacket.getName()==null || "".equals(dataPacket.getName())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasName", getObjectLabel(dataPacket, context) },
						 new Object[] { dataPacket },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the hasConnector constraint of '<em>Data Packet</em>'.
	 * <!-- begin-user-doc -->
	 * 	check that the data packet connector is not null
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateDataPacket_hasConnector(DataPacket dataPacket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (dataPacket.getConnector()==null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasConnector", getObjectLabel(dataPacket, context) },
						 new Object[] { dataPacket },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the hasValue constraint of '<em>Data Packet</em>'.
	 * <!-- begin-user-doc -->
	 * 	check that the data packet value is not null and not equal to ""
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateDataPacket_hasValue(DataPacket dataPacket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (dataPacket.getValue() == null || "".equals(dataPacket.getValue())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasValue", getObjectLabel(dataPacket, context) },
						 new Object[] { dataPacket },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelayedDataPacket(DelayedDataPacket delayedDataPacket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(delayedDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(delayedDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delayedDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delayedDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delayedDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delayedDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delayedDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delayedDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delayedDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataPacket_hasName(delayedDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataPacket_hasPort(delayedDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataPacket_hasValue(delayedDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validateDelayedDataPacket_hasDelay(delayedDataPacket, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasDelay constraint of '<em>Delayed Data Packet</em>'.
	 * <!-- begin-user-doc -->
	 * 	check that the delayed data packet delay is not null and not equal to ""
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateDelayedDataPacket_hasDelay(DelayedDataPacket delayedDataPacket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (delayedDataPacket.getDelay() == null || "".equals(delayedDataPacket.getDelay())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasDelay", getObjectLabel(delayedDataPacket, context) },
						 new Object[] { delayedDataPacket },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelfWake(SelfWake selfWake, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(selfWake, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(selfWake, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selfWake, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selfWake, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selfWake, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selfWake, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selfWake, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selfWake, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selfWake, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_hasLabel(selfWake, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_hasElaborates(selfWake, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_sendScope(selfWake, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_callScope(selfWake, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternal(External external, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(external, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(external, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(external, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(external, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(external, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(external, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(external, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(external, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(external, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_hasLabel(external, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_hasElaborates(external, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_sendScope(external, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_callScope(external, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWakeEvent(WakeEvent wakeEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(wakeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(wakeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wakeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wakeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(wakeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wakeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wakeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wakeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wakeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateWakeEvent_hasName(wakeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateWakeEvent_hasDelay(wakeEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateWakeEvent_hasWakeKind(wakeEvent, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasName constraint of '<em>Wake Event</em>'.
	 * <!-- begin-user-doc -->
	 * 	check that the wake event name is not null and not equal to ""
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateWakeEvent_hasName(WakeEvent wakeEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (wakeEvent.getName()==null || "".equals(wakeEvent.getName())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasName", getObjectLabel(wakeEvent, context) },
						 new Object[] { wakeEvent },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the hasDelay constraint of '<em>Wake Event</em>'.
	 * <!-- begin-user-doc -->
	 * 	check that the wake event delay is not null and not equal to ""
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateWakeEvent_hasDelay(WakeEvent wakeEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (wakeEvent.getDelay_min() == null || "".equals(wakeEvent.getDelay_min())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasDelay", getObjectLabel(wakeEvent, context) },
						 new Object[] { wakeEvent },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the hasWakeKind constraint of '<em>Wake Event</em>'.
	 * <!-- begin-user-doc -->
	 * 	check that the wake event wake kind is not null
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateWakeEvent_hasWakeKind(WakeEvent wakeEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (wakeEvent.getWakeKind() == null) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasWakeKind", getObjectLabel(wakeEvent, context) },
						 new Object[] { wakeEvent },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_hasLabel(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_hasElaborates(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_sendScope(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractComponentOperation_callScope(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_hasCorrespondingStatemachineTransition(transition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasCorrespondingStatemachineTransition constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * check that all the events elaborated by the Component Transition operation are also elaborated by a transition 
	 * of a state-machine of the component (or a state-machine of a parent component)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTransition_hasCorrespondingStatemachineTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		List<Event> events = new ArrayList<Event>(transition.getElaborates());
		EObject component = ((Component)transition.getContaining(ComponentsPackage.Literals.COMPONENT));
		for (Event e : transition.getElaborates()){		
			whileloop:
			while (component instanceof Component){
				EList<EObject> transitions = ((Component)component).getAllContained(StatemachinesPackage.Literals.TRANSITION, true);		
					for (EObject t : transitions){
						if (t instanceof ac.soton.eventb.statemachines.Transition &&
								((ac.soton.eventb.statemachines.Transition)t).getElaborates().contains(e)){
							events.remove(e);
							break whileloop;
						}				
					}		
				component = component.eContainer();
			}
		}
		if (events.isEmpty()) return true;
		else{
			//if we get this far the Transition operation has no corresponding Statemachine Transition
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasCorrespondingStatemachineTransition", getObjectLabel(transition, context) },
						 new Object[] { transition },
						 context));
			}
			return false;
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationGuard(OperationGuard operationGuard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationGuard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationAction(OperationAction operationAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationWitness(OperationWitness operationWitness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationWitness, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInvariant(ComponentInvariant componentInvariant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentInvariant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentVariable(ComponentVariable componentVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentInitialisation(ComponentInitialisation componentInitialisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentInitialisation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentSet(ComponentSet componentSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentConstant(ComponentConstant componentConstant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentConstant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentAxiom(ComponentAxiom componentAxiom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentAxiom, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWakeQueue(WakeQueue wakeQueue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wakeQueue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractPort(AbstractPort abstractPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(abstractPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(abstractPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPort_hasName(abstractPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPort_hasType(abstractPort, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasName constraint of '<em>Abstract Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAbstractPort_hasName(AbstractPort abstractPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (abstractPort.getName()==null || "".equals(abstractPort.getName())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasName", getObjectLabel(abstractPort, context) },
						 new Object[] { abstractPort },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the hasType constraint of '<em>Abstract Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAbstractPort_hasType(AbstractPort abstractPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (abstractPort.getType() == null || "".equals(abstractPort.getType())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasType", getObjectLabel(abstractPort, context) },
						 new Object[] { abstractPort },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInPort(InPort inPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(inPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(inPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPort_hasName(inPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPort_hasType(inPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractInReceiver_isSourceValid(inPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractInSender_areDestinationsValid(inPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutPort(OutPort outPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(outPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(outPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(outPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(outPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(outPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(outPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(outPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(outPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(outPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPort_hasName(outPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPort_hasType(outPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractOutSender_isDestinationValid(outPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractOutReceiver_isSourceValid(outPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractDataPacket(AbstractDataPacket abstractDataPacket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(abstractDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(abstractDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataPacket_hasName(abstractDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataPacket_hasPort(abstractDataPacket, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataPacket_hasValue(abstractDataPacket, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasName constraint of '<em>Abstract Data Packet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAbstractDataPacket_hasName(AbstractDataPacket abstractDataPacket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (abstractDataPacket.getName()==null || "".equals(abstractDataPacket.getName())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasName", getObjectLabel(abstractDataPacket, context) },
						 new Object[] { abstractDataPacket },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the hasPort constraint of '<em>Abstract Data Packet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAbstractDataPacket_hasPort(AbstractDataPacket abstractDataPacket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (abstractDataPacket.getPort() == null ) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasPort", getObjectLabel(abstractDataPacket, context) },
						 new Object[] { abstractDataPacket },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the hasValue constraint of '<em>Abstract Data Packet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAbstractDataPacket_hasValue(AbstractDataPacket abstractDataPacket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (abstractDataPacket.getValue()==null || "".equals(abstractDataPacket.getValue())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "hasValue", getObjectLabel(abstractDataPacket, context) },
						 new Object[] { abstractDataPacket },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractInReceiver(AbstractInReceiver abstractInReceiver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(abstractInReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(abstractInReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractInReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractInReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractInReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractInReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractInReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractInReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractInReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPort_hasName(abstractInReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPort_hasType(abstractInReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractInReceiver_isSourceValid(abstractInReceiver, diagnostics, context);
		return result;
	}


	/**
	 * Validates the isSourceValid constraint of '<em>Abstract In Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAbstractInReceiver_isSourceValid(AbstractInReceiver abstractInReceiver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (abstractInReceiver.getSource() == null) return true;
		String moreSpecificMessage = "";
		
		if (abstractInReceiver.getSource().eContainer() == null) moreSpecificMessage="source has no container ";
		if (abstractInReceiver.eContainer()==null) moreSpecificMessage = moreSpecificMessage + "receiver has no container ";
		if (moreSpecificMessage.length()==0 &&
				abstractInReceiver.getSource().eContainer() != abstractInReceiver.eContainer().eContainer()) 
			moreSpecificMessage = "source container != receiver container container";
		
		if (moreSpecificMessage.length()>0){
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "isSourceValid("+moreSpecificMessage+")", getObjectLabel(abstractInReceiver, context) },
						 new Object[] { abstractInReceiver },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractInSender(AbstractInSender abstractInSender, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(abstractInSender, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(abstractInSender, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractInSender, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractInSender, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractInSender, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractInSender, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractInSender, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractInSender, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractInSender, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPort_hasName(abstractInSender, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPort_hasType(abstractInSender, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractInSender_areDestinationsValid(abstractInSender, diagnostics, context);
		return result;
	}


	/**
	 * Validates the areDestinationsValid constraint of '<em>Abstract In Sender</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAbstractInSender_areDestinationsValid(AbstractInSender abstractInSender, DiagnosticChain diagnostics, Map<Object, Object> context) {
		for (AbstractInReceiver dest : abstractInSender.getDestinations()){
			String moreSpecificMessage = "";
			
			if (dest.eContainer() == null) moreSpecificMessage="destination has no container ";
			if (abstractInSender.eContainer()==null) moreSpecificMessage = moreSpecificMessage + "sender has no container ";
			if (moreSpecificMessage.length()==0 &&
					dest.eContainer().eContainer() != abstractInSender.eContainer()) 
				moreSpecificMessage = "destination container container != sender container";
			
			if (moreSpecificMessage.length()>0){
				if (diagnostics != null) {
					diagnostics.add
						(createDiagnostic
							(Diagnostic.ERROR,
							 DIAGNOSTIC_SOURCE,
							 0,
							 "_UI_GenericConstraint_diagnostic",
							 new Object[] { "areDestinationsValid("+moreSpecificMessage+")", getObjectLabel(abstractInSender, context) },
							 new Object[] { abstractInSender },
							 context));
				}
				return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractOutReceiver(AbstractOutReceiver abstractOutReceiver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(abstractOutReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(abstractOutReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractOutReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractOutReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractOutReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractOutReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractOutReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractOutReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractOutReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPort_hasName(abstractOutReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPort_hasType(abstractOutReceiver, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractOutReceiver_isSourceValid(abstractOutReceiver, diagnostics, context);
		return result;
	}


	/**
	 * Validates the isSourceValid constraint of '<em>Abstract Out Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAbstractOutReceiver_isSourceValid(AbstractOutReceiver abstractOutReceiver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (abstractOutReceiver.getSource() == null) return true;	
		String moreSpecificMessage = "";
		
		if (abstractOutReceiver.getSource().eContainer() == null) moreSpecificMessage="source has no container ";
		if (abstractOutReceiver.eContainer()==null) moreSpecificMessage = moreSpecificMessage + "receiver has no container ";
		if (moreSpecificMessage.length()==0 &&
				abstractOutReceiver.getSource().eContainer().eContainer() != abstractOutReceiver.eContainer()) 
			moreSpecificMessage = "source container container != receiver container";
		
		if (moreSpecificMessage.length()>0){
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "isSourceValid("+moreSpecificMessage+")", getObjectLabel(abstractOutReceiver, context) },
						 new Object[] { abstractOutReceiver },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractOutSender(AbstractOutSender abstractOutSender, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(abstractOutSender, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(abstractOutSender, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractOutSender, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractOutSender, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractOutSender, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractOutSender, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractOutSender, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractOutSender, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractOutSender, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPort_hasName(abstractOutSender, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractPort_hasType(abstractOutSender, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractOutSender_isDestinationValid(abstractOutSender, diagnostics, context);
		return result;
	}


	/**
	 * Validates the isDestinationValid constraint of '<em>Abstract Out Sender</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateAbstractOutSender_isDestinationValid(AbstractOutSender abstractOutSender, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (abstractOutSender.getDestination() == null) return true;	
		String moreSpecificMessage = "";
		
		if (abstractOutSender.getDestination().eContainer() == null) moreSpecificMessage="destination has no container ";
		if (abstractOutSender.eContainer()==null) moreSpecificMessage = moreSpecificMessage + "sender has no container ";
		if (moreSpecificMessage.length()==0 &&
				abstractOutSender.getDestination().eContainer() != abstractOutSender.eContainer().eContainer()) 
			moreSpecificMessage = "destination container != sender container container";
		
		if (moreSpecificMessage.length()>0){
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "isDestinationValid("+moreSpecificMessage+")", getObjectLabel(abstractOutSender, context) },
						 new Object[] { abstractOutSender },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWakeKind(WakeKind wakeKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

	/**
	 * Currently, ID's are not unique so we override this validation from EObject
	 * so that errors are only reported if the collision is between 2 objects with the same parent element
	 * 
	 * @custom
	 */
	//TODO: If ID's are made unique in the Event-B EMF core then this method should be removed.
	@Override
	public boolean validate_UniqueID(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context){
	    boolean result = true;
	    String id = EcoreUtil.getID(eObject);
	    if (id != null)
	    {
	      Resource resource = eObject.eResource();
	      if (resource != null)
	      {
	        EObject otherEObject = resource.getEObject(id);
	        if (eObject != otherEObject && otherEObject != null
	        		&& eObject.eContainer() == otherEObject.eContainer())	//THE NEW BIT!!
	        {
	          // ...
	          diagnostics.add
	            (createDiagnostic
	              (Diagnostic.ERROR,
	               DIAGNOSTIC_SOURCE,
	               EOBJECT__UNIQUE_ID,
	               "_UI_DuplicateID_diagnostic",
	               new Object []
	               {
	                 id,
	                 getObjectLabel(eObject, context),
	                 getObjectLabel(otherEObject, context)
	               },
	               new Object [] { eObject, otherEObject, id },
	               context));
	        }
	      }
	    }
	    return result;
	}
	
	
	
} //ComponentsValidator
