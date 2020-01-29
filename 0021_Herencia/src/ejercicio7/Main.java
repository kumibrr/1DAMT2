package ejercicio7;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList lista = new ArrayList<Inmueble>();
		
		lista.add(new Piso("2", 24, 30000f, false, 14, 7));
		lista.add(new Local("1", 60, 55000f, true, 0, 5));
		
		System.out.println(lista.get(0).toString());
		System.out.println(lista.get(1).toString());
	}

}
