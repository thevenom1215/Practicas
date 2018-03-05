package modelos;

import org.springframework.beans.factory.annotation.Autowired;

public class Retorno_Inversion {
@Autowired
private int 	id_retorno_inversion;
private String descripcion;
private String periodo;

public int getId_retorno_inversion() {
	return id_retorno_inversion;
}
public void setId_retorno_inversion(int id_retorno_inversion) {
	this.id_retorno_inversion = id_retorno_inversion;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public String getPeriodo() {
	return periodo;
}
public void setPeriodo(String periodo) {
	this.periodo = periodo;
}

}
