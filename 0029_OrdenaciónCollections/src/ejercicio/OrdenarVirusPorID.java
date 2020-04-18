package ejercicio;

import java.util.Comparator;

public class OrdenarVirusPorID implements Comparator<Virus> {

	@Override
	public int compare(Virus o1, Virus o2) {
		return o1.getID() - o2.getID();
	}

}
