package _04_AYUDA_ECLIPSE;
public class Persona {
	String nombre;
	int edad;
	double peso;
	boolean estaCasado;

	//lOS IDE POR GENERAL NOS AYUDA A LA CREACION DE CODIGO
	//EN CONCRETO ECLIPSE NOS PUEDE AYUDAR EN LA CREACION DE LOS 
	//CONTRUCTORES 
	
	//PARA CREAR ESTE COSNTRUCTOR 
	//-> BOTON DERECHO SOBRE DONDE QUEREMOS CREARLO
	//-> SELECIONAMOS "SOURCE"
	//-> SEÑECIONAMOS "GENERATE CONSTRUCTOR USING FIELDA"
	//A CONTINUACION EKEGIMO LOS ATRIBUTOS CON LOS QUE QUEREMOS CREAR
	//EL CONTRUCTOR
	public Persona(String nombre, int edad, double peso, boolean estaCasado) {
		super();//ESTA PALABRA ESTA RELACIONADA CON LA HERENCIA
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.estaCasado = estaCasado;
	}


	


	//PODEMOS CREAR TODOS LOS CONTTRUCTORES QUE QUERAMOS
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Persona() {
		super();
	}
	//sobre escribimso el metodo tostrindh()
	/*
	public String toString() {
		return "Me llamos: " + this.nombre;
		*/
		//Eclipse tambien nos ayuda en sobrescribir el método toString()
		//Para crear este método
		//-> boton derecho sobre donde queremos crearlo
		//-> seleccionamos "source"
		//-> seleccionarmos "Generate toString()"
		//A continuación elegimos los atributos con los que queremos crear
		//el método





	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", estaCasado=" + estaCasado + "]";
	}
	
	
}