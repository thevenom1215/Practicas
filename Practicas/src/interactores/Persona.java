package interactores;
import java.util.Date;
public class Persona {
String nombre;
String apellidos;
int edad;
Date fechaNacimiento;
public void leer() {}
public void escribir() {}
public void adquirirDatos(String n, String a, int e, Date d) {
	nombre = n;
	apellidos = a;
	edad = e;
	fechaNacimiento = d;
	System.out.println("Tus datos son: ");
	System.out.println("nombre: " +   nombre);
	System.out.println("apellidos " + apellidos);
	System.out.println("edad :" + edad);
	System.out.println("fecha de nacimiento: " + fechaNacimiento);
}
}
