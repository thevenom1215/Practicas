package acceso;

import java.sql.PreparedStatement;

import conexion.ConexionBD;
import modelos.Usuario;

public class DAOUsuarioImpl extends ConexionBD implements DAOUsuario{
	ConexionBD conecta;
	
	@Override
	public void registrar(Usuario usuario) throws Exception {
		try {
			conecta = new ConexionBD();
			conecta.getConnection();
			this.getConnection();
			
			String sql = "INSERT INTO 'usuarios' ('nombre','apellidos','fecha de nacimiento', 'edad', 'genero', 'telefono', 'celular', 'correo', 'direccion', 'locacion', 'ocupacion', 'estado civil', 'pasatiempos', 'rfc', 'curp', 'id condicion medica') VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement pstm = conecta.getConnection().prepareStatement(sql);
			
			pstm.setString	(1,		usuario.getNombre());
			pstm.setString	(2,		usuario.getApellidos());
			pstm.setDate	(3, 	(java.sql.Date) usuario.getFecha_de_nacimiento());
			pstm.setInt		(4,		usuario.getEdad());
			pstm.setString	(5, 	usuario.getGenero());
			pstm.setString	(6,		usuario.getTelefono());
			pstm.setString	(7,		usuario.getCelular());
			pstm.setString	(8,		usuario.getCorreo());
			pstm.setString	(9,		usuario.getDireccion());
			pstm.setString	(10,	usuario.getLocacion());
			pstm.setString	(11,	usuario.getOcupacion());
			pstm.setString	(12,	usuario.getEstado_civil());
			pstm.setString	(13,	usuario.getPasatiempos());
			pstm.setString	(14,	usuario.getRfc());
			pstm.setString	(15,	usuario.getCurp());
			pstm.setInt		(16,	usuario.getId_condicionMedica());
			pstm.executeUpdate();
		}catch(Exception e) {throw e;}
		finally {this.desconectar();}
	}

	@Override
	public void editar(Usuario usuario) throws Exception {
		try {
			this.getConnection();
			PreparedStatement pstm = this.getConnection().prepareStatement("UPDATE "
					+ "usuarios "
					+ "SET (nombre,apellidos,fecha de nacimiento, edad, genero, telefono, celular, correo, direccion, locacion, opcupacion, estado civil, pasatiempos, rfc, curp, id condicion medica) "
					+ "WHERE id = ?");
			pstm.setInt(1,usuario.getId_usuario());
			pstm.executeUpdate();
		}catch(Exception e) {throw e;}
		finally {this.desconectar();}
		}

	@Override
	public void eliminar(Usuario usuario) throws Exception {
		try {
			this.getConnection();
			PreparedStatement pstm = this.getConnection().prepareStatement("DELETE FROM "
					+ "usuarios "
					+ "WHERE id = ?");
			pstm.setInt(1,usuario.getId_usuario());
			pstm.executeUpdate();
		}catch(Exception e) {throw e;}
		finally {this.desconectar();}
		
	}

	@Override
	public void buscar(Usuario usuario) throws Exception {
		try {
			this.getConnection();
		PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM usuarios WHERE nombre = ? AND apellidos = ?");
		pstm.setString(1, usuario.getNombre());
		pstm.setString(2, usuario.getApellidos());
		pstm.executeUpdate();}
		catch(Exception e) {throw e;}
		finally {this.desconectar();}
	}

}
