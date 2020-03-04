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
		System.out.println(Recursividad.todosEquals(arraylista, "hola"));
		Recursividad.corridaArrayLista(arraylista);
		
		ArrayList<Integer> arrayListaInt = new ArrayList<Integer>();
		arrayListaInt.add(40);
		arrayListaInt.add(-30);
		arrayListaInt.add(20);
		arrayListaInt.add(-50);
		arrayListaInt.add(10);
		Recursividad.corridaArrayListaInt(Recursividad.positivos(arrayListaInt));
		
	}

}
