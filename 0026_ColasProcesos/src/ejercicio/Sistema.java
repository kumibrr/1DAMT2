package ejercicio;

import java.util.List;

public class Sistema {
	//Gestorcolas
	private Cola cola1, cola2, cola3;
	private List<Proceso> precarga;
	private List<Proceso> tiempoReal;
	
	//lista precarga
	//lista tiempoReal
	
	Sistema(){
		 cola1 = Cola.creaCola();
		 cola2 = Cola.creaCola();
		 cola3 = Cola.creaCola();
	}
	
	public void cargarListas(){
		
	}
}
