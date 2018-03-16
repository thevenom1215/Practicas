package servicio;

import modelos.EventoUsuario;



public class ServiciosEventos {
	
private boolean validacion;
	
	public boolean verificarRegistro(EventoUsuario evento) {
		validacion = false;
		if(	evento.getNoPoliza() != 0 &&
			evento.getEvento() 	!= 0 
				) {
			validacion = true;
		}
		return validacion;
	}
	
	public boolean verificarBusqueda (EventoUsuario evento) {
		validacion = false;
		if(evento.getNoPoliza() != 0) {
			validacion = true;
			
		}
		return validacion;
	}
	
}
