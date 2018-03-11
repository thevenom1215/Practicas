package acceso;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import modelos.CondicionMedica;
import modelos.Usuario;
import conexion.ConexionBD;

import java.util.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MovimientosUsuarios {

	//generacion del metodo aplication context con anotaciones y asociacion de clases con beans
	
	AnnotationConfigApplicationContext usuario_context = new AnnotationConfigApplicationContext();
	Usuario user = (Usuario) usuario_context.getBean("Usuario");
	CondicionMedica condicion = (CondicionMedica) usuario_context.getBean("CondicionMedica");
	
	 void generarUsuario() throws ParseException {
		
		ConexionBD acceso = new ConexionBD();
		try {
		Statement sentencia = acceso.getConnection().createStatement();
		
		String accion 	= "INSERT INTO";
		String tabla 	= "usuarios";
		String campos 	= "VALUES"
				+ "('"+user.getNombre()+
				"','"+user.getApellidos()+
				"','"+user.getFecha_de_nacimiento()+
				"','"+user.getEdad()+
				"','"+user.getGenero()+
				"','"+user.getTelefono()+
				"','"+user.getCelular()+
				"','"+user.getCorreo()+
				"','"+user.getDireccion()+
				"','"+user.getLocacion()+
				"','"+user.getOcupacion()+
				"','"+user.getEstado_civil()+
				"','"+user.getPasatiempos()+
				"','"+user.getRfc()+
				"','"+user.getCurp()+
				"','"+user.getId_condicionMedica()+"')";
		
		String consulta = accion+" "+tabla+" "+campos;
		
		sentencia.executeUpdate(consulta);}
		catch(Exception e) {
			System.err.println("ha ocurrido un error al tratar de insertar el usuario");
		}
		
		SimpleDateFormat formato = new SimpleDateFormat("DD/MM/YYYY");
		Date nacimiento = formato.parse("01/01/1900");
		
		user.setId_usuario(0);
		
		user.setNombre("");
		user.setApellidos("");
		user.setFecha_de_nacimiento(nacimiento);
		user.setEdad(0);
		user.setGenero("");
		user.setTelefono("");
		user.setCelular("");
		user.setCorreo("");
		user.setCalle("");
		user.setNumero(0);
		user.setCodigo_postal(0);
		user.setDireccion();
		user.setCiudad("");
		user.setEstado("");
		user.setPais("");
		user.setLocacion();
		user.setOcupacion("");
		user.setEstado_civil("");
		user.setPasatiempos("");
		user.setRfc("");
		user.setCurp("");
		
		condicion.getCondicionMedica();
	}
	
	void modificarUsuario() {
		
	}
	
}
