package view;

import java.util.Scanner;

import application.model.entities.Product;
import controller.CartController;

public class Menu {

	private CartController controller;
	
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
			System.out.println("5. Preço total");
			System.out.println("0. Exit");
			System.out.print("Escolha uma opcao: ");

			int option = scanner.nextInt();
			scanner.nextLine();

			switch (option) {
			case 1:
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
				controller.listProducts();
				break;

			case 3:
				System.out.println("Total de produtos no carrinho: " + controller.getTotalQuantity());
				break;

			case 4:
				System.out.println("Escreva o nome do produto que deseja remover: ");
				String productName = scanner.nextLine().toLowerCase();
				boolean b = controller.removeProduct(productName);
				if(b) {
					System.out.println(productName +  " removido com sucesso!");
				}
				else {					
					System.out.println(productName +  " não encontrado");
				}
				break;
			case 5:
				System.out.println("Preço total: " + controller.getTotalPrice());
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
