package ej5t7;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class EJ5T7 {

    public static void rellenarArray(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a rellenar un array de 4x2");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Introduce un valor para la posicion [" + i + j + "] :");
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public static void mostrarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" [" + i + j + "]-->" + array[i][j]);
            }
            System.out.print("\n");
        }
    }
    
    public static void mayorDeArray(int[][] array) {
        int may =-2147483648;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++)
          if (array[i] [j] > may) {
            may = array[i] [j];
           }
            
        }
        System.out.println(may);
    }
    
    public static void menorDeArray(int[][] array) {
        int men = 2147483647;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++)
          if (array[i] [j] < men) {
            men = array[i] [j];
           }
            
        }
        System.out.println(men);
    }
    
    
    public static void sumaArray(int[][] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                suma = suma + array[i] [j];
            }
                System.out.println(suma);
        }
        System.out.println(suma);
    }

    public static void main(String[] args) {
        int[][] array = new int[4][2];
        rellenarArray(array);
        mostrarArray(array);
        mayorDeArray(array);
        menorDeArray(array);
        sumaArray(array);
    }
}