package conexion;

//import ;
import java.sql.*;
import com.mysql.jdbc.Connection;

public class ConexionBD {
	String dbnombre 	=	"segurosdevida";
	String usuario 		=	"root";
	String contraseña 	= 	"";
	String url 			= 	"jdbc:mysql://localhost/"+dbnombre;
	
	Connection conexion = null;
	public ConexionBD(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = (Connection) DriverManager.getConnection(url, usuario, contraseña);
		
		if(conexion!=null) {
			System.out.println("conexion a base de datos exitosa");
		}
		}
		catch(Exception e) {
			System.out.println("Ha ocurrido un error: \n \n");
			System.err.println(e.getMessage());}
		
	}
	
	public Connection getConnection() {
		return conexion;
	}
	
	public void desconectar() {
		conexion = null;
	}
	
}
