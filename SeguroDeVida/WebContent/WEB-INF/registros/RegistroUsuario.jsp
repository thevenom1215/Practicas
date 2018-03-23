<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Registro de datos de usuario</title>
</head>
<body>

<!-- Datos a llenar del usuario -->
<div class = "text-justify d-flex justify-content-center">
<form  action = "registroExitoso.do" method = "POST">
<table class = "table table-condensed table-responsive">

<tr>
<td><h2>Registro de datos de usuario</h2></td>
</tr>

<tr>
<td><a>Nombre:</a></td>
<td><input type = "text" name = "nombre" class = "form-control"></td>
</tr>

<tr>
<td><a>Apellidos:</a></td>
<td><input type = "text" name = "apellidos" class = "form-control"></td>
</tr>

<tr>
<td><a>Fecha de nacimiento:</a></td>
<td><input type = "date" name = "nacimiento" class = "form-control"></td>
</tr>

<tr>
<td><a>Edad:</a></td>
<td><input type = "text" name = "edad" class = "form-control"></td>
<tr>

<tr>
<td><a>Genero:</a></td>
<td><input type = "text" name = "genero" class = "form-control"></td>
</tr>

<tr>
<td><a>Telefono:</a></td>
<td><input type = "text" name = "telefono" values = "(000)-000-00-00"class = "form-control"></td>
</tr>

<tr>
<td><a>Celular:</a></td>
<td><input type = "text" name = "celular" values = "000-000-00-00" class = "form-control"></td>
</tr>

<tr>
<td><a>Correo:</a></td>
<td><input type = "text" name = "correo" class = "form-control"></td>
</tr>

<tr>
<td><a>Calle:</a></td>
<td><input type = "text" name = "calle" class = "form-control"></td>
<tr>

<tr>
<td><a>Numero:</a></td>
<td><input type = "number" name = "numero" class = "form-control"></td>
</tr>

<tr>
<td><a>Codigo postal:</a></td>
<td><input type = "number" name = "codigo postal" class = "form-control"></td>
</tr>

<tr>
<td><a>Ciudad:</a></td>
<td><input type = "text" name = "ciudad" class = "form-control"></td>
</tr>

<tr>
<td><a>Estado:</a></td>
<td><input type = "text" name = "estado" class = "form-control"></td>
</tr>

<tr>
<td><a>Pais:</a></td>
<td><input type = "text" name = "pais" class = "form-control"></td>
</tr>

<tr>
<td><a>Ocupacion:</a></td>
<td><input type = "text" name = "ocupacion" class = "form-control"></td>
</tr>

<tr>
<td><a>Estado civil:</a></td>
<td><input type = "text" name = "estado civil" class = "form-control"></td>
</tr>

<tr>
<td><a>pasatiempos:</a></td>
<td><input type = "text" name = "pasatiempos" class = "form-control"></td>
</tr>

<tr>
<td><a>RFC:</a></td>
<td><input type = "text" name = "rfc" class = "form-control"></td>
</tr>

<tr>
<td><a>CURP:</a></td>
<td><input type = "text" name = "curp" class = "form-control"></td>
</tr>

<tr>
<td><a>Condicion medica</a></td>
<td><select name = "salud" class = "form-control">
<c:forEach var = "elemento" items = "${lista}" varStatus = "pos">
<option value = "${pos.index}">${elemento}</option>
</c:forEach>
</select>

</td>
</tr>
</table>
</div>

<div class = "d-flex justify-content-center text-right">
<input type = "submit" value = "Enviar" class = "btn btn-sencondary">
</div>

</form>

<br/>
<br/>

</body>
</html>