package servicios;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import modelos.Estatus_Poliza;
import modelos.Poliza;
import modelos.Retorno_Inversion;
import modelos.Tipo_de_Cobertura;
import modelos.Tipo_de_Poliza;
import modelos.Usuario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MovimientoPoliza {
	
AnnotationConfigApplicationContext conseguirDatos = new AnnotationConfigApplicationContext();

Usuario 			user 		= (Usuario) conseguirDatos.getBean("Usuario");
Poliza 				poliza 		= (Poliza) conseguirDatos.getBean("Poliza");
Retorno_Inversion 	retorno 	= (Retorno_Inversion) conseguirDatos.getBean("Retorno_Inversion");
Tipo_de_Poliza 		tipo 		= (Tipo_de_Poliza) conseguirDatos.getBean("Tipo_de_Poliza");
Tipo_de_Cobertura 	cobertura 	= (Tipo_de_Cobertura) conseguirDatos.getBean("Tipo_de_Cobertura");
Estatus_Poliza 		estatus 	= (Estatus_Poliza) conseguirDatos.getBean("Estatus_Poliza");

public void generarPoliza() throws ParseException{
	
SimpleDateFormat formato = new SimpleDateFormat("DD/MM/YYYY");
Date fecha  = formato.parse("01/01/1900");

poliza.setNo_de_poliza(0);
poliza.setNo_de_folio(0);
user.setId_usuario(0);
poliza.setSuma_asegurada(5000.00);
estatus.setEstatus_Poliza(0);
poliza.setFecha_celebracion(fecha);
tipo.setId_tipo_poliza(0);
cobertura.setTipo_de_cobertura(0);
poliza.setTasa_interes(0.25);
poliza.setCobro_rescate(50000);
retorno.setId_retorno_inversion(0);
}


@Autowired
public ModelAndView obtenerPoliza() {
ModelAndView modelo = new ModelAndView();
Map <String, Double> mapeado = new HashMap<String, Double>();

mapeado.put("no de poliza" 		, 	(double)poliza.getNo_de_poliza());
mapeado.put("no de folio"		,	(double)poliza.getNo_de_folio());
mapeado.put("id usuario"		,	(double)user.getId_usuario());
mapeado.put("suma asegurada"	,	(double)poliza.getSuma_asegurada());
mapeado.put("estatus poliza"	,   (double)estatus.getEstatus_Poliza());
mapeado.put("tipo poliza"		, 	(double)tipo.getId_tipo_poliza());
mapeado.put("cobertura"			, 	(double)cobertura.getTipo_de_cobertura());
mapeado.put("tasa interes"		,	poliza.getTasa_interes());
mapeado.put("cobro rescate"		,	poliza.getCobro_rescate());
mapeado.put("retorno inversion"	,	(double)retorno.getId_retorno_inversion());

modelo.addAllObjects(mapeado);
return modelo;
}


}
