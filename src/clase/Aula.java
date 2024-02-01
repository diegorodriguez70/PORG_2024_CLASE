package clase;

import java.util.Arrays;

public class Aula {
	private Alumno capacidad[];
	private int contador;
	
	
	public String toString() {
		return "Aula [" + Arrays.toString(capacidad) + "]";
	}


	public Aula() {
		capacidad= new Alumno[5];
		contador=0;
	}
	
	
	public void setAlumno(Alumno alumno) {
		capacidad[contador]=alumno;
		contador++;
	}
}
