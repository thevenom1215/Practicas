<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de nueva poliza</title>
</head>
<body>

<div class = "text-justify d-flex justify-content-center">

<form action = "registroPoliza.do" method = "POST">
<table>

<tr>
<td><h2>Generacion de nueva poliza</h2></td>
</tr>

<tr>
<td>No de folio:</td>
<td><input type ="number" name = "no de folio" class = "form-control"></td>
</tr>

<tr>
<td>Id Usuario</td>
<td><input type = "number" name = "id usuario" class = "form-control"></td>
</tr>

<tr>
<td>Suma asegurada</td>
<td><input type ="text" name = "suma asegurada" class = "form-control"></td>
</tr>

<tr>
<td>Estatus</td>
<td><p contentEditable = "false"><input type ="text" name = "id estatus" value = "01" class = "form-control"></p></td>
</tr>

<tr>	
<td>Fecha:</td>
<td><input type ="date" name = "celebracion contrato" class = "form-control"></td>
</tr>

<tr>
<td>Tipo de poliza</td>
<td>
<select name = "tipo de poliza" class = "form-control">
<c:forEach var = "tipo" items = "${tipos}" varStatus = "pos">
<option value = "${pos.index}">${tipo}</option>
</c:forEach>
</select></td>
</tr>

<tr>
<td>Tipo de cobertura</td>
<td>
<select name = "tipo de cobertura" class = "form-control">
<c:forEach var = "cob" items = "${cobertura}" varStatus = "pos">
<option value = "${pos.index}">${cob}</option>
</c:forEach>
</select>
</td>
</tr>	

<tr>
<td>Tasa de interes</td>
<td><input type ="text" name = "tasa de interes" class = "form-control"></td>
</tr>

<tr>
<td>Surrender fee:</td>
<td><input type ="text" name = "rescate" class = "form-control"></td>
<tr>

<tr>
<td>Retorno de inversion</td>
<td><input type ="number" name = "retorno inversion" value = "1" class = "form-control"></td>
</tr>		
</table>
</div>

<div class = "d-flex justify-content-center text-right">
<input type = "submit" value ="enviar">
</div>
</form>
</body>
</html>