package conexion;

import java.sql.DriverManager;
import java.sql.Connection;

public class ConexionBD {
	public Connection conexion		=	null;
	public final String dbnombre	=	"segurosdevida";
	public final String usuario		=	"root";
	public final String contraseña	= 	"";
	public final String url			= 	"jdbc:mysql://localhost:3306/"+dbnombre;
	public final String driver		=	"com.mysql.jdbc.Driver";
	
	public ConexionBD(){
		try {
			Class.forName(driver);
			conexion = DriverManager.getConnection(url, usuario, contraseña);
		
		if(conexion!=null) {
			//System.out.println("conexion a base de datos exitosa");
			}
		}
		catch(Exception e) {
			System.out.println("Ha ocurrido un error: " + e.getMessage());}
	}
	
	public java.sql.Connection getConnection() {		
		return conexion;
	}
	
	public void desconectar() {
		conexion = null;
	}
	
}
