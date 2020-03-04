package ejercicio;

import java.util.ArrayList;

public class Recursividad {
	public static int recursivo(int i,int fin) {
		if(i<=fin) {
			return i + recursivo(i+1, fin);
		} else {
			return fin;
		}
	}
	public static int factorial(int i) {
		if(i>=1) {
			return i * factorial(i-1);
			
		} else {
			return 1;
		}
	}
	public static int pow(int i, int pow) {
		if(pow>=1) {
			return i * pow(i,pow-1);
		}
		else {
			return 1;
		}
	}
	
	private static void arrayListCorrida(ArrayList<Object> arraylist, int i) {
		
		if(i < arraylist.size()) {
			System.out.println(arraylist.get(i));
			arrayListCorrida(arraylist, i+1);
		}
		
	}
	
	public static void arrayListCorrida(ArrayList<Object> arraylist) {
		
		arrayListCorrida(arraylist, 0);
		
	}
	
	private static boolean buscarArray(ArrayList<Object> arraylist, Object obj, int i) {
			
		if(i < arraylist.size() && !arraylist.contains(obj)) {
			buscarArray(arraylist, obj, i+1);
		} else if(arraylist.equals(obj)) {
			return true;
		} 
		
		return false;
		
	}
	
	public static boolean buscarArray(ArrayList<Object> arraylist, Object obj) {
		return buscarArray(arraylist, obj,0);
		}
	
	private static boolean buscarSustituirArray(ArrayList<Object> arraylista, Object buscar, Object sustituir, int i) {
		if(i == arraylista.size()) {
			return false;
		} else if(arraylista.get(i).equals(buscar)) {
			arraylista.set(i,sustituir);
			return buscarSustituirArray(arraylista, buscar, sustituir, i+1) || true;	
		} else {
			return buscarSustituirArray(arraylista, buscar, sustituir, i+1);
		}
	
	}
	
	public static boolean buscarSustituirArray(ArrayList<Object> arrayLista, Object buscar, Object sustituir) {
		return buscarSustituirArray(arrayLista, buscar, sustituir, 0);
	}
	
	private static boolean todosEquals(ArrayList<Object> arrayLista, Object buscar, int i) {
		if (i == arrayLista.size()) {
			return true;
		} else if(arrayLista.get(i).equals(buscar)) {
			return todosEquals(arrayLista, buscar, i+1) && true;
		} else {
			return false;
		}
	}
	
	public static boolean todosEquals(ArrayList<Object> arrayLista, Object buscar) {
		return todosEquals(arrayLista, buscar, 0);
	}
	
	public static void corridaArrayLista(ArrayList<Object> arrayLista) {
		if(arrayLista.size() != 0) {
			System.out.println(arrayLista.get(0));
			arrayLista.remove(0);
			corridaArrayLista(arrayLista);
		} else {
			
		}
	}
	
	public static void corridaArrayListaInt(ArrayList<Integer> arrayLista) {
		if(arrayLista.size() != 0) {
			System.out.println(arrayLista.get(0));
			arrayLista.remove(0);
			corridaArrayListaInt(arrayLista);
		} else {
			
		}
	}
	
	private static int sumaRecursiva(ArrayList<Integer> arrayListaInt, int i) {
		if (i < arrayListaInt.size()) {
			return arrayListaInt.get(i) + sumaRecursiva(arrayListaInt,i+1);
		} else {
			return 0;
		}
	}
	
	public static int sumaRecursiva(ArrayList<Integer> arrayListaInt) {
		return sumaRecursiva(arrayListaInt, 0);
	}
	
	private static int mediaRecursiva(ArrayList<Integer> arrayListaInt, int i) {
		if(i == arrayListaInt.size()) {
			return 0;
		} else if(i == 0) {
			return (arrayListaInt.get(i) + mediaRecursiva(arrayListaInt,i+1))/arrayListaInt.size();
		} else {
			return arrayListaInt.get(i) + mediaRecursiva(arrayListaInt,i+1);
		}

		
	}
	
	public static int mediaRecursiva(ArrayList<Integer> arrayListaInt) {
		return mediaRecursiva(arrayListaInt, 0);
	}
	
	private static ArrayList<Integer> positivos(ArrayList<Integer> arrayListaInt, int i){	
		if(i == arrayListaInt.size()) {
			return new ArrayList<Integer>();
		} else if(arrayListaInt.get(i) > 0) {
			ArrayList<Integer> listaP = positivos(arrayListaInt,i+1);
			listaP.add(arrayListaInt.get(i));
			return listaP;
		} else {
			return positivos(arrayListaInt, i+1);
		}
		
	}
	
	public static ArrayList<Integer> positivos(ArrayList<Integer> arrayListaInt){
		return positivos(arrayListaInt, 0);
	}
	
	private static void randomList(ArrayList<Integer> lista,int size, int i){
		if (lista.size() == 0) {
			
		}
	}
	
	public static ArrayList<Integer> randomList(int size){
		ArrayList<Integer> lista = new ArrayList<Integer>();
		randomList(lista,size, 0);
		return lista;
	}
	
}
