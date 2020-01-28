package ejercicio5;
/* Enunciado ejercicio5:
 *  Se quiere gestionar las personas vinculadas con un instituto, que se pueden clasificar en:
estudiantes, profesores y personal de servicio. Por cada persona se debe conocer su nombre y
apellidos, su DNI y su estado civil. Si son empleados del instituto se debe saber su año de
incorporación y el número de despacho que tienen asignado. Los profesores sólo pueden pertenecer
a un departamento determinado y el personal de servicio a una sección concreta. Por ultimo, se tiene
que almacenar a que curso pertenecen los estudiantes. 
 */

public abstract class Persona {
	@SuppressWarnings("unused")
	private String nombre;
	@SuppressWarnings("unused")
	private String apellido1;
	@SuppressWarnings("unused")
	private String apellido2;
	@SuppressWarnings("unused")
	private String dni;
	@SuppressWarnings("unused")
	private EstadoCivil estadoCivil;
	
	public Persona(String nombre, String apellido1, String apellido2, String dni, EstadoCivil estadoCivil){
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.estadoCivil = estadoCivil;
	}
	
	public void getDNI() {
		
	}
}

