package project;

public abstract class Cliente implements Comparable<Cliente> {
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
	
	public boolean equals(Object obj) {
		Cliente cliente = (Cliente) obj;
		boolean response = false;
		if(this.name == cliente.name && this.dni == cliente.dni) {
			response = true;
		}
		return response;
	}

	@Override
	public int compareTo(Cliente o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
