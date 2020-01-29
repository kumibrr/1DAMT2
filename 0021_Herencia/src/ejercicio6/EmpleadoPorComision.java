package ejercicio6;

public class EmpleadoPorComision extends Empleado {
	
	private float comision;
	private float ventas;

	public EmpleadoPorComision(String nombre, String apellido1, String numeroSeguridadSocial, float comision, int ventas) {
		super(nombre, apellido1, numeroSeguridadSocial, 0);
		
		this.comision = comision;
		this.ventas = ventas;
	}
	
	public float calcularSalario() {
		return (comision * ventas);
	}

}
