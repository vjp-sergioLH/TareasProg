/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2t7;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class EJ2T7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] aqui;
        
        aqui = new int[7];
        rellenarVectores(aqui);
        muestraVectores(aqui);
    }
    
    public static void rellenarVectores(int[] aqui) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos a rellenar un array de 10 posiciones");
        for (int i = 0; i < aqui.length; i++) {
            System.out.println("El valor guardado en la posicion "+i);
            aqui[i]=entrada.nextInt();
        }
    }
    
    public static void muestraVectores(int [] aqui) {
        for (int i = 0; i < 7; i++) {
            System.out.println("El valor guardado en la posicion "+i+" es de: "+aqui[i]);
            
        }
    }
    
    public static void intercambiarVectores(String[] args) {
        
    }
}
