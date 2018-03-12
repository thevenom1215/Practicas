<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Registro de datos de usuario</title>
</head>
<body>

<!-- Datos a llenar del usuario -->
<h2>Registro de datos de usuario</h2>

<form  action = "registroExitoso.do" method = "POST">

<table class = "table table-condensed table-responsive">

<tr>
<td><a>Nombre:</a></td>
<td><input type = "text" name = "nombre"></td>
</tr>

<tr>
<td><a>Apellidos:</a></td>
<td><input type = "text" name = "apellidos"></td>
</tr>

<tr>
<td><a>Fecha de nacimiento:</a></td>
<td><input type = "date" name = "nacimiento"></td>
</tr>

<tr>
<td><a>Edad:</a></td>
<td><input type = "text" name = "edad"></td>
<tr>

<tr>
<td><a>Genero:</a></td>
<td><input type = "text" name = "genero"></td>
</tr>

<tr>
<td><a>Telefono:</a></td>
<td><input type = "text" name = "telefono"></td>
</tr>

<tr>
<td><a>Celular:</a></td>
<td><input type = "text" name = "celular"></td>
</tr>

<tr>
<td><a>Correo:</a></td>
<td><input type = "text" name = "correo"></td>
</tr>

<tr>
<td><a>Calle:</a></td>
<td><input type = "text" name = "calle"></td>
<tr>

<tr>
<td><a>Numero:</a></td>
<td><input type = "number" name = "numero"></td>
</tr>

<tr>
<td><a>Codigo postal:</a></td>
<td><input type = "number" name = "codigo postal"></td>
</tr>

<tr>
<td><a>Ciudad:</a></td>
<td><input type = "text" name = "ciudad"></td>
</tr>

<tr>
<td><a>Estado:</a></td>
<td><input type = "text" name = "estado"></td>
</tr>

<tr>
<td><a>Pais:</a></td>
<td><input type = "text" name = "pais"></td>
</tr>

<tr>
<td><a>Ocupacion:</a></td>
<td><input type = "text" name = "ocupacion"></td>
</tr>

<tr>
<td><a>Estado civil:</a></td>
<td><input type = "text" name = "estado civil"></td>
</tr>

<tr>
<td><a>pasatiempos:</a></td>
<td><input type = "text" name = "pasatiempos"></td>
</tr>

<tr>
<td><a>RFC:</a></td>
<td><input type = "text" name = "rfc"></td>
</tr>

<tr>
<td><a>CURP:</a></td>
<td><input type = "text" name = "curp"></td>
</tr>

<tr>
<td><a>Condicion medica</a></td>
<td><select name = "salud">
<c:forEach var = "elemento" items = "${lista}" varStatus = "pos">
<option value = "${pos.index}">${elemento}</option>
</c:forEach>
</select>

</td>
</tr>
</table>
<input type = "submit" value = "Enviar">
</form>


</body>
</html>