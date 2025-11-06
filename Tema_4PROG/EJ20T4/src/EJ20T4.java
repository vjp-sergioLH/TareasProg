
import java.util.Scanner;

public class EJ20T4 {

/**
 *
 * @author Sergio
 */
    // Constantes para las almacenar las respuestas correctas
    private static final String C_España = "Madrid";
    private static final String Descubre_america = "Colón";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota = 0;

        // Mostrar el encabezado del examen
        System.out.println("- - Examen de cultura genral OBLIGATORIO- -");

        // Se realiza la primera pregunta y se evalua la respuesta
        if (preguntaC_España(scanner)) {
            nota += 5; // Sumamos puntos si la respuesta es correcta
        }

        // Se realiza la segunda pregunta y se evalua la respuesta
        if (preguntaDescubre_america(scanner)) {
            nota += 5; // Sumamos puntos si la respuesta es correcta
        }

        // Mostrar la nota final
        System.out.println("Su nota es: " + nota);

        scanner.close();
    }

    // Realiza la pregunta sobre la capital de España y evalúa la respuesta del usuario.
    public static boolean preguntaCapitalEspaña(Scanner scanner) {
        System.out.print("1ª PREGUNTA: ¿Cuál es la capital de España?: ");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase(C_España)) {
            System.out.println("Muy bien, respuesta correcta.");
            return true;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + C_España);
            return false;
        }
    }

    /**
     * Realiza la pregunta sobre quién descubrió América y evalúa la respuesta del usuario.
     * @param scanner El objeto Scanner para leer la entrada del usuario.
     * @return true si la respuesta es correcta, false en caso contrario.
     */
    public static boolean preguntaDescubre_america(Scanner scanner) {
        System.out.print("2ª PREGUNTA: ¿Quién descubrió América?: ");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase(Descubre_america)) {
            System.out.println("Muy bien, respuesta correcta.");
            return true;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + Descubre_america);
            return false;
        }
    }

    private static boolean preguntaC_España(Scanner scanner) {
        throw new UnsupportedOperationException("No establecida todavia."); 
    }
}