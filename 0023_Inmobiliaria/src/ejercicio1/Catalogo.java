package ejercicio1;

import java.util.ArrayList;

public class Catalogo implements IAgencia {
	
	private ArrayList<Inmueble> catalogo = new ArrayList<Inmueble>(); 

	@Override
	public boolean añadeAlquilerInmueble(Inmueble inmueble) {
		boolean result = false;
		/*Definir un método añadeVentaInmueble(in), que añade el inmueble
dado por el parámetro a la secuencia de inmuebles en venta de la agencia,
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
		ArrayList<Inmueble> resultado = new ArrayList<Inmueble>();
		
		for (int i = 0; i < catalogo.size(); i++) {
			if (catalogo.get(i).getPrecio() <= precio) {
				resultado.add(catalogo.get(i));
			}
		}
		
		return resultado;
	}

	@Override
	public ArrayList<Inmueble> SegundaMano(Float superficie) {
		ArrayList<Inmueble> resultado = new ArrayList<Inmueble>();
		
		for (int i = 0; i < catalogo.size(); i++) {
			if (catalogo.get(i).getClass().getSimpleName() == "LocalComercial" && catalogo.get(i).getSqrMetros() > superficie) {
				resultado.add(catalogo.get(i));
			}
		}
		
		return resultado;
	}

	@Override
	public int solaresRusticos() {
		int result = 0;
		
		for (int i = 0; i < catalogo.size(); i++) {
			if (catalogo.get(i).getClass().getSimpleName() == "Solar" && ((Solar) catalogo.get(i)).getZonaSolar() != ZonaSolar.URBANA) {
				result++;
			}
		}
		return result;
	}

	@Override
	public ArrayList<Inmueble> funsion(ArrayList<Inmueble> agencia) {
		ArrayList<Inmueble> resultado = new ArrayList<Inmueble>();
		
		for (int i = 0; i < agencia.size(); i++) {
			resultado.add(agencia.get(i));
		}
		for (int i = 0; i < catalogo.size(); i++) {
			resultado.add(catalogo.get(i));
		}
		return resultado;
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
