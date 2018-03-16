package modelos;

import java.util.ArrayList;
import java.sql.Date;

public class ListaEventosPoliza {
	
	private static ArrayList <Integer> noPoliza;
	private static ArrayList <Integer> evento;
	private static ArrayList <String> asegurado;
	private static ArrayList <String> descripcion;
	private static ArrayList <Date> fecha;
	
	public static ArrayList<Integer> getNoPoliza() {
		return noPoliza;
	}
	public static void setNoPoliza(ArrayList<Integer> noPoliza) {
		ListaEventosPoliza.noPoliza = noPoliza;
	}
	public static ArrayList<Integer> getEvento() {
		return evento;
	}
	public static void setEvento(ArrayList<Integer> evento) {
		ListaEventosPoliza.evento = evento;
	}
	public static ArrayList<String> getAsegurado() {
		return asegurado;
	}
	public static void setAsegurado(ArrayList<String> asegurado) {
		ListaEventosPoliza.asegurado = asegurado;
	}
	public static ArrayList<String> getDescripcion() {
		return descripcion;
	}
	public static void setDescripcion(ArrayList<String> descripcion) {
		ListaEventosPoliza.descripcion = descripcion;
	}
	public static ArrayList<Date> getFecha() {
		return fecha;
	}
	public static void setFecha(ArrayList<Date> fecha) {
		ListaEventosPoliza.fecha = fecha;
	}
	
}
