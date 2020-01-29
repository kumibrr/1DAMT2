package ejercicio6;

import java.util.ArrayList;

public class ListaEmpleadosV2 extends ArrayList<Empleado> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ListaEmpleadosV2(){
		super(); //Siempre sera lo primero en el constructor la llamada al constructor de la superclase
		super.add(new EmpleadoBaseMasComision("Pedro", "Cosa", "31324", 1000, 0.78f, 8));
		super.add(new EmpleadoPorComision("Alvaro", "matias", "343523", 2.5f, 340));
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		
		for (int index = 0; index < super.size(); index++) {
			result.append(super.get(index).getNombre() + "\t" + super.get(index).calcularSalario() + "\n");
		}
		
		return result.toString();
	}
}
