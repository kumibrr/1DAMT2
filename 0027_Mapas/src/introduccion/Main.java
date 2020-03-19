package introduccion;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Virus> mapaVirus = new HashMap<String, Virus>();
		
		mapaVirus.put("Viruela", new Virus("VariolaVirus", 7));
		mapaVirus.put("COVID19", new Virus("CoronaVirus", 3));
		mapaVirus.put("SARS", new Virus("CoronaVirus", 1));
		mapaVirus.put("MERS", new Virus("CoronaVirus",5));
		mapaVirus.put("Carbunco", new Virus("Antrax", 8));
		mapaVirus.put("Ebola", new Virus("Ebolavirus", 6));
		mapaVirus.put("SIDA", new Virus("VIH", 3));
		mapaVirus.put("DEN1", new Virus("Dengue", 6));
		mapaVirus.put("DEN2", new Virus("Dengue", 8));
		mapaVirus.put("DEN4", new Virus("Dengue", 9));
		mapaVirus.put("DEN4", new Virus("Dengue", 9));
		
		//mapaVirus.remove("VariolaVirus");
		
		//mapaVirus.clear();
		
		System.out.println(mapaVirus.containsKey("Viruela"));
		System.out.println(mapaVirus.containsValue(mapaVirus.get("Viruela")));
		
		System.out.println(mapaVirus.containsValue(new Virus("VariolaVirus",7)));
		
		Virus virusMalo = new Virus("Hepatitis",7);
		mapaVirus.put("Hepatitis C", virusMalo);
		System.out.println(mapaVirus.containsValue(virusMalo));
		
		System.out.println(mapaVirus);
		System.out.println(mapaVirus.entrySet());
		System.out.println(mapaVirus.keySet());
		System.out.println(mapaVirus.size());
		System.out.println(mapaVirus.get("Viruela"));
		System.out.println(mapaVirus.values());
		
		LinkedHashMap<String, Virus> linkedMapaVirus = new LinkedHashMap<String, Virus>();
		
		linkedMapaVirus.putAll(mapaVirus);
		
		System.out.println(linkedMapaVirus);
		
		System.out.println(linkedMapaVirus.containsKey("Viruela"));
		System.out.println(linkedMapaVirus.containsValue(new Virus("VariolaVirus",7)));
		System.out.println(linkedMapaVirus.containsValue(mapaVirus.get("Viruela")));
		
		TreeMap<String, Virus> arbolVirus = new TreeMap<String, Virus>();
		
		arbolVirus.put("Viruela", new Virus("VariolaVirus", 7));
		arbolVirus.put("COVID19", new Virus("CoronaVirus", 3));
		arbolVirus.put("SARS", new Virus("CoronaVirus", 1));
		arbolVirus.put("MERS", new Virus("CoronaVirus",5));
		arbolVirus.put("Carbunco", new Virus("Antrax", 8));
		arbolVirus.put("Ebola", new Virus("Ebolavirus", 6));
		arbolVirus.put("SIDA", new Virus("VIH", 3));
		arbolVirus.put("DEN1", new Virus("Dengue", 6));
		arbolVirus.put("DEN2", new Virus("Dengue", 8));
		arbolVirus.put("DEN4", new Virus("Dengue", 9));
		
		System.out.println(arbolVirus);
		
		System.out.println(arbolVirus.get("Carbunco"));
		System.out.println(arbolVirus.size());
		System.out.println(mapaVirus.get("Viruela").getClass());
		System.out.println(arbolVirus.descendingKeySet());
		System.out.println(arbolVirus.descendingMap());
	}

}
