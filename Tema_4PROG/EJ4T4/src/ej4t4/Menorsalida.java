package ej4t4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Menorsalida {
     public static void orden(int num1, int num2, int num3) {
        int menor = num1;
        
        if (num2 < menor) {
        menor = num2;
  }
        if (num3 < menor) {
        menor = num3;
  }
        System.out.println("El numero mas pequenio es: " + menor );
}
            
    }


