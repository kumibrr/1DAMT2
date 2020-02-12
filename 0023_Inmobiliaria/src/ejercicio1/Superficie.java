package ejercicio1;

public abstract class Superficie extends Inmueble {

	public Superficie(String ubicacion, float sqrMetros, float precio) {
		super(ubicacion, sqrMetros, precio);
		// TODO Auto-generated constructor stub
	}
	
	public float getPrecio(){
		return super.getPrecio() * this.getSqrMetros();
	}
	
}
