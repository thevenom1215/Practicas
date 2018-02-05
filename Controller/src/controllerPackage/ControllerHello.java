package controllerPackage;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerHello {
	
@RequestMapping("/hello")
public ModelAndView sayHello() {

	ModelAndView modelo = new ModelAndView();
	modelo.addObject("salute","ola k ase");
	return modelo;}
}
