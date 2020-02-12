package ejercicio1;

import java.util.ArrayList;

public interface IAgencia {

	public boolean añadeAlquilerInmueble(Inmueble inmbueble);
	public ArrayList<Inmueble> inmueblesVenta(Float precio);
	public ArrayList<Inmueble> SegundaMano(Float superficie);
	public int solaresRusticos();
	public IAgencia funsion(IAgencia agencia);
	
}
