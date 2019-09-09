B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.3
@EndOfDesignText@
'*****************************************************
'
' Modulo de código con funciones de proposito general
'
' Javier Gomez
' abril 2016
'
'
'*****************************************************

#Region Globals

'#IgnoreWarnings: 9
'-- Variables sin uso, se debe activar una nueva funcion que las incluye
'--
Sub Process_Globals
	Dim Const MAX_CACHE_SIZE As Int = 200
	Dim App_tit As String
	Dim App_ver As String
	
	Dim App_tts As Boolean
	Dim App_vibrar As Boolean
	Dim App_dictado As Boolean
	Dim App_wifi As Boolean

	Dim Ok As Boolean	
	'Dim Mlw As MLwifi
End Sub
#End Region

#region Movil

'public Sub Con_Red As Boolean
'	Dim e As Boolean = False
'	
'	e = Mlw.isWifiConnected
'	If e Then
'		e = Mlw.isOnline         'PENDIENTE verificar sin Ping -- isOnlinePing4(comun.cfgServer, 5000) 'max. 5 seg. de espera
'	Else
'		e = Mlw.isMobileConnected
'		If e Then
'			e = Mlw.isOnline			'PENDIENTE -- isOnlinePing4(comun.cfgServer, 5000)
'		End If
'	End If
'	Return e
'End Sub

Sub RandomNumber(Lowest As Double, Highest As Double, DecimalPlaces As Int, PreventZero As Boolean) As String
	Lowest  = Round(Lowest)
	Highest = Round(Highest)
	Dim Decimal As Double
	If DecimalPlaces > 0 Then Decimal = (Rnd(0, Power(10, DecimalPlaces))) / Power(10, DecimalPlaces)
	If Lowest = Highest Then
		Return  NumberFormat(Lowest, 0, 0)
	Else
		If Lowest > Highest Then
			Dim TempValue = Lowest As Double
			Lowest   = Highest
			Highest  = TempValue
		End If
		Dim ReturnValue = Lowest + Rnd(0, Highest - Lowest) + Decimal As Double
		If ReturnValue = 0 And PreventZero Then
			Return NumberFormat(RandomNumber(Lowest, Highest, DecimalPlaces, PreventZero),0,0)
		Else
			Return NumberFormat(ReturnValue,0,0)
		End If
	End If
End Sub

'Sub Get_Numero_Movil As String
'	Dim pid As PhoneId
'	Return pid.GetLine1Number
'End Sub

#end region

#region Colores

'Retorna vector de enteros para asignar color con funcion Colors.ARGB(Alpha, R, G, B)
'Ejemplo:  Log("RGB: " & RGB(0), & ", " & RGB(1) & ", " & RGB(2))
Sub RGB(colorHex As String) As Int()
	Dim R = Bit.ParseInt(colorHex.SubString2(1, 3), 16) As Int
	Dim G = Bit.ParseInt(colorHex.SubString2(3, 5), 16) As Int
	Dim B = Bit.ParseInt(colorHex.SubString2(5, 7), 16) As Int
	Return Array As Int(R, G, B)
End Sub

public Sub Color_ingreso_valor As Int
	Return Colors.ARGB(50, 255, 216, 0)
End Sub

public Sub Color_no_ingreso_valor As Int
	Return Colors.ARGB(50, 173, 216, 230)
End Sub

#End Region

#region config

public Sub set_app(tit As String, ver As String)
	App_tit = tit
	App_ver = ver
End Sub

public Sub set_config(tts As Boolean, vibrar As Boolean, dictado As Boolean, wifi As Boolean)
	App_tts = tts
	App_vibrar = vibrar
	App_dictado = dictado
	App_wifi = wifi
End Sub

#End Region

#region Mensajes

'-------
' msg : texto de mensaje
' modulo : para indicar modulo donde se muestra
' tipo : para indicar icono .png de mensaje  info - alerta - error
'-------
public Sub mensaje(texto As String, tipo As String)
	Msgbox2(texto, App_tit & " " & App_ver,  "Ok", "", "", LoadBitmap(File.DirAssets, tipo & ".png"))
End Sub



'-------
' Return True si la pregunta se responde con boton Si
' False con botón No
'
' se usa icono pregunta.png
'-------

#end region

#region Fecha
' una fecha con formato dd/mm/yyyy la retorna como mm/dd/yyyy para usar DateParse
'
public Sub fecha_parse(fecha As String) As String
	Dim mes As String = fecha.SubString2(3,5)

	Return mes & "/" & fecha.SubString2(0,2) & "/" & fecha.SubString(6)	
End Sub

' retorna los ticks correspondientes a la fecha-hora dd/mm/yyyy hh:mm:ss
'
public Sub Parse_fecha_hora(fecha_hora As String) As Long
	
	If fecha_hora <> "" Then
		Return DateTime.DateTimeParse( Left(fecha_hora,10), Right(fecha_hora,8))
	Else
		Return DateTime.Now
	End If
	
End Sub

' retorna fecha de hoy como dd/mm/yyyy
'
public Sub Hoy As String
	
	Return DateTime.Date( DateTime.Now )
	
End Sub

' retorna los tick de la fecha de hoy
'
public Sub Hoy2 As Long
	
	Return DateTime.DateParse( Hoy )
	
End Sub

' retorna fecha de ayer  dd/mm/yyyy
'
public Sub Ayer As String

	Return DateTime.Date( Ayer_date )			

End Sub

' retorna fecha de ayer como ticks
'
public Sub Ayer_date As Long
	
	Return DateTime.Add(DateTime.now,0,0,-1)
	
End Sub

' retorna fecha de mañana  dd/mm/yyyy
'
Public Sub Manana As String
	
	DateTime.DateFormat = "dd/MM/yyyy"
	Return DateTime.Date( Manana_date )		
	
End Sub

' retorna fecha de mañana como Ticks
'
Public Sub Manana_date As Long

	Return DateTime.Add(DateTime.now,0,0,1) 

End Sub

' retorna cadena con hora de este momento
'
Public Sub Ahora As String
	
	Return DateTime.Time( DateTime.Now )
	
End Sub

' retona cadena con fecha y hora de este momento
'
public Sub Ahora2 As String
	Return Hoy & " " & Ahora
End Sub

' fecha_sql  aaaammdd  retorna como dd/mm/yyyy
'
public Sub Fecha_format(fecha_sql As String) As String
	
	Return fecha_sql.SubString(6) & "/" & fecha_sql.SubString2(4,6) & "/" & fecha_sql.SubString2(0,4)
	
End Sub

Sub JsonDateToTick(json_fecha As String) As Long
	Dim m As Matcher = Regex.Matcher("\d+", json_fecha)
	If m.Find Then
		Return m.Match
	End If
	Log("Invalid date: " & json_fecha)
	Return 0
End Sub

#end region

#region Funciones

' IIF( c as Boolean,  TrueRes as String, FalseRes as String)
'
public Sub IIF(c As Boolean, TrueRes As String, FalseRes As String) As String
	If c Then Return TrueRes Else Return FalseRes
End Sub  

' si S es una cadena vacia retorna un Int cero
'
public Sub CInt(s As String) As Int
	Return IIF((s = ""), 0, s)
End Sub

public Sub CDbl(s As String) As Double
	Return IIF((s = ""), 0.0, s)
End Sub

#End Region

#Region Spinner
' retorna el Id incorporado en un string en el formato:  string #id.
' si string es vacio retorna o no contiene # retorna cadena vacia.
' Ej. CD Santiago #20  -->  "20"
'
Public Sub spId(s As String) As String
	Dim p As Int = s.IndexOf("#")
	If p >= 0 Then
		Return s.SubString(p + 1).trim
	Else
		Return ""
	End If
End Sub

public Sub spNombre(s As String) As String
	Dim p As Int = s.IndexOf("#")
	If p >= 0 Then
		Return s.SubString2(0,p).Trim
	Else
		Return s
	End If
End Sub

Public Sub spIndexNombre(sp As Spinner, nombre As String) As Int
	Dim item As String
	For i=0 To sp.Size-1
		item = sp.GetItem(i)
		If nombre.ToLowerCase = item.SubString2(0, item.IndexOf("#")).ToLowerCase.trim Then
			Return i
		End If
	Next
	Return -1
End Sub

public Sub spIndexId(sp As Spinner, id As String) As Int
	Dim item As String
	For i=0 To sp.Size-1
		item = sp.GetItem(i)
		If id.ToLowerCase = item.SubString( item.IndexOf("#") + 1).ToLowerCase.Trim Then
			Return i
		End If
	Next
	Return -1
End Sub

public Sub sql_to_sp(sql_1campo As String, sp As Spinner)
	Dim rs As ResultSet = comun.SQL1.ExecQuery(sql_1campo)
	sp.Clear
	Do While rs.NextRow
		sp.Add(rs.GetString2(0))
	Loop
	rs.Close
	sp.SelectedIndex = 0
End Sub

public Sub sql_to_sp2(sql_2campos As String, sp As Spinner)
	Dim rs As ResultSet = comun.SQL1.ExecQuery(sql_2campos)
	sp.Clear
	Do While rs.NextRow
		sp.Add(rs.GetString2(0) & " #" & rs.GetString2(1))
	Loop
	rs.Close
	sp.SelectedIndex = 0
End Sub

' Carga campo(0) o codigo en lista y campo(1) o nombre en spinner
' Uso:  valor_codigo = lista.get(spinner.selectedIndex)
' 		spinner.selectedIndex = lista.indexOf(valor_codigo)
'
public Sub sql_to_spli(sql_2campos As String, sp As Spinner, Li As List)
	Dim rs As ResultSet = comun.SQL1.ExecQuery(sql_2campos)
	sp.Clear
	Li.Initialize
	Do While rs.NextRow
		sp.Add(rs.GetString2(1))
		Li.Add(rs.GetString2(0))
	Loop
	rs.Close
	sp.SelectedIndex = 0
End Sub

public Sub list_to_sp(lista As List, key As String, sp As Spinner)
	For Each m As Map In lista
		sp.Add(m.Get(key))
	Next
End Sub

public Sub List_to_sp2(lista As List, key As String, value As String, sp As Spinner, listaKey As List)
	Dim m2 As Map
	Dim i As Int
	
	'elimina duplicados
	m2.Initialize
	For Each m As Map In lista
		m2.Put(m.Get(key), m.Get(value))
	Next
	
	listaKey.Clear
	sp.Clear
	For i=0 To m2.Size-1
		sp.Add(m2.GetValueAt(i))
		listaKey.Add(m2.GetKeyAt(i))
	Next
End Sub

'public Sub List_to_ACsp2(lista As List, key As String, value As String, sp As ACSpinner, listaKey As List)
'	Dim m2 As Map
'	Dim i As Int
'	
'	'elimina duplicados
'	m2.Initialize
'	For Each m As Map In lista
'		m2.Put(m.Get(key), m.Get(value))
'	Next
'	
'	listaKey.Clear
'	sp.Clear
'	For i=0 To m2.Size-1
'		sp.Add(m2.GetValueAt(i))
'		listaKey.Add(m2.GetKeyAt(i))
'	Next
'End Sub
#end region

#region Sql_Listas
' Retorna una lista con el campo de todos los regitros de rs
'
Sub rs_to_list(rs As ResultSet, campo As String) As List
	Dim li As List 
	li.Initialize
	Do While rs.NextRow
		li.Add(rs.GetString(campo))
	Loop
	
	Return li
End Sub

Sub sqlInt_to_list(sql As String, campo As String) As List
	Dim li As List
	li.Initialize
	Dim rs As ResultSet = comun.SQL1.ExecQuery(sql)
	Do While rs.NextRow
		li.Add(rs.GetLong(campo))
	Loop
	
	Return li
End Sub

Sub cuenta_filas(tabla As String, where As String) As Int
	Return comun.SQL1.ExecQuerySingleResult("SELECT count(*) FROM " & tabla & IIF(where = "", "", " WHERE " & where))
End Sub

Sub cuenta_filas2(sql As String) As Int
	Return comun.SQL1.ExecQuerySingleResult(sql)
End Sub

Sub elimina_filas(tabla As String, where As String)
	comun.SQL1.ExecNonQuery("DELETE FROM " & tabla & IIF(where = "", "", " WHERE " & where))	
End Sub

#IgnoreWarnings: 12
'-- funciones sin uso en proyecto verdeclick
'--
Sub JsonToList(Json1 As String) As List
	Dim str As String = Json1 'Json vacio =>  []
	Dim rows As List
	Dim parser As JSONParser
	rows.Initialize
	parser.Initialize(str)
	rows = parser.NextArray
	Return rows  'rows.size = 0 cuando Json1 es vacio
End Sub

Sub JobGetRows(job As HttpJob) As List
	Dim rows As List
	rows.Initialize
	Dim response As String	= job.GetString
	If response.Contains("[") And response.Contains("]") And response<>"[]" Then
		Dim parser As JSONParser
		parser.Initialize(response)
		rows = parser.NextArray
	End If
	Return rows
End Sub

#End Region

#region Validar

' retorna True si la cadena str es un numero. Elimina bug de IsNumber() que considera la , como número.
'
public Sub IsNumeric(str As String) As Boolean
	Return IsNumber(str.Replace(",",""))
End Sub

public Sub IsFono(f As String) As Boolean	
	If Not (IsNumeric(f)) Then
		Return False
	End If
	If f.Length <> 9 Then
		Return False
	End If
	
	Return True	
End Sub

public Sub IsMail(mail As String) As Boolean
	Dim MatchEmail As Matcher = Regex.Matcher("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$", mail)
	Return MatchEmail.Find 
End Sub

#end region

#region Rut

'
'-- PENDIENTE   se recomienda no sar StringFunctions
'

'Public Sub CompletaRut(rut As String) As String
'	Dim r As String = rut
'	If Not (r.Contains("-")) Then
'		r = r.SubString2(0,  r.Length-1) & "-" & r.SubString(r.Length-1)
'	End If
'	If (r.Length < 10) Then
'		Dim sf As StringFunctions
'		sf.Initialize
'		r = sf.Replicate("0", 10 - r.Length) & r
'	End If
'	Return r
'End Sub
#End Region

#region String
'
'-- PENDIENTE se recomienda no usaar librería StringFunctions
'

'Sub MargenString(str As String, margen As Int) As String
'	Dim Sf As StringFunctions
'	Sf.Initialize
'	Dim ls As List = Sf.StringToList(str, False, True)
'	Dim ms As String = ""
'	Dim tmp As String
'	Dim c As Int = 1
'	Dim br As Boolean = True
'	For Each w As String In ls
'		tmp = ms
'		If Not(br) Then
'			tmp = tmp & " " & w
'		Else
'			tmp = ms & w
'		End If
'		If tmp.Length > c * margen Then
'			ms = tmp & CRLF
'			br = True
'			c = c + 1
'		Else
'			ms = tmp
'			br = False
'		End If
'	Next
'	Return ms.Trim
'End Sub

Sub Left(Text As String, Length As Int)As String
	If Length>Text.Length Then Length=Text.Length
	Return Text.SubString2(0, Length)
End Sub

Sub Right(Text As String, Length As Int) As String
	If Length>Text.Length Then Length=Text.Length
	Return Text.SubString(Text.Length - Length)
End Sub

Sub Mid(Text As String, Start As Int, Length As Int) As String
	Return Text.SubString2(Start-1,Start+Length-1)
End Sub

Sub Split(Text As String, delimiter As String) As String()
	Return Regex.Split(delimiter,Text)
End Sub

public Sub PtoToComa(NumPto As Double) As String
	Dim ns As String = NumPto
	Return ns.Replace(".",",")
End Sub

#End Region

#Region Image

Sub FillImageToView(bmp As B4XBitmap, ImageView As B4XView)
   Dim bmpRatio As Float = bmp.Width / bmp.Height
   Dim viewRatio As Float = ImageView.Width / ImageView.Height
   If viewRatio > bmpRatio Then
     Dim NewHeight As Int = bmp.Width / viewRatio
     bmp = bmp.Crop(0, bmp.Height / 2 - NewHeight / 2, bmp.Width, NewHeight)
   Else if viewRatio < bmpRatio Then
     Dim NewWidth As Int = bmp.Height * viewRatio
     bmp = bmp.Crop(bmp.Width / 2 - NewWidth / 2, 0, NewWidth, bmp.Height)
   End If
   ImageView.SetBitmap(bmp.Resize(ImageView.Width, ImageView.Height, True))
End Sub

'--
'Usar: FontToBitmap(Chr(0xF17B), False, 28, Colors.White) para Typeface FONTAWESOME   True para TypeFace MATERIALICONS
'--
Public Sub FontToBitmap (text As String, IsMaterialIcons As Boolean, FontSize As Float, color As Int) As B4XBitmap
	Dim xui As XUI
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 32dip, 32dip)
	Dim cvs1 As B4XCanvas
	cvs1.Initialize(p)
	Dim t As Typeface
	If IsMaterialIcons Then t = Typeface.MATERIALICONS Else t = Typeface.FONTAWESOME
	Dim fnt As B4XFont = xui.CreateFont(t, FontSize)
	Dim r As B4XRect = cvs1.MeasureText(text, fnt)
	Dim BaseLine As Int = cvs1.TargetRect.CenterY - r.Height / 2 - r.Top
	cvs1.DrawText(text, cvs1.TargetRect.CenterX, BaseLine, fnt, color, "CENTER")
	Dim b As B4XBitmap = cvs1.CreateBitmap
	cvs1.Release
	Return b
End Sub
#End Region

#Region Maps
'Sub CheckForGooglePlayServices As Boolean
'	Dim GoogleApiAvailablity As JavaObject
'	GoogleApiAvailablity = GoogleApiAvailablity.InitializeStatic("com.google.android.gms.common.GoogleApiAvailability").RunMethod("getInstance", Null)
'	Dim context As JavaObject
'	context.InitializeContext
'	If GoogleApiAvailablity.RunMethod("isGooglePlayServicesAvailable", Array(context)) <> 0 Then
'		GoogleApiAvailablity.RunMethod("makeGooglePlayServicesAvailable", Array(context))
'		Return False
'	End If
'	Return True
'End Sub
'#End Region