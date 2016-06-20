/*
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.components.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentDiagramEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentNameEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ConnectorEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ConnectorNameEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ConnectorReceiversEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ConnectorSenderEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ExternalEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.MethodEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.PortWakeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ProcessStatemachineEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SelfWakeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.StatemachineEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SubcomponentEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SynchronousStatemachineEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.TransitionEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.WakeQueueEditPart;
import ac.soton.eventb.emf.components.diagram.part.ComponentsDiagramEditorPlugin;
import ac.soton.eventb.emf.components.diagram.part.ComponentsVisualIDRegistry;
import ac.soton.eventb.emf.components.diagram.providers.ComponentsElementTypes;
import ac.soton.eventb.emf.components.diagram.providers.ComponentsParserProvider;

/**
 * @generated
 */
public class ComponentsNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ComponentsDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ComponentsDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ComponentsNavigatorItem
				&& !isOwnView(((ComponentsNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ComponentsNavigatorGroup) {
			ComponentsNavigatorGroup group = (ComponentsNavigatorGroup) element;
			return ComponentsDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof ComponentsNavigatorItem) {
			ComponentsNavigatorItem navigatorItem = (ComponentsNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (ComponentsVisualIDRegistry.getVisualID(view)) {
		case ComponentDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://soton.ac.uk/models/eventb/components/2016?Component", ComponentsElementTypes.Component_1000); //$NON-NLS-1$
		case ComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://soton.ac.uk/models/eventb/components/2016?Component", ComponentsElementTypes.Component_2005); //$NON-NLS-1$
		case ConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://soton.ac.uk/models/eventb/components/2016?Connector", ComponentsElementTypes.Connector_2006); //$NON-NLS-1$
		case PortWakeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://soton.ac.uk/models/eventb/components/2016?PortWake", ComponentsElementTypes.PortWake_3008); //$NON-NLS-1$
		case SelfWakeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://soton.ac.uk/models/eventb/components/2016?SelfWake", ComponentsElementTypes.SelfWake_3009); //$NON-NLS-1$
		case MethodEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://soton.ac.uk/models/eventb/components/2016?Method", ComponentsElementTypes.Method_3010); //$NON-NLS-1$
		case SubcomponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://soton.ac.uk/models/eventb/components/2016?Component", ComponentsElementTypes.Component_3012); //$NON-NLS-1$
		case ExternalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://soton.ac.uk/models/eventb/components/2016?External", ComponentsElementTypes.External_3013); //$NON-NLS-1$
		case TransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://soton.ac.uk/models/eventb/components/2016?Transition", ComponentsElementTypes.Transition_3014); //$NON-NLS-1$
		case StatemachineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://soton.ac.uk/models/eventb/statemachines/2014?Statemachine", ComponentsElementTypes.Statemachine_3015); //$NON-NLS-1$
		case SynchronousStatemachineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://soton.ac.uk/models/eventb/statemachines/2014?Statemachine", ComponentsElementTypes.Statemachine_3016); //$NON-NLS-1$
		case ProcessStatemachineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://soton.ac.uk/models/eventb/statemachines/2014?Statemachine", ComponentsElementTypes.Statemachine_3017); //$NON-NLS-1$
		case WakeQueueEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://soton.ac.uk/models/eventb/components/2016?WakeQueue", ComponentsElementTypes.WakeQueue_3018); //$NON-NLS-1$
		case ConnectorSenderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://soton.ac.uk/models/eventb/components/2016?Connector?sender", ComponentsElementTypes.ConnectorSender_4004); //$NON-NLS-1$
		case ConnectorReceiversEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://soton.ac.uk/models/eventb/components/2016?Connector?receivers", ComponentsElementTypes.ConnectorReceivers_4005); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ComponentsDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ComponentsElementTypes.isKnownElementType(elementType)) {
			image = ComponentsElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof ComponentsNavigatorGroup) {
			ComponentsNavigatorGroup group = (ComponentsNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ComponentsNavigatorItem) {
			ComponentsNavigatorItem navigatorItem = (ComponentsNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ComponentsVisualIDRegistry.getVisualID(view)) {
		case ComponentDiagramEditPart.VISUAL_ID:
			return getComponent_1000Text(view);
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2005Text(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2006Text(view);
		case PortWakeEditPart.VISUAL_ID:
			return getPortWake_3008Text(view);
		case SelfWakeEditPart.VISUAL_ID:
			return getSelfWake_3009Text(view);
		case MethodEditPart.VISUAL_ID:
			return getMethod_3010Text(view);
		case SubcomponentEditPart.VISUAL_ID:
			return getComponent_3012Text(view);
		case ExternalEditPart.VISUAL_ID:
			return getExternal_3013Text(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_3014Text(view);
		case StatemachineEditPart.VISUAL_ID:
			return getStatemachine_3015Text(view);
		case SynchronousStatemachineEditPart.VISUAL_ID:
			return getStatemachine_3016Text(view);
		case ProcessStatemachineEditPart.VISUAL_ID:
			return getStatemachine_3017Text(view);
		case WakeQueueEditPart.VISUAL_ID:
			return getWakeQueue_3018Text(view);
		case ConnectorSenderEditPart.VISUAL_ID:
			return getConnectorSender_4004Text(view);
		case ConnectorReceiversEditPart.VISUAL_ID:
			return getConnectorReceivers_4005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getConnectorReceivers_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPortWake_3008Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(
				ComponentsElementTypes.PortWake_3008,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry.getType(PortWakeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectorSender_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnector_2006Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(
				ComponentsElementTypes.Connector_2006,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry
						.getType(ConnectorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponent_1000Text(View view) {
		Component domainModelElement = (Component) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransition_3014Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(
				ComponentsElementTypes.Transition_3014,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry
						.getType(TransitionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStatemachine_3015Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(
				ComponentsElementTypes.Statemachine_3015,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry
						.getType(StatemachineEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStatemachine_3016Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(
				ComponentsElementTypes.Statemachine_3016,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry
						.getType(SynchronousStatemachineEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStatemachine_3017Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(
				ComponentsElementTypes.Statemachine_3017,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry
						.getType(ProcessStatemachineEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWakeQueue_3018Text(View view) {
		IParser parser = ComponentsParserProvider
				.getParser(ComponentsElementTypes.WakeQueue_3018, view
						.getElement() != null ? view.getElement() : view,
						ComponentsVisualIDRegistry
								.getType(WakeQueueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponent_3012Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(
				ComponentsElementTypes.Component_3012,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry
						.getType(SubcomponentEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMethod_3010Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(
				ComponentsElementTypes.Method_3010,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry.getType(MethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSelfWake_3009Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(
				ComponentsElementTypes.SelfWake_3009,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry.getType(SelfWakeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponent_2005Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(
				ComponentsElementTypes.Component_2005,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry
						.getType(ComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExternal_3013Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(
				ComponentsElementTypes.External_3013,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry.getType(ExternalEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ComponentDiagramEditPart.MODEL_ID
				.equals(ComponentsVisualIDRegistry.getModelID(view));
	}

}
