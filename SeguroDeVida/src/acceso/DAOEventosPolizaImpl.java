package acceso;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

import conexion.ConexionBD;

import modelos.ListaEventosPoliza;

public class DAOEventosPolizaImpl extends ConexionBD implements DAOEventosPoliza{

	@Override
	public void registrarEvento() throws Exception {
		String sql = "INSERT INTO eventosUsuario (no de poliza, id evento, fecha evento ,descripcion) VALUES (?,?,?,?)";
		this.getConnection();
		PreparedStatement pstm = this.getConnection().prepareStatement(sql);
		pstm.executeQuery();
	}

	@Override
	public void consultarEvento() throws Exception {
		ListaEventosPoliza lista = new ListaEventosPoliza();
		String sql = "SELECT * FROM eventosUsuario where 'no de poliza' = ?";
		Statement stm = this.getConnection().createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while(rs.next()) {
			lista.getNoPoliza().add(rs.getInt("no de poliza"));
			lista.getEvento().add(rs.getInt("id evento"));
			lista.getFecha().add(rs.getDate("fecha"));
			lista.getDescripcion().add(rs.getString("descripcion"));
		}
		
	}

}
