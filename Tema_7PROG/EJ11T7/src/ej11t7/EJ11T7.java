/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11t7;

/**
 *
 * @author Sergio
 */
public class EJ11T7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int [10];
        rellenarVector(vector); // Llamamos al metodo rellenarVector
        mostrarVector(vector); // Llamamos a la metodo  mostrarVector
    }
    
    public static void mostrarVector(int[] v) {
        for (int i = 0; i < v.length; i++) { // Creamos este metodo que mostraria el vector.
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    
    public static void rellenarVector(int[] v){
        for (int i = 0; i < v.length; i++) { // Creamos este "for" para que salgan todos los numero en 12 y evitar el fallo del 0 y entre en bucle
            v[i] = 12;
        }
        for (int i = 0; i < v.length; i++) { 
            v[i] = (int)(Math.random() * 10); //Creamos este "for" para que nos de un numero entre el 0 y el 9
            for (int j = 0; j < v.length; j++) { 
                if (v[i] == v[j] && i != j) { // Este apartado nos serviria para que el resultado de la i y la j no sean el mismo y no nos de un bucle entre posicion y numero
                     --i;
                }
            }
        }
        
    }
}
