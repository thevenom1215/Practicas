package modelos;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

public class Eventos {
	
@Autowired
private static HashMap <Integer,String> eventos = new HashMap <Integer,String>();

public static HashMap<Integer, String> getEventos() {
	return eventos;
}

public static void setEventos(HashMap<Integer, String> eventos) {
	Eventos.eventos = eventos;
} 

}
