/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4t6;

/**
 *
 * @author alumno
 */
public class Perros extends Canidos {
    public Perros(){
        super();
    }
    
    public Perros(String nombre, int edad, float peso){
        super(nombre, edad, peso);
    }
    
    @Override
    public String sonidoAnimal(){
        return "EL perro tiene de sonido el Ladrido";
    }
    @Override
    public String tipoAlimentacion(){
        return "El perro es Carnivoro";
    }
    @Override
    public String tipoHabitat(){
        return "El perro es Domestico"; 
    }
    @Override
    public String nombreCientifico(){
        return "El nombre cientifico del perro es: Canis lupus familiaris";
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
    
