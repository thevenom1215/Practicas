<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- relaciones con los links y javascript -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- Datos a llenar del usuario -->
<h2>Registro de datos de usuario</h2>
<form action="registroExitoso.jsp" method = "POST">
<a>Nombre:</a>
<input type = "text" name = "nombre">
<a>Apellidos:</a>
<input type = "text" name = "apellidos">
<a>Fecha de nacimiento:</a>
<input type = "date" name = "nacimiento">
<a>Edad:</a>
<input type = "text" name = "edad">
<a>Genero:</a>
<input type = "text" name = "genero">
<a>Telefono:</a>
<input type = "text" name = "telefono">
<a>Celular:</a>
<input type = "text" name = "celular">
<a>Correo:</a>
<input type = "text" name = "correo">
<a>Calle:</a>
<input type = "text" name = "calle">
<a>Numero:</a>
<input type = "number" name = "numero">
<a>Codigo postal:</a>
<input type = "number" name = "codigo postal">
<a>Ciudad:</a>
<input type = "text" name = "ciudad">
<a>Estado:</a>
<input type = "text" name = "estado">
<a>País:</a>
<input type = "text" name = "pais">
<a>Ocupacion:</a>
<input type = "text" name = "ocupacion">
<a>Estado civil:</a>
<input type = "text" name = "estado civil">
<a>pasatiempos:</a>
<input type = "text" name = "pasatiempos">
<a>RFC:</a>
<input type = "text" name = "rfc">
<a>CURP:</a>
<input type = "text" name = "curp">
<a>Condicion medica</a>
<select name = "salud">
<option value = "opcion1">opcion 1</option>
<option value = "opcion2">opcion 2</option>
</select>

</form>
</body>
</html>