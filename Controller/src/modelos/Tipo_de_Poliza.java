package modelos;

import java.util.HashMap;

public class Tipo_de_Poliza {

public static HashMap <Integer,String> tipoPoliza = new HashMap<Integer,String>();

public static HashMap<Integer, String> getTipoPoliza() {
	return tipoPoliza;
}

public static void setTipoPoliza(HashMap<Integer, String> tipoPoliza) {
	Tipo_de_Poliza.tipoPoliza = tipoPoliza;
}
	
}
