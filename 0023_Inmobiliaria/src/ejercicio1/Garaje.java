package ejercicio1;

public class Garaje extends Superficie {
	private ClaseGaraje claseGaraje;
	public Garaje(String ubicacion, float sqrMetros, float precio,ClaseGaraje claseGaraje) {
		super(ubicacion, sqrMetros, precio);
		this.claseGaraje = claseGaraje;
		// TODO Auto-generated constructor stub
	}
	public ClaseGaraje getClaseGaraje() {
		return this.claseGaraje;
	}
	public void setClaseGaraje(ClaseGaraje claseGaraje) {
		this.claseGaraje = claseGaraje;
	}

}
