package modelos;
import org.springframework.stereotype.Component;

@Component
public class Beneficiario extends Usuario {
private int id_asegurado;

public int getId_asegurado() {
	return id_asegurado;
}

public void setId_asegurado(int id_asegurado) {
	this.id_asegurado = id_asegurado;
}

}
