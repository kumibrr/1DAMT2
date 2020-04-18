package project;

public class Profesor extends Cliente {
	
	private Dpto departamento;

	public Profesor(String dni, String name, Dpto departamento) {
		super(dni, name);
		this.departamento = departamento;
	}
	
	public String toString() {
		return super.toString() + " Departamento=" + this.departamento;
	}

}
