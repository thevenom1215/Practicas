package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InterfacesController {
	
	@RequestMapping("/main.do")
	public ModelAndView interfazPrincipal() {
	ModelAndView vista = new ModelAndView("Interfaz");
	return vista;
}
}
