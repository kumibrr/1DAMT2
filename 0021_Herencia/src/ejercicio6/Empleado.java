package ejercicio6;
/* Enunciado ejercicio6
 *  Crear una clase Empleado que se defina por un nombre, apellido, un número de la seguridad
social y un salario base. Crear los métodos habituales y uno que devuelva el salario que cobra el
empleado. 
 */

public abstract class Empleado {
	@SuppressWarnings("unused")
	private String nombre;
	@SuppressWarnings("unused")
	private String apellido1;
	@SuppressWarnings("unused")
	private String numeroSeguridadSocial;
	@SuppressWarnings("unused")
	private float salarioBase;
	
	public Empleado(String nombre, String apellido1, String numeroSeguridadSocial) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.numeroSeguridadSocial = numeroSeguridadSocial;
		this.salarioBase = 0;
	}
	
	public String toString() {
		return "[Empleado: nombre= " + nombre + ". Apellido= " + apellido1 + ". Numero Seguridad Social= " + numeroSeguridadSocial + ". Salario Base= " + salarioBase + "]"; 
	}
	
}
