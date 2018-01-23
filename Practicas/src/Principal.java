import biblioteca.*;
import interactores.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Principal {
	
	
	public static void main(String[] args) throws Exception {
		String n,a;
		int e;
		Date d;
		
		Persona p = new Persona();
		Scanner s = new Scanner(System.in);
		System.out.println("Nombre"); 
		n = s.nextLine();
		System.out.println("Apellidos");
		a = s.nextLine();
		System.out.println("Edad");
		e = s.nextInt();
		System.out.println("Fecha de nacimiento");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Scanner dt = new Scanner(System.in);
		String fecha = dt.nextLine();
		d = sdf.parse(fecha);
		p.adquirirDatos(n, a, e, d);

	}

}
