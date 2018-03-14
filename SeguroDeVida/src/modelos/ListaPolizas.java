package modelos;

import java.util.Date;
import java.util.ArrayList;

public class ListaPolizas {
	
	private static ArrayList<Integer> 	no_de_poliza = new ArrayList<Integer>();
	private static ArrayList<Integer> 	no_de_folio = new ArrayList<Integer>();
	private static ArrayList<Integer> 	id_estatus = new ArrayList<Integer>();
	private static ArrayList<Integer> 	id_tipo = new ArrayList<Integer>();
	private static ArrayList<Integer> 	id_usuario = new ArrayList<Integer>();
	private static ArrayList<Integer> 	cobertura = new ArrayList<Integer>();
	private static ArrayList<Integer> 	id_retorno_inv = new ArrayList<Integer>();
	private static ArrayList<Double>  	suma_asegurada = new ArrayList<Double>();
	private static ArrayList<Double>  	tasa_interes = new ArrayList<Double>();
	private static ArrayList<Double>  	cobro_rescate = new ArrayList<Double>();
	private static ArrayList<Date>		fecha_celebracion = new ArrayList<Date>();
	
	public static ArrayList<Integer> getNo_de_poliza() {
		return no_de_poliza;
	}
	public static void setNo_de_poliza(ArrayList<Integer> no_de_poliza) {
		ListaPolizas.no_de_poliza = no_de_poliza;
	}
	public static ArrayList<Integer> getNo_de_folio() {
		return no_de_folio;
	}
	public static void setNo_de_folio(ArrayList<Integer> no_de_folio) {
		ListaPolizas.no_de_folio = no_de_folio;
	}
	public static ArrayList<Integer> getId_estatus() {
		return id_estatus;
	}
	public static void setId_estatus(ArrayList<Integer> id_estatus) {
		ListaPolizas.id_estatus = id_estatus;
	}
	public static ArrayList<Integer> getId_tipo() {
		return id_tipo;
	}
	public static void setId_tipo(ArrayList<Integer> id_tipo) {
		ListaPolizas.id_tipo = id_tipo;
	}
	public static ArrayList<Integer> getId_usuario() {
		return id_usuario;
	}
	public static void setId_usuario(ArrayList<Integer> id_usuario) {
		ListaPolizas.id_usuario = id_usuario;
	}
	public static ArrayList<Integer> getCobertura() {
		return cobertura;
	}
	public static void setCobertura(ArrayList<Integer> cobertura) {
		ListaPolizas.cobertura = cobertura;
	}
	public static ArrayList<Integer> getId_retorno_inv() {
		return id_retorno_inv;
	}
	public static void setId_retorno_inv(ArrayList<Integer> id_retorno_inv) {
		ListaPolizas.id_retorno_inv = id_retorno_inv;
	}
	public static ArrayList<Double> getSuma_asegurada() {
		return suma_asegurada;
	}
	public static void setSuma_asegurada(ArrayList<Double> suma_asegurada) {
		ListaPolizas.suma_asegurada = suma_asegurada;
	}
	public static ArrayList<Double> getTasa_interes() {
		return tasa_interes;
	}
	public static void setTasa_interes(ArrayList<Double> tasa_interes) {
		ListaPolizas.tasa_interes = tasa_interes;
	}
	public static ArrayList<Double> getCobro_rescate() {
		return cobro_rescate;
	}
	public static void setCobro_rescate(ArrayList<Double> cobro_rescate) {
		ListaPolizas.cobro_rescate = cobro_rescate;
	}
	public static ArrayList<Date> getFecha_celebracion() {
		return fecha_celebracion;
	}
	public static void setFecha_celebracion(ArrayList<Date> fecha_celebracion) {
		ListaPolizas.fecha_celebracion = fecha_celebracion;
	}
	
	
}
