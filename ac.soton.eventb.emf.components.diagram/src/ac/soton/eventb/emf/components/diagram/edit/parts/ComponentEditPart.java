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
package ac.soton.eventb.emf.components.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import ac.soton.eventb.emf.components.diagram.edit.policies.ComponentCanonicalEditPolicy;
import ac.soton.eventb.emf.components.diagram.edit.policies.ComponentItemSemanticEditPolicy;
import ac.soton.eventb.emf.components.diagram.edit.policies.ComponentsTextSelectionEditPolicy;
import ac.soton.eventb.emf.components.diagram.edit.policies.OpenComponentDiagramEditPolicy;
import ac.soton.eventb.emf.components.diagram.part.ComponentsVisualIDRegistry;
import ac.soton.eventb.emf.components.diagram.providers.ComponentsElementTypes;

/**
 * @generated
 */
public class ComponentEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2005;

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
	public ComponentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						ComponentsVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ComponentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new ComponentCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenComponentDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		ConstrainedToolbarLayoutEditPolicy lep = new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (ComponentsVisualIDRegistry.getVisualID(childView)) {
				case SubcomponentInPortEditPart.VISUAL_ID:
				case SubcomponentOutPortEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
					if (child instanceof ITextAwareEditPart) {
						return new ComponentsTextSelectionEditPolicy();
					}
				}
				return super.createChildEditPolicy(child);
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ComponentFigure();
	}

	/**
	 * @generated
	 */
	public ComponentFigure getPrimaryShape() {
		return (ComponentFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ComponentNameEditPart) {
			((ComponentNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureComponentNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof ComponentStatemachinesEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureStatemachinesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ComponentStatemachinesEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ComponentOperationsEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureOperationsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ComponentOperationsEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ComponentSubcomponentsEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureSubcomponentsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ComponentSubcomponentsEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ComponentWakeQueuesEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureWakeQueuesCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ComponentWakeQueuesEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof SubcomponentInPortEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.WEST);
			getBorderedFigure().getBorderItemContainer().add(
					((SubcomponentInPortEditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof SubcomponentOutPortEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.EAST);
			getBorderedFigure().getBorderItemContainer().add(
					((SubcomponentOutPortEditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ComponentNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ComponentStatemachinesEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureStatemachinesCompartmentFigure();
			pane.remove(((ComponentStatemachinesEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ComponentOperationsEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureOperationsCompartmentFigure();
			pane.remove(((ComponentOperationsEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ComponentSubcomponentsEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureSubcomponentsCompartmentFigure();
			pane.remove(((ComponentSubcomponentsEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ComponentWakeQueuesEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureWakeQueuesCompartmentFigure();
			pane.remove(((ComponentWakeQueuesEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof SubcomponentInPortEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((SubcomponentInPortEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof SubcomponentOutPortEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((SubcomponentOutPortEditPart) childEditPart).getFigure());
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
		if (editPart instanceof ComponentStatemachinesEditPart) {
			return getPrimaryShape().getFigureStatemachinesCompartmentFigure();
		}
		if (editPart instanceof ComponentOperationsEditPart) {
			return getPrimaryShape().getFigureOperationsCompartmentFigure();
		}
		if (editPart instanceof ComponentSubcomponentsEditPart) {
			return getPrimaryShape().getFigureSubcomponentsCompartmentFigure();
		}
		if (editPart instanceof ComponentWakeQueuesEditPart) {
			return getPrimaryShape().getFigureWakeQueuesCompartmentFigure();
		}
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
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
	protected NodeFigure createMainFigure() {
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
				.getType(ComponentNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == ComponentsElementTypes.Statemachine_3015) {
				return getChildBySemanticHint(ComponentsVisualIDRegistry
						.getType(ComponentStatemachinesEditPart.VISUAL_ID));
			}
			if (type == ComponentsElementTypes.Statemachine_3016) {
				return getChildBySemanticHint(ComponentsVisualIDRegistry
						.getType(ComponentStatemachinesEditPart.VISUAL_ID));
			}
			if (type == ComponentsElementTypes.Statemachine_3017) {
				return getChildBySemanticHint(ComponentsVisualIDRegistry
						.getType(ComponentStatemachinesEditPart.VISUAL_ID));
			}
			if (type == ComponentsElementTypes.PortWake_3008) {
				return getChildBySemanticHint(ComponentsVisualIDRegistry
						.getType(ComponentOperationsEditPart.VISUAL_ID));
			}
			if (type == ComponentsElementTypes.SelfWake_3009) {
				return getChildBySemanticHint(ComponentsVisualIDRegistry
						.getType(ComponentOperationsEditPart.VISUAL_ID));
			}
			if (type == ComponentsElementTypes.Method_3010) {
				return getChildBySemanticHint(ComponentsVisualIDRegistry
						.getType(ComponentOperationsEditPart.VISUAL_ID));
			}
			if (type == ComponentsElementTypes.External_3013) {
				return getChildBySemanticHint(ComponentsVisualIDRegistry
						.getType(ComponentOperationsEditPart.VISUAL_ID));
			}
			if (type == ComponentsElementTypes.Transition_3014) {
				return getChildBySemanticHint(ComponentsVisualIDRegistry
						.getType(ComponentOperationsEditPart.VISUAL_ID));
			}
			if (type == ComponentsElementTypes.Component_3012) {
				return getChildBySemanticHint(ComponentsVisualIDRegistry
						.getType(ComponentSubcomponentsEditPart.VISUAL_ID));
			}
			if (type == ComponentsElementTypes.WakeQueue_3018) {
				return getChildBySemanticHint(ComponentsVisualIDRegistry
						.getType(ComponentWakeQueuesEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
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
	public class ComponentFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureComponentNameLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureStatemachinesCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureOperationsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureSubcomponentsCompartmentFigure;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureWakeQueuesCompartmentFigure;

		/**
		 * @generated
		 */
		public ComponentFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutThis.setSpacing(-1);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure componentNameFigure0 = new RectangleFigure();

			componentNameFigure0.setFill(false);
			componentNameFigure0.setOutline(false);

			this.add(componentNameFigure0);

			GridLayout layoutComponentNameFigure0 = new GridLayout();
			layoutComponentNameFigure0.numColumns = 1;
			layoutComponentNameFigure0.makeColumnsEqualWidth = true;
			componentNameFigure0.setLayoutManager(layoutComponentNameFigure0);

			fFigureComponentNameLabelFigure = new WrappingLabel();

			fFigureComponentNameLabelFigure.setText("<name?>");

			GridData constraintFFigureComponentNameLabelFigure = new GridData();
			constraintFFigureComponentNameLabelFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureComponentNameLabelFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureComponentNameLabelFigure.horizontalIndent = 0;
			constraintFFigureComponentNameLabelFigure.horizontalSpan = 1;
			constraintFFigureComponentNameLabelFigure.verticalSpan = 1;
			constraintFFigureComponentNameLabelFigure.grabExcessHorizontalSpace = true;
			constraintFFigureComponentNameLabelFigure.grabExcessVerticalSpace = false;
			componentNameFigure0.add(fFigureComponentNameLabelFigure,
					constraintFFigureComponentNameLabelFigure);

			fFigureStatemachinesCompartmentFigure = new RectangleFigure();

			this.add(fFigureStatemachinesCompartmentFigure);

			fFigureOperationsCompartmentFigure = new RectangleFigure();

			this.add(fFigureOperationsCompartmentFigure);

			fFigureSubcomponentsCompartmentFigure = new RectangleFigure();

			this.add(fFigureSubcomponentsCompartmentFigure);

			fFigureWakeQueuesCompartmentFigure = new RectangleFigure();

			this.add(fFigureWakeQueuesCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureComponentNameLabelFigure() {
			return fFigureComponentNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureStatemachinesCompartmentFigure() {
			return fFigureStatemachinesCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureOperationsCompartmentFigure() {
			return fFigureOperationsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureSubcomponentsCompartmentFigure() {
			return fFigureSubcomponentsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureWakeQueuesCompartmentFigure() {
			return fFigureWakeQueuesCompartmentFigure;
		}

		/**
		 * 
		 * This is added to give a gradient to the colour rendering
		 * 
		 * @custom
		 */
		protected void fillShape(Graphics graphics) {
			// Backup the graphics colors
			Color bgColor = graphics.getBackgroundColor();
			Color fgColor = graphics.getForegroundColor();
			// Set the graphics color
			graphics.setBackgroundColor(ColorConstants.white);
			graphics.setForegroundColor(getBackgroundColor());
			// Restore the original colors
			graphics.fillGradient(getBounds(), true);
			graphics.setBackgroundColor(bgColor);
			graphics.setForegroundColor(fgColor);
		}

	}

}
