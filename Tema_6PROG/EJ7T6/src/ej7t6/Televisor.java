/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7t6;

/**
 *
 * @author alumno
 */
public class Televisor implements ControlRemoto{
    
    private boolean encendido;
    private int canal;
    private int volumen;
    
    public Televisor(){
    encendido = false;
    canal=1;
    volumen=10;
    
}
    
    public Televisor(boolean encendido, int canal, int volumen){
    this.encendido = encendido;
    this.canal=canal;
    this.volumen=volumen;
    
    
    
}

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    @Override
    public void apagar(){
        if (encendido == true) {
            System.out.println("Se apagara en la TV en 10 Segundos. . .");
        }
    }
    @Override
    public void encender(){
        if (encendido == false) {
            System.out.println(getCanal());
            encendido = true;
        }
    }
    @Override
    public void bajarVolumen(){
        if (encendido == true) {
            volumen -= 1;
            System.out.println(getVolumen());
        }
    }
    @Override
    public void subirVolumen(){
        if (encendido == true) {
            volumen += 1;
            System.out.println(getVolumen());
        }
    }
    @Override
    public void cambiarCanal(float canal){
        if (encendido == true) {
            this.canal = (int) canal;
            System.out.println(getCanal());
        }
    }
    
    @Override
    public String toString() {
        return "Televisor{" + "encendido=" + encendido + ", canal=" + canal + ", volumen=" + volumen + '}';
    }
    
    
}

    