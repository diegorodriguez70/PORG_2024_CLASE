package clase;

public class Aula {
	private Alumno capacidad[];
	private int contador;
	
	public Aula() {
		capacidad= new Alumno[5];
	}
	
	
	public void serAlumno(Alumno alumno) {
		capacidad[contador]=alumno;
	}
}
