package modelos;

import java.util.Date;

public class Prima_seguros {

private int id_pago;
private int id_poliza;
private int id_usuario;
private int no_de_folio;
private Date fecha_generacion_recibo;
private Date fecha_limite;
private Date fecha_pago;
private double cantidad;


public int getId_pago() {
	return id_pago;
}
public void setId_pago(int id_pago) {
	this.id_pago = id_pago;
}
public int getId_poliza() {
	return id_poliza;
}
public void setId_poliza(int id_poliza) {
	this.id_poliza = id_poliza;
}
public int getId_usuario() {
	return id_usuario;
}
public void setId_usuario(int id_usuario) {
	this.id_usuario = id_usuario;
}
public int getNo_de_folio() {
	return no_de_folio;
}
public void setNo_de_folio(int no_de_folio) {
	this.no_de_folio = no_de_folio;
}
public Date getFecha_pago() {
	return fecha_pago;
}
public void setFecha_pago(Date fecha_pago) {
	this.fecha_pago = fecha_pago;
}
public double getCantidad() {
	return cantidad;
}
public void setCantidad(double cantidad) {
	this.cantidad = cantidad;
}
public Date getFecha_generacion_recibo() {
	return fecha_generacion_recibo;
}
public void setFecha_generacion_recibo(Date fecha_generacion_recibo) {
	this.fecha_generacion_recibo = fecha_generacion_recibo;
}
public Date getFecha_limite() {
	return fecha_limite;
}
public void setFecha_limite(Date fecha_limite) {
	this.fecha_limite = fecha_limite;
}

}
