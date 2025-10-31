package ej5t4;

import java.util.Scanner;
import parImpar.parImpar;

public class EJ5T4 {

/**
 *
 * @author Sergio
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
        int num1;

        //Pedimos los dos numeros
        System.out.println("Introduce el Primer numero");
        num1 = scanner.nextInt();
        parImpar.parImpar (num1);
    }
    

}