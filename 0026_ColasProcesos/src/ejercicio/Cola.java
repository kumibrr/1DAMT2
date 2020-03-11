package ejercicio;

import java.util.LinkedList;
import java.util.List;

public class Cola {
	
	private List<Proceso> cola;
	
	//El constructor se debe acceder mediante otro metodo cuando sean datos delicados.
	private Cola() {
		cola = new LinkedList<Proceso>();
	}
	
	public void inscola(Proceso p) {
		cola.add(p);
	}
	
	public Proceso desenCola() {
		Proceso tmp = null;
		if (cola.size() > 0) {
			cola.get(0);
			cola.remove(0);
		}
		return tmp;
	}
	
	public boolean esVaciaCola() {
		boolean result = false;
		if (cola.size() == 0) {
			result = true;
		}
		return result;
	}
	
	public String toString() {
		String result="Cola{\n";
		
		for(int i = 0; i < cola.size(); i++) {
			result += cola.get(i).toString();
		}
		result += "}"; 
		return result;
	}
	
	public static Cola creaCola() {
		return new Cola();
	}
}
