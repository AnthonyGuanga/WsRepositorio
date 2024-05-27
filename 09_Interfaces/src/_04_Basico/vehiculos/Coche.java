package _04_Basico.vehiculos;

public class Coche extends VehiculoTerrestre{

	
	@Override
	public void moverseLento() {
		double movimiento = 200 - (getPeso()*0.10);
		System.out.println("Soy un coche y me muevo  " + movimiento );
		
	}

	@Override
	public void moverseRapido() {
		double movimiento = 300 - (getPeso()*0.10);
		System.out.println("Soy un coche y me muevo  " + movimiento );
		
	}

	
}
