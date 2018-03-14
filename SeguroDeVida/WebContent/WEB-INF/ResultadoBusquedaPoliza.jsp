<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Resultado Busqueda Poliza</title>
</head>
<body>

<h2>Resultado Busqueda Poliza</h2>

<table>

<tr>
<td>No de poliza</td>
<td>No de folio</td>
<td>Id Estatus</td>
<td>Id tipo</td>
<td>Id Usuario</td>
<td>Id Retorno Inversion</td>
<td>Suma Asegurada</td>
<td>Tasa de interes</td>
<td>Cobro de rescate</td>
<td>Fecha celebracion contrato</td>
</tr>

<c:forEach var = "poliza" items = "${no de poliza}" varStatus = "pos">
<tr>
<td>${poliza}</td>
<td>${no de folio[pos.index]}</td>
<td>${id estatus[pos.index]}</td>
<td>${id tipo[pos.index] }</td>
<td>${id usuario[pos.index]}</td>
<td>${id retorno inv[pos.index]}</td>
<td>${suma asegurada[pos.index]}</td>
<td>${tasa de interes[pos.index]}</td>
<td>${cobro rescate[pos.index]}</td>
<td>${fecha celebracion[pos.index]}</td>
</tr>
</c:forEach>

</table>
</body>
</html>