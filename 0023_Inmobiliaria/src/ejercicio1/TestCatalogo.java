package ejercicio1;

public class TestCatalogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Catalogo catalogo = new Catalogo();
		
		System.out.println(catalogo.añadeAlquilerInmueble(new LocalComercial(null, 45, 99999, TipoConstruccion.NUEVO)));
		System.out.println(catalogo.añadeAlquilerInmueble(new LocalComercial(null, 45, 99999, TipoConstruccion.NUEVO)));
		System.out.println(catalogo.añadeAlquilerInmueble(new Solar(null, 54, 67, ZonaSolar.RUSTICA)));
		System.out.println(catalogo.añadeAlquilerInmueble(new Vivienda(null,78,667,TipoConstruccion.SEGUNDA_MANO,6,9)));
		System.out.println(catalogo.añadeAlquilerInmueble(new Vivienda(null,78,667,TipoConstruccion.SEGUNDA_MANO,6,9)));
		System.out.println(catalogo.toString());
	}

}
