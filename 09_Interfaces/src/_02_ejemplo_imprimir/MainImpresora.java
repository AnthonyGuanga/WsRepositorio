package _02_ejemplo_imprimir;

public class MainImpresora {

	public static void main(String[] args) {
		//con una referencia de una interfaz puedo apuntar a
		//cualquir objeto que inplemnta la intefaz
		
		//de hecho se considera una buena practica de progrmacion
		//el orientar tu codigo siempre que se pueda a interfaces
		//asi como utiliar para apuntar a objetos hacen que las 
		//dependencias d tu codigo seab depencias DEbiles
		//mientras que usan las referencias propias del objetos
		//hacen que sean dependencias FUERTES
		
		Imprimible impPantalla = new ImprimirPantalla();
		Imprimible impFichero = new ImprimirFichero();
		Imprimible impImpresora = new ImprimirImpresora();
		
		String cadena = "Hola interfaz";
		impPantalla.imprimir(cadena);
		impFichero.imprimir(cadena);
		impImpresora.imprimir(cadena);
		//invocamos el metodo co la interfaz+
		
		//Esta manera no estaria bien echa ya que es mejor
		//utilizar 
	}

	
	public static void metodoImprimirPantalla(ImprimirPantalla ip) {
		ip.imprimir("Manolo cabezabolo");
	}
	//aplicando polimorfismo
}
