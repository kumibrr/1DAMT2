package introduccion;

import java.util.Stack;

public class Analizador {
	
	public static String checkCode(String code) {
		String result = "";
		
		switch(analyzeCode(code)) {
		
		case 0: result = "Compilacion correcta";
			break;
		case 1: result = "Compilación errónea. Símbolo de cierre presente antes que de apertura.";
			break;
		case 2: result = "Compilación errónea. No se han cerrado todos los símbolos de apertura.";
			break;
		case 3: result = "Compilación errónea. El orden de los símbolos es erróneo.";
			break;
		}
		
		
		return result;
	}
	
	private static int analyzeCode(String code) {
		Stack<Character> stack = new Stack<Character>();
		char[] codeArray;
		codeArray = code.toCharArray();
		
		for(char c : codeArray) {
			if(c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else if(c == ')' || c == ']' || c == '}') {
				if(stack.empty() == true) {
					return 1;
				} else if (stack.peek() == '(' && c == ')') {
					stack.pop();
				} else if(stack.peek() == '[' && c == ']') {
					stack.pop();
				} else if(stack.peek() == '{' && c == '}') {
					stack.pop();
				} else {
					return 3;
				}
				
			}
		}
		
		if(stack.empty()) {
			return 0;
		} else {
			return 2;
		}

	}
	
	
}
