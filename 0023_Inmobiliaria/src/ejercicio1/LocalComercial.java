package ejercicio1;

public class LocalComercial extends Construcciones {

	public LocalComercial(String ubicacion, float sqrMetros, float precio, TipoConstruccion tipo) {
		super(ubicacion, sqrMetros, precio, tipo);
		super.setPrecio(super.getPrecio() * sqrMetros);
		// TODO Auto-generated constructor stub
	}
	
	public void setPrecio() {
		super.setPrecio(super.getPrecio() * super.getSqrMetros());
	}
	
	
	public String toString() {
		String result = "LocalComercial[";
		
		result += this.getUbicacion() + ". " + this.getSqrMetros() + ". " + this.getPrecio() + ". " + this.getTipoConstruccion() + "]\n";
		
		return result;
	}
	

}
