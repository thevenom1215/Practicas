package acceso;

import modelos.Prima_seguros;

public interface DAOPrima_seguros {
public void generarPrimaSeguro(Prima_seguros prima) throws Exception;
public void consultarPrimaSeguro(Prima_seguros prima) throws Exception;
public void editarPrimaSeguro(Prima_seguros prima) throws Exception;
}
