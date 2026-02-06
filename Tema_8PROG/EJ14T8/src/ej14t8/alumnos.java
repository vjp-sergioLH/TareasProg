/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14t8;

/**
 *
 * @author Sergio Lopez Hdez
 */
public class alumnos {
    private String nombre;
    private double notaMedia;

    // Constructores
    
    //Por defecto
    public alumnos() {
        this.nombre = "";
        this.notaMedia = 0.0;
    }
    
    //Parametrizado
    public alumnos(String nombre, double notaMedia) {
        this.nombre = nombre;
        this.notaMedia = notaMedia;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    // Mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Nota media: " + notaMedia);
    }
}
