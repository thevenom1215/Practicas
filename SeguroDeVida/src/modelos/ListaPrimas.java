package modelos;

import java.util.ArrayList;
import java.util.Date;

public class ListaPrimas {
private static ArrayList <Integer> folio 	= new ArrayList<Integer>();
private static ArrayList <Integer> poliza 	= new ArrayList<Integer>();
private static ArrayList <Date> generacion 	= new ArrayList<Date>();
private static ArrayList <Date> limite 		= new ArrayList<Date>();
private static ArrayList <Date> pago 		= new ArrayList<Date>();
private static ArrayList <Double> cantidad 	= new ArrayList<Double>();
private static ArrayList <Integer> tipo 	= new ArrayList<Integer>();

public static ArrayList<Integer> getFolio() {
	return folio;
}
public static void setFolio(ArrayList<Integer> folio) {
	ListaPrimas.folio = folio;
}
public static ArrayList<Integer> getPoliza() {
	return poliza;
}
public static void setPoliza(ArrayList<Integer> poliza) {
	ListaPrimas.poliza = poliza;
}
public static ArrayList<Date> getGeneracion() {
	return generacion;
}
public static void setGeneracion(ArrayList<Date> generacion) {
	ListaPrimas.generacion = generacion;
}
public static ArrayList<Date> getLimite() {
	return limite;
}
public static void setLimite(ArrayList<Date> limite) {
	ListaPrimas.limite = limite;
}
public static ArrayList<Date> getPago() {
	return pago;
}
public static void setPago(ArrayList<Date> pago) {
	ListaPrimas.pago = pago;
}
public static ArrayList<Double> getCantidad() {
	return cantidad;
}
public static void setCantidad(ArrayList<Double> cantidad) {
	ListaPrimas.cantidad = cantidad;
}
public static ArrayList<Integer> getTipo() {
	return tipo;
}
public static void setTipo(ArrayList<Integer> tipo) {
	ListaPrimas.tipo = tipo;
}

}
