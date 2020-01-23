package ejercicio1;
/*Enunciado ejercicio1: 
Crear una clase Punto representada por sus coordenadas x e y y con los métodos habituales. Las
coordenadas deben ser visibles para posibles subclases. 

Enunciado ejercicio2:
- Crear una clase Círculo representada por un radio y que herede el punto de la clase anterior.

 Enunciado ejercicio3:
  Ahora que sabemos que todas las clases heredan automaticamente de la clase Object, redefinir el
método toString de la clase Punto, para que además del punto en formato “(x,y)”, aparezca el
cuadrante al que pertenece. 

Enunciado ejercicio4:
 Redefinir el método equals, para que devuelva que dos puntos son iguales si pertenecen al
mismo cuadrante.
*/

public class Punto {
	
	protected int coordenadaX;
	protected int coordenadaY;
	public static final int X = 1, Y=0;
	public static final int CUADRANTE1 = 0, CUADRANTE2 = 1, CUADRANTE3 = 2, CUADRANTE4 = 3;
	
	public Punto() {
		coordenadaX = 0;
		coordenadaY = 0;
	}
	
	public Punto(int x, int y) {
		coordenadaX = x;
		coordenadaY = y;
	}
	
	public int getCoordenada(int flag) {
		@SuppressWarnings("null")
		int result = (Integer) null;
		if (flag == 1) {
			result = coordenadaX;
		} else if(flag == 0) {
			result = coordenadaY;
		}
		return result;
	}
	
	public void setCoordenada() {
		
	}
	
	public String toString() {
		int valueCuadrante = detectCuadrante();
		String cuadrante;
		if (valueCuadrante == CUADRANTE1) {
			cuadrante = "1er Cuadrante";
		} else if (valueCuadrante == CUADRANTE2){
			cuadrante = "2o Cuadrante";
		} else if (valueCuadrante == CUADRANTE3) {
			cuadrante = "3er Cuadrante";
		} else if (valueCuadrante == CUADRANTE4) {
			cuadrante = "4o cuadrante";
		}else {
			cuadrante = "undetermined cuadrante";
		}
		return "(" + coordenadaX + "," + coordenadaY + ")" + cuadrante;
	}
	
	public int detectCuadrante() {
		int cuadrante=9;
		if ((coordenadaX >= 0 && coordenadaY >= 0)) {
			cuadrante = CUADRANTE1;
		} else if (coordenadaX <= 0 && coordenadaY >= 0){
			cuadrante = CUADRANTE2;
		} else if (coordenadaX <= 0 && coordenadaY <= 0) {
			cuadrante = CUADRANTE3;
		} else if (coordenadaX >= 0 && coordenadaY <= 0) {
			cuadrante = CUADRANTE4;
		}
		return cuadrante;
	}
	
	public boolean equals(Object obj) {
		return detectCuadrante() == ((Punto)obj).detectCuadrante();
	}
	
}
