package ej14t7;

import java.util.Scanner;

/**
 *
 * @author Sergio Lopez
 */
public class EJ14T7 {
    
    public static void menu(String[] args) {
        int menu;
        System.out.println("===[1 - Rellenar las temperaturas]===");
        System.out.println(" ");
        System.out.println("===[2 - Mostrar las temperaturas]===");
        System.out.println(" ");
        System.out.println("===[3 - Visualizar la altura media del mes]===");
        System.out.println(" ");
        System.out.println("===[4 - Dia o dias mas calurosos del mes]===");
        System.out.println(" ");
        System.out.println("===[5 - Salir]===");
        System.out.println(" ");
        
        System.out.println("Para elegir escribe un numero del 1 al 4, pero si quieres no hacer ninguna operacion simplemente presione 5");
        
    }
    
    public static void seleccionMenu(int menu) {
        switch (menu) {
            case 1:
                System.out.println(rellenarTemperaturas(array));
                break;
                
            case 2:
                System.out.println(mostrarTemperaturas(array));
                break;
                
            case 3:
                System.out.println(visualizarTemperaturas(array));
                break;
                
            case 4:
                System.out.println(diasConMasTemperatura(array) );
                break;
                
            case 5:
                System.out.println("Mucho gusto haberte sido de ayuda aunque solo haya sido un poco, hasta mas ver. . .");
                break;
            
            
        }
    }
    
    public static void rellenarTemperaturas(int [][] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a rellenar un array de 4x2");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Introduce un valor para la posicion [" + i + j + "] :");
                array[i][j] = scanner.nextInt();
            }
        }
    }
    
    public static void mostrarTemperaturas(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a mostrar las temperaturas actuales");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Introduce un valor para la posicion [" + i + j + "] :");
                array[i][j] = scanner.nextInt();
            }
        }
    }
    
    
    public static void visualizarTemperaturas(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a dejaros las temperaturas de este dia: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Introduce un valor para la posicion [" + i + j + "] :");
                array[i][j] = scanner.nextInt();
            }
        }
    }
    
    public static void diasConMasTemperatura(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" [" + i + j + "]-->" + array[i][j]);
            }
            System.out.print("\n");
        }
    
    }
    
    public static void main(String[] args) {
        int [] [] array = new int[4] [4]; 
        rellenarTemperaturas(array);
        mostrarTemperaturas(array);
        visualizarTemperaturas(array);
        diasConMasTemperatura(array);
        sumaArray(array);
    }
    
}
