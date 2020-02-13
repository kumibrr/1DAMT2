package ejercicio1;

public class Vivienda extends Construcciones {
	private int numHabitaciones;
	private int piso;
	
	public Vivienda(String ubicacion, float sqrMetros, float precio, TipoConstruccion tipo, int numHabitaciones, int piso) {
		super(ubicacion, sqrMetros, precio, tipo);
		// TODO Auto-generated constructor stub
		this.numHabitaciones = numHabitaciones;
		this.piso = piso;
	}
	public int getNumHabitaciones() {
		return this.numHabitaciones;
	}
	public void setNumHabitaciones(int habitaciones) {
		this.numHabitaciones = habitaciones;
	}
	public int getPiso() {
		return this.piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	
	public String toString() {
		String result="Vivienda[";
		result += this.getUbicacion() + ". " + this.getSqrMetros() + ". " + this.getPrecio() + ". " + this.getTipoConstruccion() + ". " + this.numHabitaciones + ". " + this.piso + "]\n";
		
		return result;
	}
	
	
	
}
