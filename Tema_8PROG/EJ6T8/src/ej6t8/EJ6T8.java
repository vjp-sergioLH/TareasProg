package ej6t8;

/**
 *
 * @author Sergio Lopez Hdez
 */
import java.util.Scanner;
public class EJ6T8 {

    
    public static void main(String[] args) {
        //Creamos scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuantos empleados desea introducir? ");
        int numEmpleados = sc.nextInt();
        sc.nextLine();
        
        //Almacenamos la longitud del array en un método
        empleado[] empleados = new empleado[numEmpleados];
        
        //Empezamos a almacenar la información usando un búcle para almacenarla en cada uno de los array
        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("\n- EMPLEADO " + (i + 1) + " -");

            System.out.print("Introduzca el nombre del empleado: ");
            String nombre = sc.nextLine();

            System.out.print("¿Cuantas horas trabajo este empleado este mes? ");
            int horas = sc.nextInt();

            System.out.print("¿Cual es su tarifa por cada hora de trabajo? ");
            double tarifa = sc.nextDouble();
            sc.nextLine();

            empleados[i] = new empleado(nombre, horas, tarifa);

            System.out.println("EMPLEADO " + (i + 1) + " ALMACENADO CON ÉXITO –");
        }

        System.out.println("\nSUELDO BRUTO DE LOS EMPLEADOS");
        
        //Comprobamos que la información de cada uno de los array para comprobar la tarifa de cada uno.
        for (empleado e : empleados) {
            System.out.println(
                e.getNombre() + " trabajó " + e.getHoras
        () +
                " horas, cobra " + e.getTarifa() +
                " euros la hora por lo que le corresponde un sueldo de " +
                e.calcularSueldoBruto() + " euros."
            );
        }
        sc.close();
    }
    
}
