/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12t8;

/**
 *
 * @author Sergio Lopez Hdez
 */
import java.util.Scanner;

public class EJ12T8 { // 11 y 12 juntos

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Creamos dos objetos mueble.
        mueble mueble1 = new mueble(); // Uno con el constructor por defecto
        mueble mueble2 = new mueble(150, "Mesa de comedor"); // Y el otro con el constructor parametrizado

        //Cambiamos la descripción del mueble usando los setters
        mueble1.setDescripcion("Silla de oficina");
        mueble1.setPrecio(75);

        //Mostramos la información de los muebles
        System.out.println("INFORMACIÓN DE LOS MUEBLES");
        mueble1.mostrarInfo();
        mueble2.mostrarInfo();

        //Creamos el vector de los muebles
        mueble[] muebles = new mueble[4];

        int opcion;
        //Creamos un menu con bucles para que elija los opciones, hasta que cuando se quiera salir, le de al 4 y finalizar el bucle
        do {
            System.out.println("\nMENU");
            System.out.println("1. Rellenar muebles");
            System.out.println("2. Mostrar muebles");
            System.out.println("3. Mostrar muebles por precio");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            // Bucle del menu
            switch (opcion) {
                case 1:
                    for (int i = 0; i < muebles.length; i++) {
                        System.out.println("\nMUEBLE " + (i + 1));

                        System.out.print("Descripcion: ");
                        String descripcion = sc.nextLine();

                        System.out.print("Precio: ");
                        double precio = sc.nextDouble();
                        sc.nextLine();

                        muebles[i] = new mueble(precio, descripcion);
                    }
                    System.out.println("Muebles rellenados correctamente.");
                    break;

                case 2:
                    System.out.println("\nLISTADO DE MUEBLES");
                    for (int i = 0; i < muebles.length; i++) {
                        if (muebles[i] != null) {
                            muebles[i].mostrarInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.print("\nIntroduce el precio maximo: ");
                    double precioMax = sc.nextDouble();

                    System.out.println("Muebles con precio igual o menor a " + precioMax + " euros:");
                    for (int i = 0; i < muebles.length; i++) {
                        if (muebles[i] != null && muebles[i].getPrecio() <= precioMax) {
                            muebles[i].mostrarInfo();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
