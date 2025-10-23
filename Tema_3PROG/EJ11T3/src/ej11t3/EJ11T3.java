package ej11t3;

/**
 *
 * @author Sergio
 */
public class EJ11T3 {

public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            System.out.print("Hola" + i);
            
            // Solo se agrega " – " si no es el último
            if (i < 6) {
                System.out.println(" – ");
            }
        }
    }
}