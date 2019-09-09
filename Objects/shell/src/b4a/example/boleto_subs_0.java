package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class boleto_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (boleto) ","boleto",6,boleto.mostCurrent.activityBA,boleto.mostCurrent,33);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.boleto.remoteMe.runUserSub(false, "boleto","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 37;BA.debugLine="Activity.LoadLayout(\"boleto\")";
Debug.ShouldStop(16);
boleto.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("boleto")),boleto.mostCurrent.activityBA);
 BA.debugLineNum = 39;BA.debugLine="Label2.Text= Venta.orId";
Debug.ShouldStop(64);
boleto.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(boleto.mostCurrent._venta._orid /*RemoteObject*/ ));
 BA.debugLineNum = 40;BA.debugLine="Label3.Text=Venta.desId";
Debug.ShouldStop(128);
boleto.mostCurrent._label3.runMethod(true,"setText",BA.ObjectToCharSequence(boleto.mostCurrent._venta._desid /*RemoteObject*/ ));
 BA.debugLineNum = 41;BA.debugLine="lbctn.Text=Venta.tarifaId";
Debug.ShouldStop(256);
boleto.mostCurrent._lbctn.runMethod(true,"setText",BA.ObjectToCharSequence(boleto.mostCurrent._venta._tarifaid /*RemoteObject*/ ));
 BA.debugLineNum = 43;BA.debugLine="Label5.Text= DateTime.Time(now)";
Debug.ShouldStop(1024);
boleto.mostCurrent._label5.runMethod(true,"setText",BA.ObjectToCharSequence(boleto.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(boleto._now))));
 BA.debugLineNum = 44;BA.debugLine="Label7.Text =DateTime.Date(now)";
Debug.ShouldStop(2048);
boleto.mostCurrent._label7.runMethod(true,"setText",BA.ObjectToCharSequence(boleto.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(boleto._now))));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Activity_Pause (boleto) ","boleto",6,boleto.mostCurrent.activityBA,boleto.mostCurrent,56);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.boleto.remoteMe.runUserSub(false, "boleto","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 56;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Activity_Resume (boleto) ","boleto",6,boleto.mostCurrent.activityBA,boleto.mostCurrent,52);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.boleto.remoteMe.runUserSub(false, "boleto","activity_resume");}
 BA.debugLineNum = 52;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(524288);
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim now As Long = DateTime.Now";
boleto._now = boleto.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");
 //BA.debugLineNum = 17;BA.debugLine="Log(DateTime.Date(now))";
boleto.mostCurrent.__c.runVoidMethod ("LogImpl","57274501",boleto.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(boleto._now)),0);
 //BA.debugLineNum = 18;BA.debugLine="Log(DateTime.Time(now))";
boleto.mostCurrent.__c.runVoidMethod ("LogImpl","57274502",boleto.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(boleto._now)),0);
 //BA.debugLineNum = 19;BA.debugLine="Log($\"$DateTime{now}\"$)";
boleto.mostCurrent.__c.runVoidMethod ("LogImpl","57274503",(RemoteObject.concat(RemoteObject.createImmutable(""),boleto.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("datetime")),(Object)((boleto._now))),RemoteObject.createImmutable(""))),0);
 //BA.debugLineNum = 21;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
boleto.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 //BA.debugLineNum = 26;BA.debugLine="Private Label2 As Label";
boleto.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private Label3 As Label";
boleto.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private lbctn As Label";
boleto.mostCurrent._lbctn = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private Label5 As Label";
boleto.mostCurrent._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private Label7 As Label";
boleto.mostCurrent._label7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}