/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej14t8;

/**
 *
 * @author Sergio Lopez Hdez
 */
import java.util.Scanner;
public class EJ14T8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creamos el metodo scanner
        alumnos[] alumnos = new alumnos[5]; // Creamos el array de 5 posiciones
        int opcion; //Creamos la variable opcion

        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Rellenar un alumno");
            System.out.println("2. Mostrar vector de alumnos");
            System.out.println("3. Mostrar alumnos con nota media por encima de una nota");
            System.out.println("4. Mostrar cuantos alumnos están suspensos");
            System.out.println("5. Buscar alumno por nombre");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiamos el buffer

            //Creamos el switch para usarlo con las opciones del menu.
            switch (opcion) {
                case 1:
                    int posicion;
                    //Creamos el bucle para la primera opción (Rellenar Alumno)
                    do {
                        System.out.print("Introduce la posición (0 a 4): ");
                        posicion = sc.nextInt();
                        sc.nextLine();

                        if (posicion < 0 || posicion >= alumnos.length) { //Vemos que si el alumno esta por debajo de 0 es incorrecta
                            System.out.println("Posición incorrecta."); 
                        } else if (alumnos[posicion] != null) { // Y si no es el caso es que ya esta ocupada por otro alumno
                            System.out.println("Esa posición ya está ocupada.");
                        }

                    } while (posicion < 0 || posicion >= alumnos.length || alumnos[posicion] != null);

                    System.out.print("Nombre del alumno: "); //Usamos un System para que pida su nombre por pantalla
                    String nombre = sc.nextLine();

                    System.out.print("Nota media: "); //Lo mismo pero con su nota
                    double nota = sc.nextDouble();

                    alumnos[posicion] = new alumnos(nombre, nota);
                    System.out.println("Alumno insertado correctamente."); // Y si todo va correctamente, estaria creado perfectamente.
                    break;

                case 2:
                    System.out.println("\nLISTADO DE ALUMNOS"); //Creamos un listado de alumnos (segunda opcion)
                    for (int i = 0; i < alumnos.length; i++) {
                        if (alumnos[i] != null) {
                            alumnos[i].mostrarInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Introduce la nota mínima: "); 
                    double notaMin = sc.nextDouble();// Introducimos la nota minima de la clase (Tercera Opcion)

                    System.out.println("Alumnos con nota superior a " + notaMin + ":"); 
                    for (alumnos a : alumnos) {
                        if (a != null && a.getNotaMedia() > notaMin) {
                            a.mostrarInfo();
                        }
                    }
                    break;

                case 4:
                    int suspensos = 0;  // Vemos los alumnos con suspensos (Cuarta opcion)
                    for (alumnos a : alumnos) {
                        if (a != null && a.getNotaMedia() < 5) {
                            suspensos++;
                        }
                    }
                    System.out.println("Número de alumnos suspensos: " + suspensos);
                    break;

                case 5:
                    System.out.print("Introduce el nombre a buscar: "); // Buscador de alumno
                    String nombreBuscar = sc.nextLine();
                    boolean encontrado = false;

                    for (alumnos a : alumnos) {
                        if (a != null && a.getNombre().equalsIgnoreCase(nombreBuscar)) {
                            encontrado = true;
                            break;
                        }
                    }

                    if (encontrado) {
                        System.out.println("El alumno está matriculado.");
                    } else { //Comprobamos si el alumno esta o no matriculado
                        System.out.println("El alumno NO está matriculado.");
                    }
                    break;

                case 6:
                    System.out.println("Programa finalizado."); // Opcion Salir
                    break;

                default:
                    System.out.println("Opción no válida."); // Si no introduces el numero de algun campo establecido
            }

        } while (opcion != 6);
        sc.close();
    }
    
}
