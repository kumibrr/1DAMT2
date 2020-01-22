import java.util.Date;

public class Alumno extends Persona {
	private Cursos curso;
	
	Alumno(String nombre, String dni, MiDate fechaNacimiento, Cursos curso) {
		super(nombre, dni, fechaNacimiento);
		curso = this.curso;
	}
	
	public String toString() {
		return super.toString() + "curso=" + curso;
	}
	
	public String getCurso() {
		return null;
	}

}
