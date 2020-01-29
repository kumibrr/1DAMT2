package ejercicio6;
/* Enunciado ejercicio6
 *  Crear una clase Empleado que se defina por un nombre, apellido, un n�mero de la seguridad
social y un salario base. Crear los m�todos habituales y uno que devuelva el salario que cobra el
empleado. 

	Posteriormente crear dos clases: EmpleadoPorComision que tenga un salario base de 0, pero tenga
un valor de ventas y una comisi�n por ventas, y su salario sea su multiplicaci�n. Y
EmpleadoBaseMasComision que incluya tanto un salario base como unas ventas y una comisi�n
como salario. Redefinir para ambas clases la forma en la que se devuelve el salario que cobra cada
uno.
	Crear una clase listaEmpleados que almacene tanto los EmpleadoPorComision como los
EmpleadoBaseMasComision. Crear un m�todo que devuelva el nombre y el salario de cada
empleado almacenado.
Crear un par de empleados que cobren por comisi�n y otros dos que cobren su salario base mas una
comisi�n, crear un objeto listaEmpleados que almacene todos ellos e imprimir por pantalla el
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
	
	public Empleado(String nombre, String apellido1, String numeroSeguridadSocial, float salarioBase) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.numeroSeguridadSocial = numeroSeguridadSocial;
		this.salarioBase = salarioBase;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido1() {
		return apellido1;
	}



	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}



	public String getNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}



	public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}



	public float getSalarioBase() {
		return salarioBase;
	}



	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}



	public String toString() {
		return "[Empleado: nombre= " + nombre + ". Apellido= " + apellido1 + ". Numero Seguridad Social= " + numeroSeguridadSocial + ". Salario= " + salarioBase + "]"; 
	}
	
	public abstract float calcularSalario();
}
