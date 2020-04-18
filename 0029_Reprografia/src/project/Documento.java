package project;

import java.util.concurrent.atomic.AtomicInteger;

public class Documento {
	private Cliente autor;
	private int paginas;
	private final int id;
	private static final AtomicInteger count = new AtomicInteger();
	
	Documento(Cliente autor, int paginas){
		this.autor = autor;
		this.paginas = paginas;
		this.id = count.incrementAndGet();
		
	}
	
	public int getPaginas() {
		return paginas;
	}
	
	public String toString() {
		
		return "Documento[id=" + this.id + "paginas=" + this.paginas + "cliente{" + autor.toString() + "}]";
		
	}
}
