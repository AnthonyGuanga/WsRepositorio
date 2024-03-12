package _09_enumerados;

import java.util.Scanner;


public class MainEnumerdados {

	public static void main(String[] args) {
		//Direccion d1 = new Direccion();
		//d1.setTipoVia("");
		//d1.setTipoVia("calle");
		//d1.setTipoVia("c\\");
		
		
		//para acceder a un enumeradi concreto lo haremos
		//a traves de su clase, con un "." y luego el nombre
		//del enumerado
		System.out.println(TipoVia.CALLE);
		System.out.println(TipoVia.AVENIDA);
		
		//podemos recorrer todos los tipos como un array
		//accediendo a el metodo "values()"
		System.out.println("Accedinedo recorriendo el array ");
		for(int i = 0;i < TipoVia.values().length;i++) {
				System.out.println(TipoVia.values()[i]);
		}
		System.out.println("Accedinedo recorriendo el array con un for each");
		
		for(TipoVia tv : TipoVia.values()) {
			System.out.println(tv);
		}
		
		//Podemos utilizar lso anumerados para mostrar al usuario
		Scanner sc = new Scanner(System.in);
		System.out.println("selecciones el tipo de via que quiere ");
		for(int i = 0;i < TipoVia.values().length;i++) {
			System.out.println(i+ "-"+TipoVia.values()[i]);
		}
		int seleccion = sc.nextInt();
		TipoVia tv = TipoVia.values()[seleccion];
		System.out.println("Usted a seleccionado: "+ tv);
		
		//Trabajando con enumerados dentro de clases
		Direccion d1 = new Direccion();
		Persona p1 = new Persona();
		//p1.setDireccion().setTipoVia
		d1.setTipoVia(TipoVia.AVENIDA);
		p1.setDireccion(d1);
		System.out.println(p1);
		d1.setTipoVia(TipoVia.CAÑADA_REAL);
		System.out.println(p1);
	}
	

}
