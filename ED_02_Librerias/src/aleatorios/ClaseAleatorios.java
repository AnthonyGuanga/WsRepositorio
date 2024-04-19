package aleatorios;

import java.util.Random;
/**
 * clase para generar números aleatorios
 *@author Muñon lider & muñoncitos 
 */
public class ClaseAleatorios {
	
	/**
	 * Método que genera un<b> número aleatorio </b>entre dos números
	 * pasados por parámetros
	 * @param n1 el mínimo valor posible del rango
	 * @param n2 el maximo valor posible del rango (incluido)
	 * @return el numero aleatorio generado
	 */
	public int numeroAleatoriosEntreNumeros(int n1,int n2){
		Random rn = new Random();
		//ponemos n2 + 1 para incluir en n2
		int nAleatorio = rn.nextInt(n1, n2 +1);
		return nAleatorio;
	}
	
	/**
	 * Método que genera un número aleatorios entre el 0
	 * y 2^32
	 * @return el numero pseudosleatoros
	 */
	public int numerosAleatorios() {
		Random rn = new Random();
		int nAleatorio = rn.nextInt();
		return nAleatorio;
	}
}
