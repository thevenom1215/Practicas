package tipos;
import org.springframework.beans.factory.annotation.Autowired;

public class CondicionMedica {
	
@Autowired
private int id_condicionMedica;
private String descripcion_condicionMedica;

public int getId_condicionMedica() {
	return id_condicionMedica;
}
public void setId_condicionMedica(int id_condicionMedica) {
	this.id_condicionMedica = id_condicionMedica;
}
public String getDescripcion_condicionMedica() {
	return descripcion_condicionMedica;
}
public void setDescripcion_condicionMedica(String descripcion_condicionMedica) {
	this.descripcion_condicionMedica = descripcion_condicionMedica;
}



}
