<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Busqueda de polizas</h2>
<form action="buscarPoliza.do" method = "POST">
<table>
<tr>
<td>No de folio</td>
<td><input type = "number" name = "no de folio"></td>
</tr>
</table>
<input type = "submit" value = "consultar">
</form>
</body>
</html>