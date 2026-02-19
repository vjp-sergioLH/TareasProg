package ej2t9;

/**
 *
 * @author Sergio Lopez Hdez
 */
public class EJ2T9 {

    public static void main(String[] args) {
        String texto = "Java";

        // Bucle para recorrer la cadena entera
        for (int i = 0; i < texto.length(); i++) {
            // charAt(i) obtiene el carácter en la posición i, eso va revelando cada caracter
            char caracter = texto.charAt(i);
            System.out.println("Caracter " + i + ": " + caracter);
        }
    }
}
