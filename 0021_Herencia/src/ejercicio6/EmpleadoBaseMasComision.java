package ejercicio6;

public class EmpleadoBaseMasComision extends Empleado {
	
	private int ventas;
	private float comision;

	public EmpleadoBaseMasComision(String nombre, String apellido1, String numeroSeguridadSocial, float salarioBase, float comision, int ventas) {
		super(nombre, apellido1, numeroSeguridadSocial, salarioBase);
		// TODO Auto-generated constructor stub
		this.comision = comision;
		this.ventas = ventas;
	}

	@Override
	public float calcularSalario() {
		return getSalarioBase() + (comision * ventas);
	}

	
}
