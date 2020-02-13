package ejercicio1;

public abstract class Inmueble {
	private String ubicacion;
	private float sqrMetros;
	private float precio;
	
	public Inmueble(String ubicacion, float sqrMetros, float precio) {
		this.ubicacion = ubicacion;
		this.sqrMetros = sqrMetros;
		this.precio = precio;
	}
	
	
	public String getUbicacion() {
		return this.ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public float getSqrMetros() {
		return this.sqrMetros;
	}
	public void setSqrMetros(float sqrMetros) {
		this.sqrMetros = sqrMetros;
	}
	public float getPrecio() {
		return this.precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public boolean equals(Inmueble inmueble) {
		boolean result = false;
		if (this.getClass().getSimpleName() == inmueble.getClass().getSimpleName() && this.getUbicacion() == inmueble.getUbicacion() &&
			this.getPrecio() == inmueble.getPrecio() &&	this.getSqrMetros() == inmueble.getSqrMetros()) {
			result = true;
		}
		
		return result;
	}
}
