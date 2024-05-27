package _04_Basico_animales;

public class Cangrejo extends Pez{

	@Override
	public void moverseLento() {
		double movimiento = 10 - (getPeso() *10);
		System.out.println("Soy un cangrejo y me muevo  " + movimiento );
	}

	@Override
	public void moverseRapido() {
		double movimiento = 20 - (getPeso() *10);
		System.out.println("Soy un cangrejo y me muevo  " + movimiento );
	}
	
}
