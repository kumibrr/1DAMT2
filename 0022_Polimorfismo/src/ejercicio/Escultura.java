package ejercicio;

import java.util.Date;

public class Escultura extends Obra {
	
	private String material;
	private float altura;

	Escultura(String title, String storageID, Date year, Artist artist, String material, float altura) {
		super(title, storageID, year, artist);
		this.material = material;
		this.altura = altura;
		// TODO Auto-generated constructor stub
	}

}
