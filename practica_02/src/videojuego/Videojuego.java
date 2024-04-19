package videojuego;

public class Videojuego {

	public long id;
	public String nombre;
	public String fecha;
	public double puntacion;
	public double precio;
	public String[] jugadores;
	

	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", puntacion=" + puntacion
				+ ", precio=" + precio + "]";
	}



	public Videojuego(long id, String nombre, String fecha, double puntacion, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.puntacion = puntacion;
		this.precio = precio;
	}
	
	

	public Videojuego(long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	


	public Videojuego() {
		super();
		this.fecha = "09/09/2000";
	}



	public void fechaInvertidad() {
		String[] fechaPartida = this.fecha.split("/");
		
		String dia = fechaPartida[0];
		String mes = fechaPartida[1];
		String anio = fechaPartida[2];
		
		String fechaInvertida = dia+"-"+mes+"-"+anio;
		System.out.println(fechaInvertida);
	}
	
	public void elJuegoEsAdto() {
		if (this.puntacion >= 5) {
			System.out.println("Es adto para jugar ");
		} else {
			System.out.println("No es adto para jugar");
		}
	}
	
	public boolean esJuegoEsMasCaraQueOtro(Videojuego videojuego) {
		if (this.precio <= videojuego.precio) {
			return false;
		} else {
			return true;
		}
	}
	
	public int elPrecioEsMasCaro(Videojuego videojuego) {
		if (this.precio< videojuego.precio) {
			return -1;
		} else if (this.precio > videojuego.precio) {
			return 1;
		} else {
			return 0;
		}
	}
	
}
