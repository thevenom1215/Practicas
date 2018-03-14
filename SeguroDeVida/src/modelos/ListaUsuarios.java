package modelos;

import java.util.ArrayList;

public class ListaUsuarios {
private static ArrayList <Integer> id = new ArrayList<Integer>();
private static ArrayList <String> nombre = new ArrayList<String>();
private static ArrayList <String> apellidos = new ArrayList<String>();
private static ArrayList <String> telefono = new ArrayList<String>();
private static ArrayList <String> celular = new ArrayList<String>();
private static ArrayList <String> correo = new ArrayList<String>();
private static ArrayList <String> direccion = new ArrayList<String>();
private static ArrayList <String> locacion = new ArrayList<String>();

public static ArrayList<Integer> getId() {
	return id;
}
public static void setId(ArrayList<Integer> id) {
	ListaUsuarios.id = id;
}
public static ArrayList<String> getNombre() {
	return nombre;
}
public static void setNombre(ArrayList<String> nombre) {
	ListaUsuarios.nombre = nombre;
}
public static ArrayList<String> getApellidos() {
	return apellidos;
}
public static void setApellidos(ArrayList<String> apellidos) {
	ListaUsuarios.apellidos = apellidos;
}
public static ArrayList<String> getTelefono() {
	return telefono;
}
public static void setTelefono(ArrayList<String> telefono) {
	ListaUsuarios.telefono = telefono;
}
public static ArrayList<String> getCelular() {
	return celular;
}
public static void setCelular(ArrayList<String> celular) {
	ListaUsuarios.celular = celular;
}
public static ArrayList<String> getCorreo() {
	return correo;
}
public static void setCorreo(ArrayList<String> correo) {
	ListaUsuarios.correo = correo;
}
public static ArrayList<String> getDireccion() {
	return direccion;
}
public static void setDireccion(ArrayList<String> direccion) {
	ListaUsuarios.direccion = direccion;
}
public static ArrayList<String> getLocacion() {
	return locacion;
}
public static void setLocacion(ArrayList<String> locacion) {
	ListaUsuarios.locacion = locacion;
}


}
