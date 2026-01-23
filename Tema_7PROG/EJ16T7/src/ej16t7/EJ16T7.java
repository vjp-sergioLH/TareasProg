package ej16t7;

import java.util.Scanner;

/**
 *
 * @author Sergio Lopez Hdez
 */
public class EJ16T7 {

    
        public static void menu(String[] args) {
        int menu;
        System.out.println("===[1 - Rellenar las notas de los alumnos]===");
        System.out.println(" ");
        System.out.println("===[2 - Mostrar las notas]===");
        System.out.println(" ");
        System.out.println("===[3 - El mejor alumno de la clase]===");
        System.out.println(" ");
        System.out.println("===[4 - Alumno con mas suspensos]===");
        System.out.println(" ");
        System.out.println("===[5 - Asignatura mas complicada]===");
        System.out.println(" ");
        System.out.println("===[6 - Salir]===");
        System.out.println(" ");
        
        System.out.println("Para elegir escribe un numero del 1 al 5, pero si quieres no hacer ninguna operacion simplemente presione 6");
        
    }
        
        public static void seleccionMenu(int menu) {
        switch (menu) {
            case 1:
                System.out.println(rellenarNotas(array));
                break;
                
            case 2:
                System.out.println(mostrarNotas(array));
                break;
                
            case 3:
                System.out.println(mejorAlumnoClase(array));
                break;
                
            case 4:
                System.out.println(peorAlumnoClase(array) );
                break;
                
            case 5:
                System.out.println(asignaturaMasComplicada(array) );
                break;
                
            case 6:
                System.out.println("Mucho gusto haberte sido de ayuda aunque solo haya sido un poco, hasta mas ver. . .");
                break;
            
            
        }
    }
        
    public static void rellenarNotas(int [][] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a rellenar un array de 4x2");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Introduce un valor para la posicion [" + i + j + "] :");
                array[i][j] = scanner.nextInt();
            }
        }
    }
    
    public static void mostrarNotas(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a mostrar las temperaturas actuales");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Introduce un valor para la posicion [" + i + j + "] :");
                array[i][j] = scanner.nextInt();
            }
        }
    }
    
    
    public static void mejorAlumnoClase(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a dejaros las temperaturas de este dia: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Introduce un valor para la posicion [" + i + j + "] :");
                array[i][j] = scanner.nextInt();
            }
        }
    }
    
    public static void peorAlumnoClase(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" [" + i + j + "]-->" + array[i][j]);
            }
            System.out.print("\n");
        }
    
    }
    
    public static void asignaturaMasComplicada(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" [" + i + j + "]-->" + array[i][j]);
            }
            System.out.print("\n");
        }
    
    }
    public static void main(String[] args) {
        int[6][4] numeros = crearArray();
    }
    
}
