
package ej6t8;

/**
 *
 * @author Sergio Lopez Hdez
 */
public class empleado {
    private String nombre;
    private final int horas;
    private double tarifa;
    
    //Constructores
    public empleado(){ //Por Defecto
        this.nombre = "";
        this.horas = 0;
        this.tarifa= 0.0;
    } 
    //Parametrizado
    public empleado(String nombre, int horas, double tarifa) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }
    //Creamos este metodo que nos ayudara a calcular el sueldo usando un bucle que comprueba las horas, trabajadas
    public double calcularSueldoBruto() {
        if (horas <= 40) {
            return horas * tarifa;
        } else {
            int horasExtra = horas - 40;
            return (40 * tarifa) + (horasExtra * tarifa * 1.5);
        }
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }

    public double getTarifa() {
        return tarifa;
    }
    
    
}
