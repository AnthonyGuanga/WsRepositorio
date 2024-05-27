package _01_Basico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02_CapturarVariasExcepciones {

	public static void main(String[] args) {
		//Vamos hacer un programa que pida dos numeros por pantalla
		//y devuelva su divicion entera
		
		//Este programa de aqui aunque sencillo esta sujeto 
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numerador: ");
		int numerador = sc.nextInt();
		System.out.println("Introduzca el denominador: ");
		int denominador = sc.nextInt();
		int resultado = numerador/denomimador;
		System.out.println(resultado);
		*/
		
		boolean estaCorrecta = false;
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Introduzca el numerador: ");
				int numerador = sc.nextInt();
				System.out.println("Introduzca el denominador: ");
				int denominador = sc.nextInt();
				int resultado = numerador/denominador;
				System.out.println(resultado);
				estaCorrecta = true;
			}catch (InputMismatchException ime) {
				System.out.println("Ha introducido una cadena en vez de un numero");
				estaCorrecta = true;
			}catch (ArithmeticException ae) {
				//Podemo tener tanto bloqeues caatch como queramos, y en cas
				//bloque capturar el tipo de exception que necesutamos
				System.out.println("No aceptamos divisiones por cero");
			}
		} while (!estaCorrecta);
	}	

}
