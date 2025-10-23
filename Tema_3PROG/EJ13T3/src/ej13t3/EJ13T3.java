package ej13t3;

/**
 *
 * @author Sergio
 */
public class EJ13T3 {

public static void main(String[] args) {
        int numero = 12; // Primer número par después del 11

        System.out.println("Los números pares entre 11 y 133 son:");

        while (numero <= 133) {
            System.out.print(numero + " ");
            numero += 2;
        }
    }
}