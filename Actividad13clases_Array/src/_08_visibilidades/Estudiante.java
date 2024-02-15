package _08_visibilidades;

	//con las visibilidaddes establencemos desde donde podemos acceder a
	//muestro metodos
	
	//en java tenemos 4 tipos de visibilidades 

	//1. privada -> solo tenemos visibilidad dentro de la propia clase 
	//2. (default) ->solo tenemos visibilidad dentro de la propia clase 
	//y de las clases dentro del mismo paquete
	//3.protected -> solo tenemos visibilidad dentro de la propia clase
	// de las clases dentro del mismo paquete yde las clases que hereden
	//de esta.
	// 4.public -> tenemso visibilidad en todas las partes de nuestro
	//proyecto

//a efectos practicos los atributos, normalmente, los atributos
//siempre se declaran como private, y se crean sus metodos acesores 

public class Estudiante {
	private String nombre;
	int edad;
	protected double peso;
	public String dni;

		
	public Estudiante() {
		super();
	}


	public Estudiante(String nombre, int edad, double peso, String dni) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.dni = dni;
	}
	
	//NOrmalmente si creamos un atributo privado tenemso que darle
	//metodos modificadores y accesores publicos . la ventaja es que en los
	//metodos podemos aplicar loficca, mientras que es un atributo
	//no.
	//Es super mega hiper importante seguir los convenios de java
	//los metodos modificadores empiezan por set y luego el nombre
	///del atributp
	public void setNombre(String nombre) {
		if(nombre.length() > 1) {
			this.nombre = nombre;
		}
	}
	
	//Para lso metodos accessores, empiezan por la palabra "get"
	//luego el nombre del atributo
	public String getNombre(){
		if(this.nombre != null) {//evitamos nullpoiters
			return convertirNombreAminuscula();
		}
		return this.nombre;
	}
	
	private String convertirNombreAminuscula() {
		return this.nombre.toLowerCase();
	}
	
}
