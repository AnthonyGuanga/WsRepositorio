package main;

import java.util.Scanner;

import matematica.Matematicas;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("calculadora");
		Scanner sc = new Scanner(System.in);
		
		Matematicas n1 = new Matematicas();
		Matematicas n2 = new Matematicas();
		Matematicas n3 = new Matematicas();
		Matematicas n4 = new Matematicas();
		
		
		System.out.println("Ingrese dos numero para sumar ");
		double s1 = sc.nextDouble();
		double s2 = sc.nextDouble();
		n1.suma(s1, s2);
		
		
		
		System.out.println("Ingrese dos numero para resta ");
		double r1 = sc.nextDouble();
		double r2 = sc.nextDouble();
		n2.resta(r1, r2);
	
		
		System.out.println("Ingrese dos numero para multiplicacion ");
		double m1 = sc.nextDouble();
		double m2 = sc.nextDouble();
		n3.multiplicacion(m1, m2);
		
		
		System.out.println("Ingrese dos numero para division ");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		n4.division(d1, d2);
		

	}

}
