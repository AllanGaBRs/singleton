package application.model.entities;
import java.util.Random;

public class Biblioteca {
	private static double total = 0;
	public void imprime() {
		System.out.println("estou imprimindo");
	}
	
	public int retornaInteiro() {
		Random rand = new Random();
		return rand.nextInt(1000);
	}
	
	public String cobrar(double total) {
		Biblioteca.total = total;
		return "Valor a ser pago pelo cliente: R$" + total;
	}
	
	public String realizarPagamento(double valorPago) {
		if(Biblioteca.total == 0) {
			return "executar cobrança primeiro";
		}
		else if(Biblioteca.total <= valorPago) {
			return "Troco: R$" + (valorPago - Biblioteca.total);
		}
		else {
			return "O valor pago está incorreto. O Valor total é R$:"+ Biblioteca.total + 
					" e o valor pago é R$:" + valorPago;
		}
	}
}
