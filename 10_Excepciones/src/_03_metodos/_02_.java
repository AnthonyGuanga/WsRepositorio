package _03_metodos;

import java.util.Scanner;

public class _02_ {

	public static void main(String[] args) {
		class _01_MetodosYExcepciones {

			public static void main(String[] args) {
				System.out.println("Introduzca un numero");
			
				int numero = 0;
				try {
					//numero = recogerNumeroExceptiom();
				} catch (Exception e) {
					System.out.println();
				}
				System.out.println(numero);
				
				
				//Es posible que ademoa de arrojar ka excepcion queramos capturarla
				//para tratarpa en 
			
			/**
			 * Recoger un nuemro pasado por consola 
			 * @return el numero recogido
			 * @throws Exception si el valor introducido no es un numero entero
			 */
			/*public static int recogerNumeroExceptiom() throws Exception {
				Scanner sc = new Scanner(System.in);
				int numero = 0;
				
				try {
					numero = sc.nextInt();
					return numero;
				} catch (Exception e) {
					System.out.println("Valor incorrexto");
					//para arrojar un erroe podemos usa la 
					throws e;
				}finally {
					//este bloq se ejcuat siempre usar la 
				
					System.out.println("Esto siempre se ejecuta haya o no error");
				}
				*/
			}
			
		}
	}
}



