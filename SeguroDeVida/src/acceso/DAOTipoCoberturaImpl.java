package acceso;

import java.sql.Statement;
import java.sql.ResultSet;

import conexion.ConexionBD;

import modelos.Tipo_de_Cobertura;

public class DAOTipoCoberturaImpl implements DAOTipoCobertura{
	
	ConexionBD enlaza;
	
	@Override
	public void consultarCoberturas() throws Exception {
		Tipo_de_Cobertura cobertura = new Tipo_de_Cobertura();
		enlaza = new ConexionBD();
		String sql = "SELECT * FROM cobertura";
		Statement stm  = enlaza.getConnection().createStatement();
		ResultSet rs = stm.executeQuery("");
		while(rs.next()) {
			cobertura.getCobertura().put(rs.getInt("id"), rs.getString("descripcion"));
		}
	}

}
