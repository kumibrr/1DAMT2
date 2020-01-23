package ejercicio5;

public class Estudiante extends Persona {
	public Estudiante(String nombre, String apellido1, String apellido2, String dni, EstadoCivil estadoCivil,Curso curso) {
		super(nombre, apellido1, apellido2, dni, estadoCivil);
		this.curso = curso;
	}

	@SuppressWarnings("unused")
	private Curso curso;
}
