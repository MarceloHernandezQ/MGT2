package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class venta extends Activity implements B4AActivity{
	public static venta mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.venta");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (venta).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.venta");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.venta", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (venta) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (venta) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return venta.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (venta) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            venta mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (venta) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _orid = "";
public static String _desid = "";
public static int _tarifaid = 0;
public static int _cantidad = 0;
public static int _precio = 0;
public anywheresoftware.b4a.objects.SpinnerWrapper _sporigen = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spdestino = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _sptarifas = null;
public anywheresoftware.b4a.objects.collections.List _lorigen = null;
public anywheresoftware.b4a.objects.collections.List _ldestino = null;
public anywheresoftware.b4a.objects.collections.List _ltarifa = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spcantidad = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvalor = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btimprimir = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.funciones _funciones = null;
public b4a.example.inicio _inicio = null;
public b4a.example.comun _comun = null;
public b4a.example.boleto _boleto = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Activity.LoadLayout(\"ventas\")";
mostCurrent._activity.LoadLayout("ventas",mostCurrent.activityBA);
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="spCantidad.AddAll(Array As String(\"-\",\"1\",\"2\",\"3\"";
mostCurrent._spcantidad.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"-","1","2","3","4","5","6","7","8","9"}));
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="Cargar_origen";
_cargar_origen();
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="Cargar_tarifas";
_cargar_tarifas();
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargar_origen() throws Exception{
RDebugUtils.currentModule="venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cargar_origen", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "cargar_origen", null));}
ResumableSub_Cargar_origen rsub = new ResumableSub_Cargar_origen(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Cargar_origen extends BA.ResumableSub {
public ResumableSub_Cargar_origen(b4a.example.venta parent) {
this.parent = parent;
}
b4a.example.venta parent;
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="venta";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Dim j As HttpJob";
_j = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize(processBA,"",venta.getObject());
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="j.Download2(\"http://192.168.1.83/Agt2/get_interme";
_j._download2("http://192.168.1.83/Agt2/get_intermedios.aspx",new String[]{"bd","gt2","r",BA.NumberToString(parent.mostCurrent._main._rutaid /*long*/ )});
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="wait for (j) jobdone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "venta", "cargar_origen"), (Object)(_j));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_j = (anywheresoftware.b4a.samples.httputils2.httpjob) result[0];
;
RDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_j._success) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1703947;
 //BA.debugLineNum = 1703947;BA.debugLine="lDestino.Initialize";
parent.mostCurrent._ldestino.Initialize();
RDebugUtils.currentLine=1703948;
 //BA.debugLineNum = 1703948;BA.debugLine="Lorigen.Initialize";
parent.mostCurrent._lorigen.Initialize();
RDebugUtils.currentLine=1703950;
 //BA.debugLineNum = 1703950;BA.debugLine="funciones.list_to_sp2(funciones.JobGetRows(j),\"c";
parent.mostCurrent._funciones._list_to_sp2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._funciones._jobgetrows /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_j),"codigo","nombre",parent.mostCurrent._sporigen,parent.mostCurrent._lorigen);
RDebugUtils.currentLine=1703951;
 //BA.debugLineNum = 1703951;BA.debugLine="funciones.list_to_sp2(funciones.JobGetRows(j),\"c";
parent.mostCurrent._funciones._list_to_sp2 /*String*/ (mostCurrent.activityBA,parent.mostCurrent._funciones._jobgetrows /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_j),"codigo","nombre",parent.mostCurrent._spdestino,parent.mostCurrent._ldestino);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=1703956;
 //BA.debugLineNum = 1703956;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=1703958;
 //BA.debugLineNum = 1703958;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargar_tarifas() throws Exception{
RDebugUtils.currentModule="venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cargar_tarifas", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "cargar_tarifas", null));}
ResumableSub_Cargar_tarifas rsub = new ResumableSub_Cargar_tarifas(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Cargar_tarifas extends BA.ResumableSub {
public ResumableSub_Cargar_tarifas(b4a.example.venta parent) {
this.parent = parent;
}
b4a.example.venta parent;
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="venta";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="Dim j As HttpJob";
_j = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize(processBA,"",venta.getObject());
RDebugUtils.currentLine=6619143;
 //BA.debugLineNum = 6619143;BA.debugLine="j.Download2(\"http://192.168.1.83/Agt2/get_tarifas";
_j._download2("http://192.168.1.83/Agt2/get_tarifas.aspx",new String[]{"bd","cvc2"});
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="wait for (j) jobdone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "venta", "cargar_tarifas"), (Object)(_j));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_j = (anywheresoftware.b4a.samples.httputils2.httpjob) result[0];
;
RDebugUtils.currentLine=6619146;
 //BA.debugLineNum = 6619146;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_j._success) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=6619148;
 //BA.debugLineNum = 6619148;BA.debugLine="Ltarifa.Initialize";
parent.mostCurrent._ltarifa.Initialize();
RDebugUtils.currentLine=6619150;
 //BA.debugLineNum = 6619150;BA.debugLine="funciones.list_to_sp(funciones.JobGetRows(j),\"Ta";
parent.mostCurrent._funciones._list_to_sp /*String*/ (mostCurrent.activityBA,parent.mostCurrent._funciones._jobgetrows /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_j),"Tarifa",parent.mostCurrent._sptarifas);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=6619156;
 //BA.debugLineNum = 6619156;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=6619158;
 //BA.debugLineNum = 6619158;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="venta";
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return "";
}
public static String  _btimprimir_click() throws Exception{
RDebugUtils.currentModule="venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btimprimir_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btimprimir_click", null));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Sub btimprimir_Click";
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="StartActivity(boleto)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._boleto.getObject()));
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="End Sub";
return "";
}
public static String  _spcantidad_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spcantidad_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spcantidad_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub spCantidad_ItemClick (Position As Int, Value A";
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="cantidad =spCantidad.GetItem(Position)";
_cantidad = (int)(Double.parseDouble(mostCurrent._spcantidad.GetItem(_position)));
RDebugUtils.currentLine=6684679;
 //BA.debugLineNum = 6684679;BA.debugLine="End Sub";
return "";
}
public static String  _sporigen_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sporigen_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sporigen_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub spOrigen_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="orId= spOrigen.GetItem(Position)";
_orid = mostCurrent._sporigen.GetItem(_position);
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="desId= spDestino.GetItem(Position)";
_desid = mostCurrent._spdestino.GetItem(_position);
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="If cantidad > 0  Then";
if (_cantidad>0) { 
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="lblValor.Text = cantidad * tarifaId";
mostCurrent._lblvalor.setText(BA.ObjectToCharSequence(_cantidad*_tarifaid));
 };
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="End Sub";
return "";
}
public static String  _sptarifas_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="venta";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sptarifas_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sptarifas_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub spTarifas_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="tarifaId =spTarifas.GetItem(Position)";
_tarifaid = (int)(Double.parseDouble(mostCurrent._sptarifas.GetItem(_position)));
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="If cantidad > 0  Then";
if (_cantidad>0) { 
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="lblValor.Text = cantidad * tarifaId";
mostCurrent._lblvalor.setText(BA.ObjectToCharSequence(_cantidad*_tarifaid));
 };
RDebugUtils.currentLine=7143435;
 //BA.debugLineNum = 7143435;BA.debugLine="End Sub";
return "";
}
}