package estructuraHash;

import java.util.HashMap;
import java.util.Scanner;

public class MainPersona {
	
	private static Scanner sc = null;
	
	public static void main(String[] args) {
		HashMap<String,Persona> listadePersona = new HashMap<>();
	
		
		
		int menu = mostrarMenur();
		
		
		
		System.out.println("Hola usuario ");
		System.out.println("1.-Introducir Persona");
		System.out.println("3.-Mostrar Personas");
		System.out.println("4.-Buscar personas por nombre");
		

		
		
		switch (menu) {
		case 1:
			Persona p1 = new Persona();
			String n1 = sc.next();
			//listadePersona.put(n1);
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		default:
			break;
		}
		
	}
	private static int mostrarMenur() {
		System.out.println("Hola usuario ");
		System.out.println("1.-Introducir Persona");
		System.out.println("3.-Mostrar Personas");
		System.out.println("4.-Buscar personas por nombre");
		
		int opcion1 = recogerEntero();
		return opcion1;
		
	}
	private static int recogerEntero() {
		String sOpcion = sc.nextLine();
		int iOpcion = Integer.parseInt(sOpcion);
		return iOpcion;
	}
	
	
}
