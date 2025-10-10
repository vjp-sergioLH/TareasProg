package ej7t3;

import java.util.Scanner;

public class EJ7T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diasemana ;
        boolean laborable = false ;
                
        System.out.println("Introduce un numero del 1 al 7 que pueda representar un dia de la semana:");
        diasemana = scanner.nextInt();
        System.out.println("1 = Lunes 2 = Martes, 3 = Miercoles, 4 = Jueves, 5 = Viernes, 6 = Sabado y 7 = Domingo ");
        
        switch (diasemana)  {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                 laborable=true;
                  break;
            case 6:
            case 7:
                 laborable=false;

            
        }
        if (diasemana <= 5) {
                    System.out.println("El dia " + diasemana + " es " + laborable + " asi que se puede trabajar");
        } else if (diasemana >= 6) {
                    System.out.println("El dia " + diasemana + " es " +  laborable + " asi que no se puede trabajar");
    }
    
    }
}