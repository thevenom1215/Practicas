<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<title>Busqueda de usuario</title>
</head>
<body>
<h2>Busqueda de usuarios</h2>

<table>
<tr>
<td>id</td>
<td>nombre</td>
<td>apellidos</td>
<td>telefono</td>
<td>celular</td>
<td>correo</td>
<td>direccion</td>
<td>locacion</td>
</tr>

<c:forEach var = "elementos" items = "${id}" varStatus = "pos">
<tr>
<td>${elementos}</td>
<td>${nombre[pos.index]}</td>
<td>${apellidos[pos.index]}</td>
<td>${telefono[pos.index]}</td>
<td>${celular[pos.index]}</td>
<td>${correo[pos.index]}</td>
<td>${direccion[pos.index]}</td>
<td>${locacion[pos.index]}</td>
</tr>
</c:forEach>

</table>

</body>
</html>