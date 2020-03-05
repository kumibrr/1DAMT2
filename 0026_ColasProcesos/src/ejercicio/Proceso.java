package ejercicio;

import java.util.Random;

public class Proceso {
	int id;
	int tiempo;
	int prioridad;
	
	public Proceso(int id, int prioridad){
		this.id = id;
		this.tiempo = new Random().nextInt(1800) + 200;
		if(prioridad >=1 && prioridad <= 3) {
			this.prioridad = prioridad;
		}
	}
	
	public String toString() {
		return id + "[Prioridad: " + prioridad + ".\t Tiempo: " + tiempo + "]\n";
	}
}
