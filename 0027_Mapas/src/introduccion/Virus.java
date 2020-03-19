package introduccion;


public class Virus {

		private String nombre;
		private int mortalidad;
		
		
		
		public Virus(String nombre, int mortalidad) {
			this.nombre = nombre;
			this.mortalidad = mortalidad;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getMortalidad() {
			return mortalidad;
		}
		public void setMortalidad(int mortalidad) {
			this.mortalidad = mortalidad;
		}
		@Override
		public String toString() {
			return "[nombre=" + nombre + ", mortalidad=" + mortalidad + "]";
		}
		
		
		
		
}
