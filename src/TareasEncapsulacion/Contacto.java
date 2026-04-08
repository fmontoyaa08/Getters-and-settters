package TareasEncapsulacion;

public class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    // Constructor que utiliza los setters para validar desde el inicio
    public Contacto(String nombre, String telefono, String email) {
        setNombre(nombre);
        setTelefono(telefono);
        setEmail(email);
    }

    // --- Getters y Setters ---

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        // Validar que no sea nulo y que tenga exactamente 8 dígitos
        if (telefono != null && telefono.matches("\\d{8}")) {
            this.telefono = telefono;
        } else {
            throw new IllegalArgumentException("El teléfono debe tener exactamente 8 dígitos numéricos.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // Validar que no sea nulo y que contenga el carácter @
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("El email es inválido (debe contener '@').");
        }
    }

    // --- Método para mostrar la información ---

    public void mostrarContacto() {
        System.out.println("Nombre:   " + this.nombre);
        System.out.println("Teléfono: " + this.telefono);
        System.out.println("Email:    " + this.email);
      
    }
}