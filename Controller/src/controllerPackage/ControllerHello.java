package controllerPackage;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import modelos.CondicionMedica;

import modelos.Tipo_de_Poliza;
import modelos.Tipo_de_Cobertura;
@Controller
public class ControllerHello {

//Controller de registro de usuarios
@RequestMapping("/hello.do")
public ModelAndView sayHello() {
	
	/*Llamada a las condiciones medicas*/
	CondicionMedica lista = new CondicionMedica();
	
	/*Datos de prueba de condicion medica*/
	lista.getCondicionMedica().put(0, "Enfermo");
	lista.getCondicionMedica().put(1, "Sano");
	lista.getCondicionMedica().put(2, "Grave");
	
	//Creacion del modelo que se envia al JSP
	ModelAndView modelo = new ModelAndView("HelloPage");
	
	//Se agregan los datos que se enviaran al front end
	modelo.addObject("lista",lista.condicionMedica.values());
	return modelo;}


//Metodo de prueba
@RequestMapping("/usuario.do")
public ModelAndView datos() {
	ModelAndView datos = new ModelAndView("DatosUsuario");
	datos.addObject("nombre","Jorge");
	return datos;
}

//Controller de registro de poliza
@RequestMapping("/poliza.do")
public ModelAndView poliza() {
	
	Tipo_de_Poliza tipo = new Tipo_de_Poliza();
	Tipo_de_Cobertura cob = new Tipo_de_Cobertura();
	cob.getCobertura().put(0, "Gastos en caso de fallecimiento");
	tipo.getTipoPoliza().put(0, "Seguro de vida Universal");
	
	ModelAndView poliza = new ModelAndView("RegistroPoliza");
	poliza.addObject("cobertura",cob.getCobertura().values());
	poliza.addObject("tipos",tipo.getTipoPoliza().values());
	return poliza;
}

}
