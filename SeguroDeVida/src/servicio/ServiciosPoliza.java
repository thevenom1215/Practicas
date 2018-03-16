package servicio;

import modelos.Poliza;

import java.util.ArrayList;

import acceso.DAOPolizaImpl;

public class ServiciosPoliza {
	
DAOPolizaImpl acceso = new DAOPolizaImpl();
boolean verificacion; 

	public boolean registroPoliza(Poliza poliza) throws Exception {
		verificacion = false;
		
		if(	poliza.getNo_de_folio() != 0 && poliza.getId_usuario() != 0 
			&& poliza.getSuma_asegurada() != 0 ) {
		verificacion = true;
		acceso.registrar(poliza);
		}
		return verificacion;
	}
	
	public boolean busquedaPoliza (Poliza poliza) throws Exception{
		verificacion = false;
		if(poliza.getNo_de_folio() != 0) {
			verificacion = true;
			acceso.buscar(poliza);
		}
		return verificacion;
	}
	
	public boolean registroCobertura(ArrayList <Integer> datos, int poliza) throws Exception{
		verificacion = false;
		if (datos.size() != 0 && poliza != 0) {
			verificacion = true;
			acceso.registrarCobertura(datos, poliza);
		}
		
		return verificacion;
	}
	
}
