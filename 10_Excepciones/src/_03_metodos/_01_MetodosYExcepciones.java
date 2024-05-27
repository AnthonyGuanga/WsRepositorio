package _03_metodos;

import java.util.Scanner;

public class _01_MetodosYExcepciones {

	public static void main(String[] args) {
		System.out.println("Introduzca un numero");
		//cuando usamos un metodo que arroja excepcion de tipo
		//Exception, se llaman excptiones "checket" y tenemos 
		//que poner un bloque "try catch" obligatoriamente
		int numero = 0;
		try {
			numero = recogerNumeroExceptiom();
		} catch (Exception e) {
			//Este bloque ha sido generado con eclipse
			//y te invoca automaticamente al metodo "e.prinstacktra"
			
			e.printStackTrace();//Utiliza la salida system.err
		}
		System.out.println("EL numero . "+numero);
		
		//invocamos a la otra funcion
		//Las excepciones de tipo "RunTimeExceptio" son excepciones
		///Que se llaman unchacket esto quiere decir que noo tenemos
		//por que capturar  las excepciones con un bloque try-catch
		//aunque muchas vece tenfamos que hacemos
		System.out.println("Introduzca un numero");
		int numero2 = recogerNumeroRuntimeException();
		//Hay que tener en clari que en java si ocurre una expcepcion
		//y no la cotrolamos (Es decirm no usamos e bloque catch)
		//el progrma se parara . por ejemplo en la liena 27 como hemos
		//capturamos el eeor si ocurre no papar el progrma
		
		//las excepciones uncheked tambien podemos controlarlas con bloque
		//try catch usando la opcion de eclipse surround  withtry catch
		try {
			int numero3 = recogerNumeroRuntimeException();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Nos podriamos preguntar cuando arrojar exepcion "checked"
		//o "unchecked" . Con "checked" es cuando queremos dar mucha
		//importancia a la exception y queremos obligar al progrmador
		// a poner un bloque trycach con unchecked no queresmo
		//capturamos el error, si ocurre se nos pasara el programa
		//tenrr mas probalidad de ocurrir
	}
	//Hay veces que nos interesa avisar a quien llame a este metodoç
	//de que ha habido un excepcion . Para ello podemos usar
	//La palabra reservadad "trows" al final del metodo y
	// a continucacionn el tipo de exception que queremos devolver
	//En  este caso usaremos la clase "Exception" para arrojaar
	//cualqueir excepcio de hecho de debe docuemntr
	
	/**
	 * Recoger un nuemro pasado por consola 
	 * @return el numero recogido
	 * @throws Exception si el valor introducido no es un numero entero
	 */
	public static int recogerNumeroExceptiom() throws Exception {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt() ;
		return numero;
	}
	
	public static int recogerNumeroRuntimeException() throws RuntimeException{
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt() ;
		return numero;
	}
}
