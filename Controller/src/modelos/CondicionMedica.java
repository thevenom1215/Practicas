package modelos;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class CondicionMedica {
	
@Autowired

private Map <Integer,String> condicionMedica = new HashMap<Integer,String>();

public Map<Integer, String> getCondicionMedica() {
	return condicionMedica;
}

public void setCondicionMedica(Map<Integer, String> condicionMedica) {
	this.condicionMedica = condicionMedica;
}

}
