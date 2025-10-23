package ej22t3;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */

public class EJ22T3 {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un Scanner para leer la entrada del usuario

        try {
            // Vamos a solicitar al usuario que ingrese el numerador
            System.out.print("Ingrese el primer numero: ");
            double numero1 = scanner.nextDouble(); // Leemos el numerador como un número de punto flotante (double)

            // Y tambien solicitamos al usuario que ingrese el denominador
            System.out.print("Ingrese el segundo numero: ");
            double numero2 = scanner.nextDouble(); // Leemos el denominador como un número de punto flotante (double)

            // Realizamos la división
            double resultado = numero1 + numero2;

            // Y mostramos el resultado
            System.out.println("El resultado de la suma es: " + resultado);

        } catch (ArithmeticException e) {
            // Capturamos la excepción ArithmeticException (división con letras prohibida)
            System.out.println("Error: No se suma con letras.");
        } finally {
            
            scanner.close();
        }
    }
}