package controller;

import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
public ModelAndView recibeDatos(@RequestParam Map<String, String> datosUsuario, @RequestParam("nacimiento") String nacimiento)throws Exception {
	
	ModelAndView modeloUsuario = new ModelAndView("RegistroExitosoUsuario");
	Usuario usuario = new Usuario();
	ArrayList <String> llaves = new ArrayList<String>();
	ArrayList <String> valores = new ArrayList<String>();
	
	Date fecha = new SimpleDateFormat("MM-DD-YYYY").parse(nacimiento);
	usuario.setNombre(datosUsuario.get("nombre"));
	usuario.setApellidos(datosUsuario.get("apellidos"));
	usuario.setFecha_de_nacimiento(fecha);
	usuario.setEdad(Integer.parseInt(datosUsuario.get("edad")));	
	usuario.setGenero(datosUsuario.get("genero"));
	usuario.setTelefono(datosUsuario.get("telefono"));
	usuario.setCelular(datosUsuario.get("celular"));
	usuario.setCorreo(datosUsuario.get("correo"));
	usuario.setCalle(datosUsuario.get("calle"));
	usuario.setNumero(Integer.parseInt(datosUsuario.get("numero")));
	usuario.setCodigo_postal(Integer.parseInt(datosUsuario.get("codigo postal")));
	usuario.setDireccion();
	usuario.setCiudad(datosUsuario.get("ciudad"));
	usuario.setEstado(datosUsuario.get("estado"));
	usuario.setPais(datosUsuario.get("pais"));
	usuario.setLocacion();
	usuario.setOcupacion(datosUsuario.get("ocupacion"));
	usuario.setEstado(datosUsuario.get("estado civil"));
	usuario.setPasatiempos(datosUsuario.get("pasatiempos"));
	usuario.setRfc(datosUsuario.get("rfc"));
	usuario.setCurp(datosUsuario.get("curp"));
	
	llaves.addAll(datosUsuario.keySet());
	valores.addAll(datosUsuario.values());
	
	modeloUsuario.addObject("llaves",llaves);
	modeloUsuario.addObject("valores",valores);
	
	return modeloUsuario;
	}



}
