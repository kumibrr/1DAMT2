package ejercicio5;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList profesores = new ArrayList();
		
		profesores.add(new Profesor("Suave", "Garcia", "Mumbo", "dni", EstadoCivil.casado, 2010, Departamento.Filosofia, 0));
		profesores.add(new Profesor("Pedro", "Perez", "Pardo", "dni2", EstadoCivil.soltero, 2014, Departamento.Historia, 3));
		
		for (Object prof:profesores) {
			if (prof instanceof Profesor) {
				System.out.println(((Profesor) prof).getDepartamento());
			}
		}
	}

}
