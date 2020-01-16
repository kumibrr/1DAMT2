package ejercicio;

public class Strings {
	
	public static String classificator(String test) {
		int letrasMinus = 0;
		int letrasMayus = 0;
		int caracterEspecial = 0;
		int caracterNumerico = 0;
		int testLenght = test.length();
		String retorno = "";
		
		for (int index = 0; index < testLenght; index++) {
			
			if (test.charAt(index) >= 'a' && test.charAt(index) <= 'z') {
				letrasMinus++;
			} else if(test.charAt(index) >= 'A' && test.charAt(index) <= 'Z'){
				letrasMayus++;
			} else if(test.charAt(index) >= '0' && test.charAt(index) <= '9') {
				caracterNumerico++;
			} else {
				caracterEspecial++;
			}
			
		}
		
		retorno = "minusculas: " + letrasMinus + "\nmayusculas: " + letrasMayus + "\nnumeros: " + caracterNumerico + "\nespeciales: " + caracterEspecial;
		
		return retorno;
	}
	
	public static Integer stringIntCast(String integerString) {
		
		int num = 0, pos = 0, quantity = 0;
		char number;
		boolean isValid = true;
		Integer result;
		
		for (int index = integerString.length() - 1; index >= 0 && isValid == true; index--,pos++) {
			
			number = integerString.charAt(index);
			num = number - 48;
			
			if (num < 0 || num > 9) isValid = false;
			
			quantity = (int) (quantity + num * Math.pow(10, pos));
		}
		
		if (isValid == true) {
			result = quantity;
		} else {
			result = null;
		}
			
		return result;
	}
	
	//ejercicio1
	public static String toLineString(String cadena) {
		String result="";
		for (int index = 0; index < cadena.length(); index++) {
			
			result = result + cadena.charAt(index) + "\n";
		
		}
		return result;
	}
	//ejercicio2
	public static boolean areMostlyEqual(String cadena1, String cadena2) {
		boolean areEqual = true;
		cadena1 = cadena1.toLowerCase();
		cadena2 = cadena2.toLowerCase();
		
		if (cadena1.length() != cadena2.length()) {
			areEqual = false;
		} else {
			for (int index = 0; index < cadena1.length(); index++) {
				if (cadena1.charAt(index) != cadena2.charAt(index)) {
					areEqual = false;
				}
			}
		}
		
		return areEqual;
	}
	
	//ejercicio4
	
	public static String reverse(String cadena) {
		String result="";
		
		for (int index = cadena.length() - 1; index >= 0; index--) {
			result = result + cadena.charAt(index);
		}
		
		return result;
	}
	
	//ejercicio5
	
	public static boolean capicua(String cadena) {
		boolean isCapicua = true;
		
		for (int index1 = 0, index2 = cadena.length() - 1; index1 < cadena.length()/2; index1++,index2--) {
			
			if (cadena.charAt(index1) != cadena.charAt(index2)) {
				isCapicua = false;
			}
			
		}
		return isCapicua;
	}
	
	//ejercicio6
	
	
	public static int appears(String cadena, char letra) {
		int occurrences = 0;
		for (int index = 0; index < cadena.length(); index++) {
			if (cadena.charAt(index) == letra) {
				occurrences++;
			}
		}
		return occurrences;
	}
	
	//ejercicio7 (falla)
	//A -> a = 32 entre ambos.
	
	public static boolean areMostlyEqualTwo(String cadena1, String cadena2) {
		boolean areEqual = true;
		char car;
		String cadena1Min = "", cadena2Min = "";
		
		if (cadena1.length() != cadena2.length()) {
			areEqual = false;
		} else {
			for (int index = 0; index < cadena1.length(); index++) {
					if (cadena1.charAt(index) >= 'A' && cadena1.charAt(index) <='Z') {
						car = (char) (cadena1.charAt(index) + 32);
					} else {
						car = cadena1.charAt(index);
					}
				cadena1Min = cadena1Min + car;
					if (cadena2.charAt(index) >= 'A' && cadena2.charAt(index) <='Z') {
						car = (char) (cadena2.charAt(index) + 32);
					} else {
						car = cadena2.charAt(index);
					}
				cadena2Min = cadena2Min + car;
			}
			
			for (int index = 0; index < cadena1Min.length(); index++) {
				if (cadena1Min.charAt(index) != cadena2Min.charAt(index)) {
					areEqual = false;
				}
			}
		}
		return areEqual;
	}
	
	//ejercicio8
	
	public static String timesInAnArray(String cadena) {
		int[] abecdario = new int[26];
		String resultado = "Minusculas: \n";
		char letra = 0;
		
		for (int index = 0; index < cadena.length(); index++) {
			abecdario[cadena.charAt(index) - 97]++;
		}
		
		for (int index = 0; index < abecdario.length; index++) {
			letra = (char) (index + 97);
			resultado = resultado + letra + ": " + abecdario[index] + "\t";
		}
		
		return resultado;
	}
	
	//ejercicio9
	
	public static void UpperFirstLetter(String cadena) {
		
		
		
	}
	
}
