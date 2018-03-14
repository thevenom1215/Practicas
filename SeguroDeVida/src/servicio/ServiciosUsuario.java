package servicio;

import acceso.DAOUsuarioImpl;
import modelos.Usuario;

public class ServiciosUsuario {
	
	DAOUsuarioImpl acceso = new DAOUsuarioImpl();
	
	public boolean verificacionUsuario(Usuario usuario) throws Exception {
		boolean verificacion = false;
		if(		usuario.getNombre() 	!= "" && 
				usuario.getApellidos() 	!= "" &&
				usuario.getFecha_de_nacimiento() != null &&
				usuario.getDireccion() != ""
				) {
		verificacion = true;
		acceso.registrar(usuario);
		}
		else {verificacion = false;}
		return verificacion;
	}
	
	public boolean consultaUsuario(Usuario usuario) throws Exception {
		boolean verificacion = false;
		if(usuario.getNombre() != "" &&
		usuario.getApellidos() != "") {
			verificacion  = true;
			acceso.buscar(usuario);
		}
		
		return verificacion;
	}
}
