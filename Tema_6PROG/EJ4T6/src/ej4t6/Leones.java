/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4t6;

/**
 *
 * @author alumno
 */
public abstract class Leones extends Felinos {
    public Leones(){
        super();
    }
    
    public Leones(String nombre, byte edad, float peso){
        super(nombre, edad, peso);
    }
    
    @Override
    public String sonidoAnimal(){
        return "El Leon tiene de sonido el Rugido";
    }
    @Override
    public String tipoAlimentacion(){
        return "El Leon es Carnivoro";
    }
    @Override
    public String tipoHabitat(){
        return "El Lobo vive en la Sabana"; 
    }
    @Override
    public String nombreCientifico(){
        return "El nombre cientifico del Lobo es: Panthera leo";
    }
}
