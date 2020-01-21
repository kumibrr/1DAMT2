import java.util.Date;

public class Profesor extends Persona {
	private Departamentos departamento;

	Profesor(String nombre, String dni, Date fechaNacimiento, Departamentos departamento) {
		super(nombre, dni, fechaNacimiento);
		this.departamento = departamento;
	}

}
