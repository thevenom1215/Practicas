package acceso;
import modelos.Usuario;

public interface DAOUsuario {
public void buscar(Usuario usuario) throws Exception;
public void registrar(Usuario usuario) throws Exception;
public void editar(Usuario usuario) throws Exception;
public void eliminar(Usuario usuario) throws Exception;
}
