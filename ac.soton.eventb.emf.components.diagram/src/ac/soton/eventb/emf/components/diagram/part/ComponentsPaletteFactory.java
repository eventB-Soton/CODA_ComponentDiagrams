/*
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.components.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import ac.soton.eventb.emf.components.diagram.providers.ComponentsElementTypes;

/**
 * @generated
 */
public class ComponentsPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDefault1Group());
	}

	/**
	 * Creates "Default" palette tool group
	 * @generated
	 */
	private PaletteContainer createDefault1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Default1Group_title);
		paletteContainer.setId("createDefault1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Default1Group_desc);
		paletteContainer.add(createComponent1CreationTool());
		paletteContainer.add(createAsynchronous2CreationTool());
		paletteContainer.add(createSynchronous3CreationTool());
		paletteContainer.add(createProcess4CreationTool());
		paletteContainer.add(createWakeQueue5CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createPortWake7CreationTool());
		paletteContainer.add(createSelfWake8CreationTool());
		paletteContainer.add(createMethod9CreationTool());
		paletteContainer.add(createExternal10CreationTool());
		paletteContainer.add(createTransition11CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createConnector13CreationTool());
		paletteContainer.add(createSender14CreationTool());
		paletteContainer.add(createReceiver15CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponent1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ComponentsElementTypes.Component_2005);
		types.add(ComponentsElementTypes.Component_3012);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Component1CreationTool_title,
				Messages.Component1CreationTool_desc, types);
		entry.setId("createComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes
				.getImageDescriptor(ComponentsElementTypes.Component_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAsynchronous2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Asynchronous2CreationTool_title,
				Messages.Asynchronous2CreationTool_desc,
				Collections
						.singletonList(ComponentsElementTypes.Statemachine_3015));
		entry.setId("createAsynchronous2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes
				.getImageDescriptor(ComponentsElementTypes.Statemachine_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSynchronous3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Synchronous3CreationTool_title,
				Messages.Synchronous3CreationTool_desc,
				Collections
						.singletonList(ComponentsElementTypes.Statemachine_3016));
		entry.setId("createSynchronous3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsDiagramEditorPlugin
				.findImageDescriptor("/ac.soton.eventb.emf.components.edit/icons/full/obj16/SynchronousStatemachine.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProcess4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Process4CreationTool_title,
				Messages.Process4CreationTool_desc,
				Collections
						.singletonList(ComponentsElementTypes.Statemachine_3017));
		entry.setId("createProcess4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsDiagramEditorPlugin
				.findImageDescriptor("/ac.soton.eventb.emf.components.edit/icons/full/obj16/ProcessStatemachine.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWakeQueue5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WakeQueue5CreationTool_title,
				Messages.WakeQueue5CreationTool_desc,
				Collections
						.singletonList(ComponentsElementTypes.WakeQueue_3018));
		entry.setId("createWakeQueue5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes
				.getImageDescriptor(ComponentsElementTypes.WakeQueue_3018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPortWake7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PortWake7CreationTool_title,
				Messages.PortWake7CreationTool_desc,
				Collections.singletonList(ComponentsElementTypes.PortWake_3008));
		entry.setId("createPortWake7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes
				.getImageDescriptor(ComponentsElementTypes.PortWake_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSelfWake8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SelfWake8CreationTool_title,
				Messages.SelfWake8CreationTool_desc,
				Collections.singletonList(ComponentsElementTypes.SelfWake_3009));
		entry.setId("createSelfWake8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes
				.getImageDescriptor(ComponentsElementTypes.SelfWake_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMethod9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Method9CreationTool_title,
				Messages.Method9CreationTool_desc,
				Collections.singletonList(ComponentsElementTypes.Method_3010));
		entry.setId("createMethod9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes
				.getImageDescriptor(ComponentsElementTypes.Method_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExternal10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.External10CreationTool_title,
				Messages.External10CreationTool_desc,
				Collections.singletonList(ComponentsElementTypes.External_3013));
		entry.setId("createExternal10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes
				.getImageDescriptor(ComponentsElementTypes.External_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransition11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Transition11CreationTool_title,
				Messages.Transition11CreationTool_desc,
				Collections
						.singletonList(ComponentsElementTypes.Transition_3014));
		entry.setId("createTransition11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes
				.getImageDescriptor(ComponentsElementTypes.Transition_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnector13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Connector13CreationTool_title,
				Messages.Connector13CreationTool_desc,
				Collections
						.singletonList(ComponentsElementTypes.Connector_2006));
		entry.setId("createConnector13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsElementTypes
				.getImageDescriptor(ComponentsElementTypes.Connector_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSender14CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Sender14CreationTool_title,
				Messages.Sender14CreationTool_desc,
				Collections
						.singletonList(ComponentsElementTypes.ConnectorSender_4004));
		entry.setId("createSender14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsDiagramEditorPlugin
				.findImageDescriptor("/ac.soton.eventb.emf.components.edit/icons/full/obj16/Sender.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReceiver15CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Receiver15CreationTool_title,
				Messages.Receiver15CreationTool_desc,
				Collections
						.singletonList(ComponentsElementTypes.ConnectorReceivers_4005));
		entry.setId("createReceiver15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComponentsDiagramEditorPlugin
				.findImageDescriptor("/ac.soton.eventb.emf.components.edit/icons/full/obj16/Receiver.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
