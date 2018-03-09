package acceso;

import java.sql.Date;
import java.sql.PreparedStatement;

import conexion.ConexionBD;
import modelos.Prima_seguros;

public class DAORecibosImpl extends ConexionBD implements DAORecibos{

	@Override
	public void generar(Prima_seguros recibos) throws Exception {
		try {
			this.getConnection();
			PreparedStatement pstm = this.getConnection().prepareStatement("INSERT INTO "
					+ "prima de seguros "
					+ "(no de poliza, no de folio, generacion recibo, limite de pago, fecha de pago, cantidad, id usuario, id forma de pago) "
					+ "VALUES (?,?,?,?,?,?,?,?)");
			pstm.setInt		(1, recibos.getId_poliza());
			pstm.setInt		(2, recibos.getNo_de_folio());
			pstm.setDate	(3, (Date) recibos.getFecha_generacion_recibo());
			pstm.setDate	(4, (Date) recibos.getFecha_limite());
			pstm.setDate	(5, (Date)recibos.getFecha_pago());
			pstm.setDouble	(6, recibos.getCantidad());
			pstm.setInt		(7, recibos.getId_usuario());
			pstm.setInt		(8, recibos.getId_pago());
			pstm.executeUpdate();
		}catch(Exception e) {throw e;}
		finally {this.desconectar();}
		
	}

	@Override
	public void consultar(Prima_seguros recibos) throws Exception {
		
		String sql="";
		int argumento = 0;
		int consulta = 0;
		switch (consulta) {
		case 0: sql = "SELECT * FROM prima de seguros WHERE id pago = ?";
				argumento = recibos.getId_pago();
				break;
		case 1: sql = "SELECT * FROM prima de seguros WHERE no de poliza = ? ";
				argumento = recibos.getId_poliza();
				break;
		case 2: sql = "SELECT * FROM prima de seguros WHERE id usuario = ?";
				argumento = recibos.getId_usuario();
				break;
		}
		
		try {
			this.getConnection();
			PreparedStatement pstm = this.getConnection().prepareStatement(sql);
			pstm.setInt		(1, argumento);
			pstm.executeUpdate();
		}catch(Exception e) {throw e;}
		finally {this.desconectar();}
		
	}

	@Override
	public void editar(Prima_seguros recibos) throws Exception {
		try {
			this.getConnection();
			PreparedStatement pstm = this.getConnection().prepareStatement("INSERT INTO "
					+ "prima de seguros "
					+ "(no de poliza, no de folio, generacion recibo, limite de pago, fecha de pago, cantidad, id usuario, id forma de pago) "
					+ "VALUES (?,?,?,?,?,?,?,?)");
			pstm.setInt		(1, recibos.getId_poliza());
			pstm.setInt		(2, recibos.getNo_de_folio());
			pstm.setDate	(3, (Date) recibos.getFecha_generacion_recibo());
			pstm.setDate	(4, (Date) recibos.getFecha_limite());
			pstm.setDate	(5, (Date)recibos.getFecha_pago());
			pstm.setDouble	(6, recibos.getCantidad());
			pstm.setInt		(7, recibos.getId_usuario());
			pstm.setInt		(8, recibos.getId_pago());
			pstm.executeUpdate();
		}catch(Exception e) {throw e;}
		finally {this.desconectar();}
		
	}

}
