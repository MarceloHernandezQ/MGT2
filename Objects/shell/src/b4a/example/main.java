
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

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4a.example.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _rutaid = RemoteObject.createImmutable(0L);
public static RemoteObject _spbus = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _spaux = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _lruta = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _laux = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _spruta = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.example.starter _starter = null;
public static b4a.example.venta _venta = null;
public static b4a.example.funciones _funciones = null;
public static b4a.example.inicio _inicio = null;
public static b4a.example.comun _comun = null;
public static b4a.example.boleto _boleto = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"boleto",Debug.moduleToString(b4a.example.boleto.class),"Button1",main.mostCurrent._button1,"comun",Debug.moduleToString(b4a.example.comun.class),"funciones",Debug.moduleToString(b4a.example.funciones.class),"HttpUtils2Service",main.mostCurrent._httputils2service,"inicio",Debug.moduleToString(b4a.example.inicio.class),"Laux",main.mostCurrent._laux,"Lruta",main.mostCurrent._lruta,"rutaId",main._rutaid,"spAux",main.mostCurrent._spaux,"spBus",main.mostCurrent._spbus,"spRuta",main.mostCurrent._spruta,"Starter",Debug.moduleToString(b4a.example.starter.class),"Venta",Debug.moduleToString(b4a.example.venta.class)};
}
}