package personas;

import java.util.ArrayList;
import java.util.Iterator;

public class Persona {

	public String nombre;
	public ArrayList<String> listadeJugadors;

	
	
	
	public void mostrarJugadores() {
		for (String jugador : listadeJugadors) {
			System.out.println(jugador);
		}
	}
	
	public boolean existeJugador() {
		for (String j : listadeJugadors) {
			if (j.equalsIgnoreCase(j)) {
				return true;
			}
			
		}
		return false;
	}
		
	public Persona(ArrayList<String> listaDni) {
		super();
		
	}
	
	
	
	
	
}
