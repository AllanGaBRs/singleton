package controller;

import application.model.entities.Cart;
import application.model.entities.Product;

public class CartController {

	private Cart cart = Cart.getInstance();

	public CartController() {
		
	}
	
	public void addProduct(Product product) {
		cart.addProduct(product);
	}

	public void listProducts() {
		if (cart.getProducts().isEmpty()) {
			System.out.println("O carrinho está vazio");
		} else {
			cart.getProducts().forEach(System.out::println);
		}
	}

	public int getTotalQuantity() {
		return cart.getTotalQuantity();
	}

	public boolean removeProduct(String productName) {
		return cart.removeProduct(productName);
	}

	public Double getTotalPrice() {
		return cart.getTotalPrice();
	}
}
