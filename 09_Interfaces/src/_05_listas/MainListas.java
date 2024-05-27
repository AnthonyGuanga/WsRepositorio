package _05_listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import _04_Basico.vehiculos.Coche;

public class MainListas {

	public static void main(String[] args) {
		//Java tiene ya muchas interface predefinida
		//unad de las importantes es la interfaz list
		//Es este interfaz se define los metodos que tienen
		//que imple,emte todas la clases que implemente
		//la interfazz "lisd",las mas importantes son:
		
		//la clase arraysList y la clase linkelist
		//la implementacion de arraylist es una implementacion
		//que esmuy buena cuando queremos recorrer la lisa
		//muchas veces pqeo no sueln cambiar de tamali
		
		//la implementacion linkedlist es muy buena cuandi
		//la lista cambia mucho dde tamaña pero en cambi
		//no la reocrremos demasiado
		
		List<Coche> listaArrayCoches = new ArrayList<>();
		listaArrayCoches.add(new Coche());
		
		LinkedList<Coche> listaLinkedCoches = new LinkedList<Coche>();
		
		//como ambas lista implementa la interfaz list tenemos los mismo
		//metodos, lo tanto para nosotros lo programadores
		//habres diferentecia de oco vamos a uar ambas list
		listaLinkedCoches.add(new Coche());	

		
		
		//creamos la persona con sus coches
		Persona p = new Persona();
		p.setNombre("guillermo cumpleañero");
		Coche c1 = new Coche();
		Coche c2 = new Coche();
		ArrayList<Coche> listaCoches = new ArrayList<Coche>();
		listaArrayCoches.add(c1);
		listaArrayCoches.add(c2);
		p.setListaCoches(listaCoches);

	}
	
	public void recorrerLista(List<Coche>lista) {
		System.out.println(lista);
		
	}

}
