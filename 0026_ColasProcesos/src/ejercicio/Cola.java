package ejercicio;

import java.util.LinkedList;

public class Cola {
	
	private LinkedList<Proceso> cola;
	
	//El constructor se debe acceder mediante otro metodo cuando sean datos delicados.
	private Cola() {
		cola = new LinkedList<Proceso>();
	}
	
	public void inscola(Proceso p) {
		
	}
	
	public Proceso desenCola() {
		return null;
	}
	
	public boolean esVaciaCola() {
		return false;
	}
	
	public String toString() {
		return "";
	}
	
	public LinkedList<Proceso> creaCola() {
		return new LinkedList<Proceso>();
	}
}
