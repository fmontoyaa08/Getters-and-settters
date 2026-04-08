package TareasEncapsulacion;

public class Producto {
    // Atributos privados para cumplir con el encapsulamiento
    private int codigo;
    private String nombre;
    private double precio;
    private int stock;

    // Constructor que recibe los 4 parámetros
    public Producto(int codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock; // Asegúrate de incluir el ; al final
    }

    // Método para retirar stock con validación
    public void retirarStock(int cantidad) {
        if (cantidad > 0 && cantidad <= this.stock) {
            this.stock -= cantidad; // Restamos la cantidad al stock actual
            System.out.println("Retiro exitoso de " + cantidad + " unidades.");
        } else {
            System.out.println("Error: Cantidad inválida o stock insuficiente.");
        }
    }

    // Método para mostrar la información del producto
    @Override
    public String toString() {
        return "Producto [Código: " + codigo + ", Nombre: " + nombre + 
               ", Precio: Q" + precio + ", Stock: " + stock + "]";
    }
}