package practica_01;import java.awt.dnd.Autoscroll;

public class MainPapel {

	public static void main(String[] args) {
		Papel p1 = new Papel();
		
		p1.setTamanio("16x16");
		p1.setTipo("cania");
		p1.setPrecio(1);
		
		imprimir(p1);
		
		Papel p2 = new Papel();
		p2.setTamanio("16x16");
		p2.setTipo("hojascomunbes");
		p2.setPrecio(0.50);
		
		p1.elPapelEsDeCania();
		p2.elPapelEsDeCania();
		
		p1.presentarsePapel();
		p2.presentarsePapel();
	}
	public static void imprimir(Papel p1) {
		System.out.println(p1.getTamanio());
		System.out.println(p1.getTipo());
		System.out.println(p1.getPrecio());
		
	}
	
	
	

}
