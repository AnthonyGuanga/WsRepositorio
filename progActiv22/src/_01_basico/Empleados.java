package _01_basico;

public class Empleados {

	private int id;
	private double DNI;
	private String nombre;
	private double sueldoBase;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getDNI() {
		return DNI;
	}
	public void setDNI(double dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	@Override
	public String toString() {
		return "Empleados [id=" + id + ", DNI=" + DNI + ", nombre=" + nombre + ", sueldoBase=" + sueldoBase + "]";
	}
		
	
	//bateria de prueba  hay quenegativos podemos hacer las preubas en el main 
	//creamos muchar variable con el valo esperado m
	// hay muchos metodos para ddar el metodo como valido 
	//baterias de material  de prueba 20% 50% porciento 
	//hay que especificar 
	//lo minimo que va pedir todos los casos de las pruebas unitarias 
	//minimo tres 
}
