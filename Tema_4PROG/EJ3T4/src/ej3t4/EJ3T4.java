package ej3t4;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class EJ3T4 {

    public static void orden(int num1, int num2, int num3) {
        int mayor = num1;
        
        if (num2 > mayor) {
        mayor = num2;
  }
        if (num3 > mayor) {
        mayor = num3;
  }
        System.out.println("El mayor numero es: " + mayor );
}
            
 
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
        orden (num1, num2, num3);

    
    
    }

}