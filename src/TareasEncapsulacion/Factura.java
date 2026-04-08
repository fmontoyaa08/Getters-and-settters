package TareasEncapsulacion;

public class Factura {
    private String codigoFactura;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public Factura(String codigo, String desc, int cant, double precio) {
        this.codigoFactura = codigo;
        this.descripcion = desc;
        setCantidad(cant);
        setPrecioUnitario(precio);
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) this.cantidad = cantidad;
        else System.out.println("Error: La cantidad debe ser mayor a 0.");
    }

    public void setPrecioUnitario(double precio) {
        if (precio > 0) this.precioUnitario = precio;
        else System.out.println("Error: El precio debe ser mayor a 0.");
    }

    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    public void mostrarFactura() {
        System.out.println("--- DETALLE DE FACTURA ---");
        System.out.println("Código: " + codigoFactura);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: Q" + precioUnitario);
        System.out.println("TOTAL A PAGAR: Q" + calcularTotal());
    }
}