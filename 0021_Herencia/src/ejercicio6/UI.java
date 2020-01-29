package ejercicio6;

import javax.swing.JOptionPane;

public class UI {

	public void salidaConsola (String mensaje) {
		System.out.println(mensaje);
	}
	
	public void salidaGrafica(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
