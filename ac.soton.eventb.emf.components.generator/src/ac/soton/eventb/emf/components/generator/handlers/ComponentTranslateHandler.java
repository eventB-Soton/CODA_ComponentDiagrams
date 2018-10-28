/**
 * 
 */
package ac.soton.eventb.emf.components.generator.handlers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBNamedCommentedComponentElement;

import ac.soton.emf.translator.TranslatorFactory;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.generator.Activator;
import ac.soton.eventb.emf.diagrams.generator.DiagramsGeneratorIdentifiers;
import ac.soton.eventb.emf.diagrams.generator.handlers.IUMLBTranslateHandler;
import ac.soton.eventb.statemachines.Statemachine;
import ac.soton.eventb.statemachines.StatemachinesPackage;


/**
 * <p>
 * 
 * </p>
 * 
 * @author cfs
 * @version
 * @see
 * @since 4.0
 */
public class ComponentTranslateHandler extends IUMLBTranslateHandler {	
		
	/**
	 * For component diagrams we return the root translatable element irrespective of
	 * type. This is because the component diagram can contain statemachines. 
	 * I.e. We run the component translation on the root component even if a statemachine
	 * is selected in the component diagram.
	 * 
	 */
	@Override
	protected EObject getEObject (Object obj){
		EObject eObject = super.getEObject(obj);
		
		while (eObject.eContainer() instanceof EventBElement && 
				!(eObject.eContainer() instanceof EventBNamedCommentedComponentElement)){
			eObject = eObject.eContainer();
		}
		
		return eObject;
	}
	
	/* (non-Javadoc)
	 * @see ac.soton.emf.translator.handler.TranslateHandler#postProcessing(org.eclipse.emf.ecore.EObject, java.lang.String, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IStatus postProcessing(EObject sourceElement, String commandId, IProgressMonitor monitor) throws Exception {
		MultiStatus status = new MultiStatus(Activator.PLUGIN_ID, 0, "Post processing for component diagram translation", null); 
		
		status.merge(super.postProcessing(sourceElement, commandId, monitor));
		TranslatorFactory factory = TranslatorFactory.getFactory();
		if (sourceElement instanceof EventBElement){
			EList<EObject> statemachines = ((EventBElement)sourceElement).getAllContained(StatemachinesPackage.Literals.STATEMACHINE, true);
			for (EObject sm : statemachines){
				if (sm==null) continue;	//ignore initial null;
				String smname = ((Statemachine)sm).getName();				
				if (sm.eContainer() instanceof Component
						&& factory.canTranslate(DiagramsGeneratorIdentifiers.COMMAND_ID, sm.eClass())){

					SubMonitor submonitor = SubMonitor.convert(monitor, "Translating Statemachine "+smname, 2);
					submonitor.setTaskName("Validating Statemachine : "+smname);
					IStatus validationStatus = (validate((EventBElement) sm, submonitor.newChild(1)));
					if (validationStatus.isOK()){
						submonitor.setTaskName("Translating Statemachine "+smname);
						status.merge(
								factory.translate(getEditingDomain(), sm, DiagramsGeneratorIdentifiers.COMMAND_ID, submonitor.newChild(2))
								);
					}else{
						status.merge(validationStatus);
					}
					submonitor.worked(2);
				}
			}
		}
		return status;
	}
	
	/**
	 * validation of a particular diagram.
	 * called before translation
	 * 
	 * @param sourceElement
	 * @param monitor
	 * @return
	 * @throws ExecutionException
	 */
	protected IStatus validate(EventBElement sourceElement, IProgressMonitor monitor) throws ExecutionException {
		IStatus status;
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(sourceElement);
		if (diagnostic.getSeverity() == Diagnostic.ERROR || diagnostic.getSeverity() == Diagnostic.WARNING){
		// didn't validate so show feedback
			String errors = diagnostic.getMessage()+"\n";
		    for (Diagnostic ch : diagnostic.getChildren()){
		    	errors = errors+ch.getMessage()+"\n";
		    }
		    status = new Status(IStatus.INFO, Activator.PLUGIN_ID, ValidationFailedMessage+errors );
		}else{
		    status = Status.OK_STATUS;
		}
		monitor.done();
		return status;
	}

final static String ValidationFailedMessage = "Translation cancelled because validation failed with the following errors : \n";


}
