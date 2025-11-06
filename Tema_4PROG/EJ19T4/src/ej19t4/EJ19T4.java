package ej19t4;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class EJ19T4 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
        System.out.println("Porfavor Introduca un dia de la semana: "); //Preguntamos el numero en pantalla
        String dia = scanner.nextLine(); // Usamos un string con scanner
        
    
        
        switch (dia){ //Creamos un switch que almacene todos los dias
            // Estos casos almacenan dos posibilidades, por si se escribe en minuscula
        case "Lunes", "lunes" -> System.out.println("Estamos a Lunes, el Primer dia de la semana!"); 
        case "Martes", "martes" -> System.out.println("Estamos a Martes, el Segundo dia de la semana");
        case "Miercoles", "miercoles" -> System.out.println("Estamos a Miercoles, el Tercero dia de la semana");
        case "Jueves", "jueves" -> System.out.println("Estamos a Jueves, el Cuarto dia de la semana");
        case "Viernes", "viernes" -> System.out.println("Estamos a Viernes, el Quinto dia de la semana!");
        case "Sabado", "sabado" -> System.out.println("Estamos a Sabado, el Sexto dia de la semana");
        case "Domingo", "domingo" -> System.out.println("Estamos a Domingo, el Septimo dia de la semana");
        
        default -> System.out.println("Ese no es un día válido."); //Si no introduce un dia existente o lo inventa
    }
   
    }
}