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
package ac.soton.eventb.emf.components.navigator.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eventb.emf.core.EventBNamed;

import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.diagram.edit.parts.ComponentDiagramEditPart;
import ac.soton.eventb.emf.components.diagram.part.ComponentsDiagramEditor;
import ac.soton.eventb.emf.components.diagram.part.ComponentsDiagramEditorPlugin;
import ac.soton.eventb.emf.components.util.ComponentsUtils;
import ac.soton.eventb.emf.diagrams.navigator.provider.IDiagramProvider;

/**
 * Diagram provider for Components.
 * 
 * @author vitaly
 *
 */
public class ComponentDiagramProvider implements IDiagramProvider {

	private static final String fileExtension = "cpd";
	
	@Override
	public String getDiagramFileName(EObject eObject) {
		if (eObject instanceof Component) {			
			// find a root component as all component diagrams are contained in the same diagram file
			// named after root component element
			Component rootComponent = ComponentsUtils.getRootComponent(eObject);
			if (rootComponent==null) return null;
			// prefix with machine name
			EObject root = EcoreUtil.getRootContainer(eObject);
			if (root != null && root instanceof EventBNamed)
				return ((EventBNamed) root).getName() + "." + rootComponent.getName() + "."+fileExtension;
			
			else 
				return rootComponent.getName() + "."+ fileExtension;
		}
		return null;
	}

	@Override
	public PreferencesHint getPreferencesHint() {
		return ComponentsDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	@Override
	public String getDiagramKind() {
		return ComponentDiagramEditPart.MODEL_ID;
	}

	@Override
	public String getEditorId() {
		return ComponentsDiagramEditor.ID;
	}

	@Override
	public String getFileExtension() {
		return fileExtension;
	}

}
