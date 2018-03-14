package acceso;
import modelos.Poliza;
public interface DAOPoliza {
	public void buscar (Poliza poliza) throws Exception;
	public void registrar(Poliza poliza) throws Exception;
	public void editar(Poliza poliza) throws Exception;
	public void eliminar(Poliza poliza) throws Exception;
}
