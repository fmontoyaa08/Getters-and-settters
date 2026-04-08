package TareasEncapsulacion;

public class Jugador {
    private String nombre;
    private int puntajeActual;
    private int puntajeMaximo;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntajeActual = 0;
        this.puntajeMaximo = 0;
    }

    public void actualizarPuntaje(int nuevoPuntaje) {
        if (nuevoPuntaje >= 0) {
            this.puntajeActual = nuevoPuntaje;
            // Lógica de récord: si el nuevo es mayor al histórico, se actualiza
            if (nuevoPuntaje > puntajeMaximo) {
                this.puntajeMaximo = nuevoPuntaje;
                System.out.println("¡NUEVO RÉCORD PARA " + nombre + "!");
            }
        } else {
            System.out.println("Error: El puntaje no puede ser negativo.");
        }
    }

    public void mostrarPerfil() {
        System.out.println("Jugador: " + nombre);
        System.out.println("Puntaje Actual: " + puntajeActual);
        System.out.println("Récord Máximo: " + puntajeMaximo);
    }
}