package controller;

import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import modelos.CondicionMedica;
import modelos.Usuario;


@Controller
public class UsuarioController {

	/*Controladores de usuarios*/
	
//Controller de registro de usuarios
@RequestMapping("/asegurado.do")
public ModelAndView sayHello() {
	CondicionMedica lista = new CondicionMedica();
	lista.getCondicionMedica().put(0, "Enfermo");
	lista.getCondicionMedica().put(1, "Sano");
	lista.getCondicionMedica().put(2, "Grave");
	ModelAndView modelo = new ModelAndView("RegistroUsuario");
	modelo.addObject("lista",lista.condicionMedica.values());
	return modelo;}


//Controller registro exitoso

@PostMapping("/registroExitoso.do")
public ModelAndView recibeDatos(@RequestParam Map<String, String> datosUsuario)throws Exception {
	
	ModelAndView modeloUsuario = new ModelAndView("RegistroExitosoUsuario");
	Usuario usuario = new Usuario();
	usuario.setNombre(datosUsuario.get("nombre"));
	usuario.setApellidos(datosUsuario.get("apellidos"));
	//usuario.setFecha_de_nacimiento(datosUsuario.get("nacimiento"));
	//usuario.setEdad(datosUsuario.get("edad"));	
	datosUsuario.get("genero");
	datosUsuario.get("telefono");
	datosUsuario.get("celular");
	datosUsuario.get("correo");
	datosUsuario.get("calle");
	datosUsuario.get("numero");
	datosUsuario.get("codigo postal");
	datosUsuario.get("ciudad");
	datosUsuario.get("estado");
	datosUsuario.get("pais");
	datosUsuario.get("ocupacion");
	datosUsuario.get("estado civil");
	datosUsuario.get("pasatiempos");
	datosUsuario.get("rfc");
	datosUsuario.get("curp");
	
	modeloUsuario.addObject("lista",datosUsuario);
	
	return modeloUsuario;
	}



}
