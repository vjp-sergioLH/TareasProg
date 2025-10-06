package ej1t3;

/**
 *
 * @author Sergio
 */
import java.util.Scanner;
public class EJ1T3 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que introduzca un número
        System.out.print("Por favor, introduzca un numero: ");
        double numero = scanner.nextDouble(); // Permite números con decimales

        // Mostrar si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número introducido es positivo.");
        } else if (numero < 0) {
            System.out.println("El número introducido es negativo.");
        } else {
            System.out.println("El número introducido es cero.");
        }
    }
    
}
