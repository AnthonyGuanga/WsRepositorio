package practica_01;

public class Papel {

	private String tamanio;
	private String tipo;
	private double precio;
	private String fecha;
	
	
	
	
	public Papel() {
		super();
		this.fecha="20/21/2000";
	}

	@Override
	public String toString() {
		return "Papel [tamanio=" + tamanio + ", tipo=" + tipo + ", precio=" + precio + "]";
	}
	
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	

	public void elPapelEsDeCania() {
		if (this.tipo=="cania") {
			System.out.println("El papel de de cania eso es muy bueno para"
					+ "el medio ambiente ");
		} else {
			System.out.println("no es bueno para el medio ambiente ");
		}	
	}
	public void presentarsePapel() {
		System.out.println("el tipo de papel que usas");
		System.out.println("El tipo del papel es : "+this.tipo);
	}
	
	public void fechaInvertida() {
		String[] fechaInvertida = this.fecha.split("/");
		
		String dia = fechaInvertida[0];
		String mes = fechaInvertida[2];
		String año = fechaInvertida[2];

		String fechaInvertidaXD = dia +"-"+mes+"-"+año;
		
		System.out.println(fechaInvertidaXD);
	}
	  
}
