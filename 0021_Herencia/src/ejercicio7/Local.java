package ejercicio7;

public class Local extends Inmueble {
	private int ventana;
	
	Local(String direccion, int metros, float precioBase, boolean esNuevo, int edad, int ventana){
		super(direccion, metros,precioBase, esNuevo, edad,"Local");
		this.ventana = ventana;
	}
	
	public String toString() {
		
		return super.toString() + "\tVentanas=" + ventana + "]";
		
	}
}
