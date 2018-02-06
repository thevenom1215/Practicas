package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BasicController {
	@RequestMapping("/hello")
	public ModelAndView hello() {
	String message = "ola k ase";
	ModelAndView modelo= new ModelAndView("hellopage");
	modelo.addObject("hellomessage",message);
	return modelo;
}
}
