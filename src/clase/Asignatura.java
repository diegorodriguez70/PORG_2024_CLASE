package clase;

public class Asignatura {

	private String nombre;
	private float evaluaciones[];
	private float nota_final;
	private int contador;

	public Asignatura(String nombre) {
		evaluaciones = new float[3];
		this.nombre=nombre;

	}

	public float calcularMediaFinal() {

		for (int i = 0; i < evaluaciones.length; i++) {
			nota_final = nota_final + evaluaciones[i];
		}
		nota_final = nota_final / 3;
		return nota_final;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float[] getEvaluaciones() {
		return evaluaciones;
	}

	public void setEvaluaciones(float calificaciones) {
		this.evaluaciones[contador] = calificaciones;
		contador++;
	}


}
