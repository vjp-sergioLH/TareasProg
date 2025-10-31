package ej4t4;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class EJ4T4 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
        int num1, num2, num3;

        //Pedimos los dos numeros
        System.out.println("Introduce el Primer numero");
        num1 = scanner.nextInt();
        System.out.println("Introduce el Segundo numero");
        num2 = scanner.nextInt();
        System.out.println("Introduce el Tercer numero");
        num3 = scanner.nextInt();
        // Ahora los llevara y ordenara
        Menorsalida.orden(num1, num2, num3);

    
    
    }

}