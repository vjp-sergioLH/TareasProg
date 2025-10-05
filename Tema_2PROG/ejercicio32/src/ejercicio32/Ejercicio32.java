package ejercicio32;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Ejercicio32 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int dinero;
        System.out.println("Escribe el dinero que quieres cambiar: ");
        dinero = entrada.nextInt();
        
        int bill50 = dinero /50;
        int bill20 = dinero % 50 / 20;
        int bill10 = dinero % 50 %20 /10;
        int bill5  = dinero % 50 %20 % 10 /5;
        int mon2 = dinero % 50 %20 % 10 % 5 /2;
        int mon1 = dinero % 50 %20 % 10 % 5 % 2 % 1;
        
        System.out.println("Necesitas " + bill50 + " billetes de 50; " +
        bill20 + " billetes de 20, " + bill10 + " billetes de 10, " + bill5 + 
                " billetes de 5" + mon2 + " monedas de 2 euros " + " y " + 
                mon1 + " mondedas de 1 euro");
                
        
        
        // TODO code application logic here
    }
    
}