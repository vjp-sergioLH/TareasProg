    package ej1t5;

/**
 *
 * @author Sergio
 */
public class Bicicleta {
    // atributos
    private String marca;
    private String color;
    private String tipo;
    private int antiguedad;
    private propietario propietario;
    
    //Atributo estatico
    private static int contadorBicicleta = 0;

        public static int getContadorBicicleta() {
            return contadorBicicleta;
        }

        public static void setContadorBicicleta(int contadorBicicleta) {
            Bicicleta.contadorBicicleta = contadorBicicleta;
        }
        
        public static void aumentarContadorBicicleta(){
            contadorBicicleta++;
    }
    
    // constructores
    // lo veremos mas adelante
    public Bicicleta(){
        marca="";
        color="";
        tipo="";
        antiguedad = 0;
        propietario=new propietario();
        aumentarContadorBicicleta();
    }
    
    public Bicicleta(String m, String c, String t, int a, String nomPropietario, int edadPropietario){
        marca="m";
        color="c";
        tipo="t";
        antiguedad=a;
        propietario=new propietario(nomPropietario, edadPropietario);
        aumentarContadorBicicleta();
    } 
    
    public Bicicleta (String m){
        marca=m;
        color="";
        tipo="";
        antiguedad=0;
        au
    }
    
    //getters/setters
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String m){
        marca = m;
    }
    public String getColor(){
        return marca;
    }
    
    public void setColor(String c){
        color = c;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String t){
        tipo = t;
    }
    
    public int getAntiguedad(){
        return antiguedad;
    }
    public void setAntiguedad(int a){
        antiguedad = a;
    }
    //otros metodos
    public void mostrarAntiguedad(){
        if (antiguedad > 10) {
            System.out.println("La bici es antigua");
        }else{
            System.out.println("La bici es nueva");
        }
    }
    //mostrar
    public void mostrarBicicleta(){
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Tipo: " + tipo);
        System.out.println("Antiguedad: " + antiguedad);
        System.out.println(propietario.toString());
     
    }

    public propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Bicicleta{" 
                + "marca=" + marca 
                + ", color=" + color 
                + ", tipo=" + tipo 
                + ", antiguedad=" + antiguedad
                + ", propietario=" + propietario
                + '}';
    }

        
    }
    
