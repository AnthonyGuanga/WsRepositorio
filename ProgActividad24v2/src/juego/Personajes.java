package juego;

public class Personajes {
	
	private String nombre;
	private double vida;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getVida() {
		return vida;
	}
	public void setVida(double vida) {
		this.vida = vida;
	}
	
	@Override
	public String toString() {
		return "Personajes [nombre=" + nombre + ", vida=" + vida + "]";
	}
	
	
	
}
