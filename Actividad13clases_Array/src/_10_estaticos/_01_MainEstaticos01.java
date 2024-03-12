package _10_estaticos;
/*
 * la parte estaticas de java es una parte de la memoria que 
 * siempre existe miestras que los objetos son dinamicos
 * y solo existen cuando se les crea, hay una parte
 * llamada "static" que existe durante todo el ciclo de vida del
 * programa
 * 
 * princilmente podemos encontrar partes estaticos dentro de
 * atributos y de metodos para elli se declaran con la palabra 
 * reservada "stati"
 * 
 * ppara crear metodos y atributos dinamicos no se utilix ninguan
 * palabra reservada dicho de otra manera practicamente todo
 * con lo que gemos trabajado hasta ahora ha sido dinamico
 * 
 * A grades rasgo podemos decir que lo dinamico esta relacionado
 * */
public class _01_MainEstaticos01 {
	//este atributo dinamico y solo existira cuando exita
	//el objto cada objeto tendra este atributo y podra
	//almacenar un valor diferencia deicho de otra manera 
	//todos 
	
	private int atributo1;
	//este atributps es estaticos por lo que su ciclo de vida no 
	//esta parte 
	private static int atributo2;
	
	
	//Las constantes del programa se declara finales y
	//estaticas y publicas , tambien con notacion UpperSnakeCase
	public static final String NOMBRE_DEL_PROGRMA = "ESTATICOS EN JAVA";
	
	
	//notee que el metodo main es un metodo estatico 
	public static void main(String[] args) {
		System.out.println(NOMBRE_DEL_PROGRMA);
		presentarse();
		//tambien podemos llamarlo por la clase
		
		//para acceder a un metodo statrico de un metodo estatico
		//podemos acceder directamente
		//_01_PTR
		//prsentarseDinamicamente
		_01_MainEstaticos01 me = new _01_MainEstaticos01();
		
		//En cambio un metodo dinamico no podemos llamarlo
		//directamente desde un metodo estatico porque lo
		//dinamico solo existe de un metodo dinamico
		//si queremos invocar un metodo dinamico desde un
		//metodos esticos denemos tener el obejto
		me.prsentarseDinamicamente();
		
		//atributo1 = 9;
		me.atributo1 = 9;
		
		
		//Desde una referencia podemos acceder a la parte estatica
		//pero no se debe. A lo estatico se acceder de manera
		//estatica
		//me.presentarse
		atributo2 = 10;
		//esto mismo se aplica si queremos trabajar con distica clase
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona.numeroPersonas = 2;
		
		p1.edad = 45;
		p2.edad = 56;
		
		//Normalemnte siempre es mucho mas comodo de trabajar de manera dinamica 
		//por ejemplo que esto metodo podemos ver imprimi edades de
		//manera diferente
		p1.imprimirEdadDinamico();
		p2.imprimirEdadDinamico();
	}

	public static void presentarse() {
		atributo2 = 89;
		System.out.println("Hola parte estatica");
	}
	
	public void prsentarseDinamicamente() {
		System.out.println("Hola parte dinamica");
		atributo1 = 9;
		this.atributo1 = 9;
		
		atributo2 = 23;
		_01_MainEstaticos01.atributo2 = 34;
		System.out.println("HOLA parte dinamica");
	}
}
