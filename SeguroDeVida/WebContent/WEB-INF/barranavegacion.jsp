<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="bootstrap/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src ="bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu principal</title>
</head>
<body>

<!-- navbar de prueba -->

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Menu principal</a>
    </div>
    <ul class="nav navbar-nav">
     
      <!-- dropdown asegurados -->
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Asegurados
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="asegurado.do">Registrar</a></li>
          <li><a href="buscarUsuario.do">Consultar</a></li>
          <li><a href="#">Editar</a></li>
        </ul>
      </li>
      
      <!-- dropdown poliza -->
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Poliza
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="poliza.do">Registrar poliza</a></li>
          <li><a href="buscarPoliza.do">Consultar poliza</a></li>
          <li><a href="#">Editar</a></li>
          <li><a href="agregarCobertura.do">Agregar cobertura poliza</a></li>
          <li><a href="agregarCobertura.do">Modificar tipo de cobertura poliza</a></li>
        </ul>
      </li>
      
      <!-- dropdown Recibos -->
       <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Recibos
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="recibos.do">Registrar</a></li>
          <li><a href="buscarRecibo.do">Consultar</a></li>
          <li><a href="#">Editar</a></li>
        </ul>
      </li>
      
      <!-- dropdown Beneficiarios -->
       <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Beneficiarios
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="asegurado.do">Registrar</a></li>
          <li><a href="buscarUsuario.do">Consultar</a></li>
          <li><a href="#">Editar</a></li>
        </ul>
      </li>
      
     <!-- dropdown Eventos -->
       <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Eventos
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="asegurado.do">Registrar</a></li>
          <li><a href="buscarUsuario.do">Consultar</a></li>
          <li><a href="#">Editar</a></li>
        </ul>
      </li>
      
    </ul>
  </div>
</nav>

<div class = "modal fade" id = "pruebaModal" role = "dialog">
	<div class = "modal-dialog">
		<div class = "modal-content">
			<div class = "modal-header">
			<h2 class></h2>
			</div>
			<div class ="modal-body">
			<p>Nombre</p>
			<input type = "text" name = "nombre">
			<p>Apellidos</p>
			<input type = "text" name = "apellidos">
			</div>
		</div>
	</div>
</div>

</body>
</html>