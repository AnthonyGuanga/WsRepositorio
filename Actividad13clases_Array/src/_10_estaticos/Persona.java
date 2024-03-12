package _10_estaticos;

import _09_enumerados.MainEnumerdados;

public class Persona {
	//no tendria mucho sentido crear el metodo estaticos
	//ya que el atributp seria conpartido 
	//con loq que solamente podriamos tener 
	//
	public static String nombre;
	public int edad;
	
	
	//su tendria sentidot tener el numero de personas
	//como estaticos asi tendriamos localozaada dicho 
	//numero en una un unico atributo compartido
	//por todos los objetos 
	public static int numeroPersonas;
	
	public Persona() {
		super();
	}
	
	public boolean esMayorEdad() {
		System.out.println("El numero personas " + numeroPersonas);
		if(this.edad >= 18) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void imprimirNumeroPersonas() {
		System.out.println(numeroPersonas);
		//this.edad;
		//edad
	}
	
	public void imprimirEdadDinamico() {
		System.out.println(this.edad);
	}
	
	public static void imprimirEdadEstatico(Persona p) {
		//System.out.println(this.edad);
		//System.out.println(edad);
		System.out.println(p.edad);
		System.out.println("Este metodo lo ha ejecutado el progrma"
		+ _01_MainEstaticos01.NOMBRE_DEL_PROGRMA);
		//presentarse();
		_01_MainEstaticos01.presentarse();
	}
}
