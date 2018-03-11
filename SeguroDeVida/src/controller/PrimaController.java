package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrimaController {

	@RequestMapping("/recibo.do")
	public ModelAndView vistaPrima() {
		ModelAndView recibo = new ModelAndView("Recibo");
		recibo.addObject("Recibo","");
		return recibo;
	}
	
}
