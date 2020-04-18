package ejercicio;


public class Virus implements Comparable<Virus>  {

		private String nombre;
		private int id;
		
		
		
		public Virus(String nombre, int id) {
			this.nombre = nombre;
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getID() {
			return id;
		}
		public void setID(int mortalidad) {
			this.id = mortalidad;
		}
		@Override
		public String toString() {
			return "[ID=" + id + ", Nombre=" + nombre + "]";
		}
		@Override
		public int compareTo(Virus o) {
			return nombre.compareToIgnoreCase(o.nombre);
		}
		
		
		
		
}
