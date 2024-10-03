package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.WorkerLevel;
import etities.Department;
import etities.HourContract;
import etities.Worker;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Department department = new Department();
		
		String name, level, date, mounthAndYear;
		Double salary, valuePerHour;
		Integer numContracts, hours;
		
		System.out.print("Enter department's name: ");
		department.setName(sc.next());
		sc.nextLine();
		System.out.println("Enter worker data: ");		
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Level: ");
		level = sc.next();
		System.out.print("Base salary: ");
		salary = sc.nextDouble();
		Worker worker = new Worker(name, WorkerLevel.valueOf(level),salary, department);
		
		System.out.print("How many contracts to this worker: ");
		numContracts = sc.nextInt();
		DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		for(int i = 0; i < numContracts; i++) {
			System.out.println("Enter contract #" + (i+1) + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			date = sc.next();
			LocalDate dateContract = LocalDate.parse(date, form1);
			System.out.print("Value per hour: ");
			valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			hours = sc.nextInt();
			HourContract hourContract = new HourContract(dateContract, valuePerHour, hours);
			worker.addContract(hourContract);
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		mounthAndYear = sc.next();
		Integer mounth = Integer.valueOf(mounthAndYear.substring(0, 2));
		Integer year = Integer.valueOf(mounthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + mounthAndYear + ": " + String.format("%.2f", worker.income(year, mounth)));
				
		sc.close();
	}

}
