/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4t6;

/**
 *
 * @author alumno
 */
public class EJ4T6 {


    public static void main(String[] args) {
        Perros perro1 = new Perros("Lucas", 5, 7);
        Animal perro2 = new Perros("Pablo", 6, 7);
        Gatos gato1 = new Gatos("Mark", 7, 6);
        Animal gato2 = new Perros("Pelusa", 10, 10);
        Lobos lobo1 = new Lobos("Shawn", 9, 10);
        Animal lobo2 = new Perros("Blank", 7, 7);
        Leones leon1 = new Leones("Blizzard", 2,7);
        Animal leon2 = new Perros("Rayo", 1, 3);
        
        System.out.println(perro1.toString());
        System.out.println("");
        System.out.println(perro2.toString());
        System.out.println("");
        System.out.println(gato1.toString());
        System.out.println("");
        System.out.println(gato2.toString());
        System.out.println("");
        System.out.println(lobo1.toString());
        System.out.println("");
        System.out.println(lobo2.toString());
        System.out.println("");
        System.out.println(leon1.toString());
        System.out.println("");
        System.out.println(leon2.toString());
        System.out.println("");
        
    }
    
}
