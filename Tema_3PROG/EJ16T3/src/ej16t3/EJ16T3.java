package ej16t3;

/**
 *
 * @author Sergio
 */
public class EJ16T3 {

public static void main(String[] args) {
        int contadorImpares = 0;

        System.out.println("Los números impares existentes entre el número 20 y el 160 son:");

        for (int i = 21; i < 160; i += 2) {
            System.out.print(i + " – ");
            contadorImpares++;
        }

        System.out.println("\nLa cantidad de números impares impresos han sido: " + contadorImpares);
    }
}