package prac;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un ArrayList para almacenar la lista
        ArrayList<Integer> lista = new ArrayList<>();

        // Pedir al usuario que ingrese los elementos de la lista
        System.out.println("Ingrese los elementos de la lista (ingrese -1 para terminar):");

        int elemento;
        do {
            System.out.print("Elemento: ");
            elemento = scanner.nextInt();
            if (elemento != -1) {
                lista.add(elemento);
            }
        } while (elemento != -1);

        // Mostrar la lista ingresada por el usuario
        System.out.println("La lista ingresada es:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }

        // Cerrar el Scanner para evitar pérdidas de recursos
        scanner.close();
    }
}
