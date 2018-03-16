package servicio;

import acceso.DAOPrima_segurosImpl;

import modelos.Prima_seguros;

public class ServiciosPrima {
	
	DAOPrima_segurosImpl acceso = new DAOPrima_segurosImpl();
	boolean verificacion;
	
	public boolean verificacionConsulta(Prima_seguros prima) throws Exception {
		verificacion = false;
		if(prima.getId_poliza() != 0) {
			verificacion = true;
		acceso.consultarPrimaSeguro(prima);
		}
		return verificacion;
		}

	public boolean verificacionInsertar (Prima_seguros prima) throws Exception {
		verificacion = false;
		if(		prima.getId_poliza() !=0 && 
				prima.getFecha_generacion_recibo() != null &&
				prima.getCantidad() != 0) {
			verificacion = true;
			acceso.generarPrimaSeguro(prima);
		}
		return verificacion;
	}
	
}
