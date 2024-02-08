package actividad11;

public class Coche {
	
	int id;
	String marca;
	String modelo;
	double precio_base;
	String fecha_de_matriculacion;
	int kilometros;

	public Coche(String marca,String modelo) {
		
	}
	
	public Coche(int id,String marca,String modelo,double precio_base) {
		
	}
	
	public String toString() {
		return "Coche id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", precio_base=" + precio_base
				+ ", fecha_de_matriculacion=" + fecha_de_matriculacion + ", kilometros=" + kilometros + "]";
	}
	
	public void PrecioBase() {
		System.out.println("El precio es : " + precio_base);
	}
	
	public void anio_de_matriculacion() {
		System.out.println("El año de matriculacion es " + fecha_de_matriculacion);
	}
	
	public void El_anio_es_bisi(){
		
	}
	

}
