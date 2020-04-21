package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class Impresora {
	
	//Para las colas uso la clase LinkedList porque es fifo, en lugar de la clase Stack, que es lifo
	
	private LinkedList<Documento> colaAlumnos = new LinkedList<Documento>();
	private LinkedList<Documento> colaProfesores = new LinkedList<Documento>();
	
	private HashMap<String, ArrayList<Documento> > historial = new HashMap<String, ArrayList<Documento> >();
	
	public Impresora() {
		
	}
	
	public Documento imprimir() throws InterruptedException {
		Documento doc;
		
		if(!colaProfesores.isEmpty()) {
			doc = colaProfesores.remove();
			doc.getPaginas();
			
		} else if(!colaAlumnos.isEmpty()) {
			doc = colaAlumnos.remove();
		} else {
			doc = null;
		}
		
		if(doc != null) {
			System.out.println("\nSe va a imprimir => " + doc.toString());
			if(historial.containsKey(doc.getCliente().getDni()) == true) {
				historial.get(doc.getCliente().getDni()).add(doc);
			} else {
				historial.put(doc.getCliente().getDni(), new ArrayList<Documento>());
				historial.get(doc.getCliente().getDni()).add(doc);
			}
			for(int i = 0; i < doc.getPaginas(); i++) {
				Thread.sleep(100);
			}
		}
		return doc;
	}
	
	public int addDocumento(Documento doc) {
		int status = 0;
		// status=0 => nothing happened.
		// status=1 => added successfully to colaAlumnos
		// status=2 => added successfully to colaProfesores
		
		if(doc.getCliente() instanceof Profesor) {
			colaProfesores.add(doc);
			status = 2;
		} else if(doc.getCliente() instanceof Alumno) {
			colaAlumnos.add(doc);
			status = 1;
		}
		
		return status;
	}
	
	public ArrayList<Documento> findHistorialDni(String dni) {
		ArrayList<Documento> response = null;
		if(historial.containsKey(dni)) {
			response = historial.get(dni);
		}
		return response;
	}
	
	public HashMap<String, ArrayList<Documento> > getHistorialSortByNombre(){
		HashMap<String, ArrayList<Documento>> response = new HashMap<String, ArrayList<Documento>>();
		
		Set<String> keys = historial.keySet();
		ArrayList<String> arrayList = new ArrayList<String>();
		for (String key : keys) {
			arrayList.add(key.toString());
			
		}
		Collections.sort(arrayList, new OrdenarClienteAlfabeticamente());
		
		for (int i = 0; i < arrayList.size(); i++) {
			response.put(arrayList.get(i), historial.get(arrayList.get(i)));
		}
		
		return response;
	}
	
	public String toString() {
		return "ColaAlumnos=" + colaAlumnos.toString() + "\n\nColaProfesores=" + colaProfesores.toString();
	}
	
}
