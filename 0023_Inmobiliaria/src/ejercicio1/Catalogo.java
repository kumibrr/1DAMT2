package ejercicio1;

import java.util.ArrayList;

public class Catalogo implements IAgencia {
	
	private ArrayList<Inmueble> catalogo; 

	@Override
	public boolean a�adeAlquilerInmueble(Inmueble inmueble) {
		boolean result = false;
		boolean equalsFlag = false;
		/*Definir un m�todo a�adeVentaInmueble(in), que a�ade el inmueble
dado por el par�metro a la secuencia de inmuebles en venta de la agencia,
siempre que no estuviera ya antes en venta.
		*/
		for (int i = 0; i < catalogo.size(); i++) {
			if (catalogo.get(i).equals(inmueble) == true) {
				equalsFlag = true;
			}
		}
		if (!equalsFlag) {
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

}
