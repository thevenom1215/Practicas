package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BeneficiariosController {
	/*Controladores de beneficiarios*/

	//Controller registro de beneficiarios
	@RequestMapping("beneficiario.do")
	public ModelAndView beneficiario(){
		return new ModelAndView("RegistroBeneficiario");
		}

}
