package ej27t3;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class EJ27T3 {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        double numero1, numero2;
        int opcion;

        // Pedimos los números al usuario
        System.out.print("Introduce el primer número: ");
        numero1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        numero2 = scanner.nextDouble();

        do {
            // Mostramos el menú
            System.out.println("\n--- Menú ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            // Realizamos la acción según la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("Suma: " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("Resta: " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("Multiplicación: " + (numero1 * numero2));
                    break;
                case 4:
                    try {
                        System.out.println("División: " + (numero1 / numero2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5); // El bucle continúa hasta que el usuario elige salir (opción 5)

        scanner.close();
    }
}