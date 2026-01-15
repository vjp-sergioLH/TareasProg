package ej15t7;

/**
 *
 * @author Sergio
 */
import java.util.Scanner;
public class EJ15T7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] ventas = new int[12]; //Creamos un array de 12 vectores
        String[] meses = { //Creamos un array con todos los meses del año
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        int opcion;
        boolean ventasLlenadas = false;

        do { //Usamos do while para crear un menu que se repita hasta que el usuario escriba correctamente una de las opciones o escriba la opción 7 que está asignada a salir
            System.out.println("\nMENÚ");
            System.out.println("1. Rellenar las ventas mensuales");
            System.out.println("2. Mostrar las ventas");
            System.out.println("3. Mostrar las ventas del revés");
            System.out.println("4. Mostrar la suma total de ventas");
            System.out.println("5. Mostrar las ventas de meses pares");
            System.out.println("6. Mostrar el mes con más ventas");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    llenarVentas(ventas);
                    ventasLlenadas = true;
                    System.out.println("Ventas generadas correctamente.");
                    break;

                case 2:
                    if (ventasLlenadas)
                        mostrarVentas(ventas, meses);
                    else
                        System.out.println("Primero debes rellenar las ventas.");
                    break;

                case 3:
                    if (ventasLlenadas)
                        ventasDelReves(ventas, meses);
                    else
                        System.out.println("Primero debes rellenar las ventas.");
                    break;

                case 4:
                    if (ventasLlenadas)
                        System.out.println("Total de ventas del año: " + sumaVentas(ventas));
                    else
                        System.out.println("Primero debes rellenar las ventas.");
                    break;

                case 5:
                    if (ventasLlenadas)
                        mostrarVentasMesesPares(ventas, meses);
                    else
                        System.out.println("Primero debes rellenar las ventas.");
                    break;

                case 6:
                    if (ventasLlenadas)
                        mostrarMesVentaConMayor(ventas, meses);
                    else
                        System.out.println("Primero debes rellenar las ventas.");
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 7);

        scanner.close();
    }

    // 1. Rellenamos ventas con valores aleatorios entre 10 y 100
    public static void llenarVentas(int[] ventas) {
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = (int)(Math.random() * 91) + 10;
        }
    }

    // 2. Mostramos ventas
    public static void mostrarVentas(int[] ventas, String[] meses) {
        for (int i = 0; i < ventas.length; i++) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }

    // 3. Mostramos ventas al revés
    public static void ventasDelReves(int[] ventas, String[] meses) {
        for (int i = ventas.length - 1; i >= 0; i--) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }

    // 4. Sumamos total de ventas
    public static int sumaVentas(int[] ventas) {
        int suma = 0;
        for (int v : ventas) {
            suma += v;
        }
        return suma;
    }

    // 5. Ventas de los meses pares
    public static void mostrarVentasMesesPares(int[] ventas, String[] meses) {
        for (int i = 1; i < ventas.length; i += 2) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }

    // 6. Mostramos el Mes con más ventas
    public static void mostrarMesVentaConMayor(int[] ventas, String[] meses) {
        int max = ventas[0];
        int pos = 0;

        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > max) {
                max = ventas[i];
                pos = i;
            }
        }

        System.out.println("El mes con más ventas es " + meses[pos] + " con " + max + " coches."); //Muestra el mes con más ventas
    }
}