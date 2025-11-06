package ej17t4;

/**
 *
 * @author Sergio
 */
import java.util.Scanner;
public class EJ17T4 {


    public static void main(String[] args) {
        int numeroLimite;
        Scanner scanner = new Scanner(System.in);

        // Bucle para asegurar que el número introducido sea mayor que 0
        do {
            numeroLimite = pedirNumeroAlUsuario(scanner);
        } while (!esNumerovalido(numeroLimite));

        // Llamamos al método para calcular y muestra los múltiplos
        mostrarMultiplosdetres(numeroLimite);

        scanner.close();
    }


    public static int pedirNumeroAlUsuario(Scanner scanner) {
        System.out.print("Por favor, introduce un número entero (mayor que 0): ");
        return scanner.nextInt();
    }

    // Comprueba si el número introducido es mayor que 0.
    public static boolean esNumerovalido(int numero) {
        if (numero <= 0) {
            System.out.println("Error: El número debe ser mayor que 0. Inténtalo de nuevo.");
            return false;
        }
        return true;
    }

    // Calcula e imprime todos los múltiplos de 3 entre 1 y el número límite,
    public static void mostrarMultiplosdetres(int limite) {
        int contadorMultiplos = 0;
        System.out.println("Los múltiplos de 3 entre 1 y " + limite + " son:");

        // Iterar desde 1 hasta el límite para encontrar los múltiplos de 3
        for (int i = 1; i <= limite; i++) {
            if (i % 3 == 0) { // Comprueba si el número es divisible por 3
                System.out.print(i + " ");
                contadorMultiplos++;
            }
        }

        System.out.println("Total de múltiplos de 3 encontrados, a continuacion. . . : " + contadorMultiplos);
    }
}