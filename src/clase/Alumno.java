package clase;

public class Alumno {

	private String nombre;
	private String apellidos;
	private float calificacionesFinal;
	private String telefono;
	
	
	
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
	public float getCalificaciones() {
	
		return calificacionesFinal;
	}
	public void setCalificaciones(float calificaciones, Asignatura asignatura) {
		if(calificaciones>-1 && calificaciones<11) {
			
			
			asignatura.setEvaluaciones(calificaciones);
			asignatura.calcularMediaFinal();
			this.calificacionesFinal = calificaciones;
			
		}
	
		
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String toString() {
		return "(nombre=" + nombre + ", apellidos=" + apellidos +"Notas finales ="+calificacionesFinal
				+ ", telefono=" + telefono + ")";
	}
	
	
}
