<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consulta de Beneficiario</title>
</head>
<body>

<h2>Consulta de Beneficiario</h2>
<div class = "text-justify d-flex justify-content-center">

<table class = "table table-condensed table-responsive">
<tr>
<td>No de poliza:</td>
<td>Nombre:</td>
<td>Apellidos:</td>
<td>tipo de poliza</td>
<td>Periodo de cobertura</td>
</tr>

<c:forEach var = "poliza" items = "" varStatus = "pos">
<tr>
<td>${poliza}</td>
<td>${nombres[pos.index]}</td>
<td>${apellidos[pos.index]}</td>
<td>${tipo[pos.index]}</td>
<td>${periodos[pos.index]}</td>
</tr>
</c:forEach>
</table>
</div>

<div class = "text-justify d-flex justify-content-end">
<a href="main.do"><button class = "btn btn-secondary">regresar</button></a>
</div>

</body>
</html>