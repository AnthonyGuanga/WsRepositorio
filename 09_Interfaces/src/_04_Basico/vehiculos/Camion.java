package _04_Basico.vehiculos;

public class Camion extends VehiculoTerrestre{

	@Override
	public void moverseLento() {
		double movimiento = 100 - (getPeso()*0.10);
		System.out.println("Soy un camion y me muevo  " + movimiento );
		
	}

	@Override
	public void moverseRapido() {
		double movimiento = 200 - (getPeso()*0.10);
		System.out.println("Soy un camion y me muevo  " + movimiento );
		
	}

}
