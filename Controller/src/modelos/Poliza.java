package modelos;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Date;

public class Poliza {
@Autowired	
private int no_de_poliza;
private int no_de_folio;
private int id_estatus;
private int id_tipo;
private int id_usuario;
private double suma_asegurada;
private double tasa_interes;
private double cobro_rescate;
private Date fecha_celebracion;

public int getNo_de_poliza() {
	return no_de_poliza;
}
public void setNo_de_poliza(int no_de_poliza) {
	this.no_de_poliza = no_de_poliza;
}
public int getNo_de_folio() {
	return no_de_folio;
}
public void setNo_de_folio(int no_de_folio) {
	this.no_de_folio = no_de_folio;
}
public double getSuma_asegurada() {
	return suma_asegurada;
}
public void setSuma_asegurada(double suma_asegurada) {
	this.suma_asegurada = suma_asegurada;
}

public Date getFecha_celebracion() {
	return fecha_celebracion;
}
public void setFecha_celebracion(Date fecha_celebracion) {
	this.fecha_celebracion = fecha_celebracion;
}
public double getTasa_interes() {
	return tasa_interes;
}
public void setTasa_interes(double tasa_interes) {
	this.tasa_interes = tasa_interes;
}
public double getCobro_rescate() {
	return cobro_rescate;
}
public void setCobro_rescate(double cobro_rescate) {
	this.cobro_rescate = cobro_rescate;
}
public int getId_estatus() {
	return id_estatus;
}
public void setId_estatus(int id_estatus) {
	this.id_estatus = id_estatus;
}
public int getId_tipo() {
	return id_tipo;
}
public void setId_tipo(int id_tipo) {
	this.id_tipo = id_tipo;
}
public int getId_usuario() {
	return id_usuario;
}
public void setId_usuario(int id_usuario) {
	this.id_usuario = id_usuario;
}

}
