package modelos;

import java.util.HashMap;

public class Tipo_de_Cobertura {

public static HashMap <Integer,String> cobertura = new HashMap<Integer,String>();

public static HashMap<Integer, String> getCobertura() {
	return cobertura;
}

public static void setCobertura(HashMap<Integer, String> cobertura) {
	Tipo_de_Cobertura.cobertura = cobertura;
}


}
