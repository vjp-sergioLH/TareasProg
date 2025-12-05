package ej7t6;

/**
 *
 * @author alumno
 */
public class Radio implements ControlRemoto{
    
    private boolean encendido;
    private float emisora;
    private int volumen;
    
    public Radio(){
    encendido = false;
    emisora=8F;
    volumen=15;
    
}
    
    public Radio(boolean encendido, float emisora, int volumen){
    this.encendido = encendido;
    this.emisora=emisora;
    this.volumen=volumen;
    
    
    
}

    public float getEmisora() {
        return emisora;
    }

    public void setEmisora(float emisora) {
        this.emisora = emisora;
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
            System.out.println(getEmisora());
            encendido = true;
            System.out.println("Has encendido la Radio");
        }
    }
    @Override
    public void bajarVolumen(){
        if (encendido == true) {
            volumen -= 5;
            System.out.println(getVolumen());
            System.out.println("Has bajado el volumen a: " + volumen);
        }
    }
    @Override
    public void subirVolumen(){
        if (encendido == true) {
            volumen += 5;
            System.out.println(getVolumen());
            System.out.println("Has subido el volumen a: " + volumen);
        }
    }
    @Override
    public void cambiarCanal(float emisora){
        if (encendido == true) {
            this.emisora = (int) emisora;
            System.out.println(getEmisora());
            System.out.println("Has cambiado la emisora a: " + emisora);
        }
    }
    
    @Override
    public String toString() {
        return "Televisor{" + "encendido=" + encendido + ", emisora=" + emisora + ", volumen=" + volumen + '}';
    }
    
    
}
