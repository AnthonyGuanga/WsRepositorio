package _05_cating.copy;

import java.util.ArrayList;

import javax.print.Doc;

public class MainCating {

	public static void main(String[] args) {
		Docente d1 = new Docente();
		d1.salario = 2000;
		d1.setNombre("Dr.Bacterio");
		d1.setEdad(56);
		
		Alumno a1 = new Alumno();
		a1.setNombre("Felipe");
		a1.setEdad(21);
		a1.curso= "Entorno de desarrollo";
		
		Persona p1 = d1;
		System.out.println(p1.getEdad());
		//System.out.println(p1.salario);
		System.out.println(d1.salario);
		
		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(a1);
		listaPersonas.add(d1);
		//listaPersonas.forEach(v -> v.presentarse());
		for (Persona p : listaPersonas) {
			p.presentarse();
		}
		
		metodoRecibirLista(listaPersonas);
		
		
	
	}

	private static void metodoRecibirLista(ArrayList<Persona> listaPersonas) {
		// queremos mostrar todos los datos de los objetos
		
		Persona p1 = listaPersonas.get(0);
		//System.out.println(p1.curso);//Este mando a diferetencia no tine "curso"
		
		//si queremos acceder a todos los metodos y atributos de un objetos
		//demos usar el mando a disrnacia del objeto. para ello aplicamos
		//el "casting"que vimos t1
		//Con el "casting" cambiamos una referencia de tipo
		Alumno a1 = (Alumno)p1;
		System.out.println(a1.curso);
		
		//problema java no sabe en tiempo de ejecuacion a que objetos estas
		//apuntandoo, por lo que queda a nuestra resposibilidad hacer
		//"casting" bien
		//En este caso, java te dejaen tiempo de compilacion hacer un
		//"casting" a una refrencia de tipo docente, lo que ocurre 
		//es que al ser un objeto de tipo alumno no podemos usar
		//una referencia de tipo "docente" para apuntar es este caso
		//dara una exception "clasclasException"
		
		//Para saber la clase de un objeto podemos y evirar "claclascastExceptio"
		//podemos usar la palabra reservada "instanceof"
		if(p1 instanceof Alumno) {
			//System.out.println(p1.curso);//no
			Alumno a2 = (Alumno)p1;//Estp nunca me va adar el error
			System.out.println(a2.curso);
		}
		
		///Dicho de otra maner, podemos recorrer el array preguntando
		//de que tipo es cada objeto
		for (Persona p : listaPersonas) {
			//mediante EL polomorfimosç
			p.presentarse();
			if(p instanceof Alumno) {
				Alumno a = (Alumno)p;
				System.out.println(a.curso);
			}
			if (p instanceof Docente) {
				Docente d = (Docente)p;
				System.out.println(d.salario);
			}
		}
	}
	
	

}
