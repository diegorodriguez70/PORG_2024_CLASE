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
	
	public float media(float media1, float media2) {
		
		return ((media1+media2)/2);
		
	}
	public void setAlumno(Alumno alumno) {
		capacidad[contador]=alumno;
		contador++;
	}
}
