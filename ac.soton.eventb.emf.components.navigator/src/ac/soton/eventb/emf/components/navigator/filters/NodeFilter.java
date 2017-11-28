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
package ac.soton.eventb.emf.components.navigator.filters;

//import org.eclipse.core.runtime.IAdaptable;
//import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

/**
 * Node filter for component nodes in navigator.
 * returns true for all nodes that should NOT be displayed in the navigator.
 * Currently filters nothing out.
 * 
 * @author 
 *
 */
public class NodeFilter extends ViewerFilter {

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
//		if (element instanceof IAdaptable) {
//			EObject eobject = (EObject) ((IAdaptable) element).getAdapter(EObject.class);
//			if (eobject != null 
//					&& eobject instanceof AbstractNode 
//					&& (eobject instanceof State == false))
//				return false;
//		}
		return false;
	}

}
