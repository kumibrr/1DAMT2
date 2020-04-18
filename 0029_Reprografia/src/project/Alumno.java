package project;

public class Alumno extends Cliente {
	private Curso curso;
	
	public Alumno(String dni, String name, Curso curso) {
		super(dni, name);
		this.curso = curso;
	}
	
	public String toString() {
		return super.toString() + " Curso=" + this.curso;
	}
}
