package pruebas;
import java.sql.ResultSet;

import java.sql.Statement;

import conexion.ConexionBD;
public class PruebaConexionDB extends ConexionBD{

	public void pruebaConexion(){
		try{this.getConnection();
			System.out.println("la conexion ha sido exitosa");
		Statement stm =  this.getConnection().createStatement();	
		ResultSet rs = stm.executeQuery("SELECT * FROM usuarios");
		while (rs.next()) {
		
		System.out.println(rs.getString("nombre"));	
		}
		System.out.println("consulta realizada");
		}
		catch(Exception e) {System.out.println("Ha ocurrido un error " + e.getMessage());}
		finally {this.desconectar();
		System.out.println("se ha cerrado la conexion");}
	}
	
	public static void main(String[] args) {
	new PruebaConexionDB().pruebaConexion();
	
	}

}
