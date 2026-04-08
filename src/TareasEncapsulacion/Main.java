package TareasEncapsulacion;

public class Main {

	public static void main(String[] args) {
		ejercicio1();
		ejercicio2();
		ejercicio3();
		ejercicio4();
		ejercicio5();
		ejercicio6();
		ejercicio7();
		ejercicio8();
		ejercicio9();
		ejercicio10();

	}
	public static void ejercicio1() {
		//CONSTRUCTOR
		Persona p1 = new Persona("Fatima", "Montoya", 25);
		Persona p2 = new Persona("David","Garcia", 20);
		Persona p3 = new Persona("Andrea", "Barrera", -23);
		
		//USAMOS TRY-CATCH
		try {
		
			p2.setEdad(-40);
		} catch(Exception e) {
			//SE EJECUTA SI HAY UN ERROR EN LAS VALIDACIONES
			System.out.println("Error");
			e.printStackTrace();
		}
	
		System.out.print("Persona1:" + p1.mostrar());
		System.out.println("Persona2:" + p2.mostrar());
		System.out.println("Persona3:" + p3.mostrar());
	}
	public static void ejercicio2() {
	    System.out.println("\n--- EJERCICIO 2: PRODUCTO ---");
	    
	    
	    Producto prod1 = new Producto(1, "Laptop", 8500.0, 10);
	    Producto prod2 = new Producto(2, "Mouse", 150.0, 50);
	    
	    // Probamos el retiro de stock
	    prod1.retirarStock(3);
	    
	
	    System.out.println(prod1.toString());
	    System.out.println(prod2.toString());
	}
	public static void ejercicio3() {
	    System.out.println("\n--- PRUEBA DE CAJERO ---");
	    Cuenta miCuenta = new Cuenta("Fatima Montoya", 1500.0, 2026);
	    
	    // Intento con PIN correcto
	    miCuenta.retirar(500, 2026);
	    
	    // Intento con PIN incorrecto
	    miCuenta.retirar(100, 1111);
	}
	
	public static void ejercicio4() {
		Curso c= new Curso("Progra", 50,40,30);
		System.out.println("Estado inical:" + c.estado());//DEBE DECIR REPROBADO
		
		System.out.println("Subiendo notas");
		c.setNota1(100);
		c.setNota2(90);
		System.out.println("Nuevo promedio:" + c.promedio());
		System.out.println("Nuevo estado:" + c.estado());
	}
	public static void ejercicio5() {
		Estudiante est = new Estudiante("09052524221", "Fatima",90.0);
		System.out.println("Promedio:" + est.getPromedio());
		System.out.println("¿Es becado?:" +(est.esBecado()? "si":"no"));
		
		
	}
	public static void ejercicio6() {
		
		Termometro t = new Termometro(25); 
			System.out.println("25C en Fahrenheit" + t.getFahrenheit());
		}
	public static void ejercicio7() {
	    System.out.println("\n--- EJERCICIO 7: RELOJ ---");
	    
	    // Prueba 1: Hora válida
	    Reloj r1 = new Reloj(8, 5, 9);
	    System.out.println("Hora actual: " + r1.mostrarHora()); // Debería salir 08:05:09
	    
	    // Prueba 2: Valores inválidos
	    System.out.println("Intentando poner 25:61:99...");
	    Reloj r2 = new Reloj(25, 61, 99);
	    System.out.println("Hora tras error: " + r2.mostrarHora()); // Saldrá 00:00:00
	}
	
	
	    public static void ejercicio8() {
	        try {
	            // Caso exitoso
	            Contacto c1 = new Contacto("Fatima Montoya", "12345678", "fatima@ejemplo.com");
	            c1.mostrarContacto();

	            // Caso con error (descomenta uno para probar la validación)
	            // Contacto c2 = new Contacto("Error", "123", "mal@correo.com"); // Esto lanzará excepción
	            
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error de validación: " + e.getMessage());
	        }
	    }
	    public static void ejercicio9() {
	    	Jugador j = new Jugador("Fatima");
	    	j.actualizarPuntaje(500);
	    	j.actualizarPuntaje(1200);
	    	j.mostrarPerfil();
	    }
	    public static void ejercicio10() {
	    Factura f = new Factura("FAC-001","Laptop HP",2,4500.0);
	    f.mostrarFactura();
	    }
	}
	
	
	
	


