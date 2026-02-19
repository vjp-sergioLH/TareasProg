package ej5t9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EJ5T9 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
        System.out.println("Porfavor Introduca un dia de la semana: "); //Preguntamos el numero en pantalla
        String dia = scanner.nextLine(); // Usamos un string con scanner
        
        String [] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        
         for (int i = 0; i < 7; i++) {
             if (dia.equals(dias[i])) {
                 System.out.println(dia + " es el " + (i+1) + " dia Mde la semana");
             }
         }
            
    }
}

