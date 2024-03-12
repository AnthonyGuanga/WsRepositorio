 package ordenador;

import java.util.ArrayList;

public class MainOrdenador {

	public static void main(String[] args) {
		System.out.println("===================================================");
		System.out.println("\tLista de productos informaticos");
		System.out.println("===================================================");
		Procesador p1 = new Procesador("intel", "i5", 5 ,100);
		TarjetaGrafica t1 = new TarjetaGrafica("nvidea","rtx4090",27,1.500,new RAM("SAMSUMN",24,54));
		PlacaBase pb1 = new PlacaBase("msi",65,"b550");
		RAM r1 = new RAM("hyperx",8,65);
		RAM r2 = new RAM("tsamsumg",16,105);
		RAM r3 = new RAM("corsair",8,65);
		RAM r4 = new RAM("Presator",32,300);
		Periferico pr1 = new Periferico("mouse","logitech",86);
		Periferico pr2 = new Periferico("teclado","corsair",110);
		Periferico pr3 = new Periferico("headset","lenovo",200);
		double precio;
		Ordenador o = new Ordenador(0,p1,t1,pb1,new ArrayList<RAM>(),new ArrayList<Periferico>());
		
		o.getListaRAMs().add(r1);
		o.getListaRAMs().add(r2);
		o.getListaRAMs().add(r3);
		o.getListaRAMs().add(r4);
		
		o.getListaPerifericos().add(pr1);
		o.getListaPerifericos().add(pr2);
		o.getListaPerifericos().add(pr3);

		
		o.calcularPrecio();
		System.out.println("Este seria todo los del ordenador  "+o);
		System.out.println("===================================================");    
		
	}

}
