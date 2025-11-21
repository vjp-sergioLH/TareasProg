/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15t5;

/**
 *
 * @author Sergio L.H
 */
public class Empleado {
    private String nombre;
    private int salario;
    private Direccion direccion;
    
    public Empleado(){
        nombre="";
        salario=0;
        direccion = new Direccion();
        
    }
    
    public Empleado(String nombre, int salario, String calle, byte numero, String piso, String ciudad){
        this.nombre=nombre;
        this.salario=salario;
        this.direccion=new Direccion(calle, numero, piso, ciudad);
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", direccion=" + direccion.toString() + '}';
    }
    
    
}


