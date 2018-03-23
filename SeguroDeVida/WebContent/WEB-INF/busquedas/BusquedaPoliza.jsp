<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Busqueda Poliza</title>
</head>
<body>

<div class = "text-justify d-flex justify-content-center">
<table class = "table table-condensed table-responsive">

<tr>
<td><h2>Busqueda Poliza</h2></td>
</tr>

<tr>
<td>No de folio</td>
<td>Nombre</td>
<td>Apellidos</td>
<td>Tipo de poliza</td>
<td>Estatus</td>
<td>asegurado</td>
<td>fecha de celebracion</td>
<td>suma asegurada</td>
<td>tasa de interes</td>
<td>cobro rescate</td>
</tr>

<c:forEach var = "poliza" items = "" varStatus = "pos">
<tr>
<td>${poliza}</td>
<td>${nombres[pos.index]}</td>
<td>${apellidos[pos.index]}</td>
<td>${tipos[pos.index]}</td>
<td>${estatus[pos.index]}</td>
<td>${asegurados[pos.index]}</td>
<td>${fechas[pos.index]}</td>
<td>${sumas[pos.index]}</td>
<td>${tasas[pos.index]}</td>
<td>${rescates[pos.index]}</td>
</tr>
</c:forEach>

</table>
</div>

<div class = "d-flex justify-content-center">
<a href = "main.do"><button class = "btn btn-secondary">Regresar</button></a>
</div>

</body>
</html>