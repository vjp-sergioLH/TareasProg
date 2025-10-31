package ej1t4;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class EJ1T4 {
    public static void num(int numeroNegoPos) {
        if (numeroNegoPos <0){
            System.out.println("El numero es negativo!");
    }else{
                System.out.println("El numero es positivo");
                }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
        int numeroNegoPos;
        System.out.println("Introduce el numero");
        numeroNegoPos = scanner.nextInt();
        num (numeroNegoPos);
    }
    
}
