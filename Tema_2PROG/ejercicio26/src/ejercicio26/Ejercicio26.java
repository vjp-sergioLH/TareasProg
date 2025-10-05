package ejercicio26;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num1;
        System.out.println("Escribe un numero de 4 Cifras ");
        num1 = entrada.nextInt();
        
        int pri = num1 /1000;
        int seg = num1 /100 % 10;
        int ter = (num1 / 10) % 10;
        int cua = num1 % 10;
        
        System.out.println("El primer numero es: " + pri);
        System.out.println("El segundo numero es: " + seg);
        System.out.println("El tercer numero es: " + ter);
        System.out.println("El cuarto numero es: " + cua);

    }
    
}