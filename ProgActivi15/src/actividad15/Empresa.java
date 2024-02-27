package actividad15;

import java.util.Arrays;


public class Empresa {

	String nombre;
	String nif;
	Trabajador []listaDeTrabajadores; 
	Trabajador dni;
	
	
	public Empresa() {
		
	}

	public Empresa(String nombre, String dni, Trabajador[] listaDeTrabajadores, String nif) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.listaDeTrabajadores = listaDeTrabajadores;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", dni=" + nif + ", listaDeTrabajadores="
				+ Arrays.toString(listaDeTrabajadores) + "]";
	}
	
	public void elTrabajador(Trabajador lisTrabajador) {
		for (Trabajador trabajador : listaDeTrabajadores) {
			System.out.println(trabajador);
		}
	}
	
	
	public void listaDeTrabajadores(Trabajador dni) {
		
		
	}
	
	
	public int salarioTotal(String salario){
			
		return 0;
		
		
	}
	
	public boolean gananMas3000() {
		if (salarioTotal(nif) > 3000) {
			return true;
		}
		return false;
	}
	
	public boolean ganameMenosMsi() {
		if (salarioTotal(nif) < 1.080) {
			return true;
		}
		return false;
	}
	
	public boolean ganaMasQueElParametro(Double cantida) {
		
		if(salarioTotal(nif) > cantida) {
			return true;
		}
		return false;
	}
	
	/*public boolean dniValido(Trabajador t) {
	    if (this.dni.equalsIgnoreCase(t.dni) && devolver(t)) {
	        return true;
	    }
	    return false;
	}
*/
	
	
	

	
}
