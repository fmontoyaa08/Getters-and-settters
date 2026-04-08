		package TareasEncapsulacion;

public class Estudiante {
    private String carnet;
    private String nombre;
    private double promedio;

    public Estudiante(String carnet, String nombre, double promedio) {
        this.carnet = carnet;
        this.nombre = nombre;
        setPromedio(promedio);
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 100) this.promedio = promedio;
        else System.out.println("Promedio inválido");
    }

    public double getPromedio() { return promedio; }
    public String getNombre() { return nombre; }

    public boolean esBecado() {
        return this.promedio >= 85;
    }
}

