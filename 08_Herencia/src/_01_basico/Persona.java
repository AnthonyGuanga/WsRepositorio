package _01_basico;


/**
 * La herencia es una de las propiedades ,as importante
 * a encontrar 
 * en POO.Mediante la herencia podemos hacer que una clase tenga todo
 * los atributos y metodos de otros. La clase de la cual heredamos se llama
 * clase ´"padre" y la clase que hereda se llama clase "hija" .Es decir,
 * la clase hija"hija" tendra los atributos u metodos de la clase "padre"
 * 
 * 
 * Existe el concepto de herencia multiple, esto sera cuando una clase
 * hija tien mas de un padre por ejemplo dos padres, En java la herencia 
 * multiple NO se implementa directamente(se puede hacer con intefaces,
 * que veremos mas adelante)
 * 
 */
public class Persona {
	
	// ojo no se hereda  los contrusctores 
	public String nombre;
	public int edad;
	
	public void presentarse() {
		System.out.println("Hola soy una Persona y me llamo: "+nombre);
	}
}
