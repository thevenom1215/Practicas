<jsp:useBean id = "RespuestaUsuario"  scope = "page" class = "servicio.RespuestaUsuario"/>
String nombre = request.getParameter("nombre");
RespuestaUsuario.function_name("nombre");