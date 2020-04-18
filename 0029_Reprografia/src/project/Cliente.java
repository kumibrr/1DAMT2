package project;

public abstract class Cliente {
	private String name;
	private String dni;
	
	public Cliente(String dni, String name){
		this.dni = dni;
		this.name = name;
	}

	public String getDni() {
		return dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return " DNI=" + this.dni + " Nombre= " + this.name;
	}
	
}
