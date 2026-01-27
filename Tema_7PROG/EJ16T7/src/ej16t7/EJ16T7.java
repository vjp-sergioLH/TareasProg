package ej16t7;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class EJ16T7 {

static Scanner sc = new Scanner(System.in);

    // Arrays globales para poder usarlos en todos los métodos
    static String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "Maria"};
    static String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};
    static double[][] notas = new double[alumnos.length][asignaturas.length];

    public static void main(String[] args) {

        int opcion;

        // Menú que se repite hasta que el usuario pulse 6
        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    rellenarNotas();
                    break;
                case 2:
                    mostrarNotas();
                    break;
                case 3:
                    mejorAlumno();
                    break;
                case 4:
                    alumnoConMasSuspensos();
                    break;
                case 5:
                    asignaturaMasDificil();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 6);
    }

    /**
     * Muestra el menú de opciones por pantalla
     */
    public static void mostrarMenu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Rellenar las notas");
        System.out.println("2. Mostrar las notas");
        System.out.println("3. Mejor alumno de la clase");
        System.out.println("4. Alumno con más suspensos");
        System.out.println("5. Asignatura más dificil");
        System.out.println("6. Salir");
        System.out.print("Elige una opcion: ");
    }

    /**
     * Pide al usuario las notas de cada alumno y cada asignatura
     * y las guarda en la matriz de notas
     */
    public static void rellenarNotas() {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("\nNotas de " + alumnos[i]);
            for (int j = 0; j < asignaturas.length; j++) {
                System.out.print(asignaturas[j] + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }
    }

    /**
     * Muestra todas las notas almacenadas en la matriz
     * alumno por alumno y asignatura por asignatura
     */
    public static void mostrarNotas() {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("\nAlumno: " + alumnos[i]);
            for (int j = 0; j < asignaturas.length; j++) {
                System.out.println(asignaturas[j] + ": " + notas[i][j]);
            }
        }
    }

    /**
     * Calcula la nota media de cada alumno
     * y muestra el alumno con la media más alta
     */
    public static void mejorAlumno() {
        double mejorMedia = 0;
        int posicionMejorAlumno = 0;

        for (int i = 0; i < alumnos.length; i++) {
            double suma = 0;

            for (int j = 0; j < asignaturas.length; j++) {
                suma += notas[i][j];
            }

            double media = suma / asignaturas.length;

            if (media > mejorMedia) {
                mejorMedia = media;
                posicionMejorAlumno = i;
            }
        }

        System.out.println("El mejor alumno es " + alumnos[posicionMejorAlumno] +
                " con una media de " + mejorMedia);
    }

    /**
     * Cuenta cuántos suspensos tiene cada alumno
     * y muestra el que tenga mayor número de suspensos
     */
    public static void alumnoConMasSuspensos() {
        int maxSuspensos = 0;
        int posicionAlumno = 0;

        for (int i = 0; i < alumnos.length; i++) {
            int suspensos = 0;

            for (int j = 0; j < asignaturas.length; j++) {
                if (notas[i][j] < 5) {
                    suspensos++;
                }
            }

            if (suspensos > maxSuspensos) {
                maxSuspensos = suspensos;
                posicionAlumno = i;
            }
        }

        System.out.println("El alumno con mas suspensos es " +
                alumnos[posicionAlumno] +
                " con " + maxSuspensos + " suspensos");
    }

    /**
     * Calcula la media de cada asignatura
     * y muestra la asignatura con la media más baja
     */
    public static void asignaturaMasDificil() {
        double peorMedia = 10;
        int posicionAsignatura = 0;

        for (int j = 0; j < asignaturas.length; j++) {
            double suma = 0;

            for (int i = 0; i < alumnos.length; i++) {
                suma += notas[i][j];
            }

            double media = suma / alumnos.length;

            if (media < peorMedia) {
                peorMedia = media;
                posicionAsignatura = j;
            }
        }

        System.out.println("La asignatura mas difícil es " +
                asignaturas[posicionAsignatura] +
                " con una media de " + peorMedia);
    }
    
}