package ej17t7;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Sergio Lopez Hernandez
 */
public class EJ17T7 {

// Crearmos un array de 10 numeros aleatorios entre el 0 y 9
    public static int[] crearArray() {

        // Creamos el array con sus 10 posiciones
        int[] numeros = new int[10];

        // Creamos un bucle para rellenar el array
        for (int i = 0; i < 10; i++) {

            // Usamos un Math.random() ya que nos genera numeros entre 0 y 1
            // Y Al multiplicar por 10 obtenemos números entre 0 y 9
            numeros[i] = (int)(Math.random() * 10);
        }

        return numeros;
    }

    // Mostrar nuestro array por pantalla
    public static void mostrarArray(int[] array) {

        // Recorremos todo el array y mostramos cada número
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    // Ordenamos nuestro array de mayor a menor
    public static void ordenarArray(int[] array) {

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                // Si el número que tenemos en la izquierda es menor, se intercambian
                if (array[i] < array[j]) { // Usamos el metodo de la burbuja para intercambiar posiciones
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
    }

    // Metodo Main/Principal
    public static void main(String[] args) {
        // Creamos nuestro array
        int[] numeros = crearArray();

        // Mostramos el array original
        System.out.println("Array original:");
        mostrarArray(numeros);

        // Ordenamos nuestro array para prepararlo para el siguiente paso.
        ordenarArray(numeros);

        // Y ahora mostramos el array ya ordenado
        System.out.println("Array ordenado de mayor a menor:");
        mostrarArray(numeros);
    }
}

