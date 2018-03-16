package controller;

import java.util.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import modelos.Eventos;
import modelos.EventoUsuario;

import servicio.ServiciosEventos;

@Controller
public class EventosController {
	
ServiciosEventos servicio = new ServiciosEventos();
EventoUsuario evento = new EventoUsuario();
	
@RequestMapping("/evento.do")
public ModelAndView vistaEvento() {
	Eventos lista = new Eventos();
	lista.getEventos().put(0, "accidente automovilistico");
	lista.getEventos().put(1, "suicidio");
	ModelAndView vista = new ModelAndView("RegistroEvento");
	vista.addObject("eventos",lista.getEventos().values());
	return vista;
}

@PostMapping("/registrarEvento.do")
public ModelAndView registrarEventro(@RequestParam Map <String,String> datosEvento) throws ParseException {
	
	
	ModelAndView registro;
	
	SimpleDateFormat formato = new SimpleDateFormat("DD-MM-YYYY");
	Date fecha = formato.parse(datosEvento.get("fecha del evento"));
	java.sql.Date fechasql = new java.sql.Date(fecha.getTime());		
	evento.setAsegurado(datosEvento.get("asegurado"));
	evento.setNoPoliza(Integer.parseInt(datosEvento.get("no de poliza")));
	evento.setFecha(fechasql);
	evento.setEvento(Integer.parseInt(datosEvento.get("evento")));
	evento.setDescripcion(datosEvento.get("descripcion"));
	if(servicio.verificarRegistro(evento)== true) {
		registro = new ModelAndView("RegistroExitosoEvento");
	}
	else{registro = new ModelAndView("FalloRegistro");}	
	return registro;
	}

@RequestMapping("/consultarEventos.do")
public ModelAndView consultarEventos() {
	
	ModelAndView consultar = new ModelAndView();
	return consultar;
}

}
