package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import modelos.Eventos;

@Controller
public class EventosController {
	
@RequestMapping("/evento.do")
public ModelAndView vistaEvento() {
	Eventos lista = new Eventos();
	lista.getEventos().put(0, "accidente automovilistico");
	lista.getEventos().put(1, "suicidio");
	ModelAndView vista = new ModelAndView("RegistroEvento");
	vista.addObject("eventos",lista.getEventos().values());
	return vista;
}
}
