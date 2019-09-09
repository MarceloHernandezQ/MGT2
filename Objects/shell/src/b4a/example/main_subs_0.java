package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,40);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 43;BA.debugLine="Activity.LoadLayout(\"inicio\")";
Debug.ShouldStop(1024);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("inicio")),main.mostCurrent.activityBA);
 BA.debugLineNum = 44;BA.debugLine="ProgressDialogShow(\"Cargando Datos...\")";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Cargando Datos..."))));
 BA.debugLineNum = 45;BA.debugLine="Cargar_buses";
Debug.ShouldStop(4096);
_cargar_buses();
 BA.debugLineNum = 46;BA.debugLine="Cargar_auxiliar";
Debug.ShouldStop(8192);
_cargar_auxiliar();
 BA.debugLineNum = 47;BA.debugLine="Cargar_rutas";
Debug.ShouldStop(16384);
_cargar_rutas();
 BA.debugLineNum = 48;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,55);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 55;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,51);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 51;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,161);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button1_click");}
 BA.debugLineNum = 161;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="StartActivity(Venta)";
Debug.ShouldStop(2);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._venta.getObject())));
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargar_auxiliar() throws Exception{
try {
		Debug.PushSubsStack("Cargar_auxiliar (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,97);
if (RapidSub.canDelegate("cargar_auxiliar")) { return b4a.example.main.remoteMe.runUserSub(false, "main","cargar_auxiliar");}
ResumableSub_Cargar_auxiliar rsub = new ResumableSub_Cargar_auxiliar(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Cargar_auxiliar extends BA.ResumableSub {
public ResumableSub_Cargar_auxiliar(b4a.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Cargar_auxiliar (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,97);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 100;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(8);
_j = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 101;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(16);
_j.runVoidMethod ("_initialize",main.processBA,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 102;BA.debugLine="j.Download2(\"http://192.168.1.83/Agt2/get_auxilia";
Debug.ShouldStop(32);
_j.runVoidMethod ("_download2",(Object)(BA.ObjectToString("http://192.168.1.83/Agt2/get_auxiliar.aspx")),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("bd"),RemoteObject.createImmutable("gt2")})));
 BA.debugLineNum = 103;BA.debugLine="wait for (j) jobdone(j As HttpJob)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "cargar_auxiliar"), (_j));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 105;BA.debugLine="If j.Success Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 4;
if (_j.getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 106;BA.debugLine="Laux.Initialize";
Debug.ShouldStop(512);
parent.mostCurrent._laux.runVoidMethod ("Initialize");
 BA.debugLineNum = 107;BA.debugLine="funciones.list_to_sp2(funciones.JobGetRows(j),\"c";
Debug.ShouldStop(1024);
parent.mostCurrent._funciones.runVoidMethod ("_list_to_sp2" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._funciones.runMethod(false,"_jobgetrows" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_j))),(Object)(BA.ObjectToString("codigo")),(Object)(BA.ObjectToString("nombre")),(Object)(parent.mostCurrent._spaux),(Object)(parent.mostCurrent._laux));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 111;BA.debugLine="j.Release";
Debug.ShouldStop(16384);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 112;BA.debugLine="Return True";
Debug.ShouldStop(32768);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject _j) throws Exception{
}
public static RemoteObject  _cargar_buses() throws Exception{
try {
		Debug.PushSubsStack("Cargar_buses (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,76);
if (RapidSub.canDelegate("cargar_buses")) { return b4a.example.main.remoteMe.runUserSub(false, "main","cargar_buses");}
ResumableSub_Cargar_buses rsub = new ResumableSub_Cargar_buses(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Cargar_buses extends BA.ResumableSub {
public ResumableSub_Cargar_buses(b4a.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Cargar_buses (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,76);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 79;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(16384);
_j = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 81;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(65536);
_j.runVoidMethod ("_initialize",main.processBA,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 83;BA.debugLine="j.Download2(\"http://192.168.1.83/Agt2/get_buses.a";
Debug.ShouldStop(262144);
_j.runVoidMethod ("_download2",(Object)(BA.ObjectToString("http://192.168.1.83/Agt2/get_buses.aspx")),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("bd"),RemoteObject.createImmutable("gt2")})));
 BA.debugLineNum = 84;BA.debugLine="wait for (j) jobdone(j As HttpJob)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "cargar_buses"), (_j));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 86;BA.debugLine="If j.Success Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 4;
if (_j.getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 88;BA.debugLine="funciones.list_to_sp(funciones.JobGetRows(j),\"co";
Debug.ShouldStop(8388608);
parent.mostCurrent._funciones.runVoidMethod ("_list_to_sp" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._funciones.runMethod(false,"_jobgetrows" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_j))),(Object)(BA.ObjectToString("codigo")),(Object)(parent.mostCurrent._spbus));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 93;BA.debugLine="Return True";
Debug.ShouldStop(268435456);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _cargar_rutas() throws Exception{
try {
		Debug.PushSubsStack("Cargar_rutas (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,116);
if (RapidSub.canDelegate("cargar_rutas")) { return b4a.example.main.remoteMe.runUserSub(false, "main","cargar_rutas");}
ResumableSub_Cargar_rutas rsub = new ResumableSub_Cargar_rutas(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Cargar_rutas extends BA.ResumableSub {
public ResumableSub_Cargar_rutas(b4a.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Cargar_rutas (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,116);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 119;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(4194304);
_j = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 120;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(8388608);
_j.runVoidMethod ("_initialize",main.processBA,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 121;BA.debugLine="j.Download2(\"http://192.168.1.83/Agt2/get_salidas";
Debug.ShouldStop(16777216);
_j.runVoidMethod ("_download2",(Object)(BA.ObjectToString("http://192.168.1.83/Agt2/get_salidas.aspx")),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("bd"),RemoteObject.createImmutable("gt2")})));
 BA.debugLineNum = 122;BA.debugLine="wait for (j) jobdone(j As HttpJob)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "cargar_rutas"), (_j));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 124;BA.debugLine="If j.Success Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 4;
if (_j.getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 125;BA.debugLine="Lruta.Initialize";
Debug.ShouldStop(268435456);
parent.mostCurrent._lruta.runVoidMethod ("Initialize");
 BA.debugLineNum = 126;BA.debugLine="funciones.list_to_sp2(funciones.JobGetRows(j),\"c";
Debug.ShouldStop(536870912);
parent.mostCurrent._funciones.runVoidMethod ("_list_to_sp2" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(parent.mostCurrent._funciones.runMethod(false,"_jobgetrows" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_j))),(Object)(BA.ObjectToString("codigo")),(Object)(BA.ObjectToString("nombre")),(Object)(parent.mostCurrent._spruta),(Object)(parent.mostCurrent._lruta));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 128;BA.debugLine="j.Release";
Debug.ShouldStop(-2147483648);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 129;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 30;BA.debugLine="Private spBus As Spinner";
main.mostCurrent._spbus = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private spAux As Spinner";
main.mostCurrent._spaux = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private Lruta As List";
main.mostCurrent._lruta = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 34;BA.debugLine="Private Laux As List";
main.mostCurrent._laux = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 36;BA.debugLine="Private spRuta As Spinner";
main.mostCurrent._spruta = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private Button1 As Button";
main.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _label2_click() throws Exception{
try {
		Debug.PushSubsStack("Label2_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,153);
if (RapidSub.canDelegate("label2_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","label2_click");}
 BA.debugLineNum = 153;BA.debugLine="Sub Label2_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label2_longclick() throws Exception{
try {
		Debug.PushSubsStack("Label2_LongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,157);
if (RapidSub.canDelegate("label2_longclick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","label2_longclick");}
 BA.debugLineNum = 157;BA.debugLine="Sub Label2_LongClick";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbsbus_longclick() throws Exception{
try {
		Debug.PushSubsStack("lbsbus_LongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,133);
if (RapidSub.canDelegate("lbsbus_longclick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","lbsbus_longclick");}
 BA.debugLineNum = 133;BA.debugLine="Sub lbsbus_LongClick";
Debug.ShouldStop(16);
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
venta_subs_0._process_globals();
funciones_subs_0._process_globals();
inicio_subs_0._process_globals();
comun_subs_0._process_globals();
boleto_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
venta.myClass = BA.getDeviceClass ("b4a.example.venta");
funciones.myClass = BA.getDeviceClass ("b4a.example.funciones");
inicio.myClass = BA.getDeviceClass ("b4a.example.inicio");
comun.myClass = BA.getDeviceClass ("b4a.example.comun");
boleto.myClass = BA.getDeviceClass ("b4a.example.boleto");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Public rutaId As Long";
main._rutaid = RemoteObject.createImmutable(0L);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _spaux_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spAux_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,141);
if (RapidSub.canDelegate("spaux_itemclick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","spaux_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 141;BA.debugLine="Sub spAux_ItemClick (Position As Int, Value As Obj";
Debug.ShouldStop(4096);
 BA.debugLineNum = 146;BA.debugLine="Msgbox2(spAux.GetItem(Position),\"Bienvenido\",\"\",\"";
Debug.ShouldStop(131072);
main.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(main.mostCurrent._spaux.runMethod(true,"GetItem",(Object)(_position)))),(Object)(BA.ObjectToCharSequence("Bienvenido")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("CODIGO")),(Object)(BA.ObjectToString(main.mostCurrent._laux.runMethod(false,"Get",(Object)(_position)))),(Object)((main.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spbus_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spBus_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,137);
if (RapidSub.canDelegate("spbus_itemclick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","spbus_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 137;BA.debugLine="Sub spBus_ItemClick (Position As Int, Value As Obj";
Debug.ShouldStop(256);
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spruta_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spRuta_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,166);
if (RapidSub.canDelegate("spruta_itemclick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","spruta_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 166;BA.debugLine="Sub spRuta_ItemClick (Position As Int, Value As Ob";
Debug.ShouldStop(32);
 BA.debugLineNum = 168;BA.debugLine="rutaId =  Lruta.Get(Position)";
Debug.ShouldStop(128);
main._rutaid = BA.numberCast(long.class, main.mostCurrent._lruta.runMethod(false,"Get",(Object)(_position)));
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}