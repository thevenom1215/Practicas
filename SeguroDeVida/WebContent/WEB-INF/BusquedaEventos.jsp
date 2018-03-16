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
<table>

<tr>
<td>No de poliza</td>
<td>Fecha</td>
<td>Evento</td>
<td>Descripcion</td>
</tr>

<c:forEach var = "" items = "" varStatus = "">
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
</c:forEach>

</table>
</body>
</html>