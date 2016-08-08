/*
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.components.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eventb.emf.core.CorePackage;

import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentNameEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ConnectorNameEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ConnectorTypeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ExternalEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.InPortNameTypeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.MethodEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.OutPortNameTypeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.PortWakeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ProcessStatemachineEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SelfWakeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.StatemachineEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SubcomponentEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SubcomponentInPortNameTypeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SubcomponentOutPortNameTypeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SynchronousStatemachineEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.TransitionEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.WakeQueueEditPart;
import ac.soton.eventb.emf.components.diagram.parsers.MessageFormatParser;
import ac.soton.eventb.emf.components.diagram.part.ComponentsVisualIDRegistry;
import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;

/**
 * @generated
 */
public class ComponentsParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser componentName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getComponentName_5010Parser() {
		if (componentName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getEventBNamed_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getEventBNamed_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			componentName_5010Parser = parser;
		}
		return componentName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser connectorName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getConnectorName_5011Parser() {
		if (connectorName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getEventBNamed_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { CorePackage.eINSTANCE
					.getEventBNamed_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			connectorName_5011Parser = parser;
		}
		return connectorName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser connectorType_5012Parser;

	/**
	 * @generated
	 */
	private IParser getConnectorType_5012Parser() {
		if (connectorType_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getAbstractPort_Type() };
			EAttribute[] editableFeatures = new EAttribute[] { ComponentsPackage.eINSTANCE
					.getAbstractPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			connectorType_5012Parser = parser;
		}
		return connectorType_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser inPortNameType_5013Parser;

	/**
	 * @generated
	 */
	private IParser getInPortNameType_5013Parser() {
		if (inPortNameType_5013Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CorePackage.eINSTANCE.getEventBNamed_Name(),
					ComponentsPackage.eINSTANCE.getAbstractPort_Type() };
			EAttribute[] editableFeatures = new EAttribute[] {
					CorePackage.eINSTANCE.getEventBNamed_Name(),
					ComponentsPackage.eINSTANCE.getAbstractPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			inPortNameType_5013Parser = parser;
		}
		return inPortNameType_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser outPortNameType_5014Parser;

	/**
	 * @generated
	 */
	private IParser getOutPortNameType_5014Parser() {
		if (outPortNameType_5014Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CorePackage.eINSTANCE.getEventBNamed_Name(),
					ComponentsPackage.eINSTANCE.getAbstractPort_Type() };
			EAttribute[] editableFeatures = new EAttribute[] {
					CorePackage.eINSTANCE.getEventBNamed_Name(),
					ComponentsPackage.eINSTANCE.getAbstractPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			outPortNameType_5014Parser = parser;
		}
		return outPortNameType_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser statemachine_3015Parser;

	/**
	 * @generated
	 */
	private IParser getStatemachine_3015Parser() {
		if (statemachine_3015Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getEventBNamed_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			statemachine_3015Parser = parser;
		}
		return statemachine_3015Parser;
	}

	/**
	 * @generated
	 */
	private IParser statemachine_3016Parser;

	/**
	 * @generated
	 */
	private IParser getStatemachine_3016Parser() {
		if (statemachine_3016Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getEventBNamed_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			statemachine_3016Parser = parser;
		}
		return statemachine_3016Parser;
	}

	/**
	 * @generated
	 */
	private IParser statemachine_3017Parser;

	/**
	 * @generated
	 */
	private IParser getStatemachine_3017Parser() {
		if (statemachine_3017Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getEventBNamed_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			statemachine_3017Parser = parser;
		}
		return statemachine_3017Parser;
	}

	/**
	 * @generated
	 */
	private IParser portWake_3008Parser;

	/**
	 * @generated
	 */
	private IParser getPortWake_3008Parser() {
		if (portWake_3008Parser == null) {
			EAttribute[] features = new EAttribute[] { CoreextensionPackage.eINSTANCE
					.getEventBLabeled_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			portWake_3008Parser = parser;
		}
		return portWake_3008Parser;
	}

	/**
	 * @generated
	 */
	private IParser selfWake_3009Parser;

	/**
	 * @generated
	 */
	private IParser getSelfWake_3009Parser() {
		if (selfWake_3009Parser == null) {
			EAttribute[] features = new EAttribute[] { CoreextensionPackage.eINSTANCE
					.getEventBLabeled_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			selfWake_3009Parser = parser;
		}
		return selfWake_3009Parser;
	}

	/**
	 * @generated
	 */
	private IParser method_3010Parser;

	/**
	 * @generated
	 */
	private IParser getMethod_3010Parser() {
		if (method_3010Parser == null) {
			EAttribute[] features = new EAttribute[] { CoreextensionPackage.eINSTANCE
					.getEventBLabeled_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			method_3010Parser = parser;
		}
		return method_3010Parser;
	}

	/**
	 * @generated
	 */
	private IParser external_3013Parser;

	/**
	 * @generated
	 */
	private IParser getExternal_3013Parser() {
		if (external_3013Parser == null) {
			EAttribute[] features = new EAttribute[] { CoreextensionPackage.eINSTANCE
					.getEventBLabeled_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			external_3013Parser = parser;
		}
		return external_3013Parser;
	}

	/**
	 * @generated
	 */
	private IParser transition_3014Parser;

	/**
	 * @generated
	 */
	private IParser getTransition_3014Parser() {
		if (transition_3014Parser == null) {
			EAttribute[] features = new EAttribute[] { CoreextensionPackage.eINSTANCE
					.getEventBLabeled_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			transition_3014Parser = parser;
		}
		return transition_3014Parser;
	}

	/**
	 * @generated
	 */
	private IParser component_3012Parser;

	/**
	 * @generated
	 */
	private IParser getComponent_3012Parser() {
		if (component_3012Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getEventBNamed_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			component_3012Parser = parser;
		}
		return component_3012Parser;
	}

	/**
	 * @generated
	 */
	private IParser wakeQueue_3018Parser;

	/**
	 * @generated
	 */
	private IParser getWakeQueue_3018Parser() {
		if (wakeQueue_3018Parser == null) {
			EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
					.getEventBNamed_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			wakeQueue_3018Parser = parser;
		}
		return wakeQueue_3018Parser;
	}

	/**
	 * @generated
	 */
	private IParser inPortNameType_5015Parser;

	/**
	 * @generated
	 */
	private IParser getInPortNameType_5015Parser() {
		if (inPortNameType_5015Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CorePackage.eINSTANCE.getEventBNamed_Name(),
					ComponentsPackage.eINSTANCE.getAbstractPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inPortNameType_5015Parser = parser;
		}
		return inPortNameType_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser outPortNameType_5016Parser;

	/**
	 * @generated
	 */
	private IParser getOutPortNameType_5016Parser() {
		if (outPortNameType_5016Parser == null) {
			EAttribute[] features = new EAttribute[] {
					CorePackage.eINSTANCE.getEventBNamed_Name(),
					ComponentsPackage.eINSTANCE.getAbstractPort_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outPortNameType_5016Parser = parser;
		}
		return outPortNameType_5016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ComponentNameEditPart.VISUAL_ID:
			return getComponentName_5010Parser();
		case ConnectorNameEditPart.VISUAL_ID:
			return getConnectorName_5011Parser();
		case ConnectorTypeEditPart.VISUAL_ID:
			return getConnectorType_5012Parser();
		case InPortNameTypeEditPart.VISUAL_ID:
			return getInPortNameType_5013Parser();
		case OutPortNameTypeEditPart.VISUAL_ID:
			return getOutPortNameType_5014Parser();
		case StatemachineEditPart.VISUAL_ID:
			return getStatemachine_3015Parser();
		case SynchronousStatemachineEditPart.VISUAL_ID:
			return getStatemachine_3016Parser();
		case ProcessStatemachineEditPart.VISUAL_ID:
			return getStatemachine_3017Parser();
		case PortWakeEditPart.VISUAL_ID:
			return getPortWake_3008Parser();
		case SelfWakeEditPart.VISUAL_ID:
			return getSelfWake_3009Parser();
		case MethodEditPart.VISUAL_ID:
			return getMethod_3010Parser();
		case ExternalEditPart.VISUAL_ID:
			return getExternal_3013Parser();
		case TransitionEditPart.VISUAL_ID:
			return getTransition_3014Parser();
		case SubcomponentEditPart.VISUAL_ID:
			return getComponent_3012Parser();
		case WakeQueueEditPart.VISUAL_ID:
			return getWakeQueue_3018Parser();
		case SubcomponentInPortNameTypeEditPart.VISUAL_ID:
			return getInPortNameType_5015Parser();
		case SubcomponentOutPortNameTypeEditPart.VISUAL_ID:
			return getOutPortNameType_5016Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ComponentsVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ComponentsVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ComponentsElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
