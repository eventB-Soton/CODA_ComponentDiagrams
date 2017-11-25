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
package ac.soton.eventb.emf.components.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.figures.DiagramColorConstants;
import org.eclipse.gmf.runtime.diagram.ui.preferences.AppearancePreferencePage;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import ac.soton.eventb.emf.components.diagram.part.ComponentsDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramAppearancePreferencePage extends AppearancePreferencePage {

	/**
	 * @generated
	 */
	public DiagramAppearancePreferencePage() {
		setPreferenceStore(ComponentsDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}

	/**
	 * Initializes the default preference values 
	 * for this preference store.
	 * 
	 * @param store
	 */
	public static void initDefaults(IPreferenceStore store) {

		setDefaultFontPreference(store);

		Color fontColor = DiagramColorConstants.white;
		PreferenceConverter.setDefault(store,
				IPreferenceConstants.PREF_FONT_COLOR, fontColor.getRGB());

		Color fillColor = new Color(null, 1, 105, 115); //this is a dark blue-green;
		PreferenceConverter.setDefault(store,
				IPreferenceConstants.PREF_FILL_COLOR, fillColor.getRGB());

		Color lineColor = DiagramColorConstants.diagramGray;
		PreferenceConverter.setDefault(store,
				IPreferenceConstants.PREF_LINE_COLOR, lineColor.getRGB());

		Color noteFillColor = DiagramColorConstants.diagramLightYellow;
		PreferenceConverter.setDefault(store,
				IPreferenceConstants.PREF_NOTE_FILL_COLOR,
				noteFillColor.getRGB());

		Color noteLineColor = DiagramColorConstants.diagramDarkYellow;
		PreferenceConverter.setDefault(store,
				IPreferenceConstants.PREF_NOTE_LINE_COLOR,
				noteLineColor.getRGB());
	}

	/**
	 * Set the default font for this preference store.
	 * @param store IPreferenceStore
	 */
	static protected void setDefaultFontPreference(IPreferenceStore store) {
		final IPreferenceStore theStore = store;
		if (Display.getCurrent() != null) {
			initDefaultFontProc(theStore);
		} else {
			Display display = PlatformUI.isWorkbenchRunning() ? PlatformUI
					.getWorkbench().getDisplay() : Display.getDefault();
			display.syncExec(new Runnable() {
				public void run() {
					initDefaultFontProc(theStore);
				}
			});
		}
	}

	/**
	 * Set the default font for this preference store. Assumes that the method
	 * executed on the UI thread
	 * 
	 * @param store
	 *            IPreferenceStore
	 */
	private static void initDefaultFontProc(IPreferenceStore store) {
		FontData fontData = getFontData();
		fontData.setHeight(9);
		PreferenceConverter.setDefault(store,
				IPreferenceConstants.PREF_DEFAULT_FONT, fontData);
	}

	private static FontData getFontData() {
		FontData fontDataArray[] = JFaceResources.getDefaultFont()
				.getFontData();
		for (FontData fd : fontDataArray) {
			if (fd.getName().endsWith("Brave Sans Mono")) {
				return fd;
			}
		}
		return fontDataArray[0];
	}

}
