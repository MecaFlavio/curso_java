package application;

import java.util.Locale;
import java.util.Scanner;

import etities.Department;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Department department = new Department();
		
		String name, level;
		Double salary;
		
		System.out.print("Enter department's name: ");
		department.setName(sc.next());
		sc.nextLine();
		System.out.println("Enter worker data: ");		
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.println();
		System.out.print("Level: ");
		level = sc.next();
		System.out.println("Base salary: ");
		salary = sc.nextDouble();
		
		
		System.out.print("How many contracts to this worker: ");
		
		
		sc.close();
	}

}
