package ej3t9;

/**
 *
 * @author Sergio Lopez Hdez
 */
public class EJ3T9 {

    public static void main(String[] args) {
        String texto = "Hola Mundo";

        // Convertir String a char[]
        char[] caracteres = texto.toCharArray();

        // Mostrar caracter por caracter
        for (char c : caracteres) {
            System.out.println(c); // Uso println para línea nueva por caracter
        }
    }
}