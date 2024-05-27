package _01_Basico;

public class Clasebasica2 implements InterfaceBasico1 {

	@Override
	public void metodo1() {
		System.out.println("Este es el metodo1 pero de la clasebasica2");

	}

	@Override
	public String metodo2(Object o) {
		String cadena = "Este seria el metodo2 de la clase clasebasica2 que invocamos"
				+ "El metodo toString del objeto objet" + o.toString();
		return cadena;
	}

	/**
	 * Operacion multiplicacion
	 */
	@Override
	public int operacion(int a, int b) {
		int multiplicacion = a * b;
		return multiplicacion;
	}

}
