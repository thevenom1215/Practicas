<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consulta de Beneficiario</title>
</head>
<body>

<h2>Consulta de Beneficiario</h2>

<form action="resBusquedaBeneficiario.do" method = "POST">

<table>
<tr>
<td>Nombre</td>
<td><input type = "text" name = "nombre"/></td>
</tr>

<tr>
<td>Apellidos</td>
<td><input type = "text" name = "apellidos"/></td>
</tr>

</table>
<input type = "submit" value = "consultar"/>
</form>

</body>
</html>