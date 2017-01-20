/*
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.components.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import ac.soton.eventb.emf.components.diagram.edit.policies.ConnectorItemSemanticEditPolicy;
import ac.soton.eventb.emf.components.diagram.part.ComponentsVisualIDRegistry;
import ac.soton.eventb.emf.components.diagram.providers.ComponentsElementTypes;

/**
 * @generated
 */
public class ConnectorEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2006;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ConnectorEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ConnectorItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ConnectorFigure();
	}

	/**
	 * @generated
	 */
	public ConnectorFigure getPrimaryShape() {
		return (ConnectorFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ConnectorNameEditPart) {
			((ConnectorNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureConnectorNameFigure());
			return true;
		}
		if (childEditPart instanceof ConnectorTypeEditPart) {
			((ConnectorTypeEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureConnectorTypeFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ConnectorNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ConnectorTypeEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ComponentsVisualIDRegistry
				.getType(ConnectorNameEditPart.VISUAL_ID));
	}

	/**
	 * 
	 *  override the following method to return a fixed point for 
	 *  anchoring links. The fixed point is one or other end corner
	 * 
	 * @custom
	 */
	@Override
	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connEditPart) {
		return new ChopboxAnchor(ConnectorEditPart.this.getFigure()) {
			/**
			 * returns the sharp corner Point on one or other end of the connector
			 * whichever the reference is closest to
			 * 
			 * @param reference
			 *            The reference point
			 * @return The anchor location
			 */
			@Override
			public Point getLocation(Point reference) {
				Rectangle r = Rectangle.SINGLETON;
				r.setBounds(getBox());
				getOwner().translateToAbsolute(r);
				float centerX = r.x + 0.5f * r.width;
				float centerY = r.y + 0.5f * r.height;
				float x = r.x;
				if (reference.x > centerX) {
					x = x + r.width;
				}
				return new Point(Math.round(x), Math.round(centerY));
			}
		};
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class ConnectorFigure extends ScalablePolygonShape {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureConnectorNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureConnectorTypeFigure;

		/**
		 * @generated
		 */
		public ConnectorFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(5)));
			this.addPoint(new Point(getMapMode().DPtoLP(5), getMapMode()
					.DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(20), getMapMode()
					.DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(25), getMapMode()
					.DPtoLP(5)));
			this.addPoint(new Point(getMapMode().DPtoLP(20), getMapMode()
					.DPtoLP(10)));
			this.addPoint(new Point(getMapMode().DPtoLP(5), getMapMode()
					.DPtoLP(10)));
			this.setFill(true);

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureConnectorNameFigure = new WrappingLabel();

			fFigureConnectorNameFigure.setText("<name?>");

			GridData constraintFFigureConnectorNameFigure = new GridData();
			constraintFFigureConnectorNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureConnectorNameFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureConnectorNameFigure.horizontalIndent = 0;
			constraintFFigureConnectorNameFigure.horizontalSpan = 1;
			constraintFFigureConnectorNameFigure.verticalSpan = 1;
			constraintFFigureConnectorNameFigure.grabExcessHorizontalSpace = true;
			constraintFFigureConnectorNameFigure.grabExcessVerticalSpace = false;
			this.add(fFigureConnectorNameFigure,
					constraintFFigureConnectorNameFigure);

			fFigureConnectorTypeFigure = new WrappingLabel();

			fFigureConnectorTypeFigure.setText("<type?>");

			fFigureConnectorTypeFigure.setFont(FFIGURECONNECTORTYPEFIGURE_FONT);

			GridData constraintFFigureConnectorTypeFigure = new GridData();
			constraintFFigureConnectorTypeFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureConnectorTypeFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureConnectorTypeFigure.horizontalIndent = 0;
			constraintFFigureConnectorTypeFigure.horizontalSpan = 1;
			constraintFFigureConnectorTypeFigure.verticalSpan = 1;
			constraintFFigureConnectorTypeFigure.grabExcessHorizontalSpace = true;
			constraintFFigureConnectorTypeFigure.grabExcessVerticalSpace = false;
			this.add(fFigureConnectorTypeFigure,
					constraintFFigureConnectorTypeFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConnectorNameFigure() {
			return fFigureConnectorNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConnectorTypeFigure() {
			return fFigureConnectorTypeFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURECONNECTORTYPEFIGURE_FONT = new Font(
			Display.getCurrent(), "Brave Sans Mono", 11, SWT.NORMAL);

}
