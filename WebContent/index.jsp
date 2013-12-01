<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hola you</title>
</head>
<body>
<div id="formularioRegistro">
<form action="estudiante/toma.do" method="post" name="frmIniciar" id="frmIniciar">
<table width="100%" cellspacing="0" border="0" cellpadding="0">
	<tr>
	  <td id='celda'>
	   <div align="center">
	   <br><br>
		 	<br>	 		
			<table cellspacing="0"  cellpadding="0">
			<tr>
				<td width="120px" height="55px" style="color: #861111; font-size:22px">nombre:</td>
				<td><input type="text" name="nombre" size="20"  maxlength="8" style="font-size: 22px"></input></td>
			</tr>
					<tr>
				<td colspan="2" align="center">		
				    &nbsp;		
				 </td>
					</tr>
			<tr>
				<td colspan="2" align="center">		
					<input id="botonIngresar" type="submit" name="botonEnviar" value="Ingresar"></input>		
				 </td>
			</tr>	
		</table>
	   </div>
	   <br><br><br>
	 </td>
	</tr>
</table>
</form>  
<%String variable = request.getParameter("respuesta");
String v = "";
String a = "";
if(variable==null)
 a = "Iniciar Sesión";
else a = request.getParameter("respuesta");%>
<div id="respuesta"><h1 style="color: blue;font-size:20px;font-weight: normal;"><%=a%></h1></div>
</div>
</body>
</html>