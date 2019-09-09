B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.01
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Dim now As Long = DateTime.Now
	Log(DateTime.Date(now))
	Log(DateTime.Time(now))
	Log($"$DateTime{now}"$)

	DateTime.DateFormat="dd/MM/yyyy"
	
	
	

	Private Label2 As Label
	Private Label3 As Label
	Private lbctn As Label
	Private Label5 As Label
	Private Label7 As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	
	Activity.LoadLayout("boleto")

    Label2.Text= Venta.orId
	Label3.Text=Venta.desId
	lbctn.Text=Venta.tarifaId
	
	Label5.Text= DateTime.Time(now)
	Label7.Text =DateTime.Date(now)
	
	
	
     

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
