package ej4t3;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class EJ4T3 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que introduzca un número
        System.out.print("Por favor, introduzca el primer numero: ");
        double numero1 = scanner.nextDouble(); // Permite números con decimales
        
        System.out.print("Por favor, introduzca el segundo numero: ");
        double numero2 = scanner.nextDouble();
        
        System.out.print("Por favor, introduzca el tercer numero: ");
        double numero3 = scanner.nextDouble();

        // Decide quien es el numero mayor
        double menor; 
        
       if (numero1 <= numero2 && numero1 <= numero3) {
            menor = numero1;
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            menor = numero2;
        } else {
            menor = numero3;
        }

        // Mostrar el resultado
        System.out.println("El número menor de los introducidos es el " + menor);

        scanner.close();
    }
    
}