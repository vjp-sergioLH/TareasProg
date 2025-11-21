/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej15t5;

/**
 *
 * @author Sergio L.H
 */
public class Direccion {
    
    private String calle;
    private int numero;
    private String piso;
    private String ciudad;

    public Direccion(){
        calle="";
        numero=0;
        piso="";
        ciudad="";
        
    }
    
    public Direccion(String calle, int numero, String piso, String ciudad){
        this.calle=calle;
        this.numero=numero;
        this.piso=piso;
        this.ciudad=ciudad;
    }
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.ciudad = Ciudad;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", piso=" + piso + ", ciudad=" + ciudad + '}';
    }
    
    
}
