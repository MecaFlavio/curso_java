package exercicios_classes;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		double newSalary = this.grossSalary * (1 + percentage / 100);
		this.grossSalary = newSalary;
			
	}
	
	public String toString() {
		return "Employee: " + this.name + ", $ " + String.format("%.2f", netSalary());
	}
}
