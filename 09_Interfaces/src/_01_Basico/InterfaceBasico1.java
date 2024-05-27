package _01_Basico;

/**
 * Las intefaces es un tipo especial de clase en la que todos
 * metodos son abtractos
 * 
 * Estan pensadas para que sean implemtadas por otras clase
 * 
 * Las interfaces define el que queremos hacer, mientras que
 * las clases que implementan las interfaces representan el
 * COMO 
 * 
 * 
 * Las interfaces son un contrato que tienen que cumplierse en las 
 * clase que implementan dicha interface
 * 
 * Cuando una clase implementa una interfas tiene la obligacion
 * de implementar los metodos de dicha interface. Una excepcion
 * seria si la clase que implementa la interface es ABTRACTA
 * 
 * Las interfaces No son intanciables debido que todos sus metoso 
 * son abtractas. Pero OJO!! Podemos crear clases 
 * ANONIMAS a partir de las interfaces 
 * 
 * Una propieda muy importante de las interfasces es que mediante
 * una referencia de una interface podemos apuntar a cualquier
 * objeto que implemente dicha interface
 * 
 * Una onterface puede tener atributos PERO siempre seran CONSTANTES
 * 
 * Cunado se crear una interfaxe suele ser importante crear buena
 * documentacion
 * 
 * Todoslos metodos de una interface son Public, no importa que
 * lo pongais explicitamente en  el metodo
 * 
 * Para crear una interfaz e java se hace como una clase pero se usa 
 * la palabra "interface". Aunque normalmente se creara mediante eclipse
 * 
 * 
 */
public interface InterfaceBasico1 {
	//Esto seria una atributo constante (final) y publico
	//No suele tener atributos las interfaces
	int ATRIBUTO_1 = 5;
	//public final int  ATRIBUTO_2 = 5;//seria equivalente a los de arriba
	
	//lo realmente i,portante de las interfaces son los metodos
	//siempre son public y abtractos
	void metodo1();
	//public abstract voif metodo1();//Seria equivalente a los de arriba
	
	public abstract String metodo2(Object o);
	int operacion(int a, int b);
	
}
