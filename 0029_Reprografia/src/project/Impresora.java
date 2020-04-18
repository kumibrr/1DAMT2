package project;

import java.util.LinkedList;

public class Impresora {
	
	//Para las colas uso la clase LinkedList porque es fifo, en lugar de la clase Stack, que es lifo
	
	LinkedList<Documento> colaAlumnos = new LinkedList<Documento>();
	LinkedList<Documento> colaProfesores = new LinkedList<Documento>();
	
	public Impresora() {
		
	}
	
	public Documento imprimir() throws InterruptedException {
		Documento result;
		
		if(colaProfesores.isEmpty() == false) {
			result = colaProfesores.remove();
			result.getPaginas();
			
		} else if(colaAlumnos.isEmpty() == false) {
			result = colaAlumnos.remove();
		} else {
			result = null;
		}
		
		if(result != null) {
			System.out.println("\nSe va a imprimir => " + result.toString());
			for(int i = 0; i < result.getPaginas(); i++) {
				Thread.sleep(10000);
			}
		}
		
		
		return result;
	}
	
	public String toString() {
		return "ColaAlumnos=" + colaAlumnos.toString() + "\n\nColaProfesores=" + colaProfesores.toString();
	}
	
}
