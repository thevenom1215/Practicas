package acceso;
import java.sql.PreparedStatement;

import conexion.ConexionBD;
import modelos.Beneficiario;

public class DAOBeneficiariosImpl extends ConexionBD implements DAOBeneficiarios{

	@Override
	public void registrarBeneficiario(Beneficiario beneficiario) throws Exception {
		try {
			this.getConnection();
			PreparedStatement pstm = this.getConnection().prepareStatement("INSERT INTO "
					+ "beneficiarios "
					+ "(nombre,apellidos,fecha de nacimiento, edad, genero, telefono, celular, correo, direccion, locacion) "
					+ "VALUES (?,?,?,?,?,?,?,?,?,?)");
			
			pstm.setString	(1,		beneficiario.getNombre());
			pstm.setString	(2,		beneficiario.getApellidos());
			pstm.setDate	(3, 	(java.sql.Date) beneficiario.getFecha_de_nacimiento());
			pstm.setInt		(4,		beneficiario.getEdad());
			pstm.setString	(5, 	beneficiario.getGenero());
			pstm.setString	(6,		beneficiario.getTelefono());
			pstm.setString	(7,		beneficiario.getCelular());
			pstm.setString	(8,		beneficiario.getCorreo());
			pstm.setString	(9,		beneficiario.getDireccion());
			pstm.setString	(10,	beneficiario.getLocacion());
			pstm.executeUpdate();
		}catch(Exception e) {throw e;}
		finally {this.desconectar();}
	}

	@Override
	public void consultarBeneficiario(Beneficiario beneficiario) throws Exception {
		try {
			this.getConnection();
		PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM beneficiarios WHERE nombre = ? AND apellidos = ?");
		pstm.setString(1, beneficiario.getNombre());
		pstm.setString(2, beneficiario.getApellidos());
		pstm.executeUpdate();}
		catch(Exception e) {throw e;}
		finally {this.desconectar();}
	}

	@Override
	public void editarBeneficiario(Beneficiario beneficiario) throws Exception {
		try {
			this.getConnection();
			PreparedStatement pstm = this.getConnection().prepareStatement("UPDATE "
					+ "usuarios "
					+ "SET (nombre,apellidos,fecha de nacimiento, edad, genero, telefono, celular, correo, direccion, locacion, opcupacion, estado civil, pasatiempos, rfc, curp, id condicion medica) "
					+ "WHERE id = ?");
			pstm.setInt(1,beneficiario.getId_usuario());
			pstm.executeUpdate();
		}catch(Exception e) {throw e;}
		finally {this.desconectar();}
	}

	@Override
	public void eliminarBeneficiario(Beneficiario beneficiario) throws Exception {
		try {
			this.getConnection();
			PreparedStatement pstm = this.getConnection().prepareStatement("DELETE FROM "
					+ "usuarios "
					+ "WHERE id = ?");
			pstm.setInt(1,beneficiario.getId_usuario());
			pstm.executeUpdate();
		}catch(Exception e) {throw e;}
		finally {this.desconectar();}
	}

}
