<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de datos de beneficiario</title>
</head>
<body>

<div class = "text-justify d-flex justify-content-center">
<form action = "registroBeneficiario.do" method = "POST">
<table class = "table table-condensed table-responsive">

<tr>
<td><h2>Registro de beneficiarios</h2></td>
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
</tr>

<tr>
<td><a>Genero:</a></td>
<td><input type = "text" name = "genero" class = "form-control"></td>
</tr>

<tr>
<td><a>Telefono:</a></td>
<td><input type = "text" name = "telefono" value = "000-000-00-00" class = "form-control"></td>
</tr>

<tr>
<td><a>Celular:</a></td>
<td><input type = "text" name = "celular" value = "(000)-000-00-00" class = "form-control"></td>
</tr>

<tr>
<td><a>Correo:</a></td>
<td><input type = "text" name = "correo" class = "form-control"></td>
</tr>

<tr>
<td><a>Calle:</a></td>
<td><input type = "text" name = "calle" class = "form-control"></td>
</tr>

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
</table>
</div>
<div class = "d-flex justify-content-center text-right">
<input type = "submit" value = "registrar" class = "button"/>
</div>
</form>
<br/>
<br/>
</body>
</html>