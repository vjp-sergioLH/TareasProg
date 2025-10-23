package ej21t3;

import java.util.Scanner;

public class EJ21T3 {


public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un Scanner para leer la entrada del usuario

        try {
            // Vamos a solicitar al usuario que ingrese el numerador
            System.out.print("Ingrese el numerador: ");
            double numerador = scanner.nextDouble(); // Leemos el numerador como un número de punto flotante (double)

            // Y tambien solicitamos al usuario que ingrese el denominador
            System.out.print("Ingrese el denominador: ");
            double denominador = scanner.nextDouble(); // Leemos el denominador como un número de punto flotante (double)

            // Realizamos la división
            double resultado = numerador / denominador;

            // Y mostramos el resultado
            System.out.println("El resultado de la división es: " + resultado);

        } catch (ArithmeticException e) {
            // Capturamos la excepción ArithmeticException (división por cero)
            System.out.println("Error: No se puede dividir por cero.");
        } catch (Exception e) {
            // Capturamos cualquier otra excepción que pueda ocurrir
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            
            scanner.close();
        }
    }
}