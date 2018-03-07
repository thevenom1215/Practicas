package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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
	ModelAndView modelo = new ModelAndView("HelloPage");
	modelo.addObject("lista",lista.condicionMedica.values());
	return modelo;}

//Controller regreso usuarios

@PostMapping("/asegurado")
public String recibeDatos(@ModelAttribute Usuario usuario) {
	return "resultado";
	}

}
