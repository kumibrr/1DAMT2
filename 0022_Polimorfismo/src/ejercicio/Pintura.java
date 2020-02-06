package ejercicio;

import java.util.Date;

public class Pintura extends Obra {
	
	private float dimensionX;
	private float dimensionY;
	private String soporte;

	Pintura(String title, String storageID, Date year, Artist artist, float dimensionX, float dimensionY, String soporte) {
		super(title, storageID, year, artist);
		this.dimensionX = dimensionX;
		this.dimensionY = dimensionY;
		this.soporte = soporte;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pintura [dimensionX=" + dimensionX + ", dimensionY=" + dimensionY + ", soporte=" + soporte + "]";
	}
	
	

}
