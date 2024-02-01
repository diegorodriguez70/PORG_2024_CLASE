package clase;

public class Start {

	public static void main(String[] args) {
		
		Aula aula1 = new Aula();
		Alumno alumno1=new Alumno();
		Asignatura asignatura1=new Asignatura("Fol");
		Asignatura asignatura2=new Asignatura("Sistemas");
		alumno1.setNombre("Diego");
		alumno1.setApellidos("Rodriguez Fernandez");
		alumno1.setCalificaciones(5,3,8, asignatura1);
		alumno1.setCalificaciones(4,3,10, asignatura2);
		aula1.serAlumno(alumno1);
		System.out.println(aula1);
		System.out.println(alumno1);
		System.out.println(asignatura1);
		

	}

}
