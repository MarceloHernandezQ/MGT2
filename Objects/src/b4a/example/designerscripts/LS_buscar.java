package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_buscar{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[buscar/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="txBus.HorizontalCenter=50%x"[buscar/General script]
views.get("txbus").vw.setLeft((int)((50d / 100 * width) - (views.get("txbus").vw.getWidth() / 2)));
//BA.debugLineNum = 5;BA.debugLine="btBuscar.HorizontalCenter=50%x"[buscar/General script]
views.get("btbuscar").vw.setLeft((int)((50d / 100 * width) - (views.get("btbuscar").vw.getWidth() / 2)));

}
}