package ejercicio5;


public class PersonalServicio extends Personal {
	@SuppressWarnings("unused")
	private Seccion seccion;
	
	public PersonalServicio(String nombre, String apellido1, String apellido2, String dni, EstadoCivil estadoCivil, int anoIncorporacion, Seccion seccion) {
		super(nombre, apellido1, apellido2, dni, estadoCivil,anoIncorporacion);
		this.seccion = seccion;
	}
}
