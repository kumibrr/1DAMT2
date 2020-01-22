import java.util.Date;

public class Persona {
	private String nombre, dni;
	private MiDate fechaNacimiento;
	
	Persona(String nombre, String dni, MiDate fechaNacimiento){
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getNombre() {
		
		return null;
	}
	
	public void setNombre() {
		
	}
	
	public String getDni() {
		
		return null;
	}
	
	public void setDni() {
		
	}
	
	public String getFechaNacimiento() {
		
		return null;
	}
	
	public void setFechaNacimiento() {
		
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		Persona per = (Persona) obj;
		if (per.dni.equalsIgnoreCase(dni) && per.nombre.equalsIgnoreCase(nombre) && per.fechaNacimiento.equals(fechaNacimiento)) result = true;
		return result;
	}
	
	
	
}
