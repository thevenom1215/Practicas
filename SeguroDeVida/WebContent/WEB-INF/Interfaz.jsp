<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
<h2>Menu</h2>

<!-- Asegurados -->
<h3>Asegurados</h3>
<a href = "asegurado.do"><button name = "registrar asegurado">Registrar asegurado</button></a>
<a href = "buscarUsuario.do"><button name = "consultar asegurado">consultar asegurado</button></a>
<a href = ""><button name = "editar asegurado">editar asegurado</button></a>
<br/>

<!-- Polizas -->
<h3>Polizas</h3>
<a href = "poliza.do"><button name = "registrar poliza">Registrar poliza</button></a>
<a href = "buscarPoliza.do"><button name = "consultar poliza">consultar poliza</button></a>
		<!--Informacion sobre cobertura y tipo de poliza registrada-->
<a href = "" ><button>editar poliza</button></a>
<br/>

<!-- Primas o recibos -->
<h3>Recibos</h3>
<a href = "recibo.do"><button name = "generar recibo">Generar recibo</button></a>
<a href = "buscarRecibo.do" ><button name = "consultar primas">Consultar recibos</button></a>
<a href = ""><button name = "editar prima">Editar recibo</button></a>
<br/>

<!-- Beneficiarios -->
<h3>Beneficiarios</h3>
<a href = "beneficiario.do"><button name = "registrar beneficiario">Registrar beneficiario</button></a>
<a href = "buscarBeneficiario.do"><button name = "buscar beneficiario">Buscar beneficiario</button></a>

<button class = "btn btn-secondary" data-toggle = "modal" data-target = "#beneficiariomodal">abrir modal</button>

<a href = ""><button name = "editar beneficiario">editar beneficiario</button></a>
<br/>

<!-- Eventos -->
<h3>Eventos</h3>
<a href = "evento.do"><button name = "registrar evento">Registrar evento</button></a>
<a href = "consultarEventos.do"><button name = "consultar evento">Consultar evento</button></a>
<a href = ""><button name = "editar evento">Editar evento</button></a>


<!-- modal de busqueda beneficiario-->

<div class = "modal" id = "beneficiariomodal">
	<div class = "modal-content">
		<div class = "modal-header">
			<h4 class = "modal-title">Buscar beneficiario</h4>
			<button class = "close" data-dissmis = "modal" aria-label="Close">
			<span aria-hidden = "true">&times;</span>
			</button>
		</div>
	<div class = "modal-body">
		<form method = "POST" action = "">
		<p>introduce tu nombre</p>
		<input type = "text" name = "nombre">
		<p>introduce tus apellidos</p>
		<input type = "text" name = "apellidos">
	</div>
	<div class = "modal-footer">
	<input type = "submit" class= "btn btn-secondary" value = "consultar">
	</form>
	</div>
	</div>
</div>

</body>
</html>