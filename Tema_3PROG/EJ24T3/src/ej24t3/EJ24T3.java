package ej24t3;

import java.util.Scanner;
/**
 *
 * @author Sergio
 */
public class EJ24T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
        int numero; // Variable para almacenar el número ingresado por el usuario
        int contador = 0; // Contador para los múltiplos de 3

        // Pedimos al usuario que ingrese un número mayor que 0
        do {
            System.out.print("Por favor, ingresa un número mayor que 0: ");
            numero = scanner.nextInt(); // Leemos el número ingresado
            if (numero <= 0) { // Verificamos si el número es menor o igual a 0
                System.out.println("Error: El número debe ser mayor que 0. Inténtalo de nuevo.");
            }
        } while (numero <= 0); // Repetimos hasta que el usuario ingrese un número válido

        // Imprimimos los múltiplos de 3 entre 1 y el número ingresado
        System.out.println("Los múltiplos de 3 entre 1 y " + numero + " son:");
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) { // Verificamos si el número es múltiplo de 3
                System.out.println(i); // Imprimimos el múltiplo
                contador++; // Incrementamos el contador
            }
        }

        // Informamos al usuario del total de múltiplos mostrados
        System.out.println("Total de múltiplos de 3 mostrados: " + contador);
        
        scanner.close(); // Cerramos el objeto Scanner
        
    }
}