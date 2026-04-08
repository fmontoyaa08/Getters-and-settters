package TareasEncapsulacion;

public class Persona {
	//Atributos
	private String nombre;
	private String apellido; 
	private int edad;
	
	//CONSTRUCTOR
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		setEdad(edad);
	}
	//Setters y Getters
	public void setNombre(String nombre)
	{this.nombre = nombre;}
	public String getNombre()
	{return nombre;}
	
	public void setApellido(String apellido)
	{this.apellido = apellido;}
	public String getApellido()
	{return apellido;}
	
	public void setEdad(int edad) {
		if(edad >=0) {
			this.edad = edad;
		}else {
			System.out.println("Error: La edad no puede ser negativa.");
			this.edad = 0;
		}
	}
	public int getEdad() {return edad;}
	
	//EL METODO MOSTRAR
	public String mostrar() {
		return nombre +"" + apellido + "" + edad;
	}
}
