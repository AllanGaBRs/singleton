package application.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private static Cart instance; 
    private List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public static Cart getInstance() {
        if (instance == null) {
            instance = new Cart();
        }
        return instance;
    }

    public void addProduct(Product product) {
        if(product.getQuantity() <= 0) {
        	throw new IllegalStateException("Produto não está mais disponivel");
        }
    	products.add(product);
        product.setQuantity(product.getQuantity() - 1);
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getTotalQuantity() {
        return products.size();
    }
    
    public boolean removeProduct(String productName) {
    	return products.removeIf(product -> product.getName().equalsIgnoreCase(productName));
    }
    
    public Double getTotalPrice() {
    	Double total = 0.0;
    	for(Product p : products) {
    		total += p.getPrice();
    	}
    	return total;
    }
}
