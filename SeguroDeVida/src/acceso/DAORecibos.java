package acceso;
import modelos.Prima_seguros;
public interface DAORecibos {
public void generar(Prima_seguros recibos) throws Exception;
public void consultar(Prima_seguros recibos) throws Exception;
public void editar(Prima_seguros recibos) throws Exception;
}
