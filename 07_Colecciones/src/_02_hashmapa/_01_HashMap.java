package _02_hashmapa;

import java.util.ArrayList;
import java.util.HashMap;

public class _01_HashMap {

	public static void main(String[] args) {
		//tenemos otros tipos  muy importante que son
		//las llamadas hash, diccionario o arrays asociativos
		//asegun el lenguaje que estemos usando
		
		//Este tipo de estructuras se caractersizam por tener una clave
		//y un valor asociado , es decir, a partir de una clave podemos
		//acceder o modificar valor 
		
		//solamaente puede haber una clave en caso de que se ponga dos
		//claves iguales , el valor se sobreescribe
		
		//Para crear una estructura de tipo has, podemos usar la clase
		//hastmap
		
		HashMap<String, Double> hashmapciudadTemperatura = 
					new HashMap<>();
		
		//Podemos establecer claves y valores con el metodo put(clave,valor)
		hashmapciudadTemperatura.put("Madrid",10.0);
		hashmapciudadTemperatura.put("Barcelona", 11.0);
		
		//podemos acceder a los  valores con el metodo get(clave)
		Double temperatura = hashmapciudadTemperatura.get("Madrid");
		System.out.println(temperatura);
		
		temperatura = hashmapciudadTemperatura.get("Barcelona");
		System.out.println(temperatura);
		
		//si accedemos a una clave que no existe te devuelve NULL
		temperatura = hashmapciudadTemperatura.get("Zaragoza");
		System.out.println(temperatura);
		
		//Las clave son case sentive 
		//nO ES LO MISMO "madrid" que " MADRID"
		temperatura = hashmapciudadTemperatura.get("MADRID");
		System.out.println(temperatura);
		
		
		//El obejetivo de los hasmap es diferrente a de loa arrays
		//sirve para hacer bsuquedas rapidas, no suelen servir
		//para recorrerlos
		
		//Si se quiere recorrer los mejora
		hashmapciudadTemperatura.forEach((k,v)->{
			System.out.println("clave"+k.toString());
			System.out.println("valor"+v.toString());
		});
		
		ArrayList<String> listaNombre = new ArrayList<String>();
		listaNombre.add("Gallego");
		listaNombre.add("Marquitos");
		listaNombre.add("Guillermo");
		
		//con funciones
		listaNombre.forEach(e -> System.out.println("Nombre : "+e));
		
		//Si ponemos la misma clave se sobreescribe el valor
		hashmapciudadTemperatura.put("Madrid", (double)7);
		System.out.println(hashmapciudadTemperatura.get("Madrid"));
		
		
		//Java soporta la inferencia 
		//Esta caracteristica permite definir el tipo de la varible
		//en el momento de asignar el primer valor ,pero ojo !!
		
		//El tipo de la varible siempre sera el tipo de valor 
		//No se puede cambiar .No confundae con los lenguje no 
		//tipados
		var numero1 = 34.0;//el tipo de esta varible sera double
								//y siempre los ser
		System.out.println(numero1);
		//numero1 = true;
		numero1 = 45.0;
		var numero2 = 100;//El tipo sera sera integer y no podra ser de otro tipo
		//numero2 = 45.0;
		
		//los tipos inferidos solo para las varibles, no se puede
		//usar en los atributos de clase
	
	}
}
