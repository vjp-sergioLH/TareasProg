package ej6_t11;

import java.util.Scanner;

public class EJ6_T11 {

/**
 *
 * @author Sergio Lopez Hdez
 */
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Campania campania = new Campania("Campania de donaciones"); // Creamos un objeto campaña para almacenar
        int opcion;

        do {
            System.out.println("Menu de la campania");
            System.out.println("1. Anadir donacion");
            System.out.println("2. Mostrar donaciones");
            System.out.println("3. Mostrar donaciones por nombre");
            System.out.println("4. Mostrar numero de donaciones");
            System.out.println("5. Mostrar total recaudado");
            System.out.println("6. Salir");
            System.out.println("Elige una opcion:");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) { // Y creamos un switch con cases para cada opcion.
                case 1 -> {
                    System.out.println("Nombre del donante:"); // Aqui nos pide y almacena los datos del donante y su donacion en cantidad
                    String nombre = entrada.nextLine();
                    System.out.println("Cantidad donada:");
                    double cantidad = entrada.nextDouble();
                    entrada.nextLine();

                    campania.addDonacion(new Donacion(nombre, cantidad)); //Levandola al apartado del add
                }

                case 2 ->
                    campania.mostrarDonaciones(); //Aqui nos redirecciona

                case 3 -> {
                    System.out.println("Introduce el nombre del donante:"); // Aqui solo nos pide el nombre y lo almacena
                    String nombre = entrada.nextLine();
                    campania.mostrarPorNombre(nombre);
                }

                case 4 ->
                    System.out.println("Numero de donaciones: " + campania.getNumeroDonaciones()); // Cuenta el numero de donaciones y lo muestra por pantalla

                case 5 ->
                    System.out.println("Total recaudado: " + campania.getTotalRecaudado()); // No smuestra cuanto dinero fue recaudado

                case 6 ->
                    System.out.println("Saliendo..."); // Salimos del menu

                default ->
                    System.out.println("Opcion no valida"); // Opcion no elegida dentro de los limites
            }

        } while (opcion != 6);
    }
}