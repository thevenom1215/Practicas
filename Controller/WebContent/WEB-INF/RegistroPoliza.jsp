<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- relaciones con los links y javascript -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de nueva poliza</title>
</head>
<body>

<h2>Generacion de nueva poliza</h2>

<form action = "CrearPoliza.jsp" method = "POST">
<table>

<tr>
<td>No de folio:</td>
<td><input type ="number" name = "no de folio"></td>
</tr>

<tr>
<td>Id Usuario</td>
<td><p contentEditable = "false"><input type = "number" name = "id usuario"></p></td>
</tr>

<tr>
<td>Suma asegurada</td>
<td><input type ="text" name = "suma asegurada"></td>
</tr>

<tr>
<td>Estatus</td>
<td><p contentEditable = "false">	<input type ="text" name = "id estatus"></p></td>
</tr>

<tr>	
<td>Fecha:</td>
<td><input type ="date" name = "celebracion contrato"></td>
</tr>

<tr>
<td>Tipo de poliza</td>
<td>
<select name = "tipo de poliza">
<c:forEach var = "tipo" items = "${tipos}" varStatus = "pos">
<option value = "${pos.index}">${tipo}</option>
</c:forEach>
</select></td>
</tr>

<tr>
<td>Tipo de cobertura</td>
<td>
<select name = "tipo de cobertura">
<c:forEach var = "cob" items = "${cobertura}" varStatus = "pos">
<option value = "${pos.index}">${cob}</option>
</c:forEach>
</select>
</td>
</tr>	

<tr>
<td>Tasa de interes</td>
<td><input type ="text" name = "tasa de interes"></td>
</tr>

<tr>
<td>Surrender fee:</td>
<td><input type ="text" name = "rescate"></td>
<tr>

<tr>
<td>Retorno de inversion</td>
<td><input type ="number" name = "retorno inversion" value = 1></td>
</tr>
					
</table>

</form>
</body>
</html>