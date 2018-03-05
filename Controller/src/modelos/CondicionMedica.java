package modelos;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class CondicionMedica {
	
@Autowired

public static Map <Integer,String> condicionMedica = new HashMap<Integer,String>();

public static Map<Integer, String> getCondicionMedica() {
	return condicionMedica;
}

public static void setCondicionMedica(Map<Integer, String> condicionMedica) {
	CondicionMedica.condicionMedica = condicionMedica;
}


}
