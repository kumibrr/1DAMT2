package ejercicio;

public class Circulo extends Figura {
	private Punto centro;
	private float radio;
	
	public Circulo(Punto centro, float radio) {
		this.centro = centro;
		this.radio = radio;
	}
	
	public float getRadio() {
		return this.radio;
	}
	public void setRadio(float radio) {
		this.radio = radio;
	}
	
	
	public String toString() {
		return "Circulo[centro: " + this.centro.toString() + "\tradio: " + this.radio + "]"; 
	}
	
	public String obtenerNombre() {
		return "Circulo";
	}
	
	public float ObtenerArea() {
		
		return (float) (2 * Math.PI * this.radio);
	}
}
