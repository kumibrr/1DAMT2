package ejercicio6;
/* Enunciado ejercicio6
 *  Crear una clase Empleado que se defina por un nombre, apellido, un número de la seguridad
social y un salario base. Crear los métodos habituales y uno que devuelva el salario que cobra el
empleado. 
	Posteriormente crear dos clases: EmpleadoPorComision que tenga un salario base de 0, pero tenga
un valor de ventas y una comisión por ventas, y su salario sea su multiplicación. Y
EmpleadoBaseMasComision que incluya tanto un salario base como unas ventas y una comisión
como salario. Redefinir para ambas clases la forma en la que se devuelve el salario que cobra cada
uno.
	Crear una clase listaEmpleados que almacene tanto los EmpleadoPorComision como los
EmpleadoBaseMasComision. Crear un método que devuelva el nombre y el salario de cada
empleado almacenado.
Crear un par de empleados que cobren por comisión y otros dos que cobren su salario base mas una
comisión, crear un objeto listaEmpleados que almacene todos ellos e imprimir por pantalla el
nombre y salario de cada uno. 
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
		return "[Empleado: nombre= " + nombre + ". Apellido= " + apellido1 + ". Numero Seguridad Social= " + numeroSeguridadSocial + ". Salario= " + salarioBase + "]"; 
	}
	
	public float calcularSalario() {
		
	}
}
