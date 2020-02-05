package ejercicio;

import java.util.ArrayList;

public class Catalogo extends ArrayList<Obra> {
	
	public Catalogo() {
		new ArrayList<Obra>();
	}

	@Override
	public boolean add(Obra obra) {
		// TODO Auto-generated method stub
		boolean result =  this.contains(obra);
		
		if (!result) {
			super.add(obra);
		}
		
		return super.add(obra);
	}
	
	
	
}
