package pruebas;
import conexion.ConexionBD;
public class PruebaConexionDB extends ConexionBD{

	public void pruebaConexion(){
		try{this.getConnection();
			System.out.println("la conexion ha sido exitosa");}
		catch(Exception e) {System.out.println("Ha ocurrido un error " + e.getMessage());}
		finally {this.desconectar();
		System.out.println("se ha cerrado la conexion");}
	}
	
	public static void main(String[] args) {
	new PruebaConexionDB().pruebaConexion();

	}

}
