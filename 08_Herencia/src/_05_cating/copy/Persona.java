package _05_cating.copy;

import java.util.Objects;

/**
 * Todas las clases en jva de la clase, por lo tanro
 * todas las clase van a heredar sus metodos
 * 
 */
public class Persona extends Object{//poner esto no importa,lo pongamos o no
									//La clase hereda de Objeto

	public String nombre;
	public int edad;
	
	public void presentarse() {
		System.out.println("Hola soy una Persona y me llamo: "+nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	
	/**
	 * Para hacer que dosobjetos sean iguales en las condiciones que queramos
	 * debemos de sobreescribir los metodos "equals" y "hascode"
	 * el meto "equals" de la clase objet por defecto comparar
	 * exatamente igual que el operador "equal" decimos que atributp
	 * 
	 * boton derecho
	 */
	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}

	
	//Eb este caso hemos elegido que doas objetos son iguales
	//cuando su nombre u su edad tenga el mismo valor
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;//castear la referencia a tipo personas
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	
}
