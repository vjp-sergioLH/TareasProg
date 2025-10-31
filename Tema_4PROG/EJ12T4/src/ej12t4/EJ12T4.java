package ej12t4;
import java.util.Scanner;
/**
 *
 * @author Sergio
 */
public class EJ12T4 {
    public static int contrasenia(int pedirNumero) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
            System.out.println("Introduce tu contraseña: ");
            pedirNumero = scanner.nextInt();
            return pedirNumero;
    }
    public static boolean contrasenio(int pedirNumero) {
        boolean pedirContrasenia=false;
        if (pedirNumero == 1234) {
             pedirContrasenia = true;
   }
        return pedirContrasenia;
  }
    
    public static void main(String[] args) {
        int pedirNumero;
        boolean enviar ;
        do {            
         pedirNumero = contrasenia(0);
         enviar = contrasenio(pedirNumero);
        } while { (ped);
        
     }
}
