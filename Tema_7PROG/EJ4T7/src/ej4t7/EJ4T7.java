
package ej4t7;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class EJ4T7 {

    public static void rellenarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) { //Preparamos las filas y las columnas con la "i" y la "j"
            for (int j = 0; j < array[i].length; j++) {
                // Math.Random busca un Número aleatorio entre 100 y 200
                array[i][j] = (int)(Math.random() * 101) + 100;
            }
        }
    }

    public static void mostrarNumerosPares(int[][] array) {
        System.out.println("Numeros pares del array:");
        for (int i = 0; i < array.length; i++) { // Creamos lo mismo pero para mostrar los numeros pares
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    System.out.println("[" + i + "][" + j + "] --> " + array[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = new int[4][3]; //Array de las 4 filas y las 3 columnas
        rellenarArray(array); //Guardamos ambos metodos en el array paara que pueda operar
        mostrarNumerosPares(array);
    }
}
