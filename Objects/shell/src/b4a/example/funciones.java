
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class funciones implements IRemote{
	public static funciones mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public funciones() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, funciones.class);
    static {
		mostCurrent = new funciones();
        remoteMe = RemoteObject.declareNull("b4a.example.funciones");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("funciones"), "b4a.example.funciones");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("b4a.example.funciones"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _max_cache_size = RemoteObject.createImmutable(0);
public static RemoteObject _app_tit = RemoteObject.createImmutable("");
public static RemoteObject _app_ver = RemoteObject.createImmutable("");
public static RemoteObject _app_tts = RemoteObject.createImmutable(false);
public static RemoteObject _app_vibrar = RemoteObject.createImmutable(false);
public static RemoteObject _app_dictado = RemoteObject.createImmutable(false);
public static RemoteObject _app_wifi = RemoteObject.createImmutable(false);
public static RemoteObject _ok = RemoteObject.createImmutable(false);
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.venta _venta = null;
public static b4a.example.inicio _inicio = null;
public static b4a.example.comun _comun = null;
public static b4a.example.boleto _boleto = null;
  public Object[] GetGlobals() {
		return new Object[] {"App_dictado",funciones._app_dictado,"App_tit",funciones._app_tit,"App_tts",funciones._app_tts,"App_ver",funciones._app_ver,"App_vibrar",funciones._app_vibrar,"App_wifi",funciones._app_wifi,"boleto",Debug.moduleToString(b4a.example.boleto.class),"comun",Debug.moduleToString(b4a.example.comun.class),"HttpUtils2Service",funciones.mostCurrent._httputils2service,"inicio",Debug.moduleToString(b4a.example.inicio.class),"Main",Debug.moduleToString(b4a.example.main.class),"MAX_CACHE_SIZE",funciones._max_cache_size,"Ok",funciones._ok,"Starter",Debug.moduleToString(b4a.example.starter.class),"Venta",Debug.moduleToString(b4a.example.venta.class)};
}
}