/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4t6;

/**
 *
 * @author alumno
 */
public class Lobos extends Perros {
    public Lobos(){
        super();
    }
    
    public Lobos(String nombre, int edad, float peso){
        super(nombre, edad, peso);
    }
    
    @Override
    public String sonidoAnimal(){
        return "El perro tiene de sonido el Aullido";
    }
    @Override
    public String tipoAlimentacion(){
        return "El Lobo es Carnivoro";
    }
    @Override
    public String tipoHabitat(){
        return "El Lobo vive en el Bosque"; 
    }
    @Override
    public String nombreCientifico(){
        return "El nombre cientifico del Lobo es: Canis lupus";
    }
    @Override
    public String toString() {
        return super.toString() + "\n" +
                sonidoAnimal() + "\n" 
                + tipoAlimentacion() + "\n" 
                + tipoHabitat() + "\n"
                + nombreCientifico();
}
}
