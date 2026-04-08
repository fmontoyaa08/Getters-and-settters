package TareasEncapsulacion;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor
    public Reloj(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    // Setters con validaciones
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) this.hora = hora;
        else System.out.println("Error: Hora inválida (0-23)");
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) this.minuto = minuto;
        else System.out.println("Error: Minuto inválido (0-59)");
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) this.segundo = segundo;
        else System.out.println("Error: Segundo inválido (0-59)");
    }

    // Método para mostrar la hora
    public String mostrarHora() {
       
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}