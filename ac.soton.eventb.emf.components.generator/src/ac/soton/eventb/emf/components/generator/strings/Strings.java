/**
 * (c) Crown owned copyright (2015) (UK Ministry of Defence)
 * This work is licensed under a Creative Commons Attribution-NonCommercial-ShareAlike 4.0
 * International License
 *  
 * This is to identify the UK Ministry of Defence as owners along with the license rights provided. The
 * URL of the CC BY NC SA 4.0 International License is 
 * http://creativecommons.org/licenses/by-nc-sa/4.0/legalcode (Accessed 02-NOV-15).
 * 
 * Contributors:
 * 	University of Southampton - Initial implementation
 *  
*/
package ac.soton.eventb.emf.components.generator.strings;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.eventb.emf.components.AbstractComponentOperation;
import ac.soton.eventb.emf.components.Component;
import ac.soton.eventb.emf.components.ComponentAxiom;
import ac.soton.eventb.emf.components.ComponentConstant;
import ac.soton.eventb.emf.components.ComponentInitialisation;
import ac.soton.eventb.emf.components.ComponentInvariant;
import ac.soton.eventb.emf.components.ComponentSet;
import ac.soton.eventb.emf.components.ComponentVariable;
import ac.soton.eventb.emf.components.ComponentsPackage;
import ac.soton.eventb.emf.components.Connector;
import ac.soton.eventb.emf.components.DataPacket;
import ac.soton.eventb.emf.components.DelayedDataPacket;
import ac.soton.eventb.emf.components.Method;
import ac.soton.eventb.emf.components.OperationAction;
import ac.soton.eventb.emf.components.OperationGuard;
import ac.soton.eventb.emf.components.OperationWitness;
import ac.soton.eventb.emf.components.OutPort;
import ac.soton.eventb.emf.components.PortWake;
import ac.soton.eventb.emf.components.SelfWake;
import ac.soton.eventb.emf.components.WakeEvent;
import ac.soton.eventb.emf.components.WakeQueue;
import ac.soton.eventb.emf.components.util.ComponentsUtils;
import ac.soton.eventb.emf.core.extension.coreextension.TypedParameter;
import ac.soton.eventb.statemachines.Statemachine;


public final class Strings {

	private static final String BUNDLE_NAME = "ac.soton.eventb.emf.components.generator.strings.Strings"; //$NON-NLS-1$

 //////////////context////////////

/**
 * properties for creating the context for a component
 **/
 public static String CTXT_NAME;
 public static String CTXT_NAME(Component cp) {
	 String mname = ((Machine) cp.getContaining(MachinePackage.Literals.MACHINE)).getName();
	 return bind(CTXT_NAME, rootComponentPrefix(cp), mname);
 }
 
 /**
  * properties for creating the wake kinds enumeration
  */
 public static String WK_NAME;
 public static String WK_NAME(Component cp) {
 	return bind(WK_NAME,rootComponentPrefix(cp));
 }
 
 public static String WK_NULLEVENT_NAME;
 public static String WK_NULLEVENT_NAME(Component cp) {
 	return bind(WK_NULLEVENT_NAME,rootComponentPrefix(cp));
 }

 public static String WK_ADDEVENT_NAME;
 public static String WK_ADDEVENT_NAME(Component cp) {
 	return bind(WK_ADDEVENT_NAME,rootComponentPrefix(cp));
 }
 
 public static String WK_ENUM_NAME;
 public static String  WK_ENUM_NAME(Component cp) {
 	return bind( WK_ENUM_NAME,rootComponentPrefix(cp));
 }
 
 public static String WK_ENUM_PRED;
 public static String  WK_ENUM_PRED(Component cp) {
 	return bind(WK_ENUM_PRED,WK_NAME(cp),getCSLwakeKinds(cp));
 }
	 
 private static String getCSLwakeKinds(Component cp) {
		return ",{"+WK_NULLEVENT_NAME(cp)+"},{"+WK_ADDEVENT_NAME(cp)+"}";
	}

// DEFINE CONNECTOR TYPES MANUALLY
// /**
//  * properties for creating a connector data type
//  */
// public static String CN_TYPESET_NAME;
// public static String CN_TYPESET_NAME(String setName) {
// 	return bind(CN_TYPESET_NAME,setName);
// }
 
 //////////////machine////////////
/**
  * properties for creating the current time variable
  **/
  public static String CT_NAME;
  public static String CT_NAME(Component cp) {
 		return  bind(CT_NAME,rootComponentPrefix(cp));
 	}
	  
 public static String CT_TYPE_NAME;
 public static String CT_TYPE_NAME(Component cp){
		return bind(CT_TYPE_NAME,CT_NAME(cp));
	}

 public static String CT_TYPE_PRED;
 public static String CT_TYPE_PRED(Component cp){
		return bind(CT_TYPE_PRED,CT_NAME(cp));
	}
 public static String CT_INIT_NAME;
 public static String CT_INIT_NAME(Component cp){
		return bind(CT_INIT_NAME,CT_NAME(cp));
	}
 public static String CT_INIT_EXPR;
 public static String CT_INIT_EXPR(Component cp){
	return bind(CT_INIT_EXPR,CT_NAME(cp));
 	}
	
 /**
  * properties for creating the Timer clock event
  **/
 public static String TE_NAME;
 public static String TE_NAME(Component cp) {
		return  bind(TE_NAME,rootComponentPrefix(cp));
	}
 
 public static String TE_PW_DONE_GUARD_NAME;
 public static String TE_PW_DONE_GUARD_NAME(PortWake pw){
 	return bind(TE_PW_DONE_GUARD_NAME,makeValidIdentifier(pw.getLabel()));
 }
 public static String TE_PW_DONE_GUARD_PRED;
 public static String TE_PW_DONE_GUARD_PRED(PortWake pw){
 	return bind(TE_PW_DONE_GUARD_PRED,OS_NAME(pw),CT_NAME((Component)ComponentsUtils.getRootComponent(pw)), getPortWakeConnectorTimes(pw));
 }
 
 public static String TE_SW_DONE_GUARD_NAME;
 public static String TE_SW_DONE_GUARD_NAME(SelfWake sw){
 	return bind(TE_SW_DONE_GUARD_NAME, sw.getQueue().getName()); //WAS:- makeValidIdentifier(sw.getLabel()));
 }
 public static String TE_SW_DONE_GUARD_PRED;
 public static String TE_SW_DONE_GUARD_PRED(SelfWake sw){
 	return bind(TE_SW_DONE_GUARD_PRED,CT_NAME((Component)ComponentsUtils.getRootComponent(sw)),WU_MAX_NAME(sw.getQueue()),OS_NAME(sw));
 }
 
 public static String TE_MD_DONE_GUARD_NAME;
 public static String TE_MD_DONE_GUARD_NAME(Method md){
 	return bind(TE_MD_DONE_GUARD_NAME,makeValidIdentifier(md.getLabel()));
 }
 public static String TE_MD_DONE_GUARD_PRED;
 public static String TE_MD_DONE_GUARD_PRED(Method md){
 	return bind(TE_MD_DONE_GUARD_PRED,OS_NAME(md));
 }

 public static String  TE_INC_TIME_NAME;
 public static String TE_INC_TIME_NAME(Component cp) {
		return  TE_INC_TIME_NAME;
	}
 public static String  TE_INC_TIME_EXPR;
 public static String TE_INC_TIME_EXPR(Component cp) {
		return  bind(TE_INC_TIME_EXPR,CT_NAME(cp));
	}
	
 /**
  * properties for creating the connector variables
  */
 public static String CN_NAME;
 public static String CN_NAME(Connector cp) {
	 if (cp==null) return "<null connector>";
		return  bind(CN_NAME,cp.getName());
	}
 public static String CN_TYPE_NAME;
 public static String CN_TYPE_NAME(Connector cp){
		return bind(CN_TYPE_NAME,CN_NAME(cp));
	}
 public static String CN_TYPE_PRED;
 public static String CN_TYPE_PRED(Connector cp){
		return bind(CN_TYPE_PRED,CN_NAME(cp),cp.getType());
	}
 public static String CN_INIT_NAME;
 public static String CN_INIT_NAME(Connector cp){
		return bind(CN_INIT_NAME,CN_NAME(cp));
	}
 public static String CN_INIT_EXPR;
 public static String CN_INIT_EXPR(Connector cp){
		return bind(CN_INIT_EXPR,CN_NAME(cp), cp.getInitialValue());
	}
 public static String CN_HELPER_NAME;
 public static String CN_HELPER_NAME(Connector cp){
		return bind(CN_HELPER_NAME,CN_NAME(cp));
	}
 public static String CN_HELPER_PRED;
 public static String CN_HELPER_PRED(Connector cp){
		return bind(CN_HELPER_PRED,CN_NAME(cp));
	} 
 
 /**
  * properties for creating the disconnected OutPort variables
  */
 public static String OP_NAME;
 public static String OP_NAME(OutPort op) {
	 if (op==null) return "<null port>";
		return  bind(OP_NAME,op.getName());
	}
 public static String OP_TYPE_NAME;
 public static String OP_TYPE_NAME(OutPort op){
		return bind(OP_TYPE_NAME,OP_NAME(op));
	}
 public static String OP_TYPE_PRED;
 public static String OP_TYPE_PRED(OutPort op){
		return bind(OP_TYPE_PRED,OP_NAME(op),op.getType());
	}
 public static String OP_INIT_NAME;
 public static String OP_INIT_NAME(OutPort op){
		return bind(OP_INIT_NAME,OP_NAME(op));
	}
 public static String OP_INIT_EXPR;
 public static String OP_INIT_EXPR(OutPort op){
		return bind(OP_INIT_EXPR,OP_NAME(op), op.getType());
	}
// public static String OP_HELPER_NAME;
// public static String OP_HELPER_NAME(Connector cp){
//		return bind(OP_HELPER_NAME,OP_NAME(cp));
//	}
// public static String OP_HELPER_PRED;
// public static String OP_HELPER_PRED(Connector cp){
//		return bind(OP_HELPER_PRED,OP_NAME(cp));
//	} 
 
 /**
  * properties for sending on a connector
  */
 public static String CN_SEND_ACTION_NAME;
 public static String CN_SEND_ACTION_NAME(DelayedDataPacket dp){
 	return bind(CN_SEND_ACTION_NAME,dp.getName());
 }
 public static String CN_SEND_ACTION_EXPR;
 public static String CN_SEND_ACTION_EXPR(DelayedDataPacket dp){
 	return bind(CN_SEND_ACTION_EXPR,CN_NAME(dp.getConnector()),CT_NAME((Component)ComponentsUtils.getRootComponent(dp)),dp.getDelay(),dp.getValue());
 }
 
 /**
  * properties for sending on a disconnected port
  */
 public static String CN_DSEND_ACTION_NAME;
 public static String CN_DSEND_ACTION_NAME(String portName){
 	return bind(CN_DSEND_ACTION_NAME, portName);
 }
 public static String CN_DSEND_ACTION_EXPR;
 public static String CN_DSEND_ACTION_EXPR(String portName, String value){
 	return bind(CN_DSEND_ACTION_EXPR, portName, value);
 }

 /**
  * properties for receiving on a connector
  */
 public static String CN_RECV_GUARD_NAME;
 public static String CN_RECV_GUARD_NAME(DataPacket dp){
 	return bind(CN_RECV_GUARD_NAME,dp.getName());
 }
 public static String CN_RECV_GUARD_PRED;
 public static String CN_RECV_GUARD_PRED(DataPacket dp){
 	return bind(CN_RECV_GUARD_PRED,CN_NAME(dp.getConnector()),CT_NAME((Component)ComponentsUtils.getRootComponent(dp)),dp.getValue());
 }

 public static String CN_NEWV_GUARD_NAME;
 public static String CN_NEWV_GUARD_NAME(){
 	return CN_NEWV_GUARD_NAME;
 }
 public static String CN_NEWV_GUARD_PRED;
 public static String CN_NEWV_GUARD_PRED(PortWake pw){
	return bind(CN_NEWV_GUARD_PRED,CT_NAME((Component)ComponentsUtils.getRootComponent(pw)),getPortWakeConnectorTimes(pw));
 }
 
/**
 * properties for receiving on a disconnected port
 *
 */
 public static String CN_DRECV_GUARD_NAME;
 public static String CN_DRECV_GUARD_NAME(String portName){
 	return bind(CN_DRECV_GUARD_NAME,portName);
 }
 public static String CN_DRECV_GUARD_PRED;
 public static String CN_DRECV_GUARD_PRED(String portName, String value){
 	return bind(CN_DRECV_GUARD_PRED,portName,value);
 }
 
 
 
/**
 * properties for creating the component wake up queue variables
 */
public static String WU_NAME;
public static String WU_NAME(WakeQueue wq) {
	return bind(WU_NAME,wq.getName());
}
public static String WU_TYPE_NAME;
public static String WU_TYPE_NAME(WakeQueue wq){
	return bind(WU_TYPE_NAME,WU_NAME(wq));
}
public static String WU_TYPE_PRED;
public static String WU_TYPE_PRED(WakeQueue wq){
	return bind(WU_TYPE_PRED,WU_NAME(wq));
}
public static String WU_INIT_NAME;
public static String WU_INIT_NAME(WakeQueue wq){
	return bind(WU_INIT_NAME,WU_NAME(wq));
}
public static String WU_INIT_EXPR;
public static String WU_INIT_EXPR(WakeQueue wq){
	return bind(WU_INIT_EXPR,WU_NAME(wq));
}
 // max
public static String WU_MAX_NAME;
public static String WU_MAX_NAME(WakeQueue wq) {
	return bind(WU_MAX_NAME,wq.getName());
}
//public static String WU_MAX_TYPE_NAME;
public static String WU_MAX_TYPE_NAME(WakeQueue wq){
	return bind(WU_TYPE_NAME,WU_MAX_NAME(wq));
}
public static String WU_MAX_TYPE_PRED;
public static String WU_MAX_TYPE_PRED(WakeQueue wq){
	return bind(WU_MAX_TYPE_PRED,WU_MAX_NAME(wq));
}
//public static String WU_MAX_INIT_NAME;
public static String WU_MAX_INIT_NAME(WakeQueue wq){
	return bind(WU_INIT_NAME,WU_MAX_NAME(wq));
}
public static String WU_MAX_INIT_EXPR;
public static String WU_MAX_INIT_EXPR(WakeQueue wq){
	return bind(WU_MAX_INIT_EXPR,WU_MAX_NAME(wq));
}

/**
 * properties for setting a wake up event (min and max)
 */
public static String WU_SET_ACTION_NAME;
public static String WU_MIN_SET_ACTION_NAME(WakeEvent we){
	return bind(WU_SET_ACTION_NAME,we.getName(),we.getQueue().getName(),"min");
}
public static String WU_SET_ACTION_EXPR;
public static String WU_MIN_SET_ACTION_EXPR(WakeEvent we){
	return bind(WU_SET_ACTION_EXPR,
			WU_NAME(we.getQueue()),
			CT_NAME((Component)ComponentsUtils.getRootComponent(we)),
			we.getDelay_min(),we.getWakeKind());
}	
public static String WU_MAX_SET_ACTION_NAME(WakeEvent we){
	return bind(WU_SET_ACTION_NAME,we.getName(),we.getQueue().getName(),"max");
}
public static String WU_MAX_SET_ACTION_EXPR(WakeEvent we){
	return bind(WU_SET_ACTION_EXPR,
			WU_MAX_NAME(we.getQueue()),
			CT_NAME((Component)ComponentsUtils.getRootComponent(we)),
			we.getDelay_max(),CT_NAME((Component)ComponentsUtils.getRootComponent(we))+"+"+we.getDelay_min());
}	

/**
 * properties for creating the operation synchronisation variables
 */
public static String OS_NAME;
public static String OS_NAME(AbstractComponentOperation op) {
	return bind(OS_NAME,makeValidIdentifier(getOSNameFromOp(op)));
}

private static String getOSNameFromOp(AbstractComponentOperation op) {
	if (op instanceof PortWake){
		PortWake pw = (PortWake)op;
		String osname = ((Component)op.getContaining(ComponentsPackage.Literals.COMPONENT)).getName()+"_PORTWAKE";
		for (DataPacket dp : pw.getReceives()){
			if (dp.getConnector()!=null){
				osname = osname +"_"+ dp.getConnector().getName();
			}
		}
		return osname;
	}else if (op instanceof SelfWake){
		return ((Component)op.getContaining(ComponentsPackage.Literals.COMPONENT)).getName()+"_SELFWAKE_"+
				((SelfWake)op).getQueue().getName();
	}else{
		return op.getLabel();
	}
}
/**
 * This creates a PortWake OSName from a list of connectors
 * This is provided so that applications can construct the correct sync flag name without
 * having the corresponding PortWake operation in order to check 
 * whether one has been generated.
 * @param op
 * @return
 */
public static String OS_NAME(Component cp, List<Connector> p) {
	return bind(OS_NAME,makeValidIdentifier(getPWNameFromConnectorList(cp,p)));
}
private static String getPWNameFromConnectorList(Component cp, List<Connector> p) {
	String osname = cp.getName()+"_PORTWAKE";
	for (Connector cn : p){
		osname = osname +"_"+ cn.getName();
	}
	return osname;
}

public static String OS_TYPE_NAME;
public static String OS_TYPE_NAME(AbstractComponentOperation op){
	return bind(OS_TYPE_NAME,OS_NAME(op));
}
public static String OS_TYPE_PRED;
public static String OS_TYPE_PRED(AbstractComponentOperation op){
	return bind(OS_TYPE_PRED,OS_NAME(op));
}
public static String OS_TYPE_PRED_SELFWAKE;
public static String OS_TYPE_PRED_SELFWAKE(AbstractComponentOperation op,WakeQueue wq){
	return bind(OS_TYPE_PRED_SELFWAKE,OS_NAME(op),WU_NAME(wq));
}

public static String OS_GUARD_NAME;
public static String OS_GUARD_NAME(AbstractComponentOperation op){
	return bind(OS_GUARD_NAME,OS_NAME(op));
}
public static String OS_FALSE_PRED;
public static String OS_FALSE_PRED(AbstractComponentOperation op){
	return bind(OS_FALSE_PRED,OS_NAME(op));
}
public static String OS_TRUE_PRED;
public static String OS_TRUE_PRED(AbstractComponentOperation op){
	return bind(OS_TRUE_PRED,OS_NAME(op));
}
public static String OS_ACTION_NAME;
public static String OS_ACTION_NAME(AbstractComponentOperation op){
	return bind(OS_ACTION_NAME,OS_NAME(op));
}
public static String OS_FALSE_EXPR;
public static String OS_FALSE_EXPR(AbstractComponentOperation op){
	return bind(OS_FALSE_EXPR,OS_NAME(op));
}
public static String OS_TRUE_EXPR;
public static String OS_TRUE_EXPR(AbstractComponentOperation op){
	return bind(OS_TRUE_EXPR,OS_NAME(op));
}
public static String OS_EMPTY_EXPR;
public static String OS_EMPTY_EXPR(AbstractComponentOperation op){
	return bind(OS_EMPTY_EXPR,OS_NAME(op));
}
public static String OS_REFREL_NAME;
public static String OS_REFREL_NAME(AbstractComponentOperation op) {
	return bind(OS_REFREL_NAME,OS_NAME(op));
}
public static String OS_REFREL_PRED;
public static String OS_REFREL_PRED(AbstractComponentOperation op,
		AbstractComponentOperation refinedOp) {
	return bind(OS_REFREL_PRED, OS_NAME(op), OS_NAME(refinedOp));
}

public static String SW_NOTDONE_PRED;
public static String SW_NOTDONE_PRED(AbstractComponentOperation op, WakeQueue wq){
	return bind(SW_NOTDONE_PRED,OS_NAME(op),WU_NAME(wq));
}
public static String SW_DONE_EXPR;
public static String SW_DONE_EXPR(AbstractComponentOperation op, WakeQueue wq){
	return bind(SW_DONE_EXPR,OS_NAME(op), WU_NAME(wq));
}
/**
 * Parameters
 */
public static String OP_PARAMETER_NAME;
public static String OP_PARAMETER_NAME(TypedParameter tp){
	return bind(OP_PARAMETER_NAME,tp.getName());
}
public static String OP_PARAMETER_TYPE_GUARD_NAME;
public static String OP_PARAMETER_TYPE_GUARD_NAME(TypedParameter tp){
	return bind(OP_PARAMETER_TYPE_GUARD_NAME,OP_PARAMETER_NAME(tp));
}
public static String OP_PARAMETER_TYPE_GUARD_PRED;
public static String OP_PARAMETER_TYPE_GUARD_PRED(TypedParameter tp){
	return bind(OP_PARAMETER_TYPE_GUARD_PRED,OP_PARAMETER_NAME(tp),tp.getType());
}


/**
 * properties for creating the selfWake guard
 */
public static String SW_GUARD_NAME;
public static String SW_GUARD_NAME(SelfWake sw){
	return bind(SW_GUARD_NAME,sw.getQueue().getName());
}

public static String SW_GUARD_PRED;
public static String SW_GUARD_PRED(SelfWake sw){
	return bind(SW_GUARD_PRED,CT_NAME((Component)ComponentsUtils.getRootComponent(sw)),WU_NAME(sw.getQueue()));
}



/**
 * USER defined Sets, Constants, Axioms, Variables Initialisations and invariants in components
 */
public static String USER_SET_NAME;
public static String USER_SET_NAME(ComponentSet s){
	return bind(USER_SET_NAME,s.getName());
}

public static String USER_CONSTANT_NAME;
public static String USER_CONSTANT_NAME(ComponentConstant c){
	return bind(USER_CONSTANT_NAME,c.getName());
}

public static String USER_AXIOM_NAME;
public static String USER_AXIOM_NAME(ComponentAxiom a){
	return bind(USER_AXIOM_NAME,a.getName());
}
public static String USER_AXIOM_PRED;
public static String USER_AXIOM_PRED(ComponentAxiom a){
	return bind(USER_AXIOM_PRED,a.getPredicate());
}

public static String USER_VARIABLE_NAME;
public static String USER_VARIABLE_NAME(ComponentVariable v){
	return bind(USER_VARIABLE_NAME,v.getName());
}

public static String USER_INVARIANT_NAME;
public static String USER_INVARIANT_NAME(ComponentInvariant i){
	return bind(USER_INVARIANT_NAME,i.getName());
}
public static String USER_INVARIANT_PRED;
public static String USER_INVARIANT_PRED(ComponentInvariant i){
	return bind(USER_INVARIANT_PRED,i.getPredicate());
}

public static String USER_INITIALISATION_NAME;
public static String USER_INITIALISATION_NAME(ComponentInitialisation i){
	return bind(USER_INITIALISATION_NAME,i.getName());
}
public static String USER_INITIALISATION_EXPR;
public static String USER_INITIALISATION_EXPR(ComponentInitialisation i){
	return bind(USER_INITIALISATION_EXPR,i.getAction());
}


/**
 * USER defined Witnesses in operations
 */
public static String USER_WITNESS_NAME;
public static String USER_WITNESS_NAME(OperationWitness w){
	return bind(USER_WITNESS_NAME,w.getName());
}
public static String USER_WITNESS_PRED;
public static String USER_WITNESS_PRED(OperationWitness w){
	return bind(USER_WITNESS_PRED,w.getPredicate());
}

/**
 * USER defined Guards in operations
 */
public static String USER_GUARD_NAME;
public static String USER_GUARD_NAME(OperationGuard g){
	return bind(USER_GUARD_NAME,g.getName());
}
public static String USER_GUARD_PRED;
public static String USER_GUARD_PRED(OperationGuard g){
	return bind(USER_GUARD_PRED,g.getPredicate());
}

/**
 * USER defined Actions in operations
 */
public static String USER_ACTION_NAME;
public static String USER_ACTION_NAME(OperationAction a){
	return bind(USER_ACTION_NAME,a.getName());
}
public static String USER_ACTION_EXPR;
public static String USER_ACTION_EXPR(OperationAction a){
	return bind(USER_ACTION_EXPR,a.getAction());
}


/**
 * properties for creating the state machine enabler variables
 */
public static String ENBLSM_NAME;
public static String ENBLSM_NAME(Statemachine sm) {
	return bind(ENBLSM_NAME,sm.getName());
}
public static String ENBLSM_TYPE_NAME;
public static String ENBLSM_TYPE_NAME(Statemachine sm){
	return bind(ENBLSM_TYPE_NAME,ENBLSM_NAME(sm));
}
public static String ENBLSM_TYPE_PRED;
public static String ENBLSM_TYPE_PRED(Statemachine sm){
	return bind(ENBLSM_TYPE_PRED,ENBLSM_NAME(sm));
}
public static String ENBLSM_GUARD_NAME;
public static String ENBLSM_GUARD_NAME(Statemachine sm){
	return bind(ENBLSM_GUARD_NAME,ENBLSM_NAME(sm));
}
public static String ENBLSM_FALSE_PRED;
public static String ENBLSM_FALSE_PRED(Statemachine sm){
	return bind(ENBLSM_FALSE_PRED,ENBLSM_NAME(sm));
}
public static String ENBLSM_TRUE_PRED;
public static String ENBLSM_TRUE_PRED(Statemachine sm){
	return bind(ENBLSM_TRUE_PRED,ENBLSM_NAME(sm));
}
public static String ENBLSM_ACTION_NAME;
public static String ENBLSM_ACTION_NAME(Statemachine sm){
	return bind(ENBLSM_ACTION_NAME,ENBLSM_NAME(sm));
}
public static String ENBLSM_FALSE_EXPR;
public static String ENBLSM_FALSE_EXPR(Statemachine sm){
	return bind(ENBLSM_FALSE_EXPR,ENBLSM_NAME(sm));
}
public static String ENBLSM_TRUE_EXPR;
public static String ENBLSM_TRUE_EXPR(Statemachine sm){
	return bind(ENBLSM_TRUE_EXPR,ENBLSM_NAME(sm));
}

/**
 * properties for creating the state machine synchronisation variables
 */
public static String SYNCSM_NAME;
public static String SYNCSM_NAME(Statemachine sm) {
	return bind(SYNCSM_NAME,sm.getName());
}
public static String SYNCSM_TYPE_NAME;
public static String SYNCSM_TYPE_NAME(Statemachine sm){
	return bind(SYNCSM_TYPE_NAME,SYNCSM_NAME(sm));
}
public static String SYNCSM_TYPE_PRED;
public static String SYNCSM_TYPE_PRED(Statemachine sm){
	return bind(SYNCSM_TYPE_PRED,SYNCSM_NAME(sm));
}
public static String SYNCSM_GUARD_NAME;
public static String SYNCSM_GUARD_NAME(Statemachine sm){
	return bind(SYNCSM_GUARD_NAME,SYNCSM_NAME(sm));
}
public static String SYNCSM_FALSE_PRED;
public static String SYNCSM_FALSE_PRED(Statemachine sm){
	return bind(SYNCSM_FALSE_PRED,SYNCSM_NAME(sm));
}
public static String SYNCSM_TRUE_PRED;
public static String SYNCSM_TRUE_PRED(Statemachine sm){
	return bind(SYNCSM_TRUE_PRED,SYNCSM_NAME(sm));
}
public static String SYNCSM_ACTION_NAME;
public static String SYNCSM_ACTION_NAME(Statemachine sm){
	return bind(SYNCSM_ACTION_NAME,SYNCSM_NAME(sm));
}
public static String SYNCSM_FALSE_EXPR;
public static String SYNCSM_FALSE_EXPR(Statemachine sm){
	return bind(SYNCSM_FALSE_EXPR,SYNCSM_NAME(sm));
}
public static String SYNCSM_TRUE_EXPR;
public static String SYNCSM_TRUE_EXPR(Statemachine sm){
	return bind(SYNCSM_TRUE_EXPR,SYNCSM_NAME(sm));
}

// special guard enable => synchronisation
public static String TIMER_SYNCHSM_GUARD_NAME;
public static String TIMER_SYNCHSM_GUARD_NAME(Statemachine sm){
	return bind(TIMER_SYNCHSM_GUARD_NAME,sm.getName());
}
public static String TIMER_SYNCHSM_GUARD_PRED;
public static String TIMER_SYNCHSM_GUARD_PRED(Statemachine sm){
	return bind(TIMER_SYNCHSM_GUARD_PRED,ENBLSM_TRUE_PRED(sm),SYNCSM_TRUE_PRED(sm));
}

////////////////////////////////////////////////////////////
// ADMIN and HELPER methods
///////////////////////////////////////////////////////////
	static {
		NLS.initializeMessages(BUNDLE_NAME, Strings.class);
	}

	/**
	 * Bind the given message's substitution locations with the given string
	 * values.
	 * 
	 * @param message
	 *            the message to be manipulated
	 * @param bindings
	 *            An array of objects to be inserted into the message
	 * @return the manipulated String
	 */
	private static String bind(String message, Object... bindings) {
		if (message == null){
			return "NULL STRING!!!";
		}
		return MessageFormat.format(message, bindings);
	}
	
	/**
	 * Returns the given components name if it is on of several root components in a machine
	 * otherwise returns an empty string
	 * 
	 * @param cp
	 * @return
	 */
	private static String rootComponentPrefix(Component cp){
		for (EObject el : cp.eContainer().eContents()){
			if (el instanceof Component && el != cp){
				return cp.getName();
			}
		}
		return "";
	}

	private static String makeValidIdentifier(String in){
		return in.replaceAll(", ", "_");
	}
	
	private static String getPortWakeConnectorTimes(PortWake pw) {
		String included = "";
		List<Connector> conn = new ArrayList<Connector>(((Component)pw.getContaining(ComponentsPackage.Literals.COMPONENT)).getInConnectors());
		for (DataPacket dp : pw.getReceives()){
			if (dp.getConnector()!=null){
				if (included.equals(""))	{
					included = "dom("+CN_NAME(dp.getConnector())+")";
				}else{
					included = included+" \u2229 dom("+CN_NAME(dp.getConnector())+")";
				}
				conn.remove(dp.getConnector());
			}
		}
		String excluded = "";
// CODA meeting 15/05/2012 decided not to generate guards that exclude other connectors having a new value
//		for (Connector cn : conn){
//			if (excluded.equals(""))	{
//				excluded = "  \u2216  dom("+CN_NAME(cn)+")";
//			}else{
//				excluded = excluded+" \u222a dom("+CN_NAME(cn)+")";
//			}	
//		}
		return included + excluded;
	}

	private Strings() {
		// Do not instantiate
	}


	
}
