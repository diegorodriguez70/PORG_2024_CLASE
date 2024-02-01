package clase;

import java.util.Arrays;

public class Alumno {

	private String nombre;
	private String apellidos;
	private Asignatura calificacionesFinal[];
	private String telefono;
	private int contador;

	public Alumno() {
		contador = 0;
		calificacionesFinal = new Asignatura[4];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Asignatura[] getCalificaciones() {

		return calificacionesFinal;
	}

	public void setCalificaciones(float calificacion1, float calificacion2, float calificacion3,
			Asignatura asignatura) {

		if (calificacion1 > -1 && calificacion1 < 11 && calificacion2 > -1 && calificacion2 < 11 && calificacion3 > -1
				&& calificacion3 < 11) {

			asignatura.setEvaluaciones(calificacion1);
			asignatura.setEvaluaciones(calificacion2);
			asignatura.setEvaluaciones(calificacion3);

			asignatura.calcularMediaFinal();
			calificacionesFinal[contador] = asignatura;

			// asignatura.calcularMediaFinal();

		}
		contador++;

	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String toString() {
		return "(nombre=" + nombre + ", apellidos=" + apellidos + "Notas finales ="
				+ Arrays.toString(calificacionesFinal) + ", telefono=" + telefono + ")";
	}

}
