package _02_ejemplo_imprimir;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ImprimirFichero implements Imprimible {

	@Override
	public void imprimir(String cadena) {
		//Este metodo arroja exceociona que DEBEMOS controlar
		//Con esta clase vamos a poder escribir en un fichero 
		//de texto cadena
		try {
			PrintWriter pw = new PrintWriter("fichero.txt");
			//El objeto tiene un metodo que nos permite escribit
			//en el fichero que se llama igual que el metod
			//de la clase "system.out"
			pw.print(cadena);//Llenamos el buffer con la informacion
			pw.flush();//passamos la informacion de buffer al fichero
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
