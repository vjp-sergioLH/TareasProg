package ej14t4;

/**
 *
 * @author Sergio
 */
import java.util.Scanner;
public class EJ14T4 {

public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);

        // Pedimos el número al usuario y lo validamos
        do {
            numero = pedirNumero(scanner);
        } while (!esMayorDeCero(numero));

        // Calculamos y mostramos los múltiplos de 3
        mostrarMultiplos(numero);

        scanner.close();
    }

    // Método para pedir el número al usuario
    public static int pedirNumero(Scanner scanner) {
        System.out.print("Por favor, introduce un numero entero mayor que 0: ");
        return scanner.nextInt();
    }

    // Método para comprobar si el número es mayor que 0
    public static boolean esMayorDeCero(int numero) {
        if (numero <= 0) {
            System.out.println("Error: El numero debe ser mayor que 0.");
            return false;
        }
        return true;
    }

    // Método para calcular y mostrar los múltiplos de 3
    public static void mostrarMultiplos(int numero) {
        int contador = 0;
        System.out.println("Los multiplos de 3 entre 1 y " + numero + " son:");

        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                contador++;
            }
        }
        System.out.println("Total de multiplos: " + contador);
    }
}