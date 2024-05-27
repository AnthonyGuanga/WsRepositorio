package _01_Basico;

/**
 * En java no se puede realizar herencia multiples entre clases
 * Pero una manera para implementar la herencia multiple en java
 * es mediante interface
 * 
 * aunque una clase java SOLO puede externder de una sola
 * clase, puede implentar n interface
 * 
 * de hecho puede extender una clase e implemntar n
 */
public class ClaseBasica3 extends Object implements InterfaceBasico1, InterfaceBasica2{

	@Override
	public void metodo4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodo5() {
		// TODO Auto-generated method stub
		
	}

	//No hay ningun metodo problema porque este metodo este
	//en dos interface, va que eb ninguna esta implementado
	@Override
	public void metodo1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String metodo2(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int operacion(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
