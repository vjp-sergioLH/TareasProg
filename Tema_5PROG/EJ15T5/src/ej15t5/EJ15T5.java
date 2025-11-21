/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej15t5;

/**
 *
 * @author Sergio L.H
 */
public class EJ15T5 {

    public static void main(String[] args) {
        Direccion direccion1 = new Direccion();
        direccion1.setCalle("Calle Fuentepal");
        direccion1.setNumero(3);
        direccion1.setCiudad("Navalmoral");
        direccion1.setPiso("Superior A");
        
        Direccion direccion2 = new Direccion();
        direccion2.setCalle("Calle Triquiñuela");
        direccion2.setNumero(8);
        direccion2.setCiudad("Palencia");
        direccion2.setPiso("Inferior C");
        
        Direccion direccion3 = new Direccion();
        direccion3.setCalle("Calle Pachequillo");
        direccion3.setNumero(10);
        direccion3.setCiudad("Riosobrao");
        direccion3.setPiso("B (Puerta Principal)");
        
        Empleado empleado1 = new Empleado();
        empleado1.setDireccion(direccion1);
        empleado1.setNombre("Fran");
        empleado1.setSalario(4500);
        
        Empleado empleado2 = new Empleado();
        empleado2.setDireccion(direccion2);
        empleado2.setNombre("Marcos");
        empleado2.setSalario(7000);
        
        Empleado empleado3 = new Empleado();
        empleado3.setDireccion(direccion3);
        empleado3.setNombre("Maria");
        empleado3.setSalario(8970);
        
        System.out.println("");
        
        empleado1.toString();
        direccion1.toString();
        System.out.println(direccion1.toString());
        System.out.println(empleado1.toString());
        System.out.println("");
        empleado2.toString();
        direccion2.toString();
        System.out.println(direccion2.toString());
        System.out.println(empleado2.toString());
        System.out.println("");
        empleado3.toString();
        direccion3.toString();
        System.out.println(direccion3.toString());
        System.out.println(empleado3.toString());
        
        System.out.println("");
    }
    
}
