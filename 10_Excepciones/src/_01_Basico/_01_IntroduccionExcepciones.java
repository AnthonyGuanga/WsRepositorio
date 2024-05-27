package _01_Basico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01_IntroduccionExcepciones {

	/*
	 * Las excepciones en java son situaciones que pueden provocar un fallo
	 * en el programa.
	 * 
	 * cuando se lanza una excepsion en java y no se controla, se para
	 * automaticamente el programa
	 * 
	 */
	public static void main(String[] args) {
		String s = null;
		//s.charAt(0);//Excepcion, concretemente NullPointerException
		
		//La opcion que tenemos en java para controlar excepciones es mediante los
		//Llamado bloques "Try-catch"ç
		
		//En la parte "try" ponermos el codigo el cual queremos capturarr posibles
		//excepciones
		//En la parte "catch" ponemos el codigo qye qyeremos ejecuatar en caso de
		//que ocurra alguna excepcion y por lo tanto no se parara el programa
		//es obligatorio pober el la parte de "catch" el tipo de excepcion que queremos
		//capturar
		
		//El programa continuara con su ejecucion de manera normal cuando salgas
		//del bloque "try - catch"
		
		try {
			s.charAt(0);
			
		} catch (NullPointerException npe) {
			//aqui ejecutamos las sentencias que queramos
			System.out.println("Ojo que te cojo s esta apuntando a nulñl");
		}
		System.out.println("Continuamos con la ejecucion del programa");

		///OJO !! Este no arregla el problema, esto lo unico que hace es evitar
		//que el programa se pare
		//
		//Este codigo de aqui si l usuario introduce trece el programa
		//se parara porque ocurre la exocuib ""jajç
		//y como se para el programa no puedo decirle al usuario que lo ha
		//hecho mal
		/*
		System.out.println("Introduzca un numero:");
		Scanner sc = new Scanner(System.in);
		Integer n1 = sc.nextInt();
		System.out.println("El numero introducido es: " + n1);
		*/
		//usamos un bloque "try-cath para evirar que el programa se pare
		
		/*
		try {
			System.out.println("Introduzca un numero:");
			Scanner sc = new Scanner(System.in);
			Integer n1 = sc.nextInt();
			System.out.println("El numero introducido es: " + n1);
		}catch (InputMismatchException ime){
			System.out.println("Eres un muñon debe ser numerico");
		}
		*/
		//OJO Esto no arregla el programa pero al meno me da la opcion de intetar
		//arreglarlo
		
		boolean numeroCorrecto = false;
		do {
			try {
				System.out.println("Introduzca un numero:");
				Scanner sc = new Scanner(System.in);
				Integer n1 = sc.nextInt();//Aqui se lanzaria la excepcion
				System.out.println("El numero introducido es: " + n1);
				//si llegamos a esta linea,no  hubo una excepcion
				numeroCorrecto = true;
			}catch (InputMismatchException ime){
				System.out.println("Eres un muñon debe ser numerico");
			}
		}while(!numeroCorrecto);
		
		//En esta ultima parte hemso usado los bloques "try-catch" para aryudarnos
		//a controlar las excepciones y poder aplicar logica para solucinarlo
		//Muchas veces podremos controlar las excepciones con "if", lo que suele
		//Ser a nivel de codigo mas optimo
		String s2 = null;
		if(s2 != null) {
			s2.charAt(0);
		}
	}

}
