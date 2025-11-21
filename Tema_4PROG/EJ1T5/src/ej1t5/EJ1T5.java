package ej1t5;

/**
 *
 * @author Sergio
 */
public class EJ1T5 {

    public static void main(String[] args) {
        Bicicleta bici1 = new Bicicleta();
        Bicicleta.aumentarContadorBicicleta();
        bici1.setMarca("Orbea");
        bici1.setColor("Azul");
        bici1.setTipo("Montania");
        bici1.setAntiguedad(6);
        
        Bicicleta bici2 = new Bicicleta("Canondale", "Roja", "Carretera" 12);
      //  bici2.setMarca("Canondale");
      //  bici2.setColor("Roja");
      //  bici2.setTipo("Carretera");
       // bici2.setAntiguedad(12);
       
       //Creamos bici3 con el segundo constructor parametrizado
        Bicicleta bici3 = new Bicicleta("Mitical")
        bici1.setMarca("Mitical");
        bici1.setColor("Negra");
        bici1.setTipo("Montaña");
        bici1.setAntiguedad(3);
        
        System.out.println("");
        System.out.println("Numero de Bicicletas: " + Bicicleta.getContadorBicicleta());
        
        bici1.mostrarBicicleta();
        System.out.println("");
        System.out.println(bici2.toString());
        System.out.println("");
        bici3.mostrarBicicleta();
        System.out.println("");
        
        System.out.println("");
        bici1.mostrarAntiguedad();
        bici2.mostrarAntiguedad();
    }
    
}
