package _01_Basico;


import java.util.LinkedList;
import java.util.List;

public class MainInterface {

	public static void main(String[] args) {
		//una interfaz no se puede instanciar
		//InterfaceBasico1 ib1 = new InterfaceBasico1() {
		ClaseBasica1 cb1 = new ClaseBasica1();
		cb1.metodo1();
		String cadena = cb1.metodo2("Soy un objeto de tipo String");
		System.out.println(cadena);
		int resultado = cb1.operacion(3, 5);//Suma es decir 8
		System.out.println(resultado);
		Clasebasica2 cb2 = new Clasebasica2();
		
		System.out.println("==========================");
		cb2.metodo1();
		
		cadena = cb2.metodo2("Soy otro objeto de tipo String");
		System.out.println(cadena);
		resultado = cb2.operacion(3, 5);//Multiplicaicon 15
		System.out.println(resultado);
		System.out.println("==========================");

		List<InterfaceBasico1> listaInterfaces = new LinkedList<InterfaceBasico1>();
		listaInterfaces.add(cb1);
		listaInterfaces.add(cb2);
		
		int numero1 = 4;
		int numero2 = 6; 
		
		for (InterfaceBasico1 ib1 : listaInterfaces) {
			//Polimorfimos
			System.out.println(ib1.operacion(numero1, numero2));//Primera vez ->10 segunda ->>244
			
		}
				
	}

}
