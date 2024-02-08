package main;

import java.util.Scanner;

import entidad.Videojuego;

public class MainActividad11 {

	public static void main(String[] args) {
		Videojuego v1 = new Videojuego();
		Videojuego v2 = new Videojuego("Fortnite", "14/044/2020");
		Videojuego v3 = new Videojuego(3,"Baldurs cate III", 10, 59.95, "03/08/2023", true);

		Scanner sc = new Scanner(System.in);
		v1.id = sc.nextInt();
		v1.precio = sc.nextDouble();
		v1.puntuacion = sc.nextDouble();
		v1.esSegundaMano = sc.nextBoolean();
		//La clase scanner tiene un problema, siempr que recojamos
		//un dato que ni sea sstring y luego querais un string
		//teneis que hacer un nextLine() extra
 		v1.nombre = sc.nextLine();
 		
 		v1.mostrarDatos();
 		v1.mostrarNombrePuntuacion();
 		v1.mostrarPrecioEnlibras();
 		v1.mostrarFechaInvertida();
 		v1.mostrarFechaInvertidaSubsting();
 		System.out.println(v1.calcularDescuento());
 		v1.mostrarEsApto();
 		v1.mostrarPuntuacionastaElDiez();
 		boolean esMasCaro = v1.esMasCaro(v3);
 		System.out.println(esMasCaro);
 		int iEsMasCaro = v1.esMasCaroIgual(v3);
 		
	}

}
