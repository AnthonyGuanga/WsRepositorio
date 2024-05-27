package _02_herencia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01_claseEcpecion {
public static void main(String[] args) {
	//Aunque la clase padre de todas las clase se ala clase objetos
	//para las excepciones que hemos trabajado
	//nullPointerEceptio
	//ArratIndexOF
	//todas esta excepcion tiene como padre la clase exceptio
	//con esto quremos decir que con una referencia d ela clase
	//excpetion podemos pauntar a cualquier exception eston nos 
	//puede servir para agrupar
	
	//vamos a utiliza el codigo anterior
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
		}catch (Exception e) {
			//si usamos la clase exception si ser la clase padre
			//cualquier excepcion que ocurra la controlaremos
			System.out.println("Ha introducido una cadena en vez de un numero");
		}
	}while (!estaCorrecta);
	
}
}



