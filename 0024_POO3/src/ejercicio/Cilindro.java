package ejercicio;

public class Cilindro {
	private Circulo base;
	private float altura;
	
	public Cilindro(Circulo base, float altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public float getAltura() {
		return this.altura;
	}
	
	public String toString() {
		return "Cilindro[base: " + this.base.toString() + "\tAltura: " + this.altura + "]";
	}
	
	public float ObtenerArea() {
		return this.base.ObtenerArea();
	}
	
	
}
