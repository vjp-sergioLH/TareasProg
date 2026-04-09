package ej3_t11;

import java.util.Scanner;

public class EJ3_T11 {

    
/**
 *
 * @author Sergio Lopez Hdez
 */
    
    static Scanner entrada = new Scanner(System.in); // creamos un scanner
    static Autobus[] darsenas = new Autobus[6]; // Y un array

    public static void main(String[] args) { //Creamos el menu
        int opcion; // Creamos la variable opcion para tomarlo como la eleccion por pantalla

        do {
            System.out.println("Menu de la estacion");
            System.out.println("1. Aparcar autobus");
            System.out.println("2. Mostrar darsenas libres");
            System.out.println("3. Buscar autobus por matricula");
            System.out.println("4. Buscar conductor por DNI");
            System.out.println("5. Autobus con mas conductores");
            System.out.println("6. Salir");
            System.out.println("Elige una opcion");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) { //Creamos los cases para direccionar el menu
                case 1 -> aparcaAutobus();
                case 2 -> aparcamientosLibres();
                case 3 -> buscarAutobus();
                case 4 -> buscarConductor();
                case 5 -> autobusConMasConductores();
                case 6 -> System.out.println("Saliendo");
                default -> System.out.println("Opcion no valida");
            }
        } while (opcion != 6);
    }

    public static void aparcaAutobus() {
        int aparcamiento; //Creamos la variable aparcamiento para que reciba y lleve la informacion
        do {
            System.out.println("Introduce un aparcamiento del 0 al 5"); //Pedimos por pantalla al usuario que nos introduzca un numero de aparcamiento del 0 al 5
            aparcamiento = entrada.nextInt(); // Hacemos que lo almacene
            entrada.nextLine();
        } while (aparcamiento < 0 || aparcamiento > 5 || darsenas[aparcamiento] != null); // Y que si no esta en los limites es que no existe

        System.out.println("Matricula del autobus: "); // Pedimos la matricula al autobus
        String matricula = entrada.nextLine();

        Autobus a = new Autobus(matricula); // Y creamos una nueva

        System.out.println("Cuantos conductores quieres anadir?");
        int n = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < n; i++) { // En este for pedimos la informacion del conductor y se la enviamos a la vsrisble conductor de la clase conductor
            System.out.println("DNI del conductor: ");
            String dni = entrada.nextLine();
            System.out.println("Nombre del conductor: ");
            String nombre = entrada.nextLine();
            a.addConductor(new Conductor(dni, nombre));
        }

        darsenas[aparcamiento] = a;
        System.out.println("Autobus aparcado correctamente.");
    }

    public static void aparcamientosLibres() { 
        System.out.println("Darsenas libres: "); // Preguntamos por pantalla cuantos aparcamiento hay libres
        for (int i = 0; i < darsenas.length; i++) {
            if (darsenas[i] == null) { // Si nos sale que la plaza es nula, es que no esta disponible
                System.out.println(" - Posicion " + i);
            }
        }
    }

    public static void buscarAutobus() {
        System.out.println("Introduce matricula: ");
        String mat = entrada.nextLine(); // Pedimos por pantalla la matricula

        for (Autobus a : darsenas) {
            if (a != null && a.getMatricula().equalsIgnoreCase(mat)) { // Y si la matricula es nula o no existe nos dice que no la vio
                System.out.println(a);
                return;
            }
        }
        System.out.println("No se ha encontrado.");
    }

    public static void buscarConductor() {
        System.out.println("Introduce el DNI del conductor: ");
        String dni = entrada.nextLine(); // Hacemos lo mismp que con la matricula

        for (Autobus a : darsenas) {
            if (a != null && a.getConductores().containsKey(dni)) { // Si encuentra nos da la matricula del conductor y si no, no la encuentra
                System.out.println("El conductor esta en el autobus con matricula: " + a.getMatricula());
                return;
            }
        }
        System.out.println("No se ha encontrado.");
    }

    public static void autobusConMasConductores() {
        int max = -1;
        int posmax = -1;

        for (int i = 0; i < darsenas.length; i++) { // Buscamos con un for el autobus con mas conductores con el metodo botella/burbuja
            if (darsenas[i] != null) {
                int num = darsenas[i].getConductores().size();
                if (num > max) {
                    max = num;
                    posmax = i;
                }
            }
        }

        if (posmax == -1) {
            System.out.println("No hay autobuses aparcados"); // SI hay menos de 1, no hay autobuses
        } else {
            System.out.println("El autobus con mas conductores esta en la posicion " + posmax); // Y muestra el autobus con mas viajantes por pantalla
            System.out.println(darsenas[posmax]);
        }
    }
}