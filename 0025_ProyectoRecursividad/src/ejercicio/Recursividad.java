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
}
