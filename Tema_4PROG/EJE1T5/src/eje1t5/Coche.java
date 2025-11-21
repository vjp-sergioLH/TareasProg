package eje1t5;

/**
 *
 * @author Sergio
 */
public class Coche {
    private String marca;
    private String color;
    private String modelo;
    private int velocidad;
    private boolean motorEncendido = false;
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String m){
        marca = m;
    }
    public String getColor(){
        return color;
    }
    
    public void setColor(String c){
        color = c;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String mo){
        modelo = mo;
    }
    
    public int getVelocidad(){
        return velocidad;
    }
    public void setVelocidad(int v){
        velocidad = v;
    }
    
    public void arrancarCoche(){
        motorEncendido = true;
        velocidad = 10;
        
        System.out.println("El coche arranco");
    }
    
    public void apagarCoche(){
        motorEncendido = false;
        velocidad = 0;
        
        System.out.println("El coche se apago");
        
       
    }
    
    
    //mostrar
    public void mostrarBicicleta(){
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Arrancar coche: " + motorEncendido);
        System.out.println("Apagar Coche: " + motorEncendido);
        
        
        
    }

}
