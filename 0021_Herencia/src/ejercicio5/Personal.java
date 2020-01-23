package ejercicio5;

public abstract class Personal extends Persona{
	@SuppressWarnings("unused")
	private int anoIncorporacion;
	
	public Personal(String nombre, String apellido1, String apellido2, String dni, EstadoCivil estadoCivil, int anoIncorporacion) {
		super(nombre, apellido1, apellido2, dni, estadoCivil);
		this.anoIncorporacion = anoIncorporacion;
	}
}
