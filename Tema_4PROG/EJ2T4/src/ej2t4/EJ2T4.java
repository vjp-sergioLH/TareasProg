package ej2t4;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class EJ2T4 {

     public static void sum(int num1, int num2) {
            System.out.println("La operacion que se realizo fue una suma, y su resultado es. . . " +(num1+num2));
        }
    public static void multi(int num1, int num2) {
            System.out.println("La operacion que se realizo fue una multiplicacion, y su resultado es. . . " +(num1*num2));
    }     
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
    int num1;
    int num2;
    //Pedimos los dos numeros
    System.out.println("Introduce el Primer numero");
    num1 = scanner.nextInt();
    System.out.println("Introduce el Segundo numero");
    // Depende la opcion que salga, nos lleva a una operacion o otra
    num2 = scanner.nextInt();
            if (num1 >10){
            multi (num1, num2);
    }else{
            sum (num1, num2);
       }
    }
    
    
    }
   