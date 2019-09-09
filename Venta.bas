B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.01
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	
	Public orId As String
	Public desId As String
	Public tarifaId As Int

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Public cantidad As Int
	Public precio As Int
	
	Private spOrigen As Spinner
	Private spDestino As Spinner
	Private spTarifas As Spinner
    'listas
	Private Lorigen As List
	Private lDestino As List
	Private Ltarifa As List

	
	Private spCantidad As Spinner
	Private lblValor As Label
	
	Private btimprimir As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("ventas")

	spCantidad.AddAll(Array As String("-","1","2","3","4","5","6","7","8","9"))
    Cargar_origen
	Cargar_tarifas
	
	
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)
      
End Sub


Sub Cargar_origen As ResumableSub
	

	Dim j As HttpJob
	
	j.Initialize("", Me)
	
	j.Download2("http://192.168.1.83/Agt2/get_intermedios.aspx", Array As String("bd","gt2","r",Main.rutaId))'localhost'
	wait for (j) jobdone(j As HttpJob)

	If j.Success Then
		lDestino.Initialize
		Lorigen.Initialize
		
		funciones.list_to_sp2(funciones.JobGetRows(j),"codigo","nombre",spOrigen,Lorigen)
		funciones.list_to_sp2(funciones.JobGetRows(j),"codigo","nombre",spDestino,lDestino)
				
	End If
	
	
	Return True
	
End Sub

Sub Cargar_tarifas As ResumableSub
	

	Dim j As HttpJob
	
	j.Initialize("", Me)
	
	j.Download2("http://192.168.1.83/Agt2/get_tarifas.aspx", Array As String("bd","cvc2"))'localhost'
	wait for (j) jobdone(j As HttpJob)

	If j.Success Then
		
		Ltarifa.Initialize
		
		funciones.list_to_sp(funciones.JobGetRows(j),"Tarifa",spTarifas)
		
				
	End If
	
	
	Return True
	
End Sub



Sub spCantidad_ItemClick (Position As Int, Value As Object)
	
	
		
	cantidad =spCantidad.GetItem(Position)
	
	
End Sub



Sub btimprimir_Click
	
	StartActivity(boleto)
	
End Sub

Sub spOrigen_ItemClick (Position As Int, Value As Object)
	
	orId= spOrigen.GetItem(Position)
	desId= spDestino.GetItem(Position)
	If cantidad > 0  Then
		lblValor.Text = cantidad * tarifaId
	End If
End Sub

Sub spTarifas_ItemClick (Position As Int, Value As Object)
	
	
	tarifaId =spTarifas.GetItem(Position)
	
	If cantidad > 0  Then
		lblValor.Text = cantidad * tarifaId
	End If
	
	
	
End Sub

