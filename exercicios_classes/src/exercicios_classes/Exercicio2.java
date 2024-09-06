package exercicios_classes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double percentage;
		
		Employee employee = new Employee();
		
		employee.name = leia.nextLine();
		employee.grossSalary = leia.nextDouble();
		employee.tax = leia.nextDouble();
		
		System.out.println(employee);
		
		System.out.print("Which percentage to increase salary? ");
		percentage = leia.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println(employee);
		
		leia.close();
	}

}
