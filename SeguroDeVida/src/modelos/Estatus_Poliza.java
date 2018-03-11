package modelos;



import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

public class Estatus_Poliza {
@Autowired
private static HashMap <Integer,String> estatusPoliza = new HashMap <Integer,String>();

public HashMap<Integer, String> getEstatusPoliza() {
	return estatusPoliza;
}

public void setEstatusPoliza(HashMap<Integer, String> estatusPoliza) {
	Estatus_Poliza.estatusPoliza = estatusPoliza;
}


}
