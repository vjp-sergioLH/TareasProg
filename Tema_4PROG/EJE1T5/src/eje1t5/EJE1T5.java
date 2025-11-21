package eje1t5;

/**
 *
 * @author Sergio
 */
public class EJE1T5 {


    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.setMarca("Nissan");
        coche1.setColor("Azul");
        coche1.setModelo("GTR");
        coche1.setVelocidad(6);
        
        Coche coche2 = new Coche();
        coche2.setMarca("Ford");
        coche2.setColor("Negro");
        coche2.setModelo("Mustang 2013");
        coche2.setVelocidad(12);
        
        coche1.mostrarBicicleta();
        System.out.println("");
        coche2.mostrarBicicleta();
        System.out.println("");
        
        System.out.println("");
        coche1.mostrarVelocidad();
        coche2.mostrarAntiguedad();
    
    }
    
}
