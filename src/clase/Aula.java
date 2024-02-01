package clase;

import java.util.Arrays;

public class Aula {
	private Alumno capacidad[];
	private int contador;
	
	
	public String toString() {
		return "Aula [" + Arrays.toString(capacidad) + ", contador=" + contador + "]";
	}


	public Aula() {
		capacidad= new Alumno[5];
	}
	
	
	public void serAlumno(Alumno alumno) {
		capacidad[contador]=alumno;
	}
}
