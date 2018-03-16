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

import modelos.Tipo_de_Cobertura;
import modelos.Tipo_de_Poliza;
import modelos.Poliza;
import modelos.ListaPolizas;
import modelos.Tipo_de_Cobertura;

import servicio.ServiciosPoliza;

@Controller
public class PolizaController {
	
	Poliza poliza = new Poliza();
	ServiciosPoliza servicios = new ServiciosPoliza();
	
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
	
	//Registro de poliza nueva
	@PostMapping("/registroPoliza.do")
	public ModelAndView registroPoliza(@RequestParam Map<String,String> datosPoliza) throws Exception {
		
		ModelAndView vistaPoliza = new ModelAndView("RegistroExitosoPoliza");
		ArrayList<String> llaves = new ArrayList<String>();
		ArrayList<String> valores = new ArrayList<String>();
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

	//Busqueda de poliza
	@RequestMapping("/buscarPoliza.do")
	public ModelAndView busquedPoliza() throws Exception {
		ModelAndView busqueda;
		if(servicios.busquedaPoliza(poliza)==true) {
			
			ListaPolizas lista = new ListaPolizas();
			
			busqueda = new ModelAndView("ResultadoBusquedaPoliza");
			
			busqueda.addObject("no de poliza",lista.getNo_de_poliza());
			busqueda.addObject("no de folio",lista.getNo_de_folio());
			busqueda.addObject("id estatus",lista.getId_estatus());
			busqueda.addObject("id tipo",lista.getId_tipo());
			busqueda.addObject("id usuario",lista.getId_usuario());
			busqueda.addObject("id retorno inv",lista.getId_retorno_inv());
			busqueda.addObject("suma asegurada",lista.getSuma_asegurada());
			busqueda.addObject("tasa de interes",lista.getTasa_interes());
			busqueda.addObject("cobro de rescate",lista.getCobro_rescate());
			busqueda.addObject("fecha celebracion",lista.getFecha_celebracion());
		}
		else {
			busqueda = new ModelAndView("FalloBusqueda");
		}
		
		return new ModelAndView("BusquedaPoliza");
	}
	
	//Acceso a cobertura de poliza
	@RequestMapping("/agregarCobertura.do")
	public ModelAndView seleccionCobertura() {
		ModelAndView vista = new ModelAndView("RegistrarCoberturaPoliza");
		Tipo_de_Cobertura cobertura = new Tipo_de_Cobertura();
		vista.addObject("poliza",poliza.getNo_de_folio());
		vista.addObject("ids", cobertura.getCobertura().keySet());
		vista.addObject("cobertura", cobertura.getCobertura().values());
		return vista;
	}
	
	//Registro cobertura de poliza
	@PostMapping("/registrarCobertura.do")
	public ModelAndView registraCobertura(@RequestParam("parametro") ArrayList <Integer> datos, @RequestParam("poliza") Integer poliza) {
		ModelAndView respuesta = new ModelAndView();
		
		try{
			if(servicios.registroCobertura(datos, poliza)==true) {
				respuesta = new ModelAndView("RegistroExitosoPoliza");}
			else {respuesta = new ModelAndView("FalloRegistro");}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());}
		
		
		return respuesta;
	}
}
