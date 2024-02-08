package _14_Actividad;

public class Equipo {

	String nombre;
	String ListaDeJuegadoresDelEquipo;
	
	public Equipo() {
		
	}
	public Equipo(String nombre,String ListaDeJuegadoresDelEquipo) {
		
		this.nombre = nombre;
		this.ListaDeJuegadoresDelEquipo = ListaDeJuegadoresDelEquipo;
	}
	
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", ListaDeJuegadoresDelEquipo=" + ListaDeJuegadoresDelEquipo + "]";
	}
	
	
	
}
