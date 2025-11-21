/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colacarniceria;
import java.util.Scanner;

/**
 *
 * @author Sergio Sánchez Muñoz
 */
public class ColaCarniceria {
    public final static String LETRA_INICIAL = "A";
    public final static String LETRA_FINAL = "C";
    public static int numCompra=0;
    public static int numPedido=0;
    //generamos las variables y las constantes
    public static void main(String[] args) {
        int opcionUsuario;
        do {            
            mostrarMenu(args);
            opcionUsuario=pedirOpcion(args);
            //guardamos la opción deseada por el usuario
            switch (opcionUsuario) {
                case 1:
                    System.out.println("Su tiket de compra es:");
                    generarNumeroEspera(opcionUsuario);
                    System.out.println("Se le atendera en el mostrador:");
                    generarLetraAleatoria(args);
                    break;
                case 2:
                    System.out.println("Su tiket para recoger es:");
                    generarNumeroEspera(opcionUsuario);
                    System.out.println("Se le atendera en el mostrador:");
                    generarLetraAleatoria(args);
                    break;
                case 3,0:
                    //en caso de que sea 3 no diremos nada
                    //tuve que añadir aqui el 0 porque si no daba 2 veces el mensaje de error
                    break;
                default:
                    System.err.println("Introduzca un numero entre el 1 y el 3");
            }
        } while (opcionUsuario!=3);
        //usamos el do while ya que minimo tenemos que usar lo que tenemos dentro 1 vez
        System.out.println("Gracias por comprar con nosotros");
    }
    public static void mostrarMenu(String[] args) {
        System.out.println("Menu carniceria.");
        System.out.println("1. Comprar.");
        System.out.println("2. Recoger pedido.");
        System.out.println("3. Salir");
        //generamos el menu que guie al usuario
    }
    
    public static int pedirOpcion(String[] args) {
        Scanner entradaOpcion = new Scanner(System.in);
        System.out.println("Elige una de las opciones.");
        int opcionUsuario;
        try {
            opcionUsuario = entradaOpcion.nextInt();
        } catch (java.util.InputMismatchException e) {
            opcionUsuario = 0;
            System.err.println("Introduzca un numero entre el 1 y el 3");
            //si el usuario se equivoca y entrega algo que no sea un numero entero
        }
        return opcionUsuario;
        //guardamos y devolvemos el numero dado por el usuario
    }
    public static void generarLetraAleatoria(String[] args) {
        double valorAleatorio = (int) (Math.random() * (67 - 65 + 1) + 65);
        System.out.println((char)valorAleatorio);
        //genera un numero aleatorio entre el 65 y el 67 para imprimirlo como "A", "B" o "C"
    }
    public static void incrementarNumero(int opcionUsuario) {
        if (opcionUsuario==1) {
            numCompra++;
            //en caso de que el usuario puso la opción 1
        }
        if (opcionUsuario==2) {
            numPedido++;
            //en caso de que el usuario puso la opción 2
        }
    }
    public static void generarNumeroEspera(int opcionUsuario) {
        if (opcionUsuario==1) {
            System.out.println("C-"+numCompra);
            //en caso de que el usuario puso la opción 1
        }
        if (opcionUsuario==2) {
            System.out.println("P-" + numPedido);
            //en caso de que el usuario puso la opción 2
        }
         incrementarNumero(opcionUsuario);
         //solicitamos el metodo anterior para incrementar las variables globales
    }
}
