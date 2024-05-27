package _02_herencia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02_claseExceocion {
	 public static void main(String[] args) {
		 
		 
		 //Este puede ser una buena practica de programacion
		 //capturar las excepciones que conozca y luego
		 //terner un bloque "catch" generacico para capturar
		 //las que no conozca
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
				}catch (Exception e) {
					//si usamos la clase exception si ser la clase padre
					//cualquier excepcion que ocurra la controlaremos
					System.out.println("Ha introducido una cadena en vez de un numero");
				}
			} while (!estaCorrecta);
	}
}
