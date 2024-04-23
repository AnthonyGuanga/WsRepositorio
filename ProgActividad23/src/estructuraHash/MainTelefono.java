package estructuraHash;

import java.util.HashMap;
import java.util.Scanner;

public class MainTelefono {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> listadeTelefonos = new HashMap<>();

		System.out.println("=========================================");
		System.out.println("Hola usuario");
		System.out.println("=========================================");
		System.out.println("En este programas solo puedes ingresar 5 numero de telefono");
		System.out.println();
		
		
		int elemento = 0;
		String  n1;
		int n2;
		
		
		//Pimer usuario del listin 
		System.out.println("Ingrese el nombre de usuario ");
		n1 = sc.next();
		System.out.println("Ingrese el numero telefono");
		n2 = sc.nextInt();
		listadeTelefonos.put(n1, n2);
		
		System.out.println("Ingrese el nombre de usuario ");
		String n3 = sc.next();
		System.out.println("Ingrese el numero telefono");
		int n4 = sc.nextInt();
		listadeTelefonos.put(n3, n4);
		
		System.out.println("Ingrese el nombre de usuario ");
		String n5 = sc.next();
		System.out.println("Ingrese el numero telefono");
		int n6 = sc.nextInt();
		listadeTelefonos.put(n5, n6);
		
		
		System.out.println("Ingrese el nombre de usuario ");
		String n7 = sc.next();
		System.out.println("Ingrese el numero telefono");
		int n8 = sc.nextInt();
		listadeTelefonos.put(n7, n8);
		 
		
		//ultimo usuario del listin
		System.out.println("Ingrese el nombre de usuario ");
		String n9 = sc.next();
		System.out.println("Ingrese el numero telefono");
		int n10 = sc.nextInt();
		listadeTelefonos.put(n9, n10);
		
		
		System.out.println(listadeTelefonos);
		
	}
	
}
