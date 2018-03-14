package servicio;

import modelos.Beneficiario;
import acceso.DAOBeneficiariosImpl;

public class ServiciosBeneficiario {
	DAOBeneficiariosImpl acceso = new DAOBeneficiariosImpl();
	
	boolean verificacion;
	
	public boolean busquedaBeneficiario(Beneficiario beneficiario) throws Exception {
		verificacion = false;
				if(		beneficiario.getNombre() 	!= "" &&
						beneficiario.getApellidos() != "") {
					verificacion = true;
					
					acceso.consultarBeneficiario(beneficiario);
				}
				
		return verificacion;
	}
}
