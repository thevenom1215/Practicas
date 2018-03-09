package acceso;
import java.sql.Date;
import java.sql.PreparedStatement;

import conexion.ConexionBD;
import modelos.Poliza;

public class DAOPolizaImpl extends ConexionBD implements DAOPoliza {

	@Override
	public void registrar(Poliza poliza) throws Exception {
		try {
			this.getConnection();
			PreparedStatement pstm = this.getConnection().prepareStatement("INSERT INTO "
					+ "poliza de contrato "
					+ "(id usuario, no de folio,suma asegurada, id estatus, fecha celebracion, id tipo de poliza, id tipo de cobertura, tasa de interes, cobro rescate, id retorno inversion) "
					+ "VALUES (?,?,?,?,?,?,?,?,?,?)");
					pstm.setInt		(1, poliza.getId_usuario());
					pstm.setInt		(2, poliza.getNo_de_folio());
					pstm.setDouble	(3, poliza.getSuma_asegurada());
					pstm.setInt		(4, poliza.getId_estatus());
					pstm.setDate	(5, (Date) poliza.getFecha_celebracion());
					pstm.setInt		(6, poliza.getId_tipo());
					pstm.setInt		(7, poliza.getCobertura());
					pstm.setDouble	(8, poliza.getTasa_interes());
					pstm.setDouble	(9, poliza.getCobro_rescate());
					pstm.setInt		(10,poliza.getId_retorno_inv());
			pstm.executeUpdate();
		}catch(Exception e) {throw e;}
		finally {this.desconectar();}
	}

	@Override
	public void editar(Poliza poliza) throws Exception {
		try {
			this.getConnection();
			PreparedStatement pstm = this.getConnection().prepareStatement("UPDATE "
					+ "poliza de contrato "
					+ "SET (id usuario, no de folio,suma asegurada, id estatus, fecha celebracion, id tipo de poliza, id tipo de cobertura, tasa de interes, cobro rescate, id retorno inversion) "
					+ "WHERE no de poliza = ?");
			pstm.setInt(1,poliza.getNo_de_poliza());
			pstm.executeUpdate();
		}catch(Exception e) {throw e;}
		finally {this.desconectar();}
		
	}

	@Override
	public void eliminar(Poliza poliza) throws Exception {
		try {
			this.getConnection();
			PreparedStatement pstm = this.getConnection().prepareStatement("DELETE * FROM "
					+ "poliza de contrato "
					+ "WHERE no de poliza = ?");
			pstm.setInt(1,poliza.getNo_de_poliza());
			pstm.executeUpdate();
		}catch(Exception e) {throw e;}
		finally {this.desconectar();}
		
	}

	@Override
	public void revisar(Poliza poliza) throws Exception {
		try {
			this.getConnection();
			PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM "
					+ "poliza de contrato "
					+ "WHERE no de poliza = ?");
			pstm.setInt(1,poliza.getNo_de_poliza());
			pstm.executeUpdate();
		}catch(Exception e) {throw e;}
		finally {this.desconectar();}
		
	}

}
