package actividad15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Trabajador {

	String nombre;
	String dni;
	String salario;
	
	public Trabajador(){
		
	}

	public Trabajador(String nombre, String dni, String salario) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
	}
	
	public boolean devolverDni( String dni) {
		String expresion = "^[a-zA-Z0-9]{9}$"; 

        Pattern pattern = Pattern.compile(expresion);
        Matcher matcher = pattern.matcher(dni);

    return matcher.find();
	}
	
	
	public boolean ganaMas() {
		return ganaMas();
	}
	/*public int ganaMasTrabajador(String salariotra){
		for ( iterable_element : iterable) {
			
		}
		return 0;
		
	}
	
	
	public boolean equiposIguales (Trabajador segundoEquipo) {
		if (this.nombre.equalsIgnoreCase(segundoEquipo.nombre)
				&& listasIguales(segundoEquipo)) {
			return true;
		}
		return false;
	}*/
	
}
