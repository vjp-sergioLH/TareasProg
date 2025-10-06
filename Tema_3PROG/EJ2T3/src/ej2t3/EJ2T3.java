package ej2t3;

import java.util.Scanner;

public class EJ2T3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se Solicita el primer número
        System.out.print("Por favor, introduzca un numero: ");
        double numero1 = scanner.nextDouble();

        // Se Solicita el segundo número
        System.out.print("Ahora, introduzca un segundo numero: ");
        double numero2 = scanner.nextDouble();

        double resultado;
        String operacion;

        // Se Determinr si se debe sumar o multiplicar
        if (numero1 > 10) {
            resultado = numero1 * numero2;
            operacion = "producto";
        } else {
            resultado = numero1 + numero2;
            operacion = "suma";
        }

        // Y se Muestra la operación realizada y el resultado
        System.out.println("La operación que se realizó es " + operacion + " y el resultado es " + resultado);

        scanner.close();
    }
}