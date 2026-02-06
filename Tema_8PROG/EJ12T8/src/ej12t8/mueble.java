package ej12t8;

/**
 *
 * @author Sergio Lopez Hdez
 */
public class mueble {
    private double precio;
    private String descripcion;

    // Constructor por defecto
    public mueble() {
        this.precio = 0;
        this.descripcion = "Sin descripción";
    }

    // Constructor parametrizado
    public mueble(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    // Getters y setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Descripción: " + descripcion + " | Precio: " + precio + " euros");
    }
}
