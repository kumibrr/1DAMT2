package project;

public class TestReprografia {
	
	static Impresora impresora = new Impresora();

	public static void main(String[] args) throws InterruptedException {
		
		Documento documentoProfesor1 = new Documento(new Profesor("111111","Alberto",Dpto.BIOLOGIA), 1);
		Documento documentoAlumno1 = new Documento(new Alumno("222222","Jose Manuel",Curso.BACH2),2);
		Documento documentoAlumno2 = new Documento(new Alumno("222222","Jose Manuel",Curso.BACH2),1);
		Documento documentoProfesor2 = new Documento(new Profesor("444444","Pedro",Dpto.ARTE),4);
		
		impresora.addDocumento(documentoProfesor1);
		impresora.addDocumento(documentoAlumno1);
		impresora.addDocumento(documentoAlumno2);
		impresora.addDocumento(documentoProfesor2);
		
		UI ui = new UI(impresora);
		
		boolean exit = false;
		do {
			exit = ui.menu();
		} while(exit == false);
		
		
		
		//impresora.colaAlumnos.add(documentoAlumno1);
		//impresora.colaProfesores.add(documentoProfesor1);
		//impresora.colaProfesores.add(documentoProfesor2);
		
		//System.out.println(impresora.toString());
		//impresora.imprimir();
		//System.out.println(impresora.toString());
		//impresora.imprimir();
		//impresora.imprimir();
		//impresora.imprimir();
		//System.out.println(impresora.toString());
		
		
	}

}
