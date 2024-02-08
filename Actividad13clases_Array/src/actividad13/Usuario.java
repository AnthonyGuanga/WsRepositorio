package actividad13;

import java.util.Arrays;

import javax.print.attribute.standard.Media;

public class Usuario {

	int id;
	String nombre;
	int []valoraciones;
	
	public Usuario(int id, String nombre, int[] valoraciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.valoraciones = valoraciones;
	}

	public Usuario() {
		
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", valoraciones=" + Arrays.toString(valoraciones) + "]";
	}
	
	public int devolLaMedia() {
		valoraciones = new int [10];
	
		int Media = valoraciones.length;

		 
		return Media ;
	}
	
	public void mostrarValoraicones() {
		System.out.println(valoraciones);
	}
	
	
	
	
}
