import java.util.Date;

public class Profesor extends Persona {
	private Departamentos departamento;

	Profesor(String nombre, String dni, MiDate fechaNacimiento, Departamentos departamento) {
		super(nombre, dni, fechaNacimiento);
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return super.toString() + " departamento=" + departamento + "]";
	}
	
	public String getDepartamento() {
		return null;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (departamento != other.departamento)
			return false;
		return true;
	}
	
	
	
	
}
