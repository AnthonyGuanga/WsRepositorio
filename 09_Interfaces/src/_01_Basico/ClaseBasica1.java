package _01_Basico;

/**
 * Para que una clase implemente una interfaz debemos de usar
 * la palabra reservada implemente
 */
public class ClaseBasica1 implements InterfaceBasico1{

	@Override
	public void metodo1() {
		System.out.println("Esto seria ell metodo 1");
		
	}

	@Override
	public String metodo2(Object o) {
		String cadena = "Esto es el emtodos 2 invocando al tostring del objeto"
			+ o.toString();
		return cadena;
	}

	/**
	 * Implementamos la operacion suma
	 */
	@Override
	public int operacion(int a, int b) {
		int resultado = a + b;
		return resultado;
	}

}
