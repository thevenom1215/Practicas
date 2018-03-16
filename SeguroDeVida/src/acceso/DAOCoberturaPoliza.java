package acceso;

import java.util.ArrayList;

public interface DAOCoberturaPoliza {
	
	public void registrarCobertura(ArrayList<Integer>cobertura, int poliza) throws Exception;
	public void consultarCobertura(ArrayList<Integer>cobertura, int poliza) throws Exception;
	

}
