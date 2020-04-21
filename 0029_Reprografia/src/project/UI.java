package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UI {
	
	Scanner input = new Scanner(System.in);
	Impresora impresora;
	
	public UI(Impresora impresora) {
		this.impresora = impresora;
	}
	
	public boolean menu() throws InterruptedException {
		boolean exit = false;
		
		System.out.println("\n\n\n\n\n\n-------MENU PRINCIPAL--------");
		System.out.println("1.Imprimir siguiente trabajo\t2.Consultar historial de fotocopias\t3.Salir del programa\n");
		
		int option = input.nextInt();
		
		if(option == 1) {
			impresora.imprimir();
			System.out.println(impresora.toString());
		} else if(option == 2) {
			int menuHistorialResult = menuHistorial();
		} else if(option == 3){
			input.close();
			exit = true;
		}
		return exit;
	}
	
	public int menuHistorial() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------HISTORIALES--------");
		System.out.println("1.Buscar por DNI\t2.Todos los usuarios y trabajos ordenados por DNI");
		System.out.println("3.Todos los usuarios y trabajos ordenados por nombre\t4.Volver al menu principal");
		int option = input.nextInt();
		
		if(option == 1) {
			System.out.println("Introduce el dni");
			String dni = input.next().toString();
			ArrayList<Documento> response = impresora.findHistorialDni(dni);
			if (response != null) {
				System.out.println(response.toString());
			} else {
				System.out.println("No se ha encontrado un resultado válido");
			}
		} else if(option == 2) {
			HashMap<String, ArrayList<Documento>> response = null;
			response = impresora.getHistorialSortByNombre();
			System.out.println(response.toString());
			
		} else if(option == 3) {
			
		} else if(option == 4) {
			
		}
		
		return 1;
		
	}
}
