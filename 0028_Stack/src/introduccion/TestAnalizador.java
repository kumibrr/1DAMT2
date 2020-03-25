package introduccion;

public class TestAnalizador {

	public static void main(String[] args) {
		
		// Si hago la pila de la clase, cuando vuelvo a llamarlo para analizar código después de un error, no está vacío
		// Por lo que empieza a dar fallos. Por esa razón son métodos estáticos.
		
		System.out.println("********Código OK********");
		String codigoBueno = "public class main{System.out.println(funcionChula())}";
		System.out.println(Analizador.checkCode(codigoBueno));
		System.out.println("\n");
		
		System.out.println("********Falta cierre de '}'********");
		String codigoFaltaCierre = "public class main{System.out.println(funcionChula())";
		System.out.println(Analizador.checkCode(codigoFaltaCierre));
		System.out.println("\n");
		
		System.out.println("********Cierre antes que apertura********");
		String codigoCierreAntes = "public class main}{System.out.println(funcionChula())}";
		System.out.println(Analizador.checkCode(codigoCierreAntes));
		System.out.println("\n");
	}

}
