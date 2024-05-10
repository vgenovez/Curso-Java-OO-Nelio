package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product() { // construtor padrao
	}
	
	public Product(String name, double price, int quantity) { //construtor passando as referencias
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product (String name, double price) {
		this.name = name;
		this.price = price;
		//quantity = 0; por padrao o int começa com 0 no java
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String getName() { //getter e setter
		return name;
	}

	public void setName(String name) { //getter e setter
		this.name = name;
	}

	public double getPrice() { //getter e setter
		return price;
	}

	public void setPrice(double price) { //getter e setter
		this.price = price;
	}

	public int getQuantity() { //getter e setter
		return quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
