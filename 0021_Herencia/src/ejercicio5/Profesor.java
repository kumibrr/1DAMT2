package ejercicio5;

public class Profesor extends Personal {

	@SuppressWarnings("unused")
	private int numeroDespacho;
	@SuppressWarnings("unused")
	private Departamento departamento;
	
	public Profesor(String nombre, String apellido1, String apellido2, String dni, EstadoCivil estadoCivil, int anoIncorporacion, Departamento departamento, int numeroDespacho) {
		super(nombre, apellido1, apellido2, dni, estadoCivil,anoIncorporacion);
		this.departamento = departamento;
		this.numeroDespacho = numeroDespacho;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}
}
