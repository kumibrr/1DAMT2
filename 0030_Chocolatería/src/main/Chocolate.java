package main;

import java.util.UUID;

public class Chocolate {
	private UUID id;
	private String nombre;
	private TipoChocolate tipo;
	
	public Chocolate(String nombre, TipoChocolate tipo) {
		this.id = UUID.randomUUID();
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public UUID getID() {
		return id;
	}
	
	public TipoChocolate getTipo() {
		return tipo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setTipo(TipoChocolate tipo) {
		this.tipo = tipo;
	}
}
