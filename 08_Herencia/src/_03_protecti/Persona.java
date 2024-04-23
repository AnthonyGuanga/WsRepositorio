package _03_protecti;
/**
 * Recordemos el alcance de protected que es .
 * 1. dentro de la propia clase
 * 2. dentro de las clases del propio paquete
 * 3. dentro de las clases que hereden de ella
 */
public class Persona {

	public String nombre;
	public int edad;
	
	public void presentarse() {
		System.out.println("Hola soy una Persona y me llamo: "+nombre);
	}
}
