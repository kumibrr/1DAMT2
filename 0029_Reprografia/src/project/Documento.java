package project;

import java.util.concurrent.atomic.AtomicInteger;

public class Documento {
	private Cliente cliente;
	private int paginas;
	private final int id;
	private static final AtomicInteger count = new AtomicInteger();
	
	Documento(Cliente cliente, int paginas){
		this.cliente = cliente;
		this.paginas = paginas;
		this.id = count.incrementAndGet();
		
	}
	
	public int getPaginas() {
		return paginas;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	public String toString() {
		
		return "Documento[id=" + this.id + " paginas=" + this.paginas + " cliente{" + cliente.toString() + "}]";
		
	}
}
