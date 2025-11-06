package ej18t4;

import java.util.Scanner;
/**
 *
 * @author Sergio
 */
public class EJ18T4 {

    public static void main(String[] args) { 
    String nombre = pedirNombre(args);
        mostrarNombre(nombre);
    }
    public static String pedirNombre(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
        System.out.println("¿Cual es tu nombre?");
        String nombre = scanner.nextLine();
        return nombre;
        
    }
    
    public static void mostrarNombre(String nombre) {
        for (int i = 0; i < 5; i++) {
            System.out.println(nombre);
        }
    }
}
