package _10_estaticos;

import java.util.Scanner;


//si vamos a utilizar un objeto dentro de muchos metodos
//estaticos podemos apoyarnos en en un
//atributo estatico para poder acceder 
//dicho metodo, en vez estar pasandolopor
//

//en este ejemplo en vez de pasar el objeto scanner
//a tdos los metodos , vamos a crear un objeto
//estaticos y asi evitar el obejeto por parametro
public class _02_MainEstaticos {
	
	private static Scanner sc;
	
	
	//
	public static void main(String[] args) {
		Scanner scDinamico = new Scanner(System.in);

		int numero = pedirNumero(scDinamico);
		numero = pedirNumeroEnteroEstico();
		
		
	}
	
	public static int pedirNumero(Scanner sc) {
		System.out.println("Introduce el numer: ");
		
		int numero = pedirNumero(sc);
		return numero;
	}
	
	public static double perdirNumeroDoubleEstatico() {
		System.out.println("Introduce el numer: ");
		double numero = sc.nextDouble();
		return numero;
		
	}
	public static int pedirNumeroEnteroEstico() {
		System.out.println("Introduce el numero entero esticos");
		int numero = sc.nextInt();
		return numero;
	}
}
