package project;

import java.util.Comparator;

public class OrdenarClienteAlfabeticamente implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int response = 0;
		
		o1.toCharArray();
		o2.toCharArray();
		
		int counto1 = 0;
		int counto2 = 0;
			
			if (o1.length() > o2.length()) {
				response = 1;
			} else if (o1.length() < o2.length()) {
				response = -2;
			} else {
				
				for(int i = 0; i < o1.length(); i++) {
					if (o1.charAt(i) > o2.charAt(i)) {
						counto2++;
					} else {
						counto1++;
					}
				}
				
				if (counto1 > counto2) {
					response = -1;
				} else {
					response = 2;
				}
			}
		
		return response;
	}

}
