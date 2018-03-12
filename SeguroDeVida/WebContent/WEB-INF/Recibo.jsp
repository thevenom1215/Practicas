<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prima generada</title>
</head>

<body>
<h2>Generacion de recibo</h2>
<form action = "generarRecibo.do" method = "POST">
<table align = "center">

<tr>
<td>Aseguradora X</td>
</tr>

<tr>
<td>No de poliza</td>
<td><input type = "text" name = "no poliza" value = "1" readonly></td>
</tr>

<tr>
<td>Usuario:</td>
<td><input type = "text" name = "usuario" value = "a" readonly></td>
</tr>

<tr>
<td>No de folio:</td>
<td><input type = "text" name = "no folio" value = "1"></td>
</tr>

<tr>
<td>Fecha generacion recibo</td>
<td><div name = "generacion">${fecha}</div></td>
</tr>

<tr>
<td>Fecha de pago</td>
<td><input type = "Date" name = "pago" value = "1900-01-01"></td>
</tr>

<tr>
<td>Fecha limite de pago</td>
<td><div name = "limite">${limite}</div></td>
</tr>

<tr>
<td>Cantidad</td>
<td><input type = "number" name = "cantidad" value = "1"></td>
</tr>

</table>
<input type = "submit" value = "Generar recibo">
</form>

</body>
</html>