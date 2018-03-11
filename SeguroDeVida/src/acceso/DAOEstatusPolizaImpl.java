package acceso;
import java.sql.PreparedStatement;

import conexion.ConexionBD;
import modelos.Estatus_Poliza;
public class DAOEstatusPolizaImpl extends ConexionBD implements DAOEstatusPoliza{

	@Override
	public void revisar(Estatus_Poliza estatus) throws Exception {
		try {
			this.getConnection();
		PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM estatus poliza");
		pstm.executeUpdate();}
		catch(Exception e) {throw e;}
		finally {this.desconectar();}
	}

}
