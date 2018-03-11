package acceso;
import java.sql.PreparedStatement;

import conexion.ConexionBD;
import modelos.CondicionMedica;

public class DAOCondicionMedicaImpl extends ConexionBD implements DAOCondicionMedica{

	@Override
	public void consultar(CondicionMedica condicion) throws Exception {
		try {
			this.getConnection();
		PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM condicion medica");
		pstm.executeUpdate();}
		catch(Exception e) {throw e;}
		finally {this.desconectar();}
	}

}
