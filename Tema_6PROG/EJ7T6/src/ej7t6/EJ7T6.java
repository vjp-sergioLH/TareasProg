/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7t6;

/**
 *
 * @author alumno
 */
public class EJ7T6 {

    public static void main(String[] args) {
        Televisor Tele = new Televisor();
        Radio radio = new Radio();
        
        Tele.encender();
        System.out.println("");
        System.out.println(Tele.toString());
        System.out.println("");
        Tele.subirVolumen();
        Tele.subirVolumen();
        Tele.subirVolumen();
        System.out.println("");
        System.out.println(Tele.toString());
        System.out.println("");
        Tele.getVolumen();
        System.out.println("");
        Tele.cambiarCanal(0);
        System.out.println("");
        Tele.bajarVolumen();
        System.out.println("");
        Tele.apagar();
        System.out.println("");
        System.out.println(Tele.toString());
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        radio.encender();
        System.out.println("");
        System.out.println(radio.toString());
        System.out.println("");
        radio.subirVolumen();
        System.out.println("");
        radio.subirVolumen();
        System.out.println("");
        radio.subirVolumen();
        System.out.println("");
        radio.getEmisora();
        System.out.println("");
        radio.getVolumen();
        System.out.println("");
        radio.cambiarCanal(0);
        System.out.println("");
        radio.bajarVolumen();
        System.out.println("");
        radio.apagar();
        System.out.println("");
        System.out.println(radio.toString());
    }
    
}
