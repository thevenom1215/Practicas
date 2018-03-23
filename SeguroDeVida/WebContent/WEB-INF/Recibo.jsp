<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recibo generado</title>
</head>

<body>

<div class = "text-center d-flex justify-content-center">
<form action = "generarRecibo.do" method = "POST">
<table class = "table table-condensed table-responsive">
<tr>
<td><h2>Recibo generado</h2></td>
</tr>

<tr>
<td>No de poliza</td>
<td><input type = "text" name = "no poliza" value = "1" class = "form-control" readonly></td>
</tr>

<tr>
<td>Usuario:</td>
<td><input type = "text" name = "usuario" value = "a" class = "form-control" readonly></td>
</tr>

<tr>
<td>No de folio:</td>
<td><input type = "text" name = "no folio" value = "1" class = "form-control"></td>
</tr>

<tr>
<td>Fecha generacion recibo</td>
<td><div name = "generacion" class = "form-control">${fecha}</div></td>
</tr>

<tr>
<td>Fecha de pago</td>
<td><input type = "Date" name = "pago" value = "1900-01-01" class = "form-control"></td>
</tr>

<tr>
<td>Fecha limite de pago</td>
<td><div name = "limite" class = "form-control">${limite}</div></td>
</tr>

<tr>
<td>Cantidad</td>
<td><input type = "number" name = "cantidad" value = "1" class = "form-control"></td>
</tr>

</table>

<div class = "d-flex justify-content-center text-right">
<input type = "submit" value = "Generar recibo" class = "btn btn-secondary">
</div>
</form>
</div>
</body>
</html>