package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class funciones_subs_0 {


public static RemoteObject  _ahora(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Ahora (funciones) ","funciones",3,_ba,funciones.mostCurrent,208);
if (RapidSub.canDelegate("ahora")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","ahora", _ba);}
;
 BA.debugLineNum = 208;BA.debugLine="Public Sub Ahora As String";
Debug.ShouldStop(32768);
 BA.debugLineNum = 210;BA.debugLine="Return DateTime.Time( DateTime.Now )";
Debug.ShouldStop(131072);
if (true) return funciones.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(funciones.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ahora2(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Ahora2 (funciones) ","funciones",3,_ba,funciones.mostCurrent,216);
if (RapidSub.canDelegate("ahora2")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","ahora2", _ba);}
;
 BA.debugLineNum = 216;BA.debugLine="public Sub Ahora2 As String";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 217;BA.debugLine="Return Hoy & \" \" & Ahora";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.concat(_hoy(_ba),RemoteObject.createImmutable(" "),_ahora(_ba));
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ayer(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Ayer (funciones) ","funciones",3,_ba,funciones.mostCurrent,175);
if (RapidSub.canDelegate("ayer")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","ayer", _ba);}
;
 BA.debugLineNum = 175;BA.debugLine="public Sub Ayer As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 177;BA.debugLine="Return DateTime.Date( Ayer_date )";
Debug.ShouldStop(65536);
if (true) return funciones.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ayer_date(_ba)));
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ayer_date(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Ayer_date (funciones) ","funciones",3,_ba,funciones.mostCurrent,183);
if (RapidSub.canDelegate("ayer_date")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","ayer_date", _ba);}
;
 BA.debugLineNum = 183;BA.debugLine="public Sub Ayer_date As Long";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 185;BA.debugLine="Return DateTime.Add(DateTime.now,0,0,-1)";
Debug.ShouldStop(16777216);
if (true) return funciones.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(funciones.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cdbl(RemoteObject _ba,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("CDbl (funciones) ","funciones",3,_ba,funciones.mostCurrent,253);
if (RapidSub.canDelegate("cdbl")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","cdbl", _ba, _s);}
;
Debug.locals.put("s", _s);
 BA.debugLineNum = 253;BA.debugLine="public Sub CDbl(s As String) As Double";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 254;BA.debugLine="Return IIF((s = \"\"), 0.0, s)";
Debug.ShouldStop(536870912);
if (true) return BA.numberCast(double.class, _iif(_ba,BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_s,RemoteObject.createImmutable("")))),BA.NumberToString(0.0),_s));
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cint(RemoteObject _ba,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("CInt (funciones) ","funciones",3,_ba,funciones.mostCurrent,249);
if (RapidSub.canDelegate("cint")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","cint", _ba, _s);}
;
Debug.locals.put("s", _s);
 BA.debugLineNum = 249;BA.debugLine="public Sub CInt(s As String) As Int";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 250;BA.debugLine="Return IIF((s = \"\"), 0, s)";
Debug.ShouldStop(33554432);
if (true) return BA.numberCast(int.class, _iif(_ba,BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_s,RemoteObject.createImmutable("")))),BA.NumberToString(0),_s));
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _color_ingreso_valor(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Color_ingreso_valor (funciones) ","funciones",3,_ba,funciones.mostCurrent,88);
if (RapidSub.canDelegate("color_ingreso_valor")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","color_ingreso_valor", _ba);}
;
 BA.debugLineNum = 88;BA.debugLine="public Sub Color_ingreso_valor As Int";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="Return Colors.ARGB(50, 255, 216, 0)";
Debug.ShouldStop(16777216);
if (true) return funciones.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 50)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 216)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _color_no_ingreso_valor(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Color_no_ingreso_valor (funciones) ","funciones",3,_ba,funciones.mostCurrent,92);
if (RapidSub.canDelegate("color_no_ingreso_valor")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","color_no_ingreso_valor", _ba);}
;
 BA.debugLineNum = 92;BA.debugLine="public Sub Color_no_ingreso_valor As Int";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="Return Colors.ARGB(50, 173, 216, 230)";
Debug.ShouldStop(268435456);
if (true) return funciones.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 50)),(Object)(BA.numberCast(int.class, 173)),(Object)(BA.numberCast(int.class, 216)),(Object)(BA.numberCast(int.class, 230)));
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cuenta_filas(RemoteObject _ba,RemoteObject _tabla,RemoteObject _where) throws Exception{
try {
		Debug.PushSubsStack("cuenta_filas (funciones) ","funciones",3,_ba,funciones.mostCurrent,407);
if (RapidSub.canDelegate("cuenta_filas")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","cuenta_filas", _ba, _tabla, _where);}
;
Debug.locals.put("tabla", _tabla);
Debug.locals.put("where", _where);
 BA.debugLineNum = 407;BA.debugLine="Sub cuenta_filas(tabla As String, where As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 408;BA.debugLine="Return comun.SQL1.ExecQuerySingleResult(\"SELECT c";
Debug.ShouldStop(8388608);
if (true) return BA.numberCast(int.class, funciones.mostCurrent._comun._sql1 /*RemoteObject*/ .runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT count(*) FROM "),_tabla,_iif(_ba,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_where,BA.ObjectToString(""))),BA.ObjectToString(""),RemoteObject.concat(RemoteObject.createImmutable(" WHERE "),_where))))));
 BA.debugLineNum = 409;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cuenta_filas2(RemoteObject _ba,RemoteObject _sql) throws Exception{
try {
		Debug.PushSubsStack("cuenta_filas2 (funciones) ","funciones",3,_ba,funciones.mostCurrent,411);
if (RapidSub.canDelegate("cuenta_filas2")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","cuenta_filas2", _ba, _sql);}
;
Debug.locals.put("sql", _sql);
 BA.debugLineNum = 411;BA.debugLine="Sub cuenta_filas2(sql As String) As Int";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 412;BA.debugLine="Return comun.SQL1.ExecQuerySingleResult(sql)";
Debug.ShouldStop(134217728);
if (true) return BA.numberCast(int.class, funciones.mostCurrent._comun._sql1 /*RemoteObject*/ .runMethod(true,"ExecQuerySingleResult",(Object)(_sql)));
 BA.debugLineNum = 413;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _elimina_filas(RemoteObject _ba,RemoteObject _tabla,RemoteObject _where) throws Exception{
try {
		Debug.PushSubsStack("elimina_filas (funciones) ","funciones",3,_ba,funciones.mostCurrent,415);
if (RapidSub.canDelegate("elimina_filas")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","elimina_filas", _ba, _tabla, _where);}
;
Debug.locals.put("tabla", _tabla);
Debug.locals.put("where", _where);
 BA.debugLineNum = 415;BA.debugLine="Sub elimina_filas(tabla As String, where As String";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 416;BA.debugLine="comun.SQL1.ExecNonQuery(\"DELETE FROM \" & tabla &";
Debug.ShouldStop(-2147483648);
funciones.mostCurrent._comun._sql1 /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM "),_tabla,_iif(_ba,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_where,BA.ObjectToString(""))),BA.ObjectToString(""),RemoteObject.concat(RemoteObject.createImmutable(" WHERE "),_where)))));
 BA.debugLineNum = 417;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fecha_format(RemoteObject _ba,RemoteObject _fecha_sql) throws Exception{
try {
		Debug.PushSubsStack("Fecha_format (funciones) ","funciones",3,_ba,funciones.mostCurrent,222);
if (RapidSub.canDelegate("fecha_format")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","fecha_format", _ba, _fecha_sql);}
;
Debug.locals.put("fecha_sql", _fecha_sql);
 BA.debugLineNum = 222;BA.debugLine="public Sub Fecha_format(fecha_sql As String) As St";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 224;BA.debugLine="Return fecha_sql.SubString(6) & \"/\" & fecha_sql.S";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.concat(_fecha_sql.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 6))),RemoteObject.createImmutable("/"),_fecha_sql.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 4)),(Object)(BA.numberCast(int.class, 6))),RemoteObject.createImmutable("/"),_fecha_sql.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 4))));
 BA.debugLineNum = 226;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fecha_parse(RemoteObject _ba,RemoteObject _fecha) throws Exception{
try {
		Debug.PushSubsStack("fecha_parse (funciones) ","funciones",3,_ba,funciones.mostCurrent,139);
if (RapidSub.canDelegate("fecha_parse")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","fecha_parse", _ba, _fecha);}
RemoteObject _mes = RemoteObject.createImmutable("");
;
Debug.locals.put("fecha", _fecha);
 BA.debugLineNum = 139;BA.debugLine="public Sub fecha_parse(fecha As String) As String";
Debug.ShouldStop(1024);
 BA.debugLineNum = 140;BA.debugLine="Dim mes As String = fecha.SubString2(3,5)";
Debug.ShouldStop(2048);
_mes = _fecha.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("mes", _mes);Debug.locals.put("mes", _mes);
 BA.debugLineNum = 142;BA.debugLine="Return mes & \"/\" & fecha.SubString2(0,2) & \"/\" &";
Debug.ShouldStop(8192);
if (true) return RemoteObject.concat(_mes,RemoteObject.createImmutable("/"),_fecha.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable("/"),_fecha.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 6))));
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fillimagetoview(RemoteObject _ba,RemoteObject _bmp,RemoteObject _imageview) throws Exception{
try {
		Debug.PushSubsStack("FillImageToView (funciones) ","funciones",3,_ba,funciones.mostCurrent,551);
if (RapidSub.canDelegate("fillimagetoview")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","fillimagetoview", _ba, _bmp, _imageview);}
RemoteObject _bmpratio = RemoteObject.createImmutable(0f);
RemoteObject _viewratio = RemoteObject.createImmutable(0f);
RemoteObject _newheight = RemoteObject.createImmutable(0);
RemoteObject _newwidth = RemoteObject.createImmutable(0);
;
Debug.locals.put("bmp", _bmp);
Debug.locals.put("ImageView", _imageview);
 BA.debugLineNum = 551;BA.debugLine="Sub FillImageToView(bmp As B4XBitmap, ImageView As";
Debug.ShouldStop(64);
 BA.debugLineNum = 552;BA.debugLine="Dim bmpRatio As Float = bmp.Width / bmp.Height";
Debug.ShouldStop(128);
_bmpratio = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_bmp.runMethod(true,"getHeight")}, "/",0, 0));Debug.locals.put("bmpRatio", _bmpratio);Debug.locals.put("bmpRatio", _bmpratio);
 BA.debugLineNum = 553;BA.debugLine="Dim viewRatio As Float = ImageView.Width / Imag";
Debug.ShouldStop(256);
_viewratio = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_imageview.runMethod(true,"getWidth"),_imageview.runMethod(true,"getHeight")}, "/",0, 0));Debug.locals.put("viewRatio", _viewratio);Debug.locals.put("viewRatio", _viewratio);
 BA.debugLineNum = 554;BA.debugLine="If viewRatio > bmpRatio Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_viewratio,BA.numberCast(double.class, _bmpratio))) { 
 BA.debugLineNum = 555;BA.debugLine="Dim NewHeight As Int = bmp.Width / viewRatio";
Debug.ShouldStop(1024);
_newheight = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_viewratio}, "/",0, 0));Debug.locals.put("NewHeight", _newheight);Debug.locals.put("NewHeight", _newheight);
 BA.debugLineNum = 556;BA.debugLine="bmp = bmp.Crop(0, bmp.Height / 2 - NewHeight";
Debug.ShouldStop(2048);
_bmp = _bmp.runMethod(false,"Crop",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_newheight,RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, _bmp.runMethod(true,"getWidth"))),(Object)(_newheight));Debug.locals.put("bmp", _bmp);
 }else 
{ BA.debugLineNum = 557;BA.debugLine="Else if viewRatio < bmpRatio Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("<",_viewratio,BA.numberCast(double.class, _bmpratio))) { 
 BA.debugLineNum = 558;BA.debugLine="Dim NewWidth As Int = bmp.Height * viewRatio";
Debug.ShouldStop(8192);
_newwidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),_viewratio}, "*",0, 0));Debug.locals.put("NewWidth", _newwidth);Debug.locals.put("NewWidth", _newwidth);
 BA.debugLineNum = 559;BA.debugLine="bmp = bmp.Crop(bmp.Width / 2 - NewWidth / 2,";
Debug.ShouldStop(16384);
_bmp = _bmp.runMethod(false,"Crop",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),_newwidth,RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(_newwidth),(Object)(BA.numberCast(int.class, _bmp.runMethod(true,"getHeight"))));Debug.locals.put("bmp", _bmp);
 }}
;
 BA.debugLineNum = 561;BA.debugLine="ImageView.SetBitmap(bmp.Resize(ImageView.Width,";
Debug.ShouldStop(65536);
_imageview.runVoidMethod ("SetBitmap",(Object)((_bmp.runMethod(false,"Resize",(Object)(_imageview.runMethod(true,"getWidth")),(Object)(_imageview.runMethod(true,"getHeight")),(Object)(funciones.mostCurrent.__c.getField(true,"True"))).getObject())));
 BA.debugLineNum = 562;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fonttobitmap(RemoteObject _ba,RemoteObject _text,RemoteObject _ismaterialicons,RemoteObject _fontsize,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("FontToBitmap (funciones) ","funciones",3,_ba,funciones.mostCurrent,567);
if (RapidSub.canDelegate("fonttobitmap")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","fonttobitmap", _ba, _text, _ismaterialicons, _fontsize, _color);}
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _cvs1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _t = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
RemoteObject _fnt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _baseline = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
;
Debug.locals.put("text", _text);
Debug.locals.put("IsMaterialIcons", _ismaterialicons);
Debug.locals.put("FontSize", _fontsize);
Debug.locals.put("color", _color);
 BA.debugLineNum = 567;BA.debugLine="Public Sub FontToBitmap (text As String, IsMateria";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 568;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(8388608);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("xui", _xui);
 BA.debugLineNum = 569;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(16777216);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = _xui.runMethod(false,"CreatePanel",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 570;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 32dip, 32dip)";
Debug.ShouldStop(33554432);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(funciones.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))),(Object)(funciones.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))));
 BA.debugLineNum = 571;BA.debugLine="Dim cvs1 As B4XCanvas";
Debug.ShouldStop(67108864);
_cvs1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("cvs1", _cvs1);
 BA.debugLineNum = 572;BA.debugLine="cvs1.Initialize(p)";
Debug.ShouldStop(134217728);
_cvs1.runVoidMethod ("Initialize",(Object)(_p));
 BA.debugLineNum = 573;BA.debugLine="Dim t As Typeface";
Debug.ShouldStop(268435456);
_t = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");Debug.locals.put("t", _t);
 BA.debugLineNum = 574;BA.debugLine="If IsMaterialIcons Then t = Typeface.MATERIALICON";
Debug.ShouldStop(536870912);
if (_ismaterialicons.<Boolean>get().booleanValue()) { 
_t.setObject(funciones.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));}
else {
_t.setObject(funciones.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getFONTAWESOME"));};
 BA.debugLineNum = 575;BA.debugLine="Dim fnt As B4XFont = xui.CreateFont(t, FontSize)";
Debug.ShouldStop(1073741824);
_fnt = _xui.runMethod(false,"CreateFont",(Object)((_t.getObject())),(Object)(_fontsize));Debug.locals.put("fnt", _fnt);Debug.locals.put("fnt", _fnt);
 BA.debugLineNum = 576;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(text, fnt)";
Debug.ShouldStop(-2147483648);
_r = _cvs1.runMethod(false,"MeasureText",(Object)(_text),(Object)(_fnt));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 577;BA.debugLine="Dim BaseLine As Int = cvs1.TargetRect.CenterY - r";
Debug.ShouldStop(1);
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_cvs1.runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_r.runMethod(true,"getTop")}, "-/-",2, 0));Debug.locals.put("BaseLine", _baseline);Debug.locals.put("BaseLine", _baseline);
 BA.debugLineNum = 578;BA.debugLine="cvs1.DrawText(text, cvs1.TargetRect.CenterX, Base";
Debug.ShouldStop(2);
_cvs1.runVoidMethod ("DrawText",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(_text),(Object)(_cvs1.runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_fnt),(Object)(_color),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 579;BA.debugLine="Dim b As B4XBitmap = cvs1.CreateBitmap";
Debug.ShouldStop(4);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_b = _cvs1.runMethod(false,"CreateBitmap");Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 580;BA.debugLine="cvs1.Release";
Debug.ShouldStop(8);
_cvs1.runVoidMethod ("Release");
 BA.debugLineNum = 581;BA.debugLine="Return b";
Debug.ShouldStop(16);
if (true) return _b;
 BA.debugLineNum = 582;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hoy(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Hoy (funciones) ","funciones",3,_ba,funciones.mostCurrent,159);
if (RapidSub.canDelegate("hoy")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","hoy", _ba);}
;
 BA.debugLineNum = 159;BA.debugLine="public Sub Hoy As String";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 161;BA.debugLine="Return DateTime.Date( DateTime.Now )";
Debug.ShouldStop(1);
if (true) return funciones.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(funciones.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hoy2(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Hoy2 (funciones) ","funciones",3,_ba,funciones.mostCurrent,167);
if (RapidSub.canDelegate("hoy2")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","hoy2", _ba);}
;
 BA.debugLineNum = 167;BA.debugLine="public Sub Hoy2 As Long";
Debug.ShouldStop(64);
 BA.debugLineNum = 169;BA.debugLine="Return DateTime.DateParse( Hoy )";
Debug.ShouldStop(256);
if (true) return funciones.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_hoy(_ba)));
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _iif(RemoteObject _ba,RemoteObject _c,RemoteObject _trueres,RemoteObject _falseres) throws Exception{
try {
		Debug.PushSubsStack("IIF (funciones) ","funciones",3,_ba,funciones.mostCurrent,243);
if (RapidSub.canDelegate("iif")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","iif", _ba, _c, _trueres, _falseres);}
;
Debug.locals.put("c", _c);
Debug.locals.put("TrueRes", _trueres);
Debug.locals.put("FalseRes", _falseres);
 BA.debugLineNum = 243;BA.debugLine="public Sub IIF(c As Boolean, TrueRes As String, Fa";
Debug.ShouldStop(262144);
 BA.debugLineNum = 244;BA.debugLine="If c Then Return TrueRes Else Return FalseRes";
Debug.ShouldStop(524288);
if (_c.<Boolean>get().booleanValue()) { 
if (true) return _trueres;}
else {
if (true) return _falseres;};
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isfono(RemoteObject _ba,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("IsFono (funciones) ","funciones",3,_ba,funciones.mostCurrent,454);
if (RapidSub.canDelegate("isfono")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","isfono", _ba, _f);}
;
Debug.locals.put("f", _f);
 BA.debugLineNum = 454;BA.debugLine="public Sub IsFono(f As String) As Boolean";
Debug.ShouldStop(32);
 BA.debugLineNum = 455;BA.debugLine="If Not (IsNumeric(f)) Then";
Debug.ShouldStop(64);
if (funciones.mostCurrent.__c.runMethod(true,"Not",(Object)(_isnumeric(_ba,_f))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 456;BA.debugLine="Return False";
Debug.ShouldStop(128);
if (true) return funciones.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 458;BA.debugLine="If f.Length <> 9 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("!",_f.runMethod(true,"length"),BA.numberCast(double.class, 9))) { 
 BA.debugLineNum = 459;BA.debugLine="Return False";
Debug.ShouldStop(1024);
if (true) return funciones.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 462;BA.debugLine="Return True";
Debug.ShouldStop(8192);
if (true) return funciones.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 463;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ismail(RemoteObject _ba,RemoteObject _mail) throws Exception{
try {
		Debug.PushSubsStack("IsMail (funciones) ","funciones",3,_ba,funciones.mostCurrent,465);
if (RapidSub.canDelegate("ismail")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","ismail", _ba, _mail);}
RemoteObject _matchemail = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
;
Debug.locals.put("mail", _mail);
 BA.debugLineNum = 465;BA.debugLine="public Sub IsMail(mail As String) As Boolean";
Debug.ShouldStop(65536);
 BA.debugLineNum = 466;BA.debugLine="Dim MatchEmail As Matcher = Regex.Matcher(\"^(?i)[";
Debug.ShouldStop(131072);
_matchemail = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_matchemail = funciones.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$")),(Object)(_mail));Debug.locals.put("MatchEmail", _matchemail);Debug.locals.put("MatchEmail", _matchemail);
 BA.debugLineNum = 467;BA.debugLine="Return MatchEmail.Find";
Debug.ShouldStop(262144);
if (true) return _matchemail.runMethod(true,"Find");
 BA.debugLineNum = 468;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isnumeric(RemoteObject _ba,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("IsNumeric (funciones) ","funciones",3,_ba,funciones.mostCurrent,450);
if (RapidSub.canDelegate("isnumeric")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","isnumeric", _ba, _str);}
;
Debug.locals.put("str", _str);
 BA.debugLineNum = 450;BA.debugLine="public Sub IsNumeric(str As String) As Boolean";
Debug.ShouldStop(2);
 BA.debugLineNum = 451;BA.debugLine="Return IsNumber(str.Replace(\",\",\"\"))";
Debug.ShouldStop(4);
if (true) return funciones.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_str.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable("")))));
 BA.debugLineNum = 452;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobgetrows(RemoteObject _ba,RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobGetRows (funciones) ","funciones",3,_ba,funciones.mostCurrent,432);
if (RapidSub.canDelegate("jobgetrows")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","jobgetrows", _ba, _job);}
RemoteObject _rows = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _response = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
;
Debug.locals.put("job", _job);
 BA.debugLineNum = 432;BA.debugLine="Sub JobGetRows(job As HttpJob) As List";
Debug.ShouldStop(32768);
 BA.debugLineNum = 433;BA.debugLine="Dim rows As List";
Debug.ShouldStop(65536);
_rows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("rows", _rows);
 BA.debugLineNum = 434;BA.debugLine="rows.Initialize";
Debug.ShouldStop(131072);
_rows.runVoidMethod ("Initialize");
 BA.debugLineNum = 435;BA.debugLine="Dim response As String	= job.GetString";
Debug.ShouldStop(262144);
_response = _job.runMethod(true,"_getstring");Debug.locals.put("response", _response);Debug.locals.put("response", _response);
 BA.debugLineNum = 436;BA.debugLine="If response.Contains(\"[\") And response.Contains(\"";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(".",_response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("[")))) && RemoteObject.solveBoolean(".",_response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("]")))) && RemoteObject.solveBoolean("!",_response,BA.ObjectToString("[]"))) { 
 BA.debugLineNum = 437;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1048576);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 438;BA.debugLine="parser.Initialize(response)";
Debug.ShouldStop(2097152);
_parser.runVoidMethod ("Initialize",(Object)(_response));
 BA.debugLineNum = 439;BA.debugLine="rows = parser.NextArray";
Debug.ShouldStop(4194304);
_rows = _parser.runMethod(false,"NextArray");Debug.locals.put("rows", _rows);
 };
 BA.debugLineNum = 441;BA.debugLine="Return rows";
Debug.ShouldStop(16777216);
if (true) return _rows;
 BA.debugLineNum = 442;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jsondatetotick(RemoteObject _ba,RemoteObject _json_fecha) throws Exception{
try {
		Debug.PushSubsStack("JsonDateToTick (funciones) ","funciones",3,_ba,funciones.mostCurrent,228);
if (RapidSub.canDelegate("jsondatetotick")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","jsondatetotick", _ba, _json_fecha);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
;
Debug.locals.put("json_fecha", _json_fecha);
 BA.debugLineNum = 228;BA.debugLine="Sub JsonDateToTick(json_fecha As String) As Long";
Debug.ShouldStop(8);
 BA.debugLineNum = 229;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"\\d+\", json_fech";
Debug.ShouldStop(16);
_m = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_m = funciones.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("\\d+")),(Object)(_json_fecha));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 230;BA.debugLine="If m.Find Then";
Debug.ShouldStop(32);
if (_m.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 231;BA.debugLine="Return m.Match";
Debug.ShouldStop(64);
if (true) return BA.numberCast(long.class, _m.runMethod(true,"getMatch"));
 };
 BA.debugLineNum = 233;BA.debugLine="Log(\"Invalid date: \" & json_fecha)";
Debug.ShouldStop(256);
funciones.mostCurrent.__c.runVoidMethod ("LogImpl","53145733",RemoteObject.concat(RemoteObject.createImmutable("Invalid date: "),_json_fecha),0);
 BA.debugLineNum = 234;BA.debugLine="Return 0";
Debug.ShouldStop(512);
if (true) return BA.numberCast(long.class, 0);
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jsontolist(RemoteObject _ba,RemoteObject _json1) throws Exception{
try {
		Debug.PushSubsStack("JsonToList (funciones) ","funciones",3,_ba,funciones.mostCurrent,422);
if (RapidSub.canDelegate("jsontolist")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","jsontolist", _ba, _json1);}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _rows = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
;
Debug.locals.put("Json1", _json1);
 BA.debugLineNum = 422;BA.debugLine="Sub JsonToList(Json1 As String) As List";
Debug.ShouldStop(32);
 BA.debugLineNum = 423;BA.debugLine="Dim str As String = Json1 'Json vacio =>  []";
Debug.ShouldStop(64);
_str = _json1;Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 424;BA.debugLine="Dim rows As List";
Debug.ShouldStop(128);
_rows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("rows", _rows);
 BA.debugLineNum = 425;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(256);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 426;BA.debugLine="rows.Initialize";
Debug.ShouldStop(512);
_rows.runVoidMethod ("Initialize");
 BA.debugLineNum = 427;BA.debugLine="parser.Initialize(str)";
Debug.ShouldStop(1024);
_parser.runVoidMethod ("Initialize",(Object)(_str));
 BA.debugLineNum = 428;BA.debugLine="rows = parser.NextArray";
Debug.ShouldStop(2048);
_rows = _parser.runMethod(false,"NextArray");Debug.locals.put("rows", _rows);
 BA.debugLineNum = 429;BA.debugLine="Return rows  'rows.size = 0 cuando Json1 es vacio";
Debug.ShouldStop(4096);
if (true) return _rows;
 BA.debugLineNum = 430;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _left(RemoteObject _ba,RemoteObject _text,RemoteObject _length) throws Exception{
try {
		Debug.PushSubsStack("Left (funciones) ","funciones",3,_ba,funciones.mostCurrent,524);
if (RapidSub.canDelegate("left")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","left", _ba, _text, _length);}
;
Debug.locals.put("Text", _text);
Debug.locals.put("Length", _length);
 BA.debugLineNum = 524;BA.debugLine="Sub Left(Text As String, Length As Int)As String";
Debug.ShouldStop(2048);
 BA.debugLineNum = 525;BA.debugLine="If Length>Text.Length Then Length=Text.Length";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_length,BA.numberCast(double.class, _text.runMethod(true,"length")))) { 
_length = _text.runMethod(true,"length");Debug.locals.put("Length", _length);};
 BA.debugLineNum = 526;BA.debugLine="Return Text.SubString2(0, Length)";
Debug.ShouldStop(8192);
if (true) return _text.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_length));
 BA.debugLineNum = 527;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _list_to_sp(RemoteObject _ba,RemoteObject _lista,RemoteObject _key,RemoteObject _sp) throws Exception{
try {
		Debug.PushSubsStack("list_to_sp (funciones) ","funciones",3,_ba,funciones.mostCurrent,340);
if (RapidSub.canDelegate("list_to_sp")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","list_to_sp", _ba, _lista, _key, _sp);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("lista", _lista);
Debug.locals.put("key", _key);
Debug.locals.put("sp", _sp);
 BA.debugLineNum = 340;BA.debugLine="public Sub list_to_sp(lista As List, key As String";
Debug.ShouldStop(524288);
 BA.debugLineNum = 341;BA.debugLine="For Each m As Map In lista";
Debug.ShouldStop(1048576);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group1 = _lista;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_m.setObject(group1.runMethod(false,"Get",index1));
Debug.locals.put("m", _m);
 BA.debugLineNum = 342;BA.debugLine="sp.Add(m.Get(key))";
Debug.ShouldStop(2097152);
_sp.runVoidMethod ("Add",(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((_key))))));
 }
}Debug.locals.put("m", _m);
;
 BA.debugLineNum = 344;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _list_to_sp2(RemoteObject _ba,RemoteObject _lista,RemoteObject _key,RemoteObject _value,RemoteObject _sp,RemoteObject _listakey) throws Exception{
try {
		Debug.PushSubsStack("List_to_sp2 (funciones) ","funciones",3,_ba,funciones.mostCurrent,346);
if (RapidSub.canDelegate("list_to_sp2")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","list_to_sp2", _ba, _lista, _key, _value, _sp, _listakey);}
RemoteObject _m2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("lista", _lista);
Debug.locals.put("key", _key);
Debug.locals.put("value", _value);
Debug.locals.put("sp", _sp);
Debug.locals.put("listaKey", _listakey);
 BA.debugLineNum = 346;BA.debugLine="public Sub List_to_sp2(lista As List, key As Strin";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 347;BA.debugLine="Dim m2 As Map";
Debug.ShouldStop(67108864);
_m2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m2", _m2);
 BA.debugLineNum = 348;BA.debugLine="Dim i As Int";
Debug.ShouldStop(134217728);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 351;BA.debugLine="m2.Initialize";
Debug.ShouldStop(1073741824);
_m2.runVoidMethod ("Initialize");
 BA.debugLineNum = 352;BA.debugLine="For Each m As Map In lista";
Debug.ShouldStop(-2147483648);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group4 = _lista;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_m.setObject(group4.runMethod(false,"Get",index4));
Debug.locals.put("m", _m);
 BA.debugLineNum = 353;BA.debugLine="m2.Put(m.Get(key), m.Get(value))";
Debug.ShouldStop(1);
_m2.runVoidMethod ("Put",(Object)(_m.runMethod(false,"Get",(Object)((_key)))),(Object)(_m.runMethod(false,"Get",(Object)((_value)))));
 }
}Debug.locals.put("m", _m);
;
 BA.debugLineNum = 356;BA.debugLine="listaKey.Clear";
Debug.ShouldStop(8);
_listakey.runVoidMethod ("Clear");
 BA.debugLineNum = 357;BA.debugLine="sp.Clear";
Debug.ShouldStop(16);
_sp.runVoidMethod ("Clear");
 BA.debugLineNum = 358;BA.debugLine="For i=0 To m2.Size-1";
Debug.ShouldStop(32);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_m2.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 359;BA.debugLine="sp.Add(m2.GetValueAt(i))";
Debug.ShouldStop(64);
_sp.runVoidMethod ("Add",(Object)(BA.ObjectToString(_m2.runMethod(false,"GetValueAt",(Object)(_i)))));
 BA.debugLineNum = 360;BA.debugLine="listaKey.Add(m2.GetKeyAt(i))";
Debug.ShouldStop(128);
_listakey.runVoidMethod ("Add",(Object)(_m2.runMethod(false,"GetKeyAt",(Object)(_i))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 362;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _manana(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Manana (funciones) ","funciones",3,_ba,funciones.mostCurrent,191);
if (RapidSub.canDelegate("manana")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","manana", _ba);}
;
 BA.debugLineNum = 191;BA.debugLine="Public Sub Manana As String";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 193;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
Debug.ShouldStop(1);
funciones.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 194;BA.debugLine="Return DateTime.Date( Manana_date )";
Debug.ShouldStop(2);
if (true) return funciones.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_manana_date(_ba)));
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _manana_date(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Manana_date (funciones) ","funciones",3,_ba,funciones.mostCurrent,200);
if (RapidSub.canDelegate("manana_date")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","manana_date", _ba);}
;
 BA.debugLineNum = 200;BA.debugLine="Public Sub Manana_date As Long";
Debug.ShouldStop(128);
 BA.debugLineNum = 202;BA.debugLine="Return DateTime.Add(DateTime.now,0,0,1)";
Debug.ShouldStop(512);
if (true) return funciones.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(funciones.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mensaje(RemoteObject _ba,RemoteObject _texto,RemoteObject _tipo) throws Exception{
try {
		Debug.PushSubsStack("mensaje (funciones) ","funciones",3,_ba,funciones.mostCurrent,121);
if (RapidSub.canDelegate("mensaje")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","mensaje", _ba, _texto, _tipo);}
;
Debug.locals.put("texto", _texto);
Debug.locals.put("tipo", _tipo);
 BA.debugLineNum = 121;BA.debugLine="public Sub mensaje(texto As String, tipo As String";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="Msgbox2(texto, App_tit & \" \" & App_ver,  \"Ok\", \"\"";
Debug.ShouldStop(33554432);
funciones.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(_texto)),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(funciones._app_tit,RemoteObject.createImmutable(" "),funciones._app_ver))),(Object)(BA.ObjectToString("Ok")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)((funciones.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(funciones.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(_tipo,RemoteObject.createImmutable(".png")))).getObject())),_ba);
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mid(RemoteObject _ba,RemoteObject _text,RemoteObject _start,RemoteObject _length) throws Exception{
try {
		Debug.PushSubsStack("Mid (funciones) ","funciones",3,_ba,funciones.mostCurrent,534);
if (RapidSub.canDelegate("mid")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","mid", _ba, _text, _start, _length);}
;
Debug.locals.put("Text", _text);
Debug.locals.put("Start", _start);
Debug.locals.put("Length", _length);
 BA.debugLineNum = 534;BA.debugLine="Sub Mid(Text As String, Start As Int, Length As In";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 535;BA.debugLine="Return Text.SubString2(Start-1,Start+Length-1)";
Debug.ShouldStop(4194304);
if (true) return _text.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_start,RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_start,_length,RemoteObject.createImmutable(1)}, "+-",2, 1)));
 BA.debugLineNum = 536;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parse_fecha_hora(RemoteObject _ba,RemoteObject _fecha_hora) throws Exception{
try {
		Debug.PushSubsStack("Parse_fecha_hora (funciones) ","funciones",3,_ba,funciones.mostCurrent,147);
if (RapidSub.canDelegate("parse_fecha_hora")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","parse_fecha_hora", _ba, _fecha_hora);}
;
Debug.locals.put("fecha_hora", _fecha_hora);
 BA.debugLineNum = 147;BA.debugLine="public Sub Parse_fecha_hora(fecha_hora As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 149;BA.debugLine="If fecha_hora <> \"\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("!",_fecha_hora,BA.ObjectToString(""))) { 
 BA.debugLineNum = 150;BA.debugLine="Return DateTime.DateTimeParse( Left(fecha_hora,1";
Debug.ShouldStop(2097152);
if (true) return funciones.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateTimeParse",(Object)(_left(_ba,_fecha_hora,BA.numberCast(int.class, 10))),(Object)(_right(_ba,_fecha_hora,BA.numberCast(int.class, 8))));
 }else {
 BA.debugLineNum = 152;BA.debugLine="Return DateTime.Now";
Debug.ShouldStop(8388608);
if (true) return funciones.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");
 };
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 17;BA.debugLine="Dim Const MAX_CACHE_SIZE As Int = 200";
funciones._max_cache_size = BA.numberCast(int.class, 200);
 //BA.debugLineNum = 18;BA.debugLine="Dim App_tit As String";
funciones._app_tit = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Dim App_ver As String";
funciones._app_ver = RemoteObject.createImmutable("");
 //BA.debugLineNum = 21;BA.debugLine="Dim App_tts As Boolean";
funciones._app_tts = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 22;BA.debugLine="Dim App_vibrar As Boolean";
funciones._app_vibrar = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 23;BA.debugLine="Dim App_dictado As Boolean";
funciones._app_dictado = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 24;BA.debugLine="Dim App_wifi As Boolean";
funciones._app_wifi = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 26;BA.debugLine="Dim Ok As Boolean";
funciones._ok = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _ptotocoma(RemoteObject _ba,RemoteObject _numpto) throws Exception{
try {
		Debug.PushSubsStack("PtoToComa (funciones) ","funciones",3,_ba,funciones.mostCurrent,542);
if (RapidSub.canDelegate("ptotocoma")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","ptotocoma", _ba, _numpto);}
RemoteObject _ns = RemoteObject.createImmutable("");
;
Debug.locals.put("NumPto", _numpto);
 BA.debugLineNum = 542;BA.debugLine="public Sub PtoToComa(NumPto As Double) As String";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 543;BA.debugLine="Dim ns As String = NumPto";
Debug.ShouldStop(1073741824);
_ns = BA.NumberToString(_numpto);Debug.locals.put("ns", _ns);Debug.locals.put("ns", _ns);
 BA.debugLineNum = 544;BA.debugLine="Return ns.Replace(\".\",\",\")";
Debug.ShouldStop(-2147483648);
if (true) return _ns.runMethod(true,"replace",(Object)(BA.ObjectToString(".")),(Object)(RemoteObject.createImmutable(",")));
 BA.debugLineNum = 545;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _randomnumber(RemoteObject _ba,RemoteObject _lowest,RemoteObject _highest,RemoteObject _decimalplaces,RemoteObject _preventzero) throws Exception{
try {
		Debug.PushSubsStack("RandomNumber (funciones) ","funciones",3,_ba,funciones.mostCurrent,48);
if (RapidSub.canDelegate("randomnumber")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","randomnumber", _ba, _lowest, _highest, _decimalplaces, _preventzero);}
RemoteObject _decimal = RemoteObject.createImmutable(0);
RemoteObject _tempvalue = RemoteObject.createImmutable(0);
RemoteObject _returnvalue = RemoteObject.createImmutable(0);
;
Debug.locals.put("Lowest", _lowest);
Debug.locals.put("Highest", _highest);
Debug.locals.put("DecimalPlaces", _decimalplaces);
Debug.locals.put("PreventZero", _preventzero);
 BA.debugLineNum = 48;BA.debugLine="Sub RandomNumber(Lowest As Double, Highest As Doub";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Lowest  = Round(Lowest)";
Debug.ShouldStop(65536);
_lowest = BA.numberCast(double.class, funciones.mostCurrent.__c.runMethod(true,"Round",(Object)(_lowest)));Debug.locals.put("Lowest", _lowest);
 BA.debugLineNum = 50;BA.debugLine="Highest = Round(Highest)";
Debug.ShouldStop(131072);
_highest = BA.numberCast(double.class, funciones.mostCurrent.__c.runMethod(true,"Round",(Object)(_highest)));Debug.locals.put("Highest", _highest);
 BA.debugLineNum = 51;BA.debugLine="Dim Decimal As Double";
Debug.ShouldStop(262144);
_decimal = RemoteObject.createImmutable(0);Debug.locals.put("Decimal", _decimal);
 BA.debugLineNum = 52;BA.debugLine="If DecimalPlaces > 0 Then Decimal = (Rnd(0, Power";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_decimalplaces,BA.numberCast(double.class, 0))) { 
_decimal = RemoteObject.solve(new RemoteObject[] {(funciones.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, funciones.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, 10)),(Object)(BA.numberCast(double.class, _decimalplaces))))))),funciones.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, 10)),(Object)(BA.numberCast(double.class, _decimalplaces)))}, "/",0, 0);Debug.locals.put("Decimal", _decimal);};
 BA.debugLineNum = 53;BA.debugLine="If Lowest = Highest Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_lowest,_highest)) { 
 BA.debugLineNum = 54;BA.debugLine="Return  NumberFormat(Lowest, 0, 0)";
Debug.ShouldStop(2097152);
if (true) return funciones.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(_lowest),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 }else {
 BA.debugLineNum = 56;BA.debugLine="If Lowest > Highest Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_lowest,_highest)) { 
 BA.debugLineNum = 57;BA.debugLine="Dim TempValue = Lowest As Double";
Debug.ShouldStop(16777216);
_tempvalue = _lowest;Debug.locals.put("TempValue", _tempvalue);Debug.locals.put("TempValue", _tempvalue);
 BA.debugLineNum = 58;BA.debugLine="Lowest   = Highest";
Debug.ShouldStop(33554432);
_lowest = _highest;Debug.locals.put("Lowest", _lowest);
 BA.debugLineNum = 59;BA.debugLine="Highest  = TempValue";
Debug.ShouldStop(67108864);
_highest = _tempvalue;Debug.locals.put("Highest", _highest);
 };
 BA.debugLineNum = 61;BA.debugLine="Dim ReturnValue = Lowest + Rnd(0, Highest - Lowe";
Debug.ShouldStop(268435456);
_returnvalue = RemoteObject.solve(new RemoteObject[] {_lowest,funciones.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_highest,_lowest}, "-",1, 0)))),_decimal}, "++",2, 0);Debug.locals.put("ReturnValue", _returnvalue);Debug.locals.put("ReturnValue", _returnvalue);
 BA.debugLineNum = 62;BA.debugLine="If ReturnValue = 0 And PreventZero Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_returnvalue,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",_preventzero)) { 
 BA.debugLineNum = 63;BA.debugLine="Return NumberFormat(RandomNumber(Lowest, Highes";
Debug.ShouldStop(1073741824);
if (true) return funciones.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _randomnumber(_ba,_lowest,_highest,_decimalplaces,_preventzero))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 }else {
 BA.debugLineNum = 65;BA.debugLine="Return NumberFormat(ReturnValue,0,0)";
Debug.ShouldStop(1);
if (true) return funciones.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(_returnvalue),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 };
 };
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rgb(RemoteObject _ba,RemoteObject _colorhex) throws Exception{
try {
		Debug.PushSubsStack("RGB (funciones) ","funciones",3,_ba,funciones.mostCurrent,81);
if (RapidSub.canDelegate("rgb")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","rgb", _ba, _colorhex);}
RemoteObject _r = RemoteObject.createImmutable(0);
RemoteObject _g = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.createImmutable(0);
;
Debug.locals.put("colorHex", _colorhex);
 BA.debugLineNum = 81;BA.debugLine="Sub RGB(colorHex As String) As Int()";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="Dim R = Bit.ParseInt(colorHex.SubString2(1, 3), 1";
Debug.ShouldStop(131072);
_r = funciones.mostCurrent.__c.getField(false,"Bit").runMethod(true,"ParseInt",(Object)(_colorhex.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3)))),(Object)(BA.numberCast(int.class, 16)));Debug.locals.put("R", _r);Debug.locals.put("R", _r);
 BA.debugLineNum = 83;BA.debugLine="Dim G = Bit.ParseInt(colorHex.SubString2(3, 5), 1";
Debug.ShouldStop(262144);
_g = funciones.mostCurrent.__c.getField(false,"Bit").runMethod(true,"ParseInt",(Object)(_colorhex.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)))),(Object)(BA.numberCast(int.class, 16)));Debug.locals.put("G", _g);Debug.locals.put("G", _g);
 BA.debugLineNum = 84;BA.debugLine="Dim B = Bit.ParseInt(colorHex.SubString2(5, 7), 1";
Debug.ShouldStop(524288);
_b = funciones.mostCurrent.__c.getField(false,"Bit").runMethod(true,"ParseInt",(Object)(_colorhex.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 7)))),(Object)(BA.numberCast(int.class, 16)));Debug.locals.put("B", _b);Debug.locals.put("B", _b);
 BA.debugLineNum = 85;BA.debugLine="Return Array As Int(R, G, B)";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.createNewArray("int",new int[] {3},new Object[] {_r,_g,_b});
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _right(RemoteObject _ba,RemoteObject _text,RemoteObject _length) throws Exception{
try {
		Debug.PushSubsStack("Right (funciones) ","funciones",3,_ba,funciones.mostCurrent,529);
if (RapidSub.canDelegate("right")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","right", _ba, _text, _length);}
;
Debug.locals.put("Text", _text);
Debug.locals.put("Length", _length);
 BA.debugLineNum = 529;BA.debugLine="Sub Right(Text As String, Length As Int) As String";
Debug.ShouldStop(65536);
 BA.debugLineNum = 530;BA.debugLine="If Length>Text.Length Then Length=Text.Length";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_length,BA.numberCast(double.class, _text.runMethod(true,"length")))) { 
_length = _text.runMethod(true,"length");Debug.locals.put("Length", _length);};
 BA.debugLineNum = 531;BA.debugLine="Return Text.SubString(Text.Length - Length)";
Debug.ShouldStop(262144);
if (true) return _text.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_text.runMethod(true,"length"),_length}, "-",1, 1)));
 BA.debugLineNum = 532;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rs_to_list(RemoteObject _ba,RemoteObject _rs,RemoteObject _campo) throws Exception{
try {
		Debug.PushSubsStack("rs_to_list (funciones) ","funciones",3,_ba,funciones.mostCurrent,386);
if (RapidSub.canDelegate("rs_to_list")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","rs_to_list", _ba, _rs, _campo);}
RemoteObject _li = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
Debug.locals.put("rs", _rs);
Debug.locals.put("campo", _campo);
 BA.debugLineNum = 386;BA.debugLine="Sub rs_to_list(rs As ResultSet, campo As String) A";
Debug.ShouldStop(2);
 BA.debugLineNum = 387;BA.debugLine="Dim li As List";
Debug.ShouldStop(4);
_li = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("li", _li);
 BA.debugLineNum = 388;BA.debugLine="li.Initialize";
Debug.ShouldStop(8);
_li.runVoidMethod ("Initialize");
 BA.debugLineNum = 389;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(16);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 390;BA.debugLine="li.Add(rs.GetString(campo))";
Debug.ShouldStop(32);
_li.runVoidMethod ("Add",(Object)((_rs.runMethod(true,"GetString",(Object)(_campo)))));
 }
;
 BA.debugLineNum = 393;BA.debugLine="Return li";
Debug.ShouldStop(256);
if (true) return _li;
 BA.debugLineNum = 394;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _set_app(RemoteObject _ba,RemoteObject _tit,RemoteObject _ver) throws Exception{
try {
		Debug.PushSubsStack("set_app (funciones) ","funciones",3,_ba,funciones.mostCurrent,100);
if (RapidSub.canDelegate("set_app")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","set_app", _ba, _tit, _ver);}
;
Debug.locals.put("tit", _tit);
Debug.locals.put("ver", _ver);
 BA.debugLineNum = 100;BA.debugLine="public Sub set_app(tit As String, ver As String)";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="App_tit = tit";
Debug.ShouldStop(16);
funciones._app_tit = _tit;
 BA.debugLineNum = 102;BA.debugLine="App_ver = ver";
Debug.ShouldStop(32);
funciones._app_ver = _ver;
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _set_config(RemoteObject _ba,RemoteObject _tts,RemoteObject _vibrar,RemoteObject _dictado,RemoteObject _wifi) throws Exception{
try {
		Debug.PushSubsStack("set_config (funciones) ","funciones",3,_ba,funciones.mostCurrent,105);
if (RapidSub.canDelegate("set_config")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","set_config", _ba, _tts, _vibrar, _dictado, _wifi);}
;
Debug.locals.put("tts", _tts);
Debug.locals.put("vibrar", _vibrar);
Debug.locals.put("dictado", _dictado);
Debug.locals.put("wifi", _wifi);
 BA.debugLineNum = 105;BA.debugLine="public Sub set_config(tts As Boolean, vibrar As Bo";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="App_tts = tts";
Debug.ShouldStop(512);
funciones._app_tts = _tts;
 BA.debugLineNum = 107;BA.debugLine="App_vibrar = vibrar";
Debug.ShouldStop(1024);
funciones._app_vibrar = _vibrar;
 BA.debugLineNum = 108;BA.debugLine="App_dictado = dictado";
Debug.ShouldStop(2048);
funciones._app_dictado = _dictado;
 BA.debugLineNum = 109;BA.debugLine="App_wifi = wifi";
Debug.ShouldStop(4096);
funciones._app_wifi = _wifi;
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spid(RemoteObject _ba,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("spId (funciones) ","funciones",3,_ba,funciones.mostCurrent,264);
if (RapidSub.canDelegate("spid")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","spid", _ba, _s);}
RemoteObject _p = RemoteObject.createImmutable(0);
;
Debug.locals.put("s", _s);
 BA.debugLineNum = 264;BA.debugLine="Public Sub spId(s As String) As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 265;BA.debugLine="Dim p As Int = s.IndexOf(\"#\")";
Debug.ShouldStop(256);
_p = _s.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("#")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 266;BA.debugLine="If p >= 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("g",_p,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 267;BA.debugLine="Return s.SubString(p + 1).trim";
Debug.ShouldStop(1024);
if (true) return _s.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_p,RemoteObject.createImmutable(1)}, "+",1, 1))).runMethod(true,"trim");
 }else {
 BA.debugLineNum = 269;BA.debugLine="Return \"\"";
Debug.ShouldStop(4096);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spindexid(RemoteObject _ba,RemoteObject _sp,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("spIndexId (funciones) ","funciones",3,_ba,funciones.mostCurrent,293);
if (RapidSub.canDelegate("spindexid")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","spindexid", _ba, _sp, _id);}
RemoteObject _item = RemoteObject.createImmutable("");
int _i = 0;
;
Debug.locals.put("sp", _sp);
Debug.locals.put("id", _id);
 BA.debugLineNum = 293;BA.debugLine="public Sub spIndexId(sp As Spinner, id As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 294;BA.debugLine="Dim item As String";
Debug.ShouldStop(32);
_item = RemoteObject.createImmutable("");Debug.locals.put("item", _item);
 BA.debugLineNum = 295;BA.debugLine="For i=0 To sp.Size-1";
Debug.ShouldStop(64);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_sp.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 296;BA.debugLine="item = sp.GetItem(i)";
Debug.ShouldStop(128);
_item = _sp.runMethod(true,"GetItem",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("item", _item);
 BA.debugLineNum = 297;BA.debugLine="If id.ToLowerCase = item.SubString( item.IndexOf";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_id.runMethod(true,"toLowerCase"),_item.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_item.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("#"))),RemoteObject.createImmutable(1)}, "+",1, 1))).runMethod(true,"toLowerCase").runMethod(true,"trim"))) { 
 BA.debugLineNum = 298;BA.debugLine="Return i";
Debug.ShouldStop(512);
if (true) return BA.numberCast(int.class, _i);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 301;BA.debugLine="Return -1";
Debug.ShouldStop(4096);
if (true) return BA.numberCast(int.class, -(double) (0 + 1));
 BA.debugLineNum = 302;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spindexnombre(RemoteObject _ba,RemoteObject _sp,RemoteObject _nombre) throws Exception{
try {
		Debug.PushSubsStack("spIndexNombre (funciones) ","funciones",3,_ba,funciones.mostCurrent,282);
if (RapidSub.canDelegate("spindexnombre")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","spindexnombre", _ba, _sp, _nombre);}
RemoteObject _item = RemoteObject.createImmutable("");
int _i = 0;
;
Debug.locals.put("sp", _sp);
Debug.locals.put("nombre", _nombre);
 BA.debugLineNum = 282;BA.debugLine="Public Sub spIndexNombre(sp As Spinner, nombre As";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 283;BA.debugLine="Dim item As String";
Debug.ShouldStop(67108864);
_item = RemoteObject.createImmutable("");Debug.locals.put("item", _item);
 BA.debugLineNum = 284;BA.debugLine="For i=0 To sp.Size-1";
Debug.ShouldStop(134217728);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_sp.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 285;BA.debugLine="item = sp.GetItem(i)";
Debug.ShouldStop(268435456);
_item = _sp.runMethod(true,"GetItem",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("item", _item);
 BA.debugLineNum = 286;BA.debugLine="If nombre.ToLowerCase = item.SubString2(0, item.";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_nombre.runMethod(true,"toLowerCase"),_item.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_item.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("#"))))).runMethod(true,"toLowerCase").runMethod(true,"trim"))) { 
 BA.debugLineNum = 287;BA.debugLine="Return i";
Debug.ShouldStop(1073741824);
if (true) return BA.numberCast(int.class, _i);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 290;BA.debugLine="Return -1";
Debug.ShouldStop(2);
if (true) return BA.numberCast(int.class, -(double) (0 + 1));
 BA.debugLineNum = 291;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _split(RemoteObject _ba,RemoteObject _text,RemoteObject _delimiter) throws Exception{
try {
		Debug.PushSubsStack("Split (funciones) ","funciones",3,_ba,funciones.mostCurrent,538);
if (RapidSub.canDelegate("split")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","split", _ba, _text, _delimiter);}
;
Debug.locals.put("Text", _text);
Debug.locals.put("delimiter", _delimiter);
 BA.debugLineNum = 538;BA.debugLine="Sub Split(Text As String, delimiter As String) As";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 539;BA.debugLine="Return Regex.Split(delimiter,Text)";
Debug.ShouldStop(67108864);
if (true) return funciones.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(_delimiter),(Object)(_text));
 BA.debugLineNum = 540;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spnombre(RemoteObject _ba,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("spNombre (funciones) ","funciones",3,_ba,funciones.mostCurrent,273);
if (RapidSub.canDelegate("spnombre")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","spnombre", _ba, _s);}
RemoteObject _p = RemoteObject.createImmutable(0);
;
Debug.locals.put("s", _s);
 BA.debugLineNum = 273;BA.debugLine="public Sub spNombre(s As String) As String";
Debug.ShouldStop(65536);
 BA.debugLineNum = 274;BA.debugLine="Dim p As Int = s.IndexOf(\"#\")";
Debug.ShouldStop(131072);
_p = _s.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("#")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 275;BA.debugLine="If p >= 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("g",_p,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 276;BA.debugLine="Return s.SubString2(0,p).Trim";
Debug.ShouldStop(524288);
if (true) return _s.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_p)).runMethod(true,"trim");
 }else {
 BA.debugLineNum = 278;BA.debugLine="Return s";
Debug.ShouldStop(2097152);
if (true) return _s;
 };
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sql_to_sp(RemoteObject _ba,RemoteObject _sql_1campo,RemoteObject _sp) throws Exception{
try {
		Debug.PushSubsStack("sql_to_sp (funciones) ","funciones",3,_ba,funciones.mostCurrent,304);
if (RapidSub.canDelegate("sql_to_sp")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","sql_to_sp", _ba, _sql_1campo, _sp);}
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("sql_1campo", _sql_1campo);
Debug.locals.put("sp", _sp);
 BA.debugLineNum = 304;BA.debugLine="public Sub sql_to_sp(sql_1campo As String, sp As S";
Debug.ShouldStop(32768);
 BA.debugLineNum = 305;BA.debugLine="Dim rs As ResultSet = comun.SQL1.ExecQuery(sql_1c";
Debug.ShouldStop(65536);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_rs.setObject(funciones.mostCurrent._comun._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql_1campo)));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 306;BA.debugLine="sp.Clear";
Debug.ShouldStop(131072);
_sp.runVoidMethod ("Clear");
 BA.debugLineNum = 307;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(262144);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 308;BA.debugLine="sp.Add(rs.GetString2(0))";
Debug.ShouldStop(524288);
_sp.runVoidMethod ("Add",(Object)(_rs.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0)))));
 }
;
 BA.debugLineNum = 310;BA.debugLine="rs.Close";
Debug.ShouldStop(2097152);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 311;BA.debugLine="sp.SelectedIndex = 0";
Debug.ShouldStop(4194304);
_sp.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 312;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sql_to_sp2(RemoteObject _ba,RemoteObject _sql_2campos,RemoteObject _sp) throws Exception{
try {
		Debug.PushSubsStack("sql_to_sp2 (funciones) ","funciones",3,_ba,funciones.mostCurrent,314);
if (RapidSub.canDelegate("sql_to_sp2")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","sql_to_sp2", _ba, _sql_2campos, _sp);}
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("sql_2campos", _sql_2campos);
Debug.locals.put("sp", _sp);
 BA.debugLineNum = 314;BA.debugLine="public Sub sql_to_sp2(sql_2campos As String, sp As";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 315;BA.debugLine="Dim rs As ResultSet = comun.SQL1.ExecQuery(sql_2c";
Debug.ShouldStop(67108864);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_rs.setObject(funciones.mostCurrent._comun._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql_2campos)));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 316;BA.debugLine="sp.Clear";
Debug.ShouldStop(134217728);
_sp.runVoidMethod ("Clear");
 BA.debugLineNum = 317;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(268435456);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 318;BA.debugLine="sp.Add(rs.GetString2(0) & \" #\" & rs.GetString2(1";
Debug.ShouldStop(536870912);
_sp.runVoidMethod ("Add",(Object)(RemoteObject.concat(_rs.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable(" #"),_rs.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 1))))));
 }
;
 BA.debugLineNum = 320;BA.debugLine="rs.Close";
Debug.ShouldStop(-2147483648);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 321;BA.debugLine="sp.SelectedIndex = 0";
Debug.ShouldStop(1);
_sp.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sql_to_spli(RemoteObject _ba,RemoteObject _sql_2campos,RemoteObject _sp,RemoteObject _li) throws Exception{
try {
		Debug.PushSubsStack("sql_to_spli (funciones) ","funciones",3,_ba,funciones.mostCurrent,328);
if (RapidSub.canDelegate("sql_to_spli")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","sql_to_spli", _ba, _sql_2campos, _sp, _li);}
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("sql_2campos", _sql_2campos);
Debug.locals.put("sp", _sp);
Debug.locals.put("Li", _li);
 BA.debugLineNum = 328;BA.debugLine="public Sub sql_to_spli(sql_2campos As String, sp A";
Debug.ShouldStop(128);
 BA.debugLineNum = 329;BA.debugLine="Dim rs As ResultSet = comun.SQL1.ExecQuery(sql_2c";
Debug.ShouldStop(256);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_rs.setObject(funciones.mostCurrent._comun._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql_2campos)));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 330;BA.debugLine="sp.Clear";
Debug.ShouldStop(512);
_sp.runVoidMethod ("Clear");
 BA.debugLineNum = 331;BA.debugLine="Li.Initialize";
Debug.ShouldStop(1024);
_li.runVoidMethod ("Initialize");
 BA.debugLineNum = 332;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(2048);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 333;BA.debugLine="sp.Add(rs.GetString2(1))";
Debug.ShouldStop(4096);
_sp.runVoidMethod ("Add",(Object)(_rs.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 334;BA.debugLine="Li.Add(rs.GetString2(0))";
Debug.ShouldStop(8192);
_li.runVoidMethod ("Add",(Object)((_rs.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))))));
 }
;
 BA.debugLineNum = 336;BA.debugLine="rs.Close";
Debug.ShouldStop(32768);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 337;BA.debugLine="sp.SelectedIndex = 0";
Debug.ShouldStop(65536);
_sp.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sqlint_to_list(RemoteObject _ba,RemoteObject _sql,RemoteObject _campo) throws Exception{
try {
		Debug.PushSubsStack("sqlInt_to_list (funciones) ","funciones",3,_ba,funciones.mostCurrent,396);
if (RapidSub.canDelegate("sqlint_to_list")) { return b4a.example.funciones.remoteMe.runUserSub(false, "funciones","sqlint_to_list", _ba, _sql, _campo);}
RemoteObject _li = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("sql", _sql);
Debug.locals.put("campo", _campo);
 BA.debugLineNum = 396;BA.debugLine="Sub sqlInt_to_list(sql As String, campo As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 397;BA.debugLine="Dim li As List";
Debug.ShouldStop(4096);
_li = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("li", _li);
 BA.debugLineNum = 398;BA.debugLine="li.Initialize";
Debug.ShouldStop(8192);
_li.runVoidMethod ("Initialize");
 BA.debugLineNum = 399;BA.debugLine="Dim rs As ResultSet = comun.SQL1.ExecQuery(sql)";
Debug.ShouldStop(16384);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_rs.setObject(funciones.mostCurrent._comun._sql1 /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 400;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(32768);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 401;BA.debugLine="li.Add(rs.GetLong(campo))";
Debug.ShouldStop(65536);
_li.runVoidMethod ("Add",(Object)((_rs.runMethod(true,"GetLong",(Object)(_campo)))));
 }
;
 BA.debugLineNum = 404;BA.debugLine="Return li";
Debug.ShouldStop(524288);
if (true) return _li;
 BA.debugLineNum = 405;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}