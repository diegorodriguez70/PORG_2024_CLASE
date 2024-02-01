package clase;

public class Start {

	public static void main(String[] args) {
		
		Aula aula1 = new Aula();
		Alumno alumno1=new Alumno();
		Alumno alumno2 = new Alumno();
		Asignatura asignatura1=new Asignatura("Fol");
		Asignatura asignatura2=new Asignatura("Sistemas");
		Asignatura asignatura3 = new Asignatura ("Prog");
		Asignatura asignatura4 = new Asignatura("Bases de datos");
		alumno1.setNombre("Diego");
		alumno1.setApellidos("Rodriguez Fernandez");
		alumno1.setCalificaciones(5,3,8, asignatura1);
		alumno1.setCalificaciones(4,3,10, asignatura2);
		alumno1.setCalificaciones(3, 3, 7, asignatura3);
		alumno1.setCalificaciones(5, 8, 7, asignatura4);
		float mediaPrimero=alumno1.laMedia(asignatura1, asignatura2, asignatura3, asignatura4);
		asignatura1.reset();
		asignatura2.reset();
		asignatura3.reset();
		asignatura4.reset();
		
		alumno2.setNombre("Paco");
		alumno2.setApellidos("Alvarez Fernandez");
		alumno2.setCalificaciones(9,5,8, asignatura1);
		alumno2.setCalificaciones(9,3,1, asignatura2);
		alumno2.setCalificaciones(4, 8, 2, asignatura3);
		alumno2.setCalificaciones(5, 10, 10, asignatura4);
		float mediaSegundo=alumno2.laMedia(asignatura1, asignatura2, asignatura3, asignatura4);
		aula1.setAlumno(alumno2);
		aula1.setAlumno(alumno1);
		System.out.println(aula1.media(mediaPrimero, mediaSegundo));
		System.out.println(aula1);

		

	}

}
