<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- Inicio del header con acceso a las bibliotecas -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
	<script type="text/javascript" src ="bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="bootstrap/js/jquery.js"></script>
		
<title>Pagina principal</title>
</head>
<body>
<nav class = "menu navbar navbar-default" id = "navbar">
<div class = "container-fluid">
<!-- Contenido visible en dispositivos grandes y medianos -->
<div class = "navbar-header">
<button type = "button" class = "navbar-toggle collapsed" datatoggle = "collapse" datatarget = "#navbar-1">
<span class = "sr-only"></span>
<span class = "icon-bar"></span>
<span class = "icon-bar"></span>
<span class = "icon-bar"></span>
</button>

<asside class = "visible-lg visible-md">
<a href = "" class ="navbar-brand" id = "nav-button">Recibos</a>
<a href = "" class ="navbar-brand" id = "nav-button">Usuarios</a>
<a href = "" class ="navbar-brand" id = "nav-button">Polizas</a>
<a href = "" class ="navbar-brand" id = "nav-button">Beneficiarios</a>
<ul>
<li class = "nav-item dropdown">
<a class = "dropdown-menu" href = "#" id = "navbarDropdow" data-toggle = "dropdown" aria-haspopup = "true" aria-expanded = "false">Asegurados</a>
<div class = "dropdown-menu" aria-labelledby = "navbarDropdow">
<a class = "dropdown-item" href = "#">Registrar</a>
<a class = "dropdown-item" href = "#">Consultar</a>
<a class = "dropdown-item" href = "#">Editar</a>
</div>
</li>
</ul>
</asside>
</div>

<!-- contenido visible en dispositivos peque�os -->
<div class = "collapse navbar-collapse" id = "navbar1">
<asside class = "hidden-lg hidden-md">
<ul>
<li><a href = "" id = "nav-button" class = "nav btn">Recibos</a></li>
<li><a href = "" id = "nav-button" class = "nav btn">Usuarios</a></li>
<li><a href = "" id = "nav-button" class = "nav btn">Polizas</a></li>
<li><a href = "" id = "nav-button" class = "nav btn">Beneficiarios</a></li>



</ul>
</asside>
</div>

</div>
</nav>

<ul>
<li><a href = ""></a></li>
</ul>


</body>
</html>