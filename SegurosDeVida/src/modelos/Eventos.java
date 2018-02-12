package modelos;
import org.springframework.beans.factory.annotation.Autowired;

public class Eventos {
@Autowired
private int id_evento;
private String descripcion_evento;

public int getId_evento() {
	return id_evento;
}
public void setId_evento(int id_evento) {
	this.id_evento = id_evento;
}
public String getDescripcion_evento() {
	return descripcion_evento;
}
public void setDescripcion_evento(String descripcion_evento) {
	this.descripcion_evento = descripcion_evento;
}
	


}
