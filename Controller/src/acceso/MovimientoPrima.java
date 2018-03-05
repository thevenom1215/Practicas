package acceso;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import modelos.Forma_de_Pago;
import modelos.Poliza;
import modelos.Prima_seguros;
import modelos.Usuario;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MovimientoPrima {
	
	//Generacion del aplication context en anotaciones y asociacion con los beans
	AnnotationConfigApplicationContext primas = new AnnotationConfigApplicationContext();
	Usuario user = (Usuario) primas.getBean("Usuarios");
	Prima_seguros prima = (Prima_seguros) primas.getBean("Prima_seguros");
	Poliza poliza = (Poliza) primas.getBean("Poliza");
	Forma_de_Pago pago = (Forma_de_Pago) primas.getBean("Forma_de_Pago");
	
	//variables de la clase
	SimpleDateFormat formato = new SimpleDateFormat("DD/MM/YYYY");
	Date fecha_pago;
	
	public void generarPrima() {
		
		//definicion de formatos y variables de tiempo
		
		Date generacion = new Date();
		Date limite  = new Date();
		
		//obtener la fecha de generacion del recibo
		formato.format(generacion);
		
		//generar la fecha limite del pago del recibo generado
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(generacion);
		int dia = calendario.get(Calendar.DAY_OF_MONTH);
		int mes = calendario.get(Calendar.MONTH);
		int año = calendario.get(Calendar.YEAR);
		
		
		
		//calculo de dias para definir limite de pago del recibo
		if (dia>13) {
			
			//comparacion de febrero de 28 dias
			if(mes==1) {
				mes ++;
				dia = dia-15;
			}
			//comparacion de meses que tienen 31 dias
			if(mes%2 == 0) {
				
				if(dia>16) {
					if(mes == 11) {
						año++;
						mes = 0;
						dia = dia - 15;
					}
					
					mes++;
					dia = dia-15;
				}
				//comparacion de los meses que tienen 30 dias
				if(dia>15) {
					mes++;
					dia = dia - 15;
				}
			}
		}
		else{dia = dia+15;}
		
		//integracion de elementos para generar fecha limite de cada recibo de pago			
		limite = new GregorianCalendar(dia,mes,año).getTime();
		
		
		//integracion de los elementos que constituyen a los recibos de pago
		poliza.getNo_de_poliza();
		prima.setId_pago(0);
		prima.setNo_de_folio(0);
		prima.setFecha_generacion_recibo(generacion);
		prima.setFecha_limite(limite);
		prima.setFecha_pago(null);
		prima.setCantidad(00000.00);
		user.getId_usuario();
		pago.setId_forma_de_pago(0);
	}
	
	public void ingresoPrima() throws ParseException {
		//Generacion de fecha de pago realizada
		fecha_pago = new Date();
		formato.format(fecha_pago);
		fecha_pago = formato.parse("01/01/1900");
		
		poliza.getNo_de_poliza();
		prima.getId_pago();
		prima.getNo_de_folio();
		prima.getFecha_generacion_recibo();
		prima.getFecha_limite();
		prima.setFecha_pago(fecha_pago);
		prima.getCantidad();
		user.getId_usuario();
		pago.setId_forma_de_pago(0);
		
	}
	
}
