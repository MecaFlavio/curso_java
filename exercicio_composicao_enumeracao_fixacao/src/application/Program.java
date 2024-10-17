package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import entities.Client;
import entities.OrderItem;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Product p = new Product("TV", 1000.0);
		
		OrderItem oi = new OrderItem(2, p);
		
		System.out.println(oi);
		
		DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Client cli = new Client("Flavio", "flavio@gmail.com", LocalDate.parse("03/03/1990", form1));
		
		System.out.println(cli);

	}

}
