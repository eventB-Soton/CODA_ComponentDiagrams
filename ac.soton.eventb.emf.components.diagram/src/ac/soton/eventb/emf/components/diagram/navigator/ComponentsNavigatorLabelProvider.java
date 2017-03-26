/*******************************************************************************
 *  (c) Crown owned copyright 2011, 2017 (UK Ministry of Defence)
 *  
 *  All rights reserved. This program and the accompanying materials  are 
 *  made available under the terms of the Eclipse Public License v1.0 which
 *  accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  This is to identify the UK Ministry of Defence as owners along with the
 *   license rights provided.
 *  
 *  Contributors:
 *  			University of Southampton - Initial implementation
 *******************************************************************************/
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
import ac.soton.eventb.emf.components.diagram.edit.parts.AbstractInSenderDestinationsEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.AbstractOutReceiverSourceEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentDiagramEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentNameEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ConnectorEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ConnectorNameEditPart;

import ac.soton.eventb.emf.components.diagram.edit.parts.ExternalEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.InPortEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.InPortNameTypeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.MethodEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.OutPortEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.OutPortNameTypeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ParentAsynchronousStatemachineEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ParentAsynchronousStatemachineNameEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ParentExternalEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ParentExternalLabelEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ParentMethodEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ParentMethodLabelEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ParentPortWakeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ParentPortWakeLabelEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ParentProcessStatemachineEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ParentProcessStatemachineNameEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ParentSelfWakeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ParentSelfWakeLabelEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ParentSynchronousStatemachineEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ParentSynchronousStatemachineNameEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ParentTransitionEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ParentTransitionLabelEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ParentWakeQueueEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ParentWakeQueueNameEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.PortWakeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.ProcessStatemachineEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SelfWakeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.StatemachineEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SubcomponentEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SubcomponentInPortEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SubcomponentInPortNameTypeEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SubcomponentOutPortEditPart;
import ac.soton.eventb.emf.components.diagram.edit.parts.SubcomponentOutPortNameTypeEditPart;
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
		case InPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://soton.ac.uk/models/eventb/components/2016?InPort", ComponentsElementTypes.InPort_2007); //$NON-NLS-1$
		case OutPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://soton.ac.uk/models/eventb/components/2016?OutPort", ComponentsElementTypes.OutPort_2008); //$NON-NLS-1$
		case ParentWakeQueueEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://soton.ac.uk/models/eventb/components/2016?WakeQueue", ComponentsElementTypes.WakeQueue_2009); //$NON-NLS-1$
		case ParentPortWakeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://soton.ac.uk/models/eventb/components/2016?PortWake", ComponentsElementTypes.PortWake_2010); //$NON-NLS-1$
		case ParentSelfWakeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://soton.ac.uk/models/eventb/components/2016?SelfWake", ComponentsElementTypes.SelfWake_2011); //$NON-NLS-1$
		case ParentMethodEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://soton.ac.uk/models/eventb/components/2016?Method", ComponentsElementTypes.Method_2012); //$NON-NLS-1$
		case ParentExternalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://soton.ac.uk/models/eventb/components/2016?External", ComponentsElementTypes.External_2013); //$NON-NLS-1$
		case ParentTransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://soton.ac.uk/models/eventb/components/2016?Transition", ComponentsElementTypes.Transition_2014); //$NON-NLS-1$
		case ParentAsynchronousStatemachineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://soton.ac.uk/models/eventb/statemachines/2014?Statemachine", ComponentsElementTypes.Statemachine_2015); //$NON-NLS-1$
		case ParentSynchronousStatemachineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://soton.ac.uk/models/eventb/statemachines/2014?Statemachine", ComponentsElementTypes.Statemachine_2016); //$NON-NLS-1$
		case ParentProcessStatemachineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://soton.ac.uk/models/eventb/statemachines/2014?Statemachine", ComponentsElementTypes.Statemachine_2017); //$NON-NLS-1$
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
		case SubcomponentInPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://soton.ac.uk/models/eventb/components/2016?InPort", ComponentsElementTypes.InPort_3019); //$NON-NLS-1$
		case SubcomponentOutPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://soton.ac.uk/models/eventb/components/2016?OutPort", ComponentsElementTypes.OutPort_3020); //$NON-NLS-1$
		case AbstractOutReceiverSourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://soton.ac.uk/models/eventb/components/2016?AbstractOutReceiver?source", ComponentsElementTypes.AbstractOutReceiverSource_4008); //$NON-NLS-1$
		case AbstractInSenderDestinationsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://soton.ac.uk/models/eventb/components/2016?AbstractInSender?destinations", ComponentsElementTypes.AbstractInSenderDestinations_4009); //$NON-NLS-1$
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
		case InPortEditPart.VISUAL_ID:
			return getInPort_2007Text(view);
		case OutPortEditPart.VISUAL_ID:
			return getOutPort_2008Text(view);
		case ParentWakeQueueEditPart.VISUAL_ID:
			return getWakeQueue_2009Text(view);
		case ParentPortWakeEditPart.VISUAL_ID:
			return getPortWake_2010Text(view);
		case ParentSelfWakeEditPart.VISUAL_ID:
			return getSelfWake_2011Text(view);
		case ParentMethodEditPart.VISUAL_ID:
			return getMethod_2012Text(view);
		case ParentExternalEditPart.VISUAL_ID:
			return getExternal_2013Text(view);
		case ParentTransitionEditPart.VISUAL_ID:
			return getTransition_2014Text(view);
		case ParentAsynchronousStatemachineEditPart.VISUAL_ID:
			return getStatemachine_2015Text(view);
		case ParentSynchronousStatemachineEditPart.VISUAL_ID:
			return getStatemachine_2016Text(view);
		case ParentProcessStatemachineEditPart.VISUAL_ID:
			return getStatemachine_2017Text(view);
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
		case SubcomponentInPortEditPart.VISUAL_ID:
			return getInPort_3019Text(view);
		case SubcomponentOutPortEditPart.VISUAL_ID:
			return getOutPort_3020Text(view);
		case AbstractOutReceiverSourceEditPart.VISUAL_ID:
			return getAbstractOutReceiverSource_4008Text(view);
		case AbstractInSenderDestinationsEditPart.VISUAL_ID:
			return getAbstractInSenderDestinations_4009Text(view);
		}
		return getUnknownElementText(view);
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
	private String getInPort_2007Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(
				ComponentsElementTypes.InPort_2007,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry
						.getType(InPortNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutPort_2008Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(
				ComponentsElementTypes.OutPort_2008,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry
						.getType(OutPortNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWakeQueue_2009Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(
				ComponentsElementTypes.WakeQueue_2009,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry
						.getType(ParentWakeQueueNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPortWake_2010Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(
				ComponentsElementTypes.PortWake_2010,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry
						.getType(ParentPortWakeLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSelfWake_2011Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(
				ComponentsElementTypes.SelfWake_2011,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry
						.getType(ParentSelfWakeLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMethod_2012Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(
				ComponentsElementTypes.Method_2012,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry
						.getType(ParentMethodLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExternal_2013Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(
				ComponentsElementTypes.External_2013,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry
						.getType(ParentExternalLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransition_2014Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(
				ComponentsElementTypes.Transition_2014,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry
						.getType(ParentTransitionLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStatemachine_2015Text(View view) {
		IParser parser = ComponentsParserProvider
				.getParser(
						ComponentsElementTypes.Statemachine_2015,
						view.getElement() != null ? view.getElement() : view,
						ComponentsVisualIDRegistry
								.getType(ParentAsynchronousStatemachineNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStatemachine_2016Text(View view) {
		IParser parser = ComponentsParserProvider
				.getParser(
						ComponentsElementTypes.Statemachine_2016,
						view.getElement() != null ? view.getElement() : view,
						ComponentsVisualIDRegistry
								.getType(ParentSynchronousStatemachineNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStatemachine_2017Text(View view) {
		IParser parser = ComponentsParserProvider
				.getParser(
						ComponentsElementTypes.Statemachine_2017,
						view.getElement() != null ? view.getElement() : view,
						ComponentsVisualIDRegistry
								.getType(ParentProcessStatemachineNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5025); //$NON-NLS-1$
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
	private String getInPort_3019Text(View view) {
		IParser parser = ComponentsParserProvider.getParser(
				ComponentsElementTypes.InPort_3019,
				view.getElement() != null ? view.getElement() : view,
				ComponentsVisualIDRegistry
						.getType(SubcomponentInPortNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutPort_3020Text(View view) {
		IParser parser = ComponentsParserProvider
				.getParser(
						ComponentsElementTypes.OutPort_3020,
						view.getElement() != null ? view.getElement() : view,
						ComponentsVisualIDRegistry
								.getType(SubcomponentOutPortNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComponentsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAbstractOutReceiverSource_4008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAbstractInSenderDestinations_4009Text(View view) {
		return ""; //$NON-NLS-1$
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
