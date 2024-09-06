package entities;

public class Product {
	// Atributos
	
	private String name;
	private double price;
	private int quantity;
	
	// Construtores
	
		//Padrão/Sobrecarga
	public Product() {
		
	}
		// Customizado
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}
		// Sobrecarga
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// Metodos
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock () {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;		
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " + quantity 
				+" units, Total: $ " 
				+ String.format("%.2f", totalValueInStock());
		
	}
	
}
