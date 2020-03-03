package ejercicio;

import java.util.ArrayList;

public class TestRecursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> arraylista = new ArrayList<Object>();
		arraylista.add(new String("hola0"));
		arraylista.add(new String("hola1"));
		arraylista.add(new String("hola2"));
		arraylista.add(new String("hola3"));
		System.out.println(Recursividad.buscarSustituirArray(arraylista, "hola3", "Que tal"));
		Recursividad.arrayListCorrida(arraylista);
		
	}

}
