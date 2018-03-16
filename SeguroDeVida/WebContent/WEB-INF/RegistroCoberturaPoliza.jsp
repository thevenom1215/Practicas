<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>Insert title here</title>
</head>
<body>
<h2>Tipo de cobertura de la poliza</h2>

<form action="registrarCobertura.do" method = "POST">

<input type = "hidden" name = "poliza" value = "${poliza}">

<table>
<c:forEach var = "id" items = "${ids}" varStatus = "pos">
<tr>
<td>${cobertura[pos.index]}</td>
<td><input type = "checkbox" value ="${id}" name = "valor" id = "valor" action = "verificarCheckBox()"></td>
</tr>
</c:forEach>
</table>

<script>
function verificarCheckBox(){
	var verificado;
	verificado = document.getElementById("valor").check;
	if(verificado = true){
		document.getElementById("valor").id = 'parametro';
		document.getElementById("valor").name = 'parametro';
	}
}
</script>

</form>

</body>
</html>