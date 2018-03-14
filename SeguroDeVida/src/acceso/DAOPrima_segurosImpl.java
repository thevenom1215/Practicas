package acceso;

import java.sql.PreparedStatement;

import conexion.ConexionBD;
import modelos.Prima_seguros;

public class DAOPrima_segurosImpl extends ConexionBD implements DAOPrima_seguros{

	@Override
	public void generarPrimaSeguro(Prima_seguros prima) throws Exception {
		try {
			this.getConnection();
			PreparedStatement pstm = this.getConnection().prepareStatement("INSERT INTO "
					+ "prima de seguros "
					+ "(no de poliza, no de folio, generacion recibo, limite pago, fecha de pago, cantidad, id usuario, id forma de pago) "
					+ "VALUES (?,?,?,?,?,?,?,?)");
			
			pstm.setInt		(1,		prima.getId_poliza());
			pstm.setInt		(2,		prima.getNo_de_folio());
			pstm.setDate	(3, 	(java.sql.Date) prima.getFecha_generacion_recibo());
			pstm.setDate	(4, 	(java.sql.Date) prima.getFecha_limite());
			pstm.setDate	(5, 	(java.sql.Date) prima.getFecha_pago());
			pstm.setDouble	(6,		prima.getCantidad());
			pstm.setInt		(7, 	prima.getId_usuario());
			pstm.setInt		(8,		prima.getId_pago());
			pstm.executeUpdate();
		}catch(Exception e) {throw e;}
		finally {this.desconectar();}
	}

	@Override
	public void consultarPrimaSeguro(Prima_seguros prima) throws Exception {
		try {
			this.getConnection();
		PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM prima de seguros WHERE no de poliza = ?");
		pstm.setInt(1, prima.getId_poliza());
		pstm.executeUpdate();}
		catch(Exception e) {throw e;}
		finally {this.desconectar();}
	}

	@Override
	public void editarPrimaSeguro(Prima_seguros prima) throws Exception {
		try {
			this.getConnection();
			PreparedStatement pstm = this.getConnection().prepareStatement("UPDATE "
					+ "prima de seguros "
					+ "SET (generacion recibo, limite de pago, fecha de pago, cantidad)"
					+ "WHERE no de folio = ?");
			pstm.setInt(1,prima.getNo_de_folio());
			pstm.executeUpdate();
		}catch(Exception e) {throw e;}
		finally {this.desconectar();}
	}

}
