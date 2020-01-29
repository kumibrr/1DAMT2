package ejercicio7;

public class Piso extends Inmueble {
	private int piso;
	
	public Piso(String direccion, int metros, float precioBase, boolean esNuevo, int edad, int piso){
		super(direccion,metros,precioBase,esNuevo,edad,"Piso");
		this.piso = piso;
	}
	
	public String toString() {
		
		return super.toString() + "\tPlanta=" + piso + "]";
		
	}
	
	@Override
	public void calcularDescuento() {
		if(super.edad < 15) {
			super.descuento += 1;
		} else {
			super.descuento += 2;
		}
		
	}
	
}
