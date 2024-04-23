package _04_object;

import java.util.ArrayList;

public class MainObject {

	public static void main(String[] args) {
		//Con una referenciade tipo Objeto podemos apuntar a CUlaquier
		//OBjeto
		Object o = new Persona();
		o = new Alumno();
		o = new ArrayList<Docente>();
		o = new int [5];
		o = 5;
		
		ArrayList<Object> listaObjeto = new ArrayList<Object>();
		listaObjeto.add(new Persona());
		listaObjeto.add(new Alumno());
		listaObjeto.add(new ArrayList<Docente>());
		listaObjeto.add(5);
		
		//Algunos metodod de la clase objeto
		Persona p1 = new Persona();
		p1.setNombre("Antonio");
		p1.setEdad(25);
		
		System.out.println(p1.toString());
		o = p1;
		System.out.println(o.toString());//Polimorfismo
		//Simepre se va a ejecutar el metodo del objeto al que
		//estamos apuntando, no importa la referencia, esun
		//yn mero apuntador
		
		Persona p2 = new Persona();
		p2.setNombre("ANTON");
		p2.setEdad(25);
		
		if (p1 == p2) {
			System.out.println("Son igualees");
		}else{
			System.out.println("Son diferentes");
		}
		//para java 2 obejetos son iguales solamente
		//cuando ambas referencia apuntan al mismo objeto
		
		//lo que tendraimso que hacer para comparar en un momento
		//dado es por el valor de lso atributos
		//si tenemos muchos atributos se complica muuchola faena
		
		
		//Para comparar objetos por atributos, se suele sobreescribir
		//el metodo equeals y el metodo hashCode(), ambos vab de la mano
	}

}
