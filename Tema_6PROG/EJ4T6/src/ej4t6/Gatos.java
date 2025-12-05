/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4t6;

/**
 *
 * @author alumno
 */
public class Gatos extends Felinos{
    public Gatos(){
        super();
    }
    
    public Gatos(String nombre, int edad, float peso){
        super(nombre, edad, peso);
    }
    
    @Override
    public String sonidoAnimal(){
        return "El Gato tiene de sonido el Maullido";
    }
    @Override
    public String tipoAlimentacion(){
        return "El Gato se alimenta de Ratones";
    }
    @Override
    public String tipoHabitat(){
        return "El Gato es domestico"; 
    }
    @Override
    public String nombreCientifico(){
        return "El nombre cientifico del Lobo es: Felis silvestris catus";
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
