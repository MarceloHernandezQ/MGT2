package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class funciones {
private static funciones mostCurrent = new funciones();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static int _max_cache_size = 0;
public static String _app_tit = "";
public static String _app_ver = "";
public static boolean _app_tts = false;
public static boolean _app_vibrar = false;
public static boolean _app_dictado = false;
public static boolean _app_wifi = false;
public static boolean _ok = false;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.venta _venta = null;
public b4a.example.inicio _inicio = null;
public b4a.example.comun _comun = null;
public b4a.example.boleto _boleto = null;
public static String  _list_to_sp2(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _lista,String _key,String _value,anywheresoftware.b4a.objects.SpinnerWrapper _sp,anywheresoftware.b4a.objects.collections.List _listakey) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "list_to_sp2", false))
	 {return ((String) Debug.delegate(null, "list_to_sp2", new Object[] {_ba,_lista,_key,_value,_sp,_listakey}));}
anywheresoftware.b4a.objects.collections.Map _m2 = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="public Sub List_to_sp2(lista As List, key As Strin";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Dim m2 As Map";
_m2 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="m2.Initialize";
_m2.Initialize();
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="For Each m As Map In lista";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group4 = _lista;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group4.Get(index4)));
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="m2.Put(m.Get(key), m.Get(value))";
_m2.Put(_m.Get((Object)(_key)),_m.Get((Object)(_value)));
 }
};
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="listaKey.Clear";
_listakey.Clear();
RDebugUtils.currentLine=3932171;
 //BA.debugLineNum = 3932171;BA.debugLine="sp.Clear";
_sp.Clear();
RDebugUtils.currentLine=3932172;
 //BA.debugLineNum = 3932172;BA.debugLine="For i=0 To m2.Size-1";
{
final int step9 = 1;
final int limit9 = (int) (_m2.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=3932173;
 //BA.debugLineNum = 3932173;BA.debugLine="sp.Add(m2.GetValueAt(i))";
_sp.Add(BA.ObjectToString(_m2.GetValueAt(_i)));
RDebugUtils.currentLine=3932174;
 //BA.debugLineNum = 3932174;BA.debugLine="listaKey.Add(m2.GetKeyAt(i))";
_listakey.Add(_m2.GetKeyAt(_i));
 }
};
RDebugUtils.currentLine=3932176;
 //BA.debugLineNum = 3932176;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _jobgetrows(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "jobgetrows", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "jobgetrows", new Object[] {_ba,_job}));}
anywheresoftware.b4a.objects.collections.List _rows = null;
String _response = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Sub JobGetRows(job As HttpJob) As List";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Dim rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="rows.Initialize";
_rows.Initialize();
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="Dim response As String	= job.GetString";
_response = _job._getstring();
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="If response.Contains(\"[\") And response.Contains(\"";
if (_response.contains("[") && _response.contains("]") && (_response).equals("[]") == false) { 
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="parser.Initialize(response)";
_parser.Initialize(_response);
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="rows = parser.NextArray";
_rows = _parser.NextArray();
 };
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="Return rows";
if (true) return _rows;
RDebugUtils.currentLine=4390922;
 //BA.debugLineNum = 4390922;BA.debugLine="End Sub";
return null;
}
public static String  _list_to_sp(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _lista,String _key,anywheresoftware.b4a.objects.SpinnerWrapper _sp) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "list_to_sp", false))
	 {return ((String) Debug.delegate(null, "list_to_sp", new Object[] {_ba,_lista,_key,_sp}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="public Sub list_to_sp(lista As List, key As String";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="For Each m As Map In lista";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = _lista;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group1.Get(index1)));
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="sp.Add(m.Get(key))";
_sp.Add(BA.ObjectToString(_m.Get((Object)(_key))));
 }
};
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="End Sub";
return "";
}
public static String  _ahora(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "ahora", false))
	 {return ((String) Debug.delegate(null, "ahora", new Object[] {_ba}));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub Ahora As String";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Return DateTime.Time( DateTime.Now )";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="End Sub";
return "";
}
public static String  _ahora2(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "ahora2", false))
	 {return ((String) Debug.delegate(null, "ahora2", new Object[] {_ba}));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="public Sub Ahora2 As String";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Return Hoy & \" \" & Ahora";
if (true) return _hoy(_ba)+" "+_ahora(_ba);
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="End Sub";
return "";
}
public static String  _hoy(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "hoy", false))
	 {return ((String) Debug.delegate(null, "hoy", new Object[] {_ba}));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="public Sub Hoy As String";
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Return DateTime.Date( DateTime.Now )";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="End Sub";
return "";
}
public static String  _ayer(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "ayer", false))
	 {return ((String) Debug.delegate(null, "ayer", new Object[] {_ba}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="public Sub Ayer As String";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Return DateTime.Date( Ayer_date )";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_ayer_date(_ba));
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="End Sub";
return "";
}
public static long  _ayer_date(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "ayer_date", false))
	 {return ((Long) Debug.delegate(null, "ayer_date", new Object[] {_ba}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="public Sub Ayer_date As Long";
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Return DateTime.Add(DateTime.now,0,0,-1)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),(int) (-1));
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="End Sub";
return 0L;
}
public static double  _cdbl(anywheresoftware.b4a.BA _ba,String _s) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "cdbl", false))
	 {return ((Double) Debug.delegate(null, "cdbl", new Object[] {_ba,_s}));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="public Sub CDbl(s As String) As Double";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Return IIF((s = \"\"), 0.0, s)";
if (true) return (double)(Double.parseDouble(_iif(_ba,((_s).equals("")),BA.NumberToString(0.0),_s)));
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="End Sub";
return 0;
}
public static String  _iif(anywheresoftware.b4a.BA _ba,boolean _c,String _trueres,String _falseres) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "iif", false))
	 {return ((String) Debug.delegate(null, "iif", new Object[] {_ba,_c,_trueres,_falseres}));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="public Sub IIF(c As Boolean, TrueRes As String, Fa";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="If c Then Return TrueRes Else Return FalseRes";
if (_c) { 
if (true) return _trueres;}
else {
if (true) return _falseres;};
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="End Sub";
return "";
}
public static int  _cint(anywheresoftware.b4a.BA _ba,String _s) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "cint", false))
	 {return ((Integer) Debug.delegate(null, "cint", new Object[] {_ba,_s}));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="public Sub CInt(s As String) As Int";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Return IIF((s = \"\"), 0, s)";
if (true) return (int)(Double.parseDouble(_iif(_ba,((_s).equals("")),BA.NumberToString(0),_s)));
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="End Sub";
return 0;
}
public static int  _color_ingreso_valor(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "color_ingreso_valor", false))
	 {return ((Integer) Debug.delegate(null, "color_ingreso_valor", new Object[] {_ba}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="public Sub Color_ingreso_valor As Int";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Return Colors.ARGB(50, 255, 216, 0)";
if (true) return anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (50),(int) (255),(int) (216),(int) (0));
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return 0;
}
public static int  _color_no_ingreso_valor(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "color_no_ingreso_valor", false))
	 {return ((Integer) Debug.delegate(null, "color_no_ingreso_valor", new Object[] {_ba}));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="public Sub Color_no_ingreso_valor As Int";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Return Colors.ARGB(50, 173, 216, 230)";
if (true) return anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (50),(int) (173),(int) (216),(int) (230));
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return 0;
}
public static int  _cuenta_filas(anywheresoftware.b4a.BA _ba,String _tabla,String _where) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "cuenta_filas", false))
	 {return ((Integer) Debug.delegate(null, "cuenta_filas", new Object[] {_ba,_tabla,_where}));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Sub cuenta_filas(tabla As String, where As String)";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Return comun.SQL1.ExecQuerySingleResult(\"SELECT c";
if (true) return (int)(Double.parseDouble(mostCurrent._comun._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuerySingleResult("SELECT count(*) FROM "+_tabla+_iif(_ba,(_where).equals(""),""," WHERE "+_where))));
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="End Sub";
return 0;
}
public static int  _cuenta_filas2(anywheresoftware.b4a.BA _ba,String _sql) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "cuenta_filas2", false))
	 {return ((Integer) Debug.delegate(null, "cuenta_filas2", new Object[] {_ba,_sql}));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Sub cuenta_filas2(sql As String) As Int";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Return comun.SQL1.ExecQuerySingleResult(sql)";
if (true) return (int)(Double.parseDouble(mostCurrent._comun._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuerySingleResult(_sql)));
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="End Sub";
return 0;
}
public static String  _elimina_filas(anywheresoftware.b4a.BA _ba,String _tabla,String _where) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "elimina_filas", false))
	 {return ((String) Debug.delegate(null, "elimina_filas", new Object[] {_ba,_tabla,_where}));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Sub elimina_filas(tabla As String, where As String";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="comun.SQL1.ExecNonQuery(\"DELETE FROM \" & tabla &";
mostCurrent._comun._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DELETE FROM "+_tabla+_iif(_ba,(_where).equals(""),""," WHERE "+_where));
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="End Sub";
return "";
}
public static String  _fecha_format(anywheresoftware.b4a.BA _ba,String _fecha_sql) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fecha_format", false))
	 {return ((String) Debug.delegate(null, "fecha_format", new Object[] {_ba,_fecha_sql}));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="public Sub Fecha_format(fecha_sql As String) As St";
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="Return fecha_sql.SubString(6) & \"/\" & fecha_sql.S";
if (true) return _fecha_sql.substring((int) (6))+"/"+_fecha_sql.substring((int) (4),(int) (6))+"/"+_fecha_sql.substring((int) (0),(int) (4));
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="End Sub";
return "";
}
public static String  _fecha_parse(anywheresoftware.b4a.BA _ba,String _fecha) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fecha_parse", false))
	 {return ((String) Debug.delegate(null, "fecha_parse", new Object[] {_ba,_fecha}));}
String _mes = "";
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="public Sub fecha_parse(fecha As String) As String";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Dim mes As String = fecha.SubString2(3,5)";
_mes = _fecha.substring((int) (3),(int) (5));
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="Return mes & \"/\" & fecha.SubString2(0,2) & \"/\" &";
if (true) return _mes+"/"+_fecha.substring((int) (0),(int) (2))+"/"+_fecha.substring((int) (6));
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="End Sub";
return "";
}
public static String  _fillimagetoview(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,anywheresoftware.b4a.objects.B4XViewWrapper _imageview) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fillimagetoview", false))
	 {return ((String) Debug.delegate(null, "fillimagetoview", new Object[] {_ba,_bmp,_imageview}));}
float _bmpratio = 0f;
float _viewratio = 0f;
int _newheight = 0;
int _newwidth = 0;
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub FillImageToView(bmp As B4XBitmap, ImageView As";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Dim bmpRatio As Float = bmp.Width / bmp.Height";
_bmpratio = (float) (_bmp.getWidth()/(double)_bmp.getHeight());
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Dim viewRatio As Float = ImageView.Width / Imag";
_viewratio = (float) (_imageview.getWidth()/(double)_imageview.getHeight());
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="If viewRatio > bmpRatio Then";
if (_viewratio>_bmpratio) { 
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="Dim NewHeight As Int = bmp.Width / viewRatio";
_newheight = (int) (_bmp.getWidth()/(double)_viewratio);
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="bmp = bmp.Crop(0, bmp.Height / 2 - NewHeight";
_bmp = _bmp.Crop((int) (0),(int) (_bmp.getHeight()/(double)2-_newheight/(double)2),(int) (_bmp.getWidth()),_newheight);
 }else 
{RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="Else if viewRatio < bmpRatio Then";
if (_viewratio<_bmpratio) { 
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="Dim NewWidth As Int = bmp.Height * viewRatio";
_newwidth = (int) (_bmp.getHeight()*_viewratio);
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="bmp = bmp.Crop(bmp.Width / 2 - NewWidth / 2,";
_bmp = _bmp.Crop((int) (_bmp.getWidth()/(double)2-_newwidth/(double)2),(int) (0),_newwidth,(int) (_bmp.getHeight()));
 }}
;
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="ImageView.SetBitmap(bmp.Resize(ImageView.Width,";
_imageview.SetBitmap((android.graphics.Bitmap)(_bmp.Resize(_imageview.getWidth(),_imageview.getHeight(),anywheresoftware.b4a.keywords.Common.True).getObject()));
RDebugUtils.currentLine=4980747;
 //BA.debugLineNum = 4980747;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _fonttobitmap(anywheresoftware.b4a.BA _ba,String _text,boolean _ismaterialicons,float _fontsize,int _color) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "fonttobitmap", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(null, "fonttobitmap", new Object[] {_ba,_text,_ismaterialicons,_fontsize,_color}));}
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs1 = null;
anywheresoftware.b4a.keywords.constants.TypefaceWrapper _t = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub FontToBitmap (text As String, IsMateria";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel((_ba.processBA == null ? _ba : _ba.processBA),"");
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 32dip, 32dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (32)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (32)));
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="Dim cvs1 As B4XCanvas";
_cvs1 = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="cvs1.Initialize(p)";
_cvs1.Initialize(_p);
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="Dim t As Typeface";
_t = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="If IsMaterialIcons Then t = Typeface.MATERIALICON";
if (_ismaterialicons) { 
_t.setObject((android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.getMATERIALICONS()));}
else {
_t.setObject((android.graphics.Typeface)(anywheresoftware.b4a.keywords.Common.Typeface.getFONTAWESOME()));};
RDebugUtils.currentLine=5046280;
 //BA.debugLineNum = 5046280;BA.debugLine="Dim fnt As B4XFont = xui.CreateFont(t, FontSize)";
_fnt = _xui.CreateFont((android.graphics.Typeface)(_t.getObject()),_fontsize);
RDebugUtils.currentLine=5046281;
 //BA.debugLineNum = 5046281;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(text, fnt)";
_r = _cvs1.MeasureText(_text,_fnt);
RDebugUtils.currentLine=5046282;
 //BA.debugLineNum = 5046282;BA.debugLine="Dim BaseLine As Int = cvs1.TargetRect.CenterY - r";
_baseline = (int) (_cvs1.getTargetRect().getCenterY()-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=5046283;
 //BA.debugLineNum = 5046283;BA.debugLine="cvs1.DrawText(text, cvs1.TargetRect.CenterX, Base";
_cvs1.DrawText((_ba.processBA == null ? _ba : _ba.processBA),_text,_cvs1.getTargetRect().getCenterX(),(float) (_baseline),_fnt,_color,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=5046284;
 //BA.debugLineNum = 5046284;BA.debugLine="Dim b As B4XBitmap = cvs1.CreateBitmap";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_b = _cvs1.CreateBitmap();
RDebugUtils.currentLine=5046285;
 //BA.debugLineNum = 5046285;BA.debugLine="cvs1.Release";
_cvs1.Release();
RDebugUtils.currentLine=5046286;
 //BA.debugLineNum = 5046286;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=5046287;
 //BA.debugLineNum = 5046287;BA.debugLine="End Sub";
return null;
}
public static long  _hoy2(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "hoy2", false))
	 {return ((Long) Debug.delegate(null, "hoy2", new Object[] {_ba}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="public Sub Hoy2 As Long";
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Return DateTime.DateParse( Hoy )";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_hoy(_ba));
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="End Sub";
return 0L;
}
public static boolean  _isfono(anywheresoftware.b4a.BA _ba,String _f) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "isfono", false))
	 {return ((Boolean) Debug.delegate(null, "isfono", new Object[] {_ba,_f}));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="public Sub IsFono(f As String) As Boolean";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="If Not (IsNumeric(f)) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_isnumeric(_ba,_f))) { 
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="If f.Length <> 9 Then";
if (_f.length()!=9) { 
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="End Sub";
return false;
}
public static boolean  _isnumeric(anywheresoftware.b4a.BA _ba,String _str) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "isnumeric", false))
	 {return ((Boolean) Debug.delegate(null, "isnumeric", new Object[] {_ba,_str}));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="public Sub IsNumeric(str As String) As Boolean";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Return IsNumber(str.Replace(\",\",\"\"))";
if (true) return anywheresoftware.b4a.keywords.Common.IsNumber(_str.replace(",",""));
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="End Sub";
return false;
}
public static boolean  _ismail(anywheresoftware.b4a.BA _ba,String _mail) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "ismail", false))
	 {return ((Boolean) Debug.delegate(null, "ismail", new Object[] {_ba,_mail}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matchemail = null;
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="public Sub IsMail(mail As String) As Boolean";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Dim MatchEmail As Matcher = Regex.Matcher(\"^(?i)[";
_matchemail = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matchemail = anywheresoftware.b4a.keywords.Common.Regex.Matcher("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$",_mail);
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="Return MatchEmail.Find";
if (true) return _matchemail.Find();
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="End Sub";
return false;
}
public static long  _jsondatetotick(anywheresoftware.b4a.BA _ba,String _json_fecha) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "jsondatetotick", false))
	 {return ((Long) Debug.delegate(null, "jsondatetotick", new Object[] {_ba,_json_fecha}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub JsonDateToTick(json_fecha As String) As Long";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"\\d+\", json_fech";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher("\\d+",_json_fecha);
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="If m.Find Then";
if (_m.Find()) { 
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="Return m.Match";
if (true) return (long)(Double.parseDouble(_m.getMatch()));
 };
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="Log(\"Invalid date: \" & json_fecha)";
anywheresoftware.b4a.keywords.Common.LogImpl("53145733","Invalid date: "+_json_fecha,0);
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="Return 0";
if (true) return (long) (0);
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="End Sub";
return 0L;
}
public static anywheresoftware.b4a.objects.collections.List  _jsontolist(anywheresoftware.b4a.BA _ba,String _json1) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "jsontolist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "jsontolist", new Object[] {_ba,_json1}));}
String _str = "";
anywheresoftware.b4a.objects.collections.List _rows = null;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub JsonToList(Json1 As String) As List";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Dim str As String = Json1 'Json vacio =>  []";
_str = _json1;
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="Dim rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="rows.Initialize";
_rows.Initialize();
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="parser.Initialize(str)";
_parser.Initialize(_str);
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="rows = parser.NextArray";
_rows = _parser.NextArray();
RDebugUtils.currentLine=4325383;
 //BA.debugLineNum = 4325383;BA.debugLine="Return rows  'rows.size = 0 cuando Json1 es vacio";
if (true) return _rows;
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="End Sub";
return null;
}
public static String  _left(anywheresoftware.b4a.BA _ba,String _text,int _length) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "left", false))
	 {return ((String) Debug.delegate(null, "left", new Object[] {_ba,_text,_length}));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub Left(Text As String, Length As Int)As String";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="If Length>Text.Length Then Length=Text.Length";
if (_length>_text.length()) { 
_length = _text.length();};
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="Return Text.SubString2(0, Length)";
if (true) return _text.substring((int) (0),_length);
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="End Sub";
return "";
}
public static String  _manana(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "manana", false))
	 {return ((String) Debug.delegate(null, "manana", new Object[] {_ba}));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub Manana As String";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="Return DateTime.Date( Manana_date )";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_manana_date(_ba));
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="End Sub";
return "";
}
public static long  _manana_date(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "manana_date", false))
	 {return ((Long) Debug.delegate(null, "manana_date", new Object[] {_ba}));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub Manana_date As Long";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Return DateTime.Add(DateTime.now,0,0,1)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),(int) (1));
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="End Sub";
return 0L;
}
public static String  _mensaje(anywheresoftware.b4a.BA _ba,String _texto,String _tipo) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "mensaje", false))
	 {return ((String) Debug.delegate(null, "mensaje", new Object[] {_ba,_texto,_tipo}));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="public Sub mensaje(texto As String, tipo As String";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Msgbox2(texto, App_tit & \" \" & App_ver,  \"Ok\", \"\"";
anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(_texto),BA.ObjectToCharSequence(_app_tit+" "+_app_ver),"Ok","","",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_tipo+".png").getObject()),_ba);
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="End Sub";
return "";
}
public static String  _mid(anywheresoftware.b4a.BA _ba,String _text,int _start,int _length) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "mid", false))
	 {return ((String) Debug.delegate(null, "mid", new Object[] {_ba,_text,_start,_length}));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub Mid(Text As String, Start As Int, Length As In";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Return Text.SubString2(Start-1,Start+Length-1)";
if (true) return _text.substring((int) (_start-1),(int) (_start+_length-1));
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="End Sub";
return "";
}
public static long  _parse_fecha_hora(anywheresoftware.b4a.BA _ba,String _fecha_hora) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "parse_fecha_hora", false))
	 {return ((Long) Debug.delegate(null, "parse_fecha_hora", new Object[] {_ba,_fecha_hora}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="public Sub Parse_fecha_hora(fecha_hora As String)";
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="If fecha_hora <> \"\" Then";
if ((_fecha_hora).equals("") == false) { 
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="Return DateTime.DateTimeParse( Left(fecha_hora,1";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.DateTimeParse(_left(_ba,_fecha_hora,(int) (10)),_right(_ba,_fecha_hora,(int) (8)));
 }else {
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="Return DateTime.Now";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 };
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="End Sub";
return 0L;
}
public static String  _right(anywheresoftware.b4a.BA _ba,String _text,int _length) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "right", false))
	 {return ((String) Debug.delegate(null, "right", new Object[] {_ba,_text,_length}));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub Right(Text As String, Length As Int) As String";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="If Length>Text.Length Then Length=Text.Length";
if (_length>_text.length()) { 
_length = _text.length();};
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="Return Text.SubString(Text.Length - Length)";
if (true) return _text.substring((int) (_text.length()-_length));
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="End Sub";
return "";
}
public static String  _ptotocoma(anywheresoftware.b4a.BA _ba,double _numpto) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "ptotocoma", false))
	 {return ((String) Debug.delegate(null, "ptotocoma", new Object[] {_ba,_numpto}));}
String _ns = "";
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="public Sub PtoToComa(NumPto As Double) As String";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim ns As String = NumPto";
_ns = BA.NumberToString(_numpto);
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Return ns.Replace(\".\",\",\")";
if (true) return _ns.replace(".",",");
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="End Sub";
return "";
}
public static String  _randomnumber(anywheresoftware.b4a.BA _ba,double _lowest,double _highest,int _decimalplaces,boolean _preventzero) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "randomnumber", false))
	 {return ((String) Debug.delegate(null, "randomnumber", new Object[] {_ba,_lowest,_highest,_decimalplaces,_preventzero}));}
double _decimal = 0;
double _tempvalue = 0;
double _returnvalue = 0;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub RandomNumber(Lowest As Double, Highest As Doub";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Lowest  = Round(Lowest)";
_lowest = anywheresoftware.b4a.keywords.Common.Round(_lowest);
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Highest = Round(Highest)";
_highest = anywheresoftware.b4a.keywords.Common.Round(_highest);
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="Dim Decimal As Double";
_decimal = 0;
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="If DecimalPlaces > 0 Then Decimal = (Rnd(0, Power";
if (_decimalplaces>0) { 
_decimal = (anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (anywheresoftware.b4a.keywords.Common.Power(10,_decimalplaces))))/(double)anywheresoftware.b4a.keywords.Common.Power(10,_decimalplaces);};
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="If Lowest = Highest Then";
if (_lowest==_highest) { 
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="Return  NumberFormat(Lowest, 0, 0)";
if (true) return anywheresoftware.b4a.keywords.Common.NumberFormat(_lowest,(int) (0),(int) (0));
 }else {
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="If Lowest > Highest Then";
if (_lowest>_highest) { 
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="Dim TempValue = Lowest As Double";
_tempvalue = _lowest;
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="Lowest   = Highest";
_lowest = _highest;
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="Highest  = TempValue";
_highest = _tempvalue;
 };
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="Dim ReturnValue = Lowest + Rnd(0, Highest - Lowe";
_returnvalue = _lowest+anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (_highest-_lowest))+_decimal;
RDebugUtils.currentLine=1966094;
 //BA.debugLineNum = 1966094;BA.debugLine="If ReturnValue = 0 And PreventZero Then";
if (_returnvalue==0 && _preventzero) { 
RDebugUtils.currentLine=1966095;
 //BA.debugLineNum = 1966095;BA.debugLine="Return NumberFormat(RandomNumber(Lowest, Highes";
if (true) return anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(_randomnumber(_ba,_lowest,_highest,_decimalplaces,_preventzero))),(int) (0),(int) (0));
 }else {
RDebugUtils.currentLine=1966097;
 //BA.debugLineNum = 1966097;BA.debugLine="Return NumberFormat(ReturnValue,0,0)";
if (true) return anywheresoftware.b4a.keywords.Common.NumberFormat(_returnvalue,(int) (0),(int) (0));
 };
 };
RDebugUtils.currentLine=1966100;
 //BA.debugLineNum = 1966100;BA.debugLine="End Sub";
return "";
}
public static int[]  _rgb(anywheresoftware.b4a.BA _ba,String _colorhex) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "rgb", false))
	 {return ((int[]) Debug.delegate(null, "rgb", new Object[] {_ba,_colorhex}));}
int _r = 0;
int _g = 0;
int _b = 0;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub RGB(colorHex As String) As Int()";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Dim R = Bit.ParseInt(colorHex.SubString2(1, 3), 1";
_r = anywheresoftware.b4a.keywords.Common.Bit.ParseInt(_colorhex.substring((int) (1),(int) (3)),(int) (16));
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Dim G = Bit.ParseInt(colorHex.SubString2(3, 5), 1";
_g = anywheresoftware.b4a.keywords.Common.Bit.ParseInt(_colorhex.substring((int) (3),(int) (5)),(int) (16));
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Dim B = Bit.ParseInt(colorHex.SubString2(5, 7), 1";
_b = anywheresoftware.b4a.keywords.Common.Bit.ParseInt(_colorhex.substring((int) (5),(int) (7)),(int) (16));
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Return Array As Int(R, G, B)";
if (true) return new int[]{_r,_g,_b};
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _rs_to_list(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs,String _campo) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "rs_to_list", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "rs_to_list", new Object[] {_ba,_rs,_campo}));}
anywheresoftware.b4a.objects.collections.List _li = null;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub rs_to_list(rs As ResultSet, campo As String) A";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Dim li As List";
_li = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="li.Initialize";
_li.Initialize();
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="li.Add(rs.GetString(campo))";
_li.Add((Object)(_rs.GetString(_campo)));
 }
;
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="Return li";
if (true) return _li;
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="End Sub";
return null;
}
public static String  _set_app(anywheresoftware.b4a.BA _ba,String _tit,String _ver) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "set_app", false))
	 {return ((String) Debug.delegate(null, "set_app", new Object[] {_ba,_tit,_ver}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="public Sub set_app(tit As String, ver As String)";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="App_tit = tit";
_app_tit = _tit;
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="App_ver = ver";
_app_ver = _ver;
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="End Sub";
return "";
}
public static String  _set_config(anywheresoftware.b4a.BA _ba,boolean _tts,boolean _vibrar,boolean _dictado,boolean _wifi) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "set_config", false))
	 {return ((String) Debug.delegate(null, "set_config", new Object[] {_ba,_tts,_vibrar,_dictado,_wifi}));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="public Sub set_config(tts As Boolean, vibrar As Bo";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="App_tts = tts";
_app_tts = _tts;
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="App_vibrar = vibrar";
_app_vibrar = _vibrar;
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="App_dictado = dictado";
_app_dictado = _dictado;
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="App_wifi = wifi";
_app_wifi = _wifi;
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="End Sub";
return "";
}
public static String  _spid(anywheresoftware.b4a.BA _ba,String _s) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "spid", false))
	 {return ((String) Debug.delegate(null, "spid", new Object[] {_ba,_s}));}
int _p = 0;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Public Sub spId(s As String) As String";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Dim p As Int = s.IndexOf(\"#\")";
_p = _s.indexOf("#");
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="If p >= 0 Then";
if (_p>=0) { 
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="Return s.SubString(p + 1).trim";
if (true) return _s.substring((int) (_p+1)).trim();
 }else {
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="End Sub";
return "";
}
public static int  _spindexid(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.SpinnerWrapper _sp,String _id) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "spindexid", false))
	 {return ((Integer) Debug.delegate(null, "spindexid", new Object[] {_ba,_sp,_id}));}
String _item = "";
int _i = 0;
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="public Sub spIndexId(sp As Spinner, id As String)";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Dim item As String";
_item = "";
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="For i=0 To sp.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (_sp.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="item = sp.GetItem(i)";
_item = _sp.GetItem(_i);
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="If id.ToLowerCase = item.SubString( item.IndexOf";
if ((_id.toLowerCase()).equals(_item.substring((int) (_item.indexOf("#")+1)).toLowerCase().trim())) { 
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="Return i";
if (true) return _i;
 };
 }
};
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="Return -1";
if (true) return (int) (-1);
RDebugUtils.currentLine=3604489;
 //BA.debugLineNum = 3604489;BA.debugLine="End Sub";
return 0;
}
public static int  _spindexnombre(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.SpinnerWrapper _sp,String _nombre) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "spindexnombre", false))
	 {return ((Integer) Debug.delegate(null, "spindexnombre", new Object[] {_ba,_sp,_nombre}));}
String _item = "";
int _i = 0;
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Public Sub spIndexNombre(sp As Spinner, nombre As";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Dim item As String";
_item = "";
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="For i=0 To sp.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (_sp.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="item = sp.GetItem(i)";
_item = _sp.GetItem(_i);
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="If nombre.ToLowerCase = item.SubString2(0, item.";
if ((_nombre.toLowerCase()).equals(_item.substring((int) (0),_item.indexOf("#")).toLowerCase().trim())) { 
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="Return i";
if (true) return _i;
 };
 }
};
RDebugUtils.currentLine=3538952;
 //BA.debugLineNum = 3538952;BA.debugLine="Return -1";
if (true) return (int) (-1);
RDebugUtils.currentLine=3538953;
 //BA.debugLineNum = 3538953;BA.debugLine="End Sub";
return 0;
}
public static String[]  _split(anywheresoftware.b4a.BA _ba,String _text,String _delimiter) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "split", false))
	 {return ((String[]) Debug.delegate(null, "split", new Object[] {_ba,_text,_delimiter}));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub Split(Text As String, delimiter As String) As";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Return Regex.Split(delimiter,Text)";
if (true) return anywheresoftware.b4a.keywords.Common.Regex.Split(_delimiter,_text);
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="End Sub";
return null;
}
public static String  _spnombre(anywheresoftware.b4a.BA _ba,String _s) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "spnombre", false))
	 {return ((String) Debug.delegate(null, "spnombre", new Object[] {_ba,_s}));}
int _p = 0;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="public Sub spNombre(s As String) As String";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Dim p As Int = s.IndexOf(\"#\")";
_p = _s.indexOf("#");
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="If p >= 0 Then";
if (_p>=0) { 
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="Return s.SubString2(0,p).Trim";
if (true) return _s.substring((int) (0),_p).trim();
 }else {
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="Return s";
if (true) return _s;
 };
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="End Sub";
return "";
}
public static String  _sql_to_sp(anywheresoftware.b4a.BA _ba,String _sql_1campo,anywheresoftware.b4a.objects.SpinnerWrapper _sp) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "sql_to_sp", false))
	 {return ((String) Debug.delegate(null, "sql_to_sp", new Object[] {_ba,_sql_1campo,_sp}));}
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="public Sub sql_to_sp(sql_1campo As String, sp As S";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Dim rs As ResultSet = comun.SQL1.ExecQuery(sql_1c";
_rs = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_rs.setObject((android.database.Cursor)(mostCurrent._comun._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql_1campo)));
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="sp.Clear";
_sp.Clear();
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="sp.Add(rs.GetString2(0))";
_sp.Add(_rs.GetString2((int) (0)));
 }
;
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="sp.SelectedIndex = 0";
_sp.setSelectedIndex((int) (0));
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="End Sub";
return "";
}
public static String  _sql_to_sp2(anywheresoftware.b4a.BA _ba,String _sql_2campos,anywheresoftware.b4a.objects.SpinnerWrapper _sp) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "sql_to_sp2", false))
	 {return ((String) Debug.delegate(null, "sql_to_sp2", new Object[] {_ba,_sql_2campos,_sp}));}
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="public Sub sql_to_sp2(sql_2campos As String, sp As";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Dim rs As ResultSet = comun.SQL1.ExecQuery(sql_2c";
_rs = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_rs.setObject((android.database.Cursor)(mostCurrent._comun._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql_2campos)));
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="sp.Clear";
_sp.Clear();
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="sp.Add(rs.GetString2(0) & \" #\" & rs.GetString2(1";
_sp.Add(_rs.GetString2((int) (0))+" #"+_rs.GetString2((int) (1)));
 }
;
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="sp.SelectedIndex = 0";
_sp.setSelectedIndex((int) (0));
RDebugUtils.currentLine=3735560;
 //BA.debugLineNum = 3735560;BA.debugLine="End Sub";
return "";
}
public static String  _sql_to_spli(anywheresoftware.b4a.BA _ba,String _sql_2campos,anywheresoftware.b4a.objects.SpinnerWrapper _sp,anywheresoftware.b4a.objects.collections.List _li) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "sql_to_spli", false))
	 {return ((String) Debug.delegate(null, "sql_to_spli", new Object[] {_ba,_sql_2campos,_sp,_li}));}
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="public Sub sql_to_spli(sql_2campos As String, sp A";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Dim rs As ResultSet = comun.SQL1.ExecQuery(sql_2c";
_rs = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_rs.setObject((android.database.Cursor)(mostCurrent._comun._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql_2campos)));
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="sp.Clear";
_sp.Clear();
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="Li.Initialize";
_li.Initialize();
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="sp.Add(rs.GetString2(1))";
_sp.Add(_rs.GetString2((int) (1)));
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="Li.Add(rs.GetString2(0))";
_li.Add((Object)(_rs.GetString2((int) (0))));
 }
;
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="sp.SelectedIndex = 0";
_sp.setSelectedIndex((int) (0));
RDebugUtils.currentLine=3801098;
 //BA.debugLineNum = 3801098;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _sqlint_to_list(anywheresoftware.b4a.BA _ba,String _sql,String _campo) throws Exception{
RDebugUtils.currentModule="funciones";
if (Debug.shouldDelegate(null, "sqlint_to_list", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(null, "sqlint_to_list", new Object[] {_ba,_sql,_campo}));}
anywheresoftware.b4a.objects.collections.List _li = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub sqlInt_to_list(sql As String, campo As String)";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Dim li As List";
_li = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="li.Initialize";
_li.Initialize();
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="Dim rs As ResultSet = comun.SQL1.ExecQuery(sql)";
_rs = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_rs.setObject((android.database.Cursor)(mostCurrent._comun._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="li.Add(rs.GetLong(campo))";
_li.Add((Object)(_rs.GetLong(_campo)));
 }
;
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="Return li";
if (true) return _li;
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="End Sub";
return null;
}
}