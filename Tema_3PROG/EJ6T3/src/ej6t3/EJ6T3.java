package ej6t3;

import java.util.Scanner;

public class EJ6T3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se solicita al usuario la nota que tiene
        System.out.print("Introduce la nota del alumno (0 a 10): ");
        
        // Verificamos si la entrada es un número entero
        if (scanner.hasNextInt()) {
            int nota = scanner.nextInt();

            // Y clasificamos según la nota
            if (nota >= 0 && nota <= 10) {
                if (nota >= 0 && nota <= 4) {
                    System.out.println("Calificación: Suspenso");
                } else if (nota <= 6) {
                    System.out.println("Calificación: Bien");
                } else if (nota <= 8) {
                    System.out.println("Calificación: Notable");
                } else {
                    System.out.println("Calificación: Sobresaliente");
                }
            } else {
                System.out.println("Error: La nota debe estar entre 0 y 10.");
            }
        } else {
            System.out.println("Error: Debes introducir un número entero.");
        }

        scanner.close();
    }
}