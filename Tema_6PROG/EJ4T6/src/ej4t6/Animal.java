/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4t6;

/**
 *
 * @author alumno
 */
public abstract class Animal {

    private String nombre;
    private byte edad;
    private float peso;
    
    public Animal(){
        nombre="";
        edad=0;
        peso=0;
    }

    public Animal(String nombre, byte edad, float peso){
        this.nombre= nombre;
        this.edad= edad;
        this.peso= peso;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public abstract String sonidoAnimal();
    public abstract String tipoAlimentacion();
    public abstract String tipoHabitat();
    public abstract String nombreCientifico();
    
    
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + '}';
    }
    
    
}
    