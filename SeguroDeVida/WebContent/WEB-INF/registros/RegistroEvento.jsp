<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Registro de eventos</title>
</head>
<body>

<div class = "text-justify d-flex justify-content-center">
<form action = "" method = "POST">
<table class = "table table-condensed table-responsive">

<tr>
<td><h2>Registro de eventos ocurridos</h2></td>
</tr>

<tr>
<td>Asegurado</td>
<td><input name = "asegurado" type = "text" class = "form-control"/></td>
</tr>

<tr>
<td>No de poliza</td>
<td><input name = "no de poliza" type = "number" class = "form-control"/></td>
</tr>

<tr>
<td>Fecha del evento</td>
<td><input type = "Date" name ="fecha del evento" class = "form-control"></td>
</tr>

<tr>
<td>Tipo de evento ocurrido</td>
<td>
<select name = "evento" class = "form-control">
<c:forEach var = "elementos" items = "${eventos}" varStatus = "pos">
<option value = "${pos.index}">${elementos}</option>
</c:forEach>
</select>
</td>
</tr>

<tr>
<td>Descripcion:</td>
<td><textarea name = "descripcion" class = "form-control">Describa el evento acontecido</textarea></td>
</tr>

</table>
</div>

<div class = "d-flex justify-content-center text-right">
<input type = "submit" value = "Registrar" class = "btn btn-secondary"/>
</div>
</form>

</body>
</html>