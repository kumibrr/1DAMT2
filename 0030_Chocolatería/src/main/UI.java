package main;

import java.util.Scanner;

public class UI {
	private Scanner input = new Scanner(System.in);
	
	public void play() {
		mainMenu();
	}
	
	public void mainMenu() {
		System.out.flush();
		System.out.println("---------Menu Principal-------");
		System.out.println("1. Anadir chocolate");
		System.out.println("2. Modificar entrada");
		System.out.println("3. Borrar entrada");
		System.out.println("4. Mostrar un elemento de la lista");
		System.out.println("5. Mostrar toda la lista");
		System.out.println("6. Salir");
		System.out.println("\n\nElige una opción:");
	}
	
	public void insertarMenu() {
		System.out.flush();
		System.out.println("---------Menu Anadir-------");
		System.out.println("Escriba el nombre del chocolate que va a anadir: ");
		System.out.println("Qué tipo de chocolate es?");
		System.out.println("1.Blanco\t2.Negro 70%\t3.Negro 90%\t4.Negro 100%\t5.Con leche\t6.Con avellanas.");
		
		System.out.println("Registro añadido correctamente!");
		System.out.println("Algo ha ido mal, intentelo de nuevo! :S");
	}
	
	public void modificarMenu() {
		System.out.flush();
		System.out.println("---------Menu Modificar-------");
		
		System.out.println("Seleccione a modificar:");
		
		System.out.println("Operación correcta!");
		System.out.println("Operación errónea.");
	}
	
	public void borrarMenu() {
		System.out.flush();
		System.out.println("---------Menu Borrar-------");
		
		
		System.out.println("Selecciona un elemento a borrar:");
	}
	
	public void mostrarItemMenu() {
		System.out.flush();
		System.out.println("Selecciona un elemento de la lista para mostrar sus detalles.");
		System.out.println("");
	}
	
	public void mostrarTodo() {
		System.out.flush();
		System.out.println();
		
		System.out.println();
	}
}
