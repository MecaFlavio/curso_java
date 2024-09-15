package fixação_exercicio_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int empNum, idNum;
		List <Employee> employeeList = new ArrayList<>();
		
		System.out.print("How many employees wil be registred: ");
		empNum = sc.nextInt();
		
		for(int i = 0; i < empNum; i++) {
			System.out.println();
			System.out.printf("Employee #%d: %n", i + 1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			while(hasId(employeeList, id)) {
				System.out.print("This Id alredy was used. Please enter another Id number: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			employeeList.add(new Employee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		idNum = sc.nextInt();
		for (int i = 0; i < employeeList.size(); i ++)  {
			if(employeeList.get(i).getId() == idNum) {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				employeeList.get(i).increaseSalary(percentage);
			} 
			else if(employeeList.get(i).getId() == null){
				System.out.println("This id does not exist");
			}	
		}
		
		System.out.println();
		System.out.println("Employee List");
		for(Employee x : employeeList) { 
			System.out.println(x);
		}
		
		sc.close();
		
	}
	
	
	public static Boolean hasId (List <Employee> employeeList, int id) {
		for(Employee x : employeeList) {
			if (x.getId() == id) {
				return true;
			}
		}
		return false;
	}

}
