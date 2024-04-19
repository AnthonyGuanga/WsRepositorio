package main;

import java.util.ArrayList;
import java.util.Scanner;

import coche.Coche;

public class MainCoche {
	
	private ArrayList<Coche> listaCoche = new ArrayList<Coche>();
	
	private Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		MainCoche coche1 = new MainCoche();
		
		System.out.println("============================");
		System.out.println("Hola Usuario bienvenido");
		System.out.println("============================");
		System.out.println("1.- Crear coche");
		System.out.println("2.- Mostrar coches");		
		System.out.println("3.- Mostrar ContadorID");
		System.out.println("4.- Resetear contadorID");
		System.out.println("5._ Salir del programa");
		int n1 = sc.nextInt();
		
		coche1.rancarPrograma(n1);
		
	}

	public void rancarPrograma(int n1) {
		boolean q = true;
		Scanner sc = new Scanner(System.in);
	
		do {
			switch (n1) {
			case 1:
			crearCoche();
			
				break;
			case 2:
				System.out.println(listaCoche.toString());
				break;
			case 3:
				listaCoche.get(0).mostrarElValor();			
				break;
			case 4:
				
			listaCoche.get(0).resetearContador();
				break;
			case 5:
				q = false;
				System.out.println("Fin del programa");
				sc.close();
				break;
		
		}	
		if(q) {
			System.out.println("============================");
			System.out.println("Hola Usuario bienvenido");
			System.out.println("============================");
			System.out.println("1.- Crear coche");
			System.out.println("2.- Mostrar coches");		
			System.out.println("3.- Mostrar ContadorID");
			System.out.println("4.- Resetear contadorID");
			System.out.println("5._ Salir del programa");
			n1 = sc.nextInt();
			
			}		
		}while (q);
	}
	
	public void crearCoche() {
		
		Coche c = new Coche();
		System.out.println("Ingresa la matricula");
		String numero1 = sc.nextLine();
		c.setMatricula(numero1);
		
		System.out.println("Ingrese la marca del coche");
		String marca1 = sc.nextLine();
		c.setMatricula(marca1);
		listaCoche.add(c);
		
	}
}
