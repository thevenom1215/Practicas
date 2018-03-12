package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import modelos.Tipo_de_Cobertura;
import modelos.Tipo_de_Poliza;
import modelos.Poliza;

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
	
	@PostMapping("/registroPoliza.do")
	public ModelAndView registroPoliza(@RequestParam Map<String,String> datosPoliza) throws Exception {
		
		ModelAndView vistaPoliza = new ModelAndView("RegistroExitosoPoliza");
		ArrayList<String> llaves = new ArrayList<String>();
		ArrayList<String> valores = new ArrayList<String>();
		
		Poliza poliza = new Poliza();
		
		Date fecha = new SimpleDateFormat("MM-DD-YYYY").parse(datosPoliza.get("celebracion contrato"));
		
		
		poliza.setNo_de_folio(Integer.parseInt(datosPoliza.get("no de folio")));
		poliza.setId_usuario(Integer.parseInt(datosPoliza.get("id usuario")));
		poliza.setSuma_asegurada(Double.parseDouble(datosPoliza.get("suma asegurada")));
		poliza.setId_estatus(Integer.parseInt(datosPoliza.get("id estatus")));
		poliza.setFecha_celebracion(fecha);
		poliza.setId_tipo(Integer.parseInt(datosPoliza.get("tipo de poliza")));
		poliza.setCobertura(Integer.parseInt(datosPoliza.get("tipo de cobertura")));
		poliza.setTasa_interes(Double.parseDouble(datosPoliza.get("tasa de interes")));
		poliza.setCobro_rescate(Double.parseDouble(datosPoliza.get("rescate")));
		poliza.setId_retorno_inv(Integer.parseInt(datosPoliza.get("retorno inversion")));
		
		llaves.addAll(datosPoliza.keySet());
		valores.addAll(datosPoliza.values());
		
		vistaPoliza.addObject("llaves",llaves);
		vistaPoliza.addObject("valores",valores);
		
		return vistaPoliza;
	}

}
