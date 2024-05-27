package _02_ejemplo_imprimir;

public class ImprimirImpresora implements Imprimible {

	@Override
	public void imprimir(String cadena) {
		String Ip = "192.169.56.13";//Supongamiss que la impresora esta aqui
		//Simulamos la  impresion por impresora
		System.out.println("IMprimiendo por impresora: "+ cadena);
		
	}

}
