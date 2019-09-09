package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class venta_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (venta) ","venta",2,venta.mostCurrent.activityBA,venta.mostCurrent,37);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.venta.remoteMe.runUserSub(false, "venta","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 40;BA.debugLine="Activity.LoadLayout(\"ventas\")";
Debug.ShouldStop(128);
venta.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ventas")),venta.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="spCantidad.AddAll(Array As String(\"-\",\"1\",\"2\",\"3\"";
Debug.ShouldStop(512);
venta.mostCurrent._spcantidad.runVoidMethod ("AddAll",(Object)(venta.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {10},new Object[] {BA.ObjectToString("-"),BA.ObjectToString("1"),BA.ObjectToString("2"),BA.ObjectToString("3"),BA.ObjectToString("4"),BA.ObjectToString("5"),BA.ObjectToString("6"),BA.ObjectToString("7"),BA.ObjectToString("8"),RemoteObject.createImmutable("9")})))));
 BA.debugLineNum = 43;BA.debugLine="Cargar_origen";
Debug.ShouldStop(1024);
_cargar_origen();
 BA.debugLineNum = 44;BA.debugLine="Cargar_tarifas";
Debug.ShouldStop(2048);
_cargar_tarifas();
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Pause (venta) ","venta",2,venta.mostCurrent.activityBA,venta.mostCurrent,54);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.venta.remoteMe.runUserSub(false, "venta","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 54;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Activity_Resume (venta) ","venta",2,venta.mostCurrent.activityBA,venta.mostCurrent,50);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.venta.remoteMe.runUserSub(false, "venta","activity_resume");}
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btimprimir_click() throws Exception{
try {
		Debug.PushSubsStack("btimprimir_Click (venta) ","venta",2,venta.mostCurrent.activityBA,venta.mostCurrent,120);
if (RapidSub.canDelegate("btimprimir_click")) { return b4a.example.venta.remoteMe.runUserSub(false, "venta","btimprimir_click");}
 BA.debugLineNum = 120;BA.debugLine="Sub btimprimir_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 122;BA.debugLine="StartActivity(boleto)";
Debug.ShouldStop(33554432);
venta.mostCurrent.__c.runVoidMethod ("StartActivity",venta.processBA,(Object)((venta.mostCurrent._boleto.getObject())));
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargar_origen() throws Exception{
try {
		Debug.PushSubsStack("Cargar_origen (venta) ","venta",2,venta.mostCurrent.activityBA,venta.mostCurrent,59);
if (RapidSub.canDelegate("cargar_origen")) { return b4a.example.venta.remoteMe.runUserSub(false, "venta","cargar_origen");}
ResumableSub_Cargar_origen rsub = new ResumableSub_Cargar_origen(null);
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
public static class ResumableSub_Cargar_origen extends BA.ResumableSub {
public ResumableSub_Cargar_origen(b4a.example.venta parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.venta parent;
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Cargar_origen (venta) ","venta",2,venta.mostCurrent.activityBA,venta.mostCurrent,59);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 62;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(536870912);
_j = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 64;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(-2147483648);
_j.runVoidMethod ("_initialize",venta.processBA,(Object)(BA.ObjectToString("")),(Object)(venta.getObject()));
 BA.debugLineNum = 66;BA.debugLine="j.Download2(\"http://192.168.1.83/Agt2/get_interme";
Debug.ShouldStop(2);
_j.runVoidMethod ("_download2",(Object)(BA.ObjectToString("http://192.168.1.83/Agt2/get_intermedios.aspx")),(Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("bd"),BA.ObjectToString("gt2"),BA.ObjectToString("r"),BA.NumberToString(parent.mostCurrent._main._rutaid /*RemoteObject*/ )})));
 BA.debugLineNum = 67;BA.debugLine="wait for (j) jobdone(j As HttpJob)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", venta.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "venta", "cargar_origen"), (_j));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 69;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 70;BA.debugLine="lDestino.Initialize";
Debug.ShouldStop(32);
parent.mostCurrent._ldestino.runVoidMethod ("Initialize");
 BA.debugLineNum = 71;BA.debugLine="Lorigen.Initialize";
Debug.ShouldStop(64);
parent.mostCurrent._lorigen.runVoidMethod ("Initialize");
 BA.debugLineNum = 73;BA.debugLine="funciones.list_to_sp2(funciones.JobGetRows(j),\"c";
Debug.ShouldStop(256);
parent.mostCurrent._funciones.runVoidMethod ("_list_to_sp2" /*RemoteObject*/ ,venta.mostCurrent.activityBA,(Object)(parent.mostCurrent._funciones.runMethod(false,"_jobgetrows" /*RemoteObject*/ ,venta.mostCurrent.activityBA,(Object)(_j))),(Object)(BA.ObjectToString("codigo")),(Object)(BA.ObjectToString("nombre")),(Object)(parent.mostCurrent._sporigen),(Object)(parent.mostCurrent._lorigen));
 BA.debugLineNum = 74;BA.debugLine="funciones.list_to_sp2(funciones.JobGetRows(j),\"c";
Debug.ShouldStop(512);
parent.mostCurrent._funciones.runVoidMethod ("_list_to_sp2" /*RemoteObject*/ ,venta.mostCurrent.activityBA,(Object)(parent.mostCurrent._funciones.runMethod(false,"_jobgetrows" /*RemoteObject*/ ,venta.mostCurrent.activityBA,(Object)(_j))),(Object)(BA.ObjectToString("codigo")),(Object)(BA.ObjectToString("nombre")),(Object)(parent.mostCurrent._spdestino),(Object)(parent.mostCurrent._ldestino));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 79;BA.debugLine="Return True";
Debug.ShouldStop(16384);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
public static RemoteObject  _cargar_tarifas() throws Exception{
try {
		Debug.PushSubsStack("Cargar_tarifas (venta) ","venta",2,venta.mostCurrent.activityBA,venta.mostCurrent,83);
if (RapidSub.canDelegate("cargar_tarifas")) { return b4a.example.venta.remoteMe.runUserSub(false, "venta","cargar_tarifas");}
ResumableSub_Cargar_tarifas rsub = new ResumableSub_Cargar_tarifas(null);
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
public static class ResumableSub_Cargar_tarifas extends BA.ResumableSub {
public ResumableSub_Cargar_tarifas(b4a.example.venta parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.venta parent;
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Cargar_tarifas (venta) ","venta",2,venta.mostCurrent.activityBA,venta.mostCurrent,83);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 86;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(2097152);
_j = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 88;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(8388608);
_j.runVoidMethod ("_initialize",venta.processBA,(Object)(BA.ObjectToString("")),(Object)(venta.getObject()));
 BA.debugLineNum = 90;BA.debugLine="j.Download2(\"http://192.168.1.83/Agt2/get_tarifas";
Debug.ShouldStop(33554432);
_j.runVoidMethod ("_download2",(Object)(BA.ObjectToString("http://192.168.1.83/Agt2/get_tarifas.aspx")),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("bd"),RemoteObject.createImmutable("cvc2")})));
 BA.debugLineNum = 91;BA.debugLine="wait for (j) jobdone(j As HttpJob)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", venta.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "venta", "cargar_tarifas"), (_j));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 93;BA.debugLine="If j.Success Then";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 95;BA.debugLine="Ltarifa.Initialize";
Debug.ShouldStop(1073741824);
parent.mostCurrent._ltarifa.runVoidMethod ("Initialize");
 BA.debugLineNum = 97;BA.debugLine="funciones.list_to_sp(funciones.JobGetRows(j),\"Ta";
Debug.ShouldStop(1);
parent.mostCurrent._funciones.runVoidMethod ("_list_to_sp" /*RemoteObject*/ ,venta.mostCurrent.activityBA,(Object)(parent.mostCurrent._funciones.runMethod(false,"_jobgetrows" /*RemoteObject*/ ,venta.mostCurrent.activityBA,(Object)(_j))),(Object)(BA.ObjectToString("Tarifa")),(Object)(parent.mostCurrent._sptarifas));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 103;BA.debugLine="Return True";
Debug.ShouldStop(64);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
 //BA.debugLineNum = 16;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Public cantidad As Int";
venta._cantidad = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 20;BA.debugLine="Public precio As Int";
venta._precio = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 22;BA.debugLine="Private spOrigen As Spinner";
venta.mostCurrent._sporigen = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private spDestino As Spinner";
venta.mostCurrent._spdestino = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private spTarifas As Spinner";
venta.mostCurrent._sptarifas = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Lorigen As List";
venta.mostCurrent._lorigen = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 27;BA.debugLine="Private lDestino As List";
venta.mostCurrent._ldestino = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 28;BA.debugLine="Private Ltarifa As List";
venta.mostCurrent._ltarifa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 31;BA.debugLine="Private spCantidad As Spinner";
venta.mostCurrent._spcantidad = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private lblValor As Label";
venta.mostCurrent._lblvalor = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private btimprimir As Button";
venta.mostCurrent._btimprimir = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Public orId As String";
venta._orid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Public desId As String";
venta._desid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Public tarifaId As Int";
venta._tarifaid = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _spcantidad_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spCantidad_ItemClick (venta) ","venta",2,venta.mostCurrent.activityBA,venta.mostCurrent,109);
if (RapidSub.canDelegate("spcantidad_itemclick")) { return b4a.example.venta.remoteMe.runUserSub(false, "venta","spcantidad_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 109;BA.debugLine="Sub spCantidad_ItemClick (Position As Int, Value A";
Debug.ShouldStop(4096);
 BA.debugLineNum = 113;BA.debugLine="cantidad =spCantidad.GetItem(Position)";
Debug.ShouldStop(65536);
venta._cantidad = BA.numberCast(int.class, venta.mostCurrent._spcantidad.runMethod(true,"GetItem",(Object)(_position)));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sporigen_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spOrigen_ItemClick (venta) ","venta",2,venta.mostCurrent.activityBA,venta.mostCurrent,126);
if (RapidSub.canDelegate("sporigen_itemclick")) { return b4a.example.venta.remoteMe.runUserSub(false, "venta","sporigen_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 126;BA.debugLine="Sub spOrigen_ItemClick (Position As Int, Value As";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 128;BA.debugLine="orId= spOrigen.GetItem(Position)";
Debug.ShouldStop(-2147483648);
venta._orid = venta.mostCurrent._sporigen.runMethod(true,"GetItem",(Object)(_position));
 BA.debugLineNum = 129;BA.debugLine="desId= spDestino.GetItem(Position)";
Debug.ShouldStop(1);
venta._desid = venta.mostCurrent._spdestino.runMethod(true,"GetItem",(Object)(_position));
 BA.debugLineNum = 130;BA.debugLine="If cantidad > 0  Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",venta._cantidad,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 131;BA.debugLine="lblValor.Text = cantidad * tarifaId";
Debug.ShouldStop(4);
venta.mostCurrent._lblvalor.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {venta._cantidad,venta._tarifaid}, "*",0, 1)));
 };
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sptarifas_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spTarifas_ItemClick (venta) ","venta",2,venta.mostCurrent.activityBA,venta.mostCurrent,135);
if (RapidSub.canDelegate("sptarifas_itemclick")) { return b4a.example.venta.remoteMe.runUserSub(false, "venta","sptarifas_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 135;BA.debugLine="Sub spTarifas_ItemClick (Position As Int, Value As";
Debug.ShouldStop(64);
 BA.debugLineNum = 138;BA.debugLine="tarifaId =spTarifas.GetItem(Position)";
Debug.ShouldStop(512);
venta._tarifaid = BA.numberCast(int.class, venta.mostCurrent._sptarifas.runMethod(true,"GetItem",(Object)(_position)));
 BA.debugLineNum = 140;BA.debugLine="If cantidad > 0  Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",venta._cantidad,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 141;BA.debugLine="lblValor.Text = cantidad * tarifaId";
Debug.ShouldStop(4096);
venta.mostCurrent._lblvalor.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {venta._cantidad,venta._tarifaid}, "*",0, 1)));
 };
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}