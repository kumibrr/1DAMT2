package ejercicio1;

public abstract class Construcciones extends Inmueble {
	private TipoConstruccion tipo;
	
	public Construcciones(String ubicacion, float sqrMetros, float precio,TipoConstruccion tipo) {
		super(ubicacion, sqrMetros, precio);
		this.tipo = tipo;
		// TODO Auto-generated constructor stub
	}
	
	public TipoConstruccion getTipoConstruccion() {
		return this.tipo;
	}
	public void setTipoConstruccion(TipoConstruccion tipo) {
		this.tipo = tipo;
	}

}
