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
<form>
<table align = "center">

<tr>
<td>Aseguradora</td>
</tr>

<tr>
<td>Id Pago</td>
<td><input type = "text" value = "1" readonly></td>
</tr>

<tr>
<td>No de poliza</td>
<td><input type = "text" value = "1" readonly></td>
</tr>

<tr>
<td>Usuario:</td>
<td><input type = "text" value = "a" readonly></td>
</tr>

<tr>
<td>No de folio:</td>
<td><input type = "text" value = "1"></td>
</tr>

<tr>
<td>Fecha generacion recibo</td>
<td><input type = "Date" value = "01/01/1800" readonly></td>
</tr>

<tr>
<td>Fecha de pago</td>
<td><input type = "Date" value = "01/01/1800"></td>
</tr>

<tr>
<td>Fecha limite de pago</td>
<td><input type = "Date" value = "01/01/1800" readonly></td>
</tr>

<tr>
<td>Cantidad</td>
<td><input type = "number" value = "1"></td>
</tr>

</table>
<input type = "submit" name = "Generar">
</form>
</body>
</html>