package TareasEncapsulacion;

public class Cuenta {
    // Atributos privados
    private String titular;
    private double saldo;
    private int pin;

    // Constructor para inicializar la cuenta
    public Cuenta(String titular, double saldo, int pin) {
        this.titular = titular;
        this.saldo = saldo;
        this.pin = pin;
    }

    // Método principal de lógica de negocio
    public void retirar(double monto, int pinIngresado) {
        // Primero validamos el PIN
        if (pinIngresado == this.pin) {
            // Si el PIN es correcto, validamos el saldo
            if (monto > 0 && monto <= this.saldo) {
                this.saldo -= monto;
                System.out.println("Retiro exitoso de: Q" + monto);
                System.out.println("Saldo restante: Q" + this.saldo);
            } else {
                System.out.println("Error: Saldo insuficiente o monto inválido.");
            }
        } else {
            // Si el PIN no coincide
            System.out.println("Error: PIN incorrecto. Acceso denegado.");
        }
    }

    // Getters necesarios por si quieres ver el saldo en el Main
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}