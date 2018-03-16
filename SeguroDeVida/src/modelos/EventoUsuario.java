package modelos;

import java.sql.Date;

public class EventoUsuario {
	
private static int noPoliza;
private static int evento;
private static String asegurado;
private static String descripcion;
private static Date fecha;

public static int getNoPoliza() {
	return noPoliza;
}
public static void setNoPoliza(int noPoliza) {
	EventoUsuario.noPoliza = noPoliza;
}
public static String getAsegurado() {
	return asegurado;
}
public static void setAsegurado(String asegurado) {
	EventoUsuario.asegurado = asegurado;
}
public static int getEvento() {
	return evento;
}
public static void setEvento(int evento) {
	EventoUsuario.evento = evento;
}
public static String getDescripcion() {
	return descripcion;
}
public static void setDescripcion(String descripcion) {
	EventoUsuario.descripcion = descripcion;
}
public static Date getFecha() {
	return fecha;
}
public static void setFecha(Date fecha) {
	EventoUsuario.fecha = fecha;
}

}
