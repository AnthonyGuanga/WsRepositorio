package ordenador;

public class MainOrdenador {

	public static void main(String[] args) {
		System.out.println("");
		Procesador p1 = new Procesador("intel", "i5", 5 ,100);
		TarjetaGrafica t1 = new TarjetaGrafica("nvidea","rtx4090",27,1.500,);
		PlacaBase pb1 = new PlacaBase("msi",65,"b550");
		RAM r1 = new RAM("hyperx",8,65);
		RAM r2 = new RAM("samsumg",16,105);
		RAM r3 = new RAM("corsair",8,65);
		Periferico pr1 = new Periferico("mouse","logitech",86);
		Periferico pr2 = new Periferico("teclado","corsair",110);
		Periferico pr3 = new Periferico("headset","lenovo",200);

		Ordenador o = new Ordenador();
		

	}

}
