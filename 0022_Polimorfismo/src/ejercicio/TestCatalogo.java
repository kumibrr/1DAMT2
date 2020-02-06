package ejercicio;

import java.sql.Date;

public class TestCatalogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Catalogo catalogo = new Catalogo();
		
		//catalogo.add(new Pintura("Las Meninas", "12B", new Date((long) 23815.2), new Artist("Velazquez","Madrid",new Date(234),new Date(235)), 49.0f, 30.4f, "Madera"));
		//catalogo.add(new Pintura("Las Meninas", "13B", new Date((long) 23815.2), new Artist("Velazquez","Madrid",new Date(234),new Date(235)), 49.0f, 30.4f, "Madera"));
		
		System.out.println(catalogo.addObra(new Pintura("Las Meninas", "12B", new Date((long) 23815.2), new Artist("Velazquez","Madrid",new Date(234),new Date(235)), 49.0f, 30.4f, "Madera")));
		System.out.println(catalogo.addObra(new Pintura("Las Meninas", "12B", new Date((long) 23815.2), new Artist("Velazquez","Madrid",new Date(234),new Date(235)), 49.0f, 30.4f, "Madera")));
		
		System.out.println(catalogo.toString());

		System.out.println(catalogo.removeObra("12B"));
		System.out.println(catalogo.toString());
	}

}
