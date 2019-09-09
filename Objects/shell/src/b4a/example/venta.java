
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

public class venta implements IRemote{
	public static venta mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public venta() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("venta"), "b4a.example.venta");
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
		pcBA = new PCBA(this, venta.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _orid = RemoteObject.createImmutable("");
public static RemoteObject _desid = RemoteObject.createImmutable("");
public static RemoteObject _tarifaid = RemoteObject.createImmutable(0);
public static RemoteObject _cantidad = RemoteObject.createImmutable(0);
public static RemoteObject _precio = RemoteObject.createImmutable(0);
public static RemoteObject _sporigen = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _spdestino = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _sptarifas = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _lorigen = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _ldestino = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _ltarifa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _spcantidad = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _lblvalor = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btimprimir = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.funciones _funciones = null;
public static b4a.example.inicio _inicio = null;
public static b4a.example.comun _comun = null;
public static b4a.example.boleto _boleto = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",venta.mostCurrent._activity,"boleto",Debug.moduleToString(b4a.example.boleto.class),"btimprimir",venta.mostCurrent._btimprimir,"cantidad",venta._cantidad,"comun",Debug.moduleToString(b4a.example.comun.class),"desId",venta._desid,"funciones",Debug.moduleToString(b4a.example.funciones.class),"HttpUtils2Service",venta.mostCurrent._httputils2service,"inicio",Debug.moduleToString(b4a.example.inicio.class),"lblValor",venta.mostCurrent._lblvalor,"lDestino",venta.mostCurrent._ldestino,"Lorigen",venta.mostCurrent._lorigen,"Ltarifa",venta.mostCurrent._ltarifa,"Main",Debug.moduleToString(b4a.example.main.class),"orId",venta._orid,"precio",venta._precio,"spCantidad",venta.mostCurrent._spcantidad,"spDestino",venta.mostCurrent._spdestino,"spOrigen",venta.mostCurrent._sporigen,"spTarifas",venta.mostCurrent._sptarifas,"Starter",Debug.moduleToString(b4a.example.starter.class),"tarifaId",venta._tarifaid};
}
}