package ejercicio6;

import java.util.ArrayList;

public class ListaEmpleados {
	private ArrayList<Empleado> listaEmpleados;
	
	ListaEmpleados(){
		super();
		this.listaEmpleados = new ArrayList<Empleado>();
		
		listaEmpleados.add(new EmpleadoBaseMasComision("Pedro", "Cosa", "31324", 1000, 0.78f, 8));
		listaEmpleados.add(new EmpleadoPorComision("Alvaro", "matias", "343523", 2.5f, 340));
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		
		for (Empleado emp: listaEmpleados) {
			result.append(emp.getNombre() + "\t" + emp.calcularSalario() + "\n");
		}
		
		return result.toString();
	}
}
