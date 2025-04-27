package entities;

public class Rectangle extends Shape {

	private double width;
	private double higth;
	
	
	
	public Rectangle() {
		super();
	}


	public Rectangle(double width, double higth) {
		super();
		this.width = width;
		this.higth = higth;
	}

	
	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHigth() {
		return higth;
	}


	public void setHigth(double higth) {
		this.higth = higth;
	}


	@Override
	public double area() {
		
	}
	
	}
	
}
