import java.util.Date;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona personas[] = {
				new Profesor("Manuel","32087364K",new MiDate(),Departamentos.Informatica),
				new Profesor("Jose","32345264T",new MiDate(),Departamentos.Informatica),
				new Alumno("pepe", "32485710P", new MiDate(), Cursos.DAM1),
				new Alumno("Antonia", "1234710L", new MiDate(), Cursos.DAM1)
				
		};
		
		for(Persona p: personas) {
			System.out.println(p);
		}
		
	}

}
