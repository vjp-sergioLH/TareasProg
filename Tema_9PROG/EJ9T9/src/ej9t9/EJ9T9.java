package ej9t9;

/**
 *
 * @author Sergio Lopez Hdez
 */
import java.util.Scanner;
public class EJ9T9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre de usuario: ");
        String usuario = sc.nextLine(); //Le pedimos por pantalla que nos diga su nombre de usuario

        System.out.print("Ingrese su contrasena: ");
        String contrasena = sc.nextLine();// Le pedimos por pantalla que nos diga su contraseña

        boolean esValida = true; //De por si el boolean de que es valida esta en true

        // Verificamos con este metodo que la contrasena no use menos de 6 caracteres, si es asi, imprimira el siguiente mensaje por pantalla
        if (contrasena.length() < 6) {
            System.out.println("La contrasena debe tener al menos 6 caracteres, intentelo denuevo.");
            esValida = false; //Podemos ver que al ser una contraseña con menos de los 6 caracteres, el valor del boolean pasa a ser false, dando a ver que no se cumplio la regla
        }

        // Verificamos que la contraseña tenga por lo menos dos digitos
        int contadorDigitos = 0;
        for (int i = 0; i < contrasena.length(); i++) {
            if (Character.isDigit(contrasena.charAt(i))) {
                contadorDigitos++;
            }
        }
        // Y si es el caso de que tenga menos de dos, nos dara el error por pantalla.
        if (contadorDigitos < 2) {
            System.out.println("La contrasena debe contener al menos 2 dígitos, intentelo denuevo");
            esValida = false;
        }

        // Verificamos que el nombre del usuario no esta en la contraseña
        if (contrasena.contains(usuario)) {
            System.out.println("La contraseña no puede contener el nombre de usuario, intentelo denuevo");
            esValida = false;
        }

        // Vemos que nos determine si es valida o no con los procesos anteriores
        if (esValida) {
            System.out.println("La contraseña es valida!");
        } else {
            System.out.println("La contraseña no es valida, porfavor vuelva a intentarlo");
        }

        sc.close();
    }
}
