package main;

import java.util.Scanner;

public class MainCoche {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean q = true;
		System.out.println("============================");
		System.out.println("Hola Usuario bienvenido");
		System.out.println("============================");
		System.out.println("1.- Crear coche");
		System.out.println("2.- Mostrar coches");		
		System.out.println("3.- Mostrar ContadorID");
		System.out.println("4.- Resetear contadorID");
		System.out.println("5._ Salir del programa");
		int n1 = sc.nextInt();

		do {
			switch (n1) {
			case 1:
			
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				q = false;
				System.out.println("Fin del programa");
				sc.close();
				break;
			}	
		} while (q);
	}

}
