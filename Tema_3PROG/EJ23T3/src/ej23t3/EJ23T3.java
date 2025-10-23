package ej23t3;

import java.util.Scanner;
/**
 *
 * @author Sergio
 */
public class EJ23T3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
        int numero; // Variable para almacenar el número ingresado por el usuario

        // Pedimos al usuario que ingrese un número mayor que 1
        do {
            System.out.print("Por favor, ingresa un número mayor que 1: ");
            numero = scanner.nextInt(); // Leemos el número ingresado
            if (numero <= 1) { // Verificamos si el número es menor o igual a 1
                System.out.println("Error: El número debe ser mayor que 1. Inténtalo de nuevo.");
            }
        } while (numero <= 1); // Repetimos hasta que el usuario ingrese un número válido

        // Imprimimos todos los números entre 1 y el número ingresado
        System.out.println("Los números entre 1 y " + numero + " son:");
        for (int i = 1; i <= numero; i++) {
            System.out.println(i); // Imprimimos cada número
        }

        scanner.close(); // Cerramos el objeto Scanner
    }
}