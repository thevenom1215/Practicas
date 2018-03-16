<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css" href = "css/estilos.css"></style>
<title>Insert title here</title>
</head>
<body>
<h2>Menu</h2>

<!--<div class = "topnav" style = 
	"overflow: hidden;
	background-color = black;
	color = white;	">
<a href = "asegurado.do">Registrar asegurado</a>
<a href = "poliza.do">Registrar poliza</a>
<a href = "recibo.do">Generar recibo</a>
<a href = "beneficiario.do">Registrar beneficiario</a>
</div>-->


<!-- Asegurados -->
<a href = "asegurado.do"><button name = "registrar asegurado">Registrar asegurado</button></a>
<a href = "buscarUsuario.do"><button name = "consultar asegurado">consultar asegurado</button></a>
<a href = ""><button name = "editar asegurado">editar asegurado</button></a>

<!-- Polizas -->
<a href = "poliza.do"><button name = "registrar poliza">Registrar poliza</button></a>
<a href = "buscarPoliza.do"><button name = "consultar poliza">consultar poliza</button></a>
		<!--Informacion sobre cobertura y tipo de poliza registrada-->
<a href = "" ><button>editar poliza</button></a>

<!-- Primas o recibos -->
<a href = "recibo.do"><button name = "generar recibo">Generar recibo</button></a>
<a href = "buscarRecibo.do" ><button name = "consultar primas">Consultar primas</button></a>
<a href = ""><button name = "editar prima">Editar prima</button></a>

<!-- Beneficiarios -->
<a href = "beneficiario.do"><button name = "registrar beneficiario">Registrar beneficiario</button></a>
<a href = "buscarBeneficiario.do"><button name = "buscar beneficiario">Buscar beneficiario</button></a>
<a href = ""><button name = "editar beneficiario">editar beneficiario</button></a>

<!-- Eventos -->


</body>
</html>