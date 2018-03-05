package controllerPackage;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerHello {
	
@RequestMapping("/hello.do")
public ModelAndView sayHello() {
	ModelAndView modelo = new ModelAndView("HelloPage");
	modelo.addObject("salute","ola k ase");
	return modelo;}

@RequestMapping("/usuario.do")
public ModelAndView datos() {
	ModelAndView datos = new ModelAndView("DatosUsuario");
	datos.addObject("nombre","Jorge");
	return datos;
}

}
