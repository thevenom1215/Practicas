package acceso;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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


@Controller
public class MovimientoPoliza {

	Usuario user = new Usuario();
	Poliza poliza = new Poliza();
	Tipo_de_Cobertura cobertura = new Tipo_de_Cobertura();
	Retorno_Inversion retorno = new Retorno_Inversion();
	
public void generarPoliza() throws ParseException{
	
SimpleDateFormat formato = new SimpleDateFormat("DD/MM/YYYY");
Date fecha  = formato.parse("01/01/1900");

poliza.setNo_de_poliza(0);
poliza.setNo_de_folio(0);
poliza.setId_usuario(0);
poliza.setSuma_asegurada(0);
poliza.setId_estatus(0);
poliza.setFecha_celebracion(fecha);
poliza.setId_tipo(0);
poliza.setCobertura(0);

poliza.setTasa_interes(0);
poliza.setCobro_rescate(0);
retorno.setId_retorno_inversion(0);
}

}
