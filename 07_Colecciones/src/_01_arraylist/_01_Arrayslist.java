package _01_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

import org.w3c.dom.css.CSSRule;

public class _01_Arrayslist {

	public static void main(String[] args) {
		// los arrays "normales " en java tienes un problema y es que sin
		// estatios, es decir, una vez creado el array, el tamaño no
		//puede cambiar nunca .si creamos un array de 5 elementos
		//solo podra tener 5 elementos.
		
		String[] arrayString1 = new String[5];
		//aunquye ni tenga un elemto el array si pregunto
		//por su tamaño me dice 5
		System.out.println(arrayString1.length);

		//normal emnte este tipo de array no se suele utilizar
		//en su lugar se utiliza arrays dinamicos, es decir 
		//arryas que se apmlia el tamaño en tiempo de ejecucion
		//dicho de otra manera, nunca se llenan
		
		//la clase Arrylist se tiene que parametrizar, esto es,
		//se pone entre > el tipo de datos que queremos que contenga
		//el Arrlist .A los arraylist yo los llamos lista
		ArrayList<String> listaString1 = new ArrayList<String>();
		//si preguntamos por el tamaño del array
		System.out.println(listaString1.size());
		
		//con arrys normales tenemos que tener siempre en cuenta
		//la position del arrys que estamos usando
		arrayString1[0] = "Tom Sawyer";
		arrayString1[1] = "Scooby Doo";
		
		//con arryslist no necesitamos controlar ultima posicion
		//usando , podemos usar metodo "add" que añade automaticamente
		//a la ultima position libre del arrys
		listaString1.add("Son Goku");
		listaString1.add("Vegeta");
		
		
		//para recorrer arrays los ponemos igual, pero vemos diferencia
		System.out.println("imprimientos arrays");
		for(String s : arrayString1) {
			System.out.println(s);
		}
		System.out.println("imprimientos lista");

		for(String s : listaString1) {
			System.out.println(s);
		}
		
		//ACCEDIENTO a elemntos concretos 
		System.out.println(arrayString1[0]);
		System.out.println(listaString1.get(0));

		//esta dos sentecia dan exceptiones
		//System.out.println(arrayString1[2]);
		//System.out.println(listaString1.get(2));
		
		//podemos rellenar posiciones concretas
		listaString1.set(2, "Broly");
		
		//Notese la diferencia de imprimir directamente una arrys y un arralist
		System.out.println(arrayString1);
		System.out.println(listaString1);
		System.out.println(Arrays.toString(arrayString1));
		
		//podemos añadir un elemento a una posicion dada y deplazaria
		//los demmas
		listaString1.add(1,"Freezer");
		System.out.println(listaString1);
		
		//la parametricion de los arryslists no admiten primitivo 
		//pero afortudamente java invento los tipos "wrapper" de los 
		//primitivos. dicho de otra manera todos los primitivos
		//tienen su equivalente a objeo.
		
		int numero1 = 5;
		//Integer numeroObjeto = new integar(5);
		//normal mente esta el concepto "auto wrapper" que hace
		//que java convierta directamente un primitivo a un objeto
		Integer numeroObjeto = 5;//esto creo un objeto en el valor 5
		//los obejetos de tipos wrapper son inmutable un objeto inmutable
		//se define como un objto el cual no se puede cambiar nunca el valor
		//de sus atributos (tambien llamdo estado)
		numeroObjeto = 6;

		//la clase string tembien es inmutable
		String S = "SHERLOCK";
		S = "Dr.wattson";
		
		String s2 = "SHERLOCK";
		
		//Existen tipos wrapper para todos lor primitivos
		//que se suele llamar igual que el primitivo pero
		//con la primera letra en mayuscula
		double d1 = 4.5;
		Double d2 = 5.6;
		Boolean b1 = true;
		Float f1 = 5.6F;
		Character c1 = 'f';
		Byte byte1 = 23;
		
		//ArrayList<int> ListaEnteros = new ArrayList<>();
		ArrayList<Integer> ListaEnteros = new ArrayList<>();
		//operador diamenate, desde la 1.7 y dice que no es
		//necesario crear el objeto con la parametrizacion,
		//automatizacion coge el de la referencia 
		ArrayList<Double> ListaDoubles = new ArrayList<Double>();
	}

}
