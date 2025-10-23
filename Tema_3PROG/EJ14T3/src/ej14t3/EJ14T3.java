package ej14t3;

/**
 *
 * @author Sergio
 */
public class EJ14T3 {

public static void main(String[] args) {
        int contador = 0; // Inicializamos un contador para llevar la cuenta de los números pares impresos
        int numero = 0;   // Inicializamos el número que vamos a evaluar

        while (contador <= 100) { // Usamos un bucle 'while' para iterar hasta que hayamos impreso 100 números pares
            if (numero % 2 == 0) { // Verificamos si el número actual es par (el resto de la división por 2 es 0)
                System.out.println(numero); // Si es par, lo imprimimos en la consola
               
            }
            numero++; // Incrementamos el número para evaluar el siguiente
            contador++; // Incrementamos el contador de números pares impresos
        }
    }
}