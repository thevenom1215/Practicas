package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import modelos.Prima_seguros;

@Controller
public class PrimaController {

	//Envio de informacion al recibo a generar
	@RequestMapping("/recibo.do")
	public ModelAndView vistaPrima() {
		ModelAndView recibo = new ModelAndView("Recibo");
		SimpleDateFormat formato = new SimpleDateFormat("MM-dd-YYYY");
		Date hoy = new Date();
		String ahora;
		String limite;
		
		formato.format(hoy);
		Calendar c = Calendar.getInstance();
		c.setTime(hoy);
		c.add(Calendar.DATE,15);
		limite = formato.format(c.getTime());
		ahora = formato.format(hoy.getTime());	
		recibo.addObject("fecha", ahora);
		recibo.addObject("limite",limite);
		return recibo;
	}
	
	//verificacion de informacion de recibo
	@PostMapping("/generarRecibo.do")
	public ModelAndView registroPrima(@RequestParam Map <String,String> datosRecibo) throws Exception {
		ModelAndView reciboPrima = new ModelAndView("GeneracionRecibo");
		ArrayList <String> llaves = new ArrayList<String>();
		ArrayList <String> valores = new ArrayList<String>();
		Prima_seguros prima = new Prima_seguros();
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
		Date generacion = formato.parse(datosRecibo.get("generacion"));
		Date pago = formato.parse(datosRecibo.get("pago"));
		Date limite = formato.parse(datosRecibo.get("limite"));
		
		prima.setId_poliza(Integer.parseInt(datosRecibo.get("no poliza")));
		prima.setId_usuario(Integer.parseInt(datosRecibo.get("usuario")));
		prima.setNo_de_folio(Integer.parseInt(datosRecibo.get("no folio")));
		prima.setFecha_generacion_recibo(generacion);
		prima.setFecha_pago(pago);
		prima.setFecha_limite(limite);
		prima.setCantidad(Double.parseDouble(datosRecibo.get("cantidad")));
	
		llaves.addAll(datosRecibo.keySet());
		valores.addAll(datosRecibo.values());
		
		reciboPrima.addObject("llaves",llaves);
		reciboPrima.addObject("valores",valores);
		reciboPrima.addObject("lista", datosRecibo);
		return reciboPrima;
	}
	
}
