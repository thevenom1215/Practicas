package servicio;

import modelos.Usuario;

public class ServiciosUsuario {

	public boolean verificacionUsuario(Usuario usuario) {
		boolean verificacion = false;
		if(		usuario.getNombre() 	!= "" && 
				usuario.getApellidos() 	!= ""
				) {
		verificacion = true;
		}
		else {verificacion = false;}
		return verificacion;
	}
}
