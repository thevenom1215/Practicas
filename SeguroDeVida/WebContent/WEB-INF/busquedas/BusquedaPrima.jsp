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
<td>No de folio</td>
<td>Fecha generacion recibo</td>
<td>Fecha limite de pago</td>
<td>Fecha de pago</td>
<td>Cantidad</td>
<td>Forma de pago</td>
</tr>

<c:forEach var = "poliza" items = "" varStatus = "pos">
<tr>
<td>${poliza}</td>
<td>${folios[pos.index]}</td>
<td>${generaciones[pos.index]}</td>
<td>${limites[pos.index]}</td>
<td>${pagos[pos.index]}</td>
<td>${cantidades[pos.index]}</td>
<td>${formas[pos.index]}</td>
</tr>
</c:forEach>
</table>
</div>

<div class = "text-justify d-flex justify-content-center">
<a href = "main.do"><button class = "btn btn-secondary">Regresar</button></a>
</div>

</body>
</html>