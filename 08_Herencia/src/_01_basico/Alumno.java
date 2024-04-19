package _01_basico;

/**
 * EN java , para heredar una clase de otra se usa la palabra 
 * reservada "extender" despues del nombre de la clase, y contuniacion
 * y el nombre de la clase padre
 */
public class Alumno extends Persona{

	//Automaticamente la clase alumno tine todos los atributos de la clase
	//Persona (nombre, edad) asi como sus metodos (presentarse()
	
	
	public String curso;
	
	public boolean esCiencias() {
		if (curso.equals("DAM")) {
			return true;
		}else {
			return false;
		}
	}

	
	/*
	 * Existe un concepto muy  importante de la herencia conocido como+
	 * la "sobreEscritura"o "override" de metodos.
	 * Psaara sobreEscribit un metod debemos de crear un metod en la clase
	 * hija con la mismoa firma el metodo padre,
	 * cuando sobreescribimos
	 * un metodo queremos darle un comportamiento diferneicre al de la clase
	 * padre
	 * 
	 * la anotacion @Override simplemente sirve para comprobar que el metodo
	 * existe  en la clase padre y  lo estamos sobreescribiendo.En caso de que
	 * el Metodo no exsite en la clase padre daria un eerror en tienpos
	 */
	
	public void presentarse() {
		System.out.println("Hola soy el alumno muñon de nombre : " + this.nombre);
	}
	
}
