package ejercicio1;

public class Solar extends Superficie {
	private ZonaSolar zonaSolar;

	public Solar(String ubicacion, float sqrMetros, float precio,ZonaSolar zonaSolar) {
		super(ubicacion, sqrMetros, precio);
		this.zonaSolar = zonaSolar;
		// TODO Auto-generated constructor stub
	}
	
	public ZonaSolar getZonaSolar(){
		return this.zonaSolar;
	}
	public void setZonaSolar(ZonaSolar zonaSolar) {
		this.zonaSolar = zonaSolar;
	}

}
