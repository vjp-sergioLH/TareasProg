package carniceria;

/**
 *
 * @author Sergio
 */
import java.util.Scanner;
public class Carniceria{
    
        public static void main(String[] args) {
        mostrarMenu(); // Creamos otro public static para el menu, enviando la variable global
        char inicial = 65; // Para determinar el principio de las opciones (A)
        char finals = 67; // Para determinar el final de las opciones (C)
        String letrasAscii = "65 66 67"; // Para determinar el rango de opciones
        int rangoInicial = (int) inicial ;
        int rangoFinal = (int) finals; // En estos dos indicamos a que pertenece cada char
        
    }
    
        public static void mostrarMenu(){
        Scanner scanner = new Scanner(System.in);
        int pedirOpcion = 0; //Generamos la global de pedir una opcion
        int incrementarNumeroCompra = 1; // Generamos la variable global de incrementar el numero de compra
        int incrementarNumeroPedido = 1; // Generamos la variable global de incrementar el numero de pedido
    
        do {
            System.out.println(" Menú Carnicería "); // Generamos varios print para ver que opcion escoje el cliente
            System.out.println("1. Comprar");
            System.out.println("2. Recoger pedido");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            switch(pedirOpcion) {
            case 1:
                ++incrementarNumeroCompra; // Logica para subirle un numero a las compras
                break;
            case 2:
                ++incrementarNumeroPedido; // Logica para subirle un numero a los pedidos
                break;
            case 3:
                System.out.println("Saliendo del programa..."); // Logica para no continuar la compra
                break;
            default:
                System.out.println("Opción no válida."); // Logica para volver a introducir una opcion por haber fallado
                return;
            }
         
           
            
          }
     }
        
}