package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import modelos.Beneficiario;

import servicio.ServiciosBeneficiario;

@Controller
public class BeneficiariosController {
	/*Controladores de beneficiarios*/

	Beneficiario beneficiario = new Beneficiario();
	ServiciosBeneficiario servicio = new ServiciosBeneficiario();
	
	//Controller registro de beneficiarios
	@RequestMapping("beneficiario.do")
	public ModelAndView beneficiario(){
		return new ModelAndView("RegistroBeneficiario");
		}
	
	//Controller de revision de datos
	@PostMapping("/registroBeneficiario.do")
	public ModelAndView registroBeneficiario(@RequestParam Map<String,String> datosBenef) throws Exception {
		
		ModelAndView registroBeneficiario = new ModelAndView("RegistroExitosoBeneficiario");
		
		ArrayList <String> llaves = new ArrayList<String>();
		ArrayList <String> valores = new ArrayList<String>();
		
		Date fecha = new SimpleDateFormat("MM-DD-YYYY").parse(datosBenef.get("nacimiento"));
		
		beneficiario.setNombre(datosBenef.get("nombre"));
		beneficiario.setApellidos(datosBenef.get("apellidos"));
		beneficiario.setFecha_de_nacimiento(fecha);
		beneficiario.setEdad(Integer.parseInt(datosBenef.get("edad")));
		beneficiario.setGenero(datosBenef.get("genero"));
		beneficiario.setTelefono(datosBenef.get("telefono"));
		beneficiario.setCelular(datosBenef.get("celular"));
		beneficiario.setCorreo(datosBenef.get("correo"));
		beneficiario.setCalle(datosBenef.get("calle"));
		beneficiario.setNumero(Integer.parseInt(datosBenef.get("numero")));
		beneficiario.setCodigo_postal(Integer.parseInt(datosBenef.get("codigo postal")));
		beneficiario.setDireccion();
		beneficiario.setCiudad(datosBenef.get("ciudad"));
		beneficiario.setEstado(datosBenef.get("estado"));
		beneficiario.setPais(datosBenef.get("pais"));
		beneficiario.setLocacion();
		
		llaves.addAll(datosBenef.keySet());
		valores.addAll(datosBenef.values());
		
		registroBeneficiario.addObject("llaves",llaves);
		registroBeneficiario.addObject("valores",valores);
		return registroBeneficiario;
	}
	
	@RequestMapping("/buscarBeneficiario.do")
	public ModelAndView busquedaBeneficiario() {
		
		ModelAndView busqueda = new ModelAndView();
	
		try {
			if(servicio.busquedaBeneficiario(beneficiario) == true) {
				busqueda = new ModelAndView("ResultadoBusquedaBeneficiario");
				}
			else {busqueda = new ModelAndView("FalloBusqueda");}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return busqueda;
		
	}
}
