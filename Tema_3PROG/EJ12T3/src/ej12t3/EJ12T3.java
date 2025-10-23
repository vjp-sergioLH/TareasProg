package ej12t3;

/**
 *
 * @author Sergio
 */
public class EJ12T3 {

public static void main(String[] args) {
        int numero = 12; // El primer número par después del 11

        System.out.println("Los números pares entre 11 y 133 son:");

        do {
            System.out.print(numero + " ");
            numero += 2;
        } while (numero <= 133);
    }
}