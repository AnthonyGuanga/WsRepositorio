package _03_protecti;

/**
 * EN java , para heredar una clase de otra se usa la palabra 
 * reservada "extender" despues del nombre de la clase, y contuniacion
 * y el nombre de la clase padre
 */
public class Docente extends Persona {

	//Automaticamente la clase Docente tine todos los atributos de la clase
	//Persona (nombre, edad) asi como sus metodos (presentarse()
	
	public double salario;
	
	public double calculaarSalarioNeto() {
		double salarioNeto = salario * 0.85;
		return salarioNeto;
	}
}
