package application.model.entities;

public class Product {

	private String name;
	private Double price;
	private String category;
	private Integer quantity;
	
	public Product() {
	
	}
	
	public Product(String name, Double price, String category, Integer quantity) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}


	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category
				+ ", quantity=" + quantity + "]";
	}

}
