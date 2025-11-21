/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1t5;

/**
 *
 * @author alumno
 */
public class propietario {
    
    //Atributos
    private String nombre;
    private int edad;
    //Constructores
    public propietario(){
        this.nombre ="";
        this.edad=0;
    }
    
    public propietario(String nombre, int edad){
        this.nombre =nombre;
        this.edad=edad;
    }
    //Getteres/Setters
    
    //Mostrar/toString

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Mostrar/toString

    @Override
    public String toString() {
        return "propietario{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
}
