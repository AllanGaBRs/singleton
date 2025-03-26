package view;

import java.util.Scanner;

import application.model.entities.Product;
import controller.CartController;
import facade.Facade;

public class Menu {
	
	private CartController controller;
	private Facade facade = new Facade();
	
	public Menu(CartController controller) {
		this.controller = controller;
	}
	
	public void showMenu(Scanner scanner) {
		while(true)
		{
			
			System.out.println("\n=== MENU ===");
			System.out.println("1. Adicionar");
			System.out.println("2. Listar produtos do carrinho");
			System.out.println("3. Vizualizar o total de produtos");
			System.out.println("4. Remover um produto pelo nome");
			System.out.println("5. Cobrar");
			System.out.println("6. Realizar pagamento");
			System.out.println("7. Número aleatório");
			System.out.println("0. Exit");
			System.out.print("Escolha uma opcao: ");
			int option = scanner.nextInt();
			scanner.nextLine();
	
			switch (option) {
			case 1:
				facade.imprime();
				System.out.print("Product name: ");
				String name = scanner.nextLine().toLowerCase();
				System.out.print("Price: ");
				Double price = scanner.nextDouble();
				System.out.print("Quantity: ");
				Integer quantity = scanner.nextInt();
				scanner.nextLine();
			
				System.out.print("Category: ");
				String category = scanner.nextLine().toLowerCase();
			
				Product product = new Product(name, price, category, quantity);
				controller.addProduct(product);
				System.out.println("Product added!");
				break;

			case 2:
				facade.imprime();
				controller.listProducts();
				break;

			case 3:
				facade.imprime();
				System.out.println("Total de produtos no carrinho: " + controller.getTotalQuantity());
				break;

			case 4:
				System.out.println("Escreva o nome do produto que deseja remover: ");
				String productName = scanner.nextLine().toLowerCase();
				boolean b = controller.removeProduct(productName);
				if(b) {
					facade.imprime();
					System.out.println(productName +  " removido com sucesso!");
				}
				else {				
					facade.imprime();
					System.out.println(productName +  " não encontrado");
				}
				break;
			case 5:
				facade.imprime();
				System.out.println(facade.cobrar(controller.getTotalPrice()));
				break;
			case 6:
				System.out.println("Insira o valor a ser pago");
				Double valor = scanner.nextDouble();
				System.out.println(facade.realizarPagamento(valor));
				break;
			case 7:
				System.out.println(facade.retornaInteiro());
				break;
			case 0:
				System.out.println("Exiting...");
				return;

			default:
				System.out.println("Invalid option!");
			}
		}
	}
	
}
