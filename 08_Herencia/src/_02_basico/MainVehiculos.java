package _02_basico;

import java.util.ArrayList;

public class MainVehiculos {

	public static void main(String[] args) {
		
		Avion avion = new Avion();
		avion.setFechaFabricacion("13/12/2009");
		System.out.println(avion.esAntiguo());
		
		Moto moto = new Moto();
		moto.setFechaFabricacion("13/12/2009");
		System.out.println(moto.esAntiguo());
		
		
		Barco barco = new Barco();
		barco.setEsPirata(true);
		barco.setFechaFabricacion("23/12/2003");
		barco.setMarca("la sirena feliz");
		barco.setPeso(2500);
		barco.setVelocidad(20);
		

		//la capacidad de que una referencia ejecute un metodo u otro
		//depediento del obejeto al que estamos apuntado se llama
		//polimorfimos.
		
		System.out.println(avion);
		System.out.println(moto);	
		System.out.println(barco);

		
		//IMPORTAMTE
		//Con una referencia de la clase superior o padre podemos 
		//apuntar a cualquier objeto inferior (o hijo)-
		//no podemos hacerlo al reves es decir son una referendia
		//((inferio))
		Vehiculo v1 = new Coche();
		//vehiculoTerreste vr = new moto();si
		//veiculo v2 = new vechilotereste
		
		// Importante aunque una refrencia superor solo podemos usa los metodos 
		//Inferior solo podemos usar los metodos o atributos que teng ala referencia
		//v
		Vehiculo v3 = new Moto();
		//v3.getVelocidad();
		//Nos podriamos preguntar para que vamos a
		// una referania padre en bez de la nijas  ,l as repsuesa
		//es, aunque no podemos usar todos los metodos
		//del objeto hijo, ganamos en versatilidad  es decir 
		//podemos apuntar en todo lo que conlleva y utiliar 
		//todos metodos de la referencia 
		
		//imaginais, que os pido guardadr todos loa objetos
		//que cree un usuarui en memoria
		
		ArrayList<Moto> listaMotos = new ArrayList<>();
		listaMotos.add(moto);
		//listaMotos.add(avion)
		
		
		ArrayList<Avion> listaAviones = new ArrayList<Avion>();
		
		ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
		 
		//mediante el polimorfinos el metodo que se ejecutara
		//sera el del¡ objeto que estamos apuntando
		//no el metodo de la referencia
		
		
		//En este ejemplo dependiendo del objeto 
		//al que estemos apumtando se ejecutaraa su
		//metodo toString o esAntiguo del propio
	}
	

}
