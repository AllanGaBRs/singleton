package facade;

import application.model.entities.Biblioteca;

public class Facade {

	private Biblioteca biblioteca;
	
	public Facade() {
		biblioteca = new Biblioteca();
	}
	
	public void imprime() {
		biblioteca.imprime();
	}
	
	public int retornaInteiro() {
		return biblioteca.retornaInteiro();
	}
	
	public String cobrar(double total) {
		return biblioteca.cobrar(total);
	}
	
	public String realizarPagamento(double valorPago) {
		return biblioteca.realizarPagamento(valorPago);
	}
	
}
