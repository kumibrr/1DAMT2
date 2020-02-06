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
		
		return !result;
	}
	
	public String toString() {
		StringBuilder cadena = new StringBuilder();
		
		for(Obra obr:this) {
			
			cadena.append(obr.toString() + "\n");
		}
		
		return cadena.toString();
	}
	
	public boolean addObra(Obra obra) {
		boolean result = false;
		
		if(this.size() != 0) {
			for (int i = 0; i < this.size(); i++) {
				
				if(obra.getStorageID() != this.get(i).getStorageID()) {
					result = true;
					this.add(obra);
				}

			}
		} else {
			result = true;
			this.add(obra);
		}
		
		return result;
	}
	
	public boolean removeObra(String storageID) {
		boolean result = false;
		
		for (int i = 0; i < this.size(); i++) {
			if (this.get(i).getStorageID() == storageID) {
				this.remove(i);
				result = true;
			}
		}
		
		return result;
	}
	
	
}
