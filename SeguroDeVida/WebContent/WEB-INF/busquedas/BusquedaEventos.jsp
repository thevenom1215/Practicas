<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class = "text-justify d-flex justify-content-center">
<table class = "table table-condensed table-responsive">

<tr>
<td>No de poliza</td>
<td>Fecha</td>
<td>Evento</td>
<td>Descripcion</td>
</tr>

<c:forEach var = "poliza" items = "" varStatus = "pos">
<tr>
<td>${poliza}</td>
<td>${fechas[pos.index]}</td>
<td>${eventos[pos.index]}</td>
<td>${descripciones[pos.index]}</td>
</tr>
</c:forEach>
</table>
</div>

<div class = "text-justify d-flex justify-content-end">
<a href = "main.do"><button class = "btn btn-secondary">Regresar</button></a>
</div>

</body>
</html>