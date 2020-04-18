package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Virus> listaVirus = new ArrayList<Virus>();
		
		listaVirus.add(new Virus("VariolaVirus", 1));
		listaVirus.add(new Virus("CoronaVirus", 2));
		listaVirus.add(new Virus("Carbunco", 3));
		listaVirus.add(new Virus("Ebolavirus", 4));
		listaVirus.add(new Virus("VIH", 5));
		listaVirus.add(new Virus("Dengue", 6));

		
		Collections.sort(listaVirus);
		
		System.out.println("\n------Orden natural(alfabético)------");
		System.out.println(listaVirus.toString());
		
		System.out.println("\\n------Orden ID------");
		Collections.sort(listaVirus, new OrdenarVirusPorID());
		System.out.println(listaVirus.toString());
		
	}

}
