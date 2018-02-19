package acceso;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

import modelos.Usuario;
import modelos.BuroCredito;

public class MovimientosBuroCredito {
	
	AnnotationConfigApplicationContext buro = new AnnotationConfigApplicationContext();
	Usuario user = (Usuario) buro.getBean("Usuario");
	BuroCredito buro_credito = (BuroCredito) buro.getBean("BuroCredito");
	
	public void agregarBuro() throws ParseException {
	Date consulta = new Date();	
	SimpleDateFormat formato = new SimpleDateFormat("DD/MM/YYYY");
	formato.format(consulta);
	consulta = formato.parse("01/01/1900");
	
	user.getId_usuario();	
	buro_credito.setNo_buro_credito(0);
	buro_credito.setNo_consulta(0);
	buro_credito.setFecha_consulta(consulta);
	}

	public void consultarBuro() {
	/*Creacion de lista tipo string que agrega datos del buro de credito*/
	ArrayList <String> datos_buro = new ArrayList<String>();	
	datos_buro.add(Integer.toString(user.getId_usuario()));
	datos_buro.add(Integer.toString(buro_credito.getNo_buro_credito()));
	datos_buro.add(Integer.toString(buro_credito.getNo_consulta()));
	datos_buro.add(buro_credito.getFecha_consulta().toString());
	}
	
}
