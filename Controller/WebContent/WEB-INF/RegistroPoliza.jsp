<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- relaciones con los links y javascript -->


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de nueva poliza</title>
</head>
<body>
<form action = "CrearPoliza.jsp" method = "POST">
								<input type ="number" name = "no de folio">
<p contentEditable = "false">	<input type = "number" name = "id usuario"></p>
								<input type ="text" name = "suma asegurada">
<p contentEditable = "false">	<input type ="text" name = "id estatus"></p>
								<input type ="date" name = "celebracion contrato">
								<!-- tipo de poliza cambiar a select -->
								<input type ="number" name = "tipo poliza" value  = 1>
								<!-- tipo de cobertura cambiar a select -->
								<input type ="number" name = "cobertura" value = 1>
								<input type ="text" name = "tasa de interes">
								<input type ="text" name = "rescate">
								<input type ="number" name = "retorno inversion" value = 1>					
</form>
</body>
</html>