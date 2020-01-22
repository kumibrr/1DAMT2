package ejercicio1;

public class Circulo extends Punto {
	private int radio;
	private Punto centro;
	
	public Circulo() {
		centro.coordenadaX = 0;
		centro.coordenadaY = 0;
		radio = 1;
	}
	
	public Circulo(Punto centro, int radio) {
		centro = this.centro;
		radio = this.radio;
	}
}
