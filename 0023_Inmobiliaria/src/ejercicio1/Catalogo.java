package ejercicio1;

import java.util.ArrayList;

public class Catalogo implements IAgencia {
	
	private ArrayList<Inmueble> catalogo = new ArrayList<Inmueble>(); 

	@Override
	public boolean a�adeAlquilerInmueble(Inmueble inmueble) {
		boolean result = false;
		/*Definir un m�todo a�adeVentaInmueble(in), que a�ade el inmueble
dado por el par�metro a la secuencia de inmuebles en venta de la agencia,
siempre que no estuviera ya antes en venta.
		*/
		if (catalogo == null || catalogo.isEmpty() ) {
			catalogo.add(inmueble);
			result = true;
		} else if(!equals(inmueble)) {
			catalogo.add(inmueble);
			result = true;
		}
		
		return result;
	}

	@Override
	public ArrayList<Inmueble> inmueblesVenta(Float precio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Inmueble> SegundaMano(Float superficie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int solaresRusticos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IAgencia funsion(IAgencia agencia) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean equals(Inmueble inmueble) {
		boolean result = false;
		for (int i = 0; i < catalogo.size(); i++) {
			if (catalogo.get(i).equals(inmueble) == true) {
				result = true;
			}
		}
		return result;
	}
	
	public String toString() {
		String result="";
		
		for (int i = 0; i < catalogo.size(); i++) {
			result += catalogo.get(i).toString();
		}
		
		return result;
		
	}

}
