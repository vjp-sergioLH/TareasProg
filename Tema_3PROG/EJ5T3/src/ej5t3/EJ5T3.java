package ej5t3;

import java.util.Scanner;

public class EJ5T3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que introduzca un número
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        numero = numero % 2;
        // Verificaramos si el número que nos da es par o impar
        if (numero <= 0) {
            System.out.println("El número es PAR.");
        } else {
            System.out.println("El número es IMPAR.");
        }

        scanner.close();
    }
}