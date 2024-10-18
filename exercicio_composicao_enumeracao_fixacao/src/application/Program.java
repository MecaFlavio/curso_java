package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		String name, email;
		LocalDate birthday;
		Integer itemNumber;
		OrderStatus status;

		DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter client data");
		System.out.println("Name: ");
		name = sc.nextLine();
		System.out.println("Email: ");
		email = sc.next();
		System.out.println("Birth Date (DD/MM/YYYY): ");
		birthday = LocalDate.parse(sc.next(), form1);
		
		Client client = new Client(name, email, birthday);
		
		System.out.println("Enter order data: ");
		System.out.println("Status: ");
		status = OrderStatus.valueOf(sc.next());
		System.out.println("How many items to this order: ");
		
		Order order = new Order(LocalDateTime.now(), status, client);
		
		itemNumber = sc.nextInt();
		for(int i = 0; i < itemNumber; i++) {
			String productName;
			Double productPrice;
			Integer productQuantity;
			
			System.out.println("Enter #" + (i+1) + " item data: " );
			System.out.println("Product name: ");
			sc.nextLine();
			productName = sc.nextLine();
			System.out.println("Product price: $");
			productPrice = sc.nextDouble();
			System.out.println("Product quantity: ");
			productQuantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem item = new OrderItem(productQuantity, product);
			
			order.addItem(item);
		}
		
		System.out.println();
		System.out.println(order);
		
		
		sc.close();

	}

}
