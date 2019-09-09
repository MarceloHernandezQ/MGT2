
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

public class comun implements IRemote{
	public static comun mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public comun() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, comun.class);
    static {
		mostCurrent = new comun();
        remoteMe = RemoteObject.declareNull("b4a.example.comun");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("comun"), "b4a.example.comun");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("b4a.example.comun"), new java.lang.ref.WeakReference<PCBA> (pcBA));
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
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.venta _venta = null;
public static b4a.example.funciones _funciones = null;
public static b4a.example.inicio _inicio = null;
public static b4a.example.boleto _boleto = null;
  public Object[] GetGlobals() {
		return new Object[] {"boleto",Debug.moduleToString(b4a.example.boleto.class),"funciones",Debug.moduleToString(b4a.example.funciones.class),"HttpUtils2Service",comun.mostCurrent._httputils2service,"inicio",Debug.moduleToString(b4a.example.inicio.class),"Main",Debug.moduleToString(b4a.example.main.class),"SQL1",comun._sql1,"Starter",Debug.moduleToString(b4a.example.starter.class),"Venta",Debug.moduleToString(b4a.example.venta.class)};
}
}