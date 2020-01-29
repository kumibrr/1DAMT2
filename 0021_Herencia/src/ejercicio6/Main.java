package ejercicio6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UI interfaz = new UI();
		ListaEmpleados lista = new ListaEmpleados();
		interfaz.salidaConsola(lista.toString());
		interfaz.salidaGrafica(lista.toString());
		
		
		ListaEmpleadosV2 listav2 = new ListaEmpleadosV2();
		interfaz.salidaGrafica(listav2.toString());
	}

}
