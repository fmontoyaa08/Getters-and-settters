package TareasEncapsulacion;

public class Curso {
	private String nombreCurso;
	private double nota1;
	private double nota2;
	private double nota3;
	
	//CONTRUCTOR
	public Curso(String nombreCurso, double nota1, double nota2, double nota3) {
		this.nombreCurso = nombreCurso;
		setNota1(nota1);
		setNota2(nota2);
		setNota3(nota3);
	}
	
	public void setNota1(double nota) {
	    if (nota >= 0 && nota <= 100) {
	        this.nota1 = nota;
	    } else {
	        System.out.println("Error: Nota 1 fuera de rango (0-100)");
	    }
	}

	public void setNota2(double nota) {
	    if (nota >= 0 && nota <= 100) {
	        this.nota2 = nota;
	    } else {
	        System.out.println("Error: Nota 2 fuera de rango (0-100)");
	    }
	}

	public void setNota3(double nota) {
	    if (nota >= 0 && nota <= 100) {
	        this.nota3 = nota;
	    } else {
	        System.out.println("Error: Nota 3 fuera de rango (0-100)");
	    }
	}
	
		public double promedio() {
			double resultado=(nota1 + nota2 + nota3)/3;
					return resultado;
		}
		public String estado() {
			
			double p = promedio();
			if(p >=61) {
				return"Aprobado";
			}else {
				return"Reprobado";
			}
	}

}
