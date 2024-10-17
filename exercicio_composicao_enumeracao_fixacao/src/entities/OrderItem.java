package entities;

public class OrderItem {
	
	private Integer quantity;

	private Double price;
	
	private Product product;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.price = product.getPrice();
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double subTotal() {
		
		return quantity * price;
	}
	
	@Override
	public String toString() {
		
		return product.getName() 
				+ ", " 
				+ price 
				+ ", Quantity: " 
				+ quantity
				+", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
	
}
