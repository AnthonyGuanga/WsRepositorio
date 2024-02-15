package _08_visibilades.relaciones;

import java.util.Arrays;

public class Persona {
	private String nombre;
	private Direccion direccion;// 1 - 1 en BBDD
	private CuentaBancaria[] cuentaBancaria;//1 - N 
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public CuentaBancaria[] getCuentaBancaria() {
		return cuentaBancaria;
	}
	public void setCuentaBancaria(CuentaBancaria[] cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	
	@Override
	
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", cuentaBancaria="
				+ Arrays.toString(cuentaBancaria) + "]";
	}
	
	
	
	
	

}
