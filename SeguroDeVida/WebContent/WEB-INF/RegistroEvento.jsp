<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Insert title here</title>
</head>
<body>
<h2>Registro de eventos ocurridos</h2>

<form action = "" method = "POST">
<table>

<tr>
<td>Asegurado</td>
<td><input name = "asegurado" type = "text"/></td>
</tr>

<tr>
<td>No de poliza</td>
<td><input name = "no de poliza" type = "number"/></td>
</tr>

<tr>
<td>Tipo de evento ocurrido</td>
<td>
<select>
<c:forEach var = "elementos" items = "${eventos}" varStatus = "pos">
<option value = "${pos.index}">${elementos}</option>
</c:forEach>
</select>
</td>
</tr>

</table>
<input type = "submit" value = "Registrar"/>
</form>
</body>
</html>