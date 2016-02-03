/**
 * Copyright (c) 2011 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.emf.components.diagram.edit.parts.custom;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @author vitaly
 *
 */
public class FixedConnectionAnchor extends AbstractConnectionAnchor {

	private int position = 0;

	/**
	 * @param owner
	 */
	public FixedConnectionAnchor(IFigure owner, int position) {
		super(owner);
		this.position = position;
	}

	@Override
	public Point getLocation(Point reference) {
		Rectangle bounds = getOwner().getBounds();
		Point positionPoint = null;
		
		switch (position) {
		case PositionConstants.TOP:
			positionPoint = bounds.getTop();
			break;
		case PositionConstants.LEFT:
			positionPoint = bounds.getLeft();
			break;
		case PositionConstants.BOTTOM:
			positionPoint = bounds.getBottom();
			break;
		case PositionConstants.RIGHT:
			positionPoint = bounds.getRight();
			break;
		case PositionConstants.CENTER:
			positionPoint = bounds.getCenter();
			break;
		default:
			positionPoint = bounds.getCenter();
		}
		positionPoint = positionPoint.getCopy();
		getOwner().translateToAbsolute(positionPoint);
		return positionPoint;
	}

}
