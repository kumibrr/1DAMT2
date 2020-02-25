package ejercicio;

public class Punto extends Figura {

	private float x;
	private float y;
	
	public Punto(float x, float y){
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return this.x;
	}
	public float getY() {
		return this.y;
	}
	public void setX(float x) {
		this.x = x;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public String toString() {
		return "x:" + x + "\ty:" + y;
	}
	
	public String obtenerNombre() {
		return "Punto";
	}
}
