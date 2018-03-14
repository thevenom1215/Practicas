package acceso;
import modelos.Beneficiario;
public interface DAOBeneficiarios {

	public void registrarBeneficiario(Beneficiario beneficiario)throws Exception;
	public void consultarBeneficiario(Beneficiario beneficiario)throws Exception;
	public void editarBeneficiario(Beneficiario beneficiario)throws Exception;
	public void eliminarBeneficiario(Beneficiario beneficiario)throws Exception;
	
}
