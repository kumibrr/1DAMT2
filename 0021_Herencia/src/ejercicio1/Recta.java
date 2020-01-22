package ejercicio1;

public class Recta extends Punto {
	@SuppressWarnings("unused")
	private int coordenadaInicioX;
	@SuppressWarnings("unused")
	private int coordenadaInicioY;
	@SuppressWarnings("unused")
	private int coordenadaFinX;
	@SuppressWarnings("unused")
	private int coordenadaFinY;
	
	Recta(Punto inicio, Punto fin){
		coordenadaInicioX = inicio.coordenadaX;
		coordenadaInicioY = inicio.coordenadaY;
		coordenadaFinX = fin.coordenadaX;
		coordenadaFinY = fin.coordenadaY;
	}
	
	
}
