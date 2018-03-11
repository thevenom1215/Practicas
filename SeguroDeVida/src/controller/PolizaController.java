package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import modelos.Tipo_de_Cobertura;
import modelos.Tipo_de_Poliza;

@Controller
public class PolizaController {
	/*Controladores de poliza*/

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
