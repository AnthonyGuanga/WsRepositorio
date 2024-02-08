package _06_CicloDeVida;

import java.util.Random;


public class MainCicloDeVida {

	public static void main(String[] args) {
		
		//Un obejeto nace cuando instaciamos la clase con 
		//la palabra new
		new Persona();
		new Persona().edad = 45;
		//normal mente si queremos guardar informacion los atributos
		//de un obejeto , debemos crear tambien una referencia para
		//poder acceder a dichos atributos. no tiene mucho sentido
		//almacenar informacion que no podemos acceder a ellç
		
		//si sque se puede tener sentido, crear un obejeto sin  referencia
		//para acceder a sus metodos en un momento dado, pero hay que
		//tenerlo en claro, que no demos volver  a accerder a dicho objeto
		int numero = new Random().nextInt(1, 10);
		System.out.println("EL NUMERO ALEAOTRIO ES : " +numero);
		
		//cuando timepo viven los ibjetos en el heap de memoria
		//en java tenemos un programa dentro de la jvm que se llama
		//reccolector de basura o garbage collector este programa
		//pasa aleatoriamente por el heap de memoria para borrar
		//objetos . la condicion para que un obejeto sea eliminar
		//del heap es que no tenga ninguna referencia .
		
		//mientra que los tres obejetos creados arriba
		//seran borrados por el gb, este objeto no sera borrado
		//ya que tiene una referncia apuntandole
		Persona p = new Persona();
		p.edad = 35;
		
		//teoriacamente , la jvm tiene un metodo para obligar a pasar el 
		//recolector de basura , que es el metodo gc() de la clase
		//sisten
		//de hecho no la jvm hotsop no le hace caso
		System.gc();
		
		//En POO existi el concepto de null . null representa "vacio "
		//nulo, ausencia de valor y se usa la palabre reservada "null"
		//solamente puede ser nulos la referencia 
		Persona p2 = null ;
		String s = null;
		Random rd = null;
		//int i = null; // solo puede ser null las referencias 
		
		p2 = new Persona();
		p2.edad = 22;
		
		
		Persona p3 = p2;
		Persona p4 = p3;
		p2 = null;
		p3 = null; 
		
		System.out.println(p4.edad);
		//Importante pesadilla de los progrmadores
		//simpre que una referencoa este apuntando a null e intentemos acceder
		//a alguno que sus atributos o metodos nnos dara el error
		//nullpointException y se nos para el progrma
		//System.out.println(p2.edad);
		System.out.println(p4.nombre );
		//p4.nombre = "manolon"
		System.out.println(p4.nombre.charAt(6));
		p4 = dameNulo();
		System.out.println(p4);
		System.out.println(p4.edad);
		//hasta aqui el dibujo "06_ciclodevidad"
		
	}
	public static Persona dameNulo() {
		return null;
	}
}
