/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4t6;

/**
 *
 * @author alumno
 */
public abstract class Felinos extends Animal {
    public Felinos(){
        super();
    }
    
    public Felinos(String nombre, byte edad, float peso){
        super(nombre, edad, peso);
    }

    @Override
    public String toString() {
        return "Felinos{" + '}';
    }
    
    
}
