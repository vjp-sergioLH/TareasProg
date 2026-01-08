/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1t7;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class EJ1T7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] hasta;
        
        hasta = new int[10];
        rellenarVectores(hasta);
        muestraVectores(hasta);
    }
    
    public static void rellenarVectores(int[] hasta) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos a rellenar un array de 10 posiciones");
        for (int i = 0; i < hasta.length; i++) {
            System.out.println("El valor guardado en la posicion "+i);
            hasta[i]=entrada.nextInt();
        }
    }
    
    public static void muestraVectores(int [] hasta) {
        for (int i = 0; i < 10; i++) {
            System.out.println("El valor guardado en la posicion "+i+" es de: "+hasta[i]);
            
        }
    }
    
}

   