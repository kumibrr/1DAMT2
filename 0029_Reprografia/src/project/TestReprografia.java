package project;

import java.util.Scanner;

public class TestReprografia {
	
	static Impresora impresora = new Impresora();
	Scanner input = new Scanner(System.in);
	
	

	public static void main(String[] args) throws InterruptedException {
		
		Documento documentoProfesor1 = new Documento(new Profesor("2341","Alberto",Dpto.BIOLOGIA), 1);
		Documento documentoAlumno1 = new Documento(new Alumno("414215D","Jose Manuel",Curso.BACH2),2);
		
		
		impresora.colaAlumnos.add(documentoAlumno1);
		impresora.colaProfesores.add(documentoProfesor1);
		
		System.out.println(impresora.toString());
		impresora.imprimir();
		System.out.println(impresora.toString());
		impresora.imprimir();
		System.out.println(impresora.toString());
		
		
	}

	
	private void menu() throws InterruptedException {
		System.out.println("-------MENU PRINCIPAL--------");
		System.out.println("1.Imprimir siguiente trabajo\t2.Consultar historial de fotocopias\n");
		
		int option = input.nextInt();
		
		if(option == 1) {
			impresora.imprimir();
		} else if(option == 2) {
			int menuHistorialResult = menuHistorial();
		} else {
			System.out.println("Opción no válida");
		}
		
		
		input.close();
	}
	
	private int menuHistorial() {
		System.out.println("-------HISTORIAL DE IMPRESIONES--------");
		System.out.println("1.Buscar por DNI\t2.Todos los usuarios y trabajos ordenados por DNI");
		System.out.println("3.Todos los usuarios y trabajos ordenados por nombre\t4.Volver al menu principal");
		int option = input.nextInt();
		
		if(option == 1) {
			
		} else if(option == 2) {
			
		} else if(option == 3) {
			
		} else if(option == 4) {
			
		}
		
		return 1;
		
	}

}
