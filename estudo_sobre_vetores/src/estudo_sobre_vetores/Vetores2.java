package estudo_sobre_vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Vetores2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos produtos quer cadastrar: ");
		int n = sc.nextInt();
		
		Produto [] vect = new Produto[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Digite o nome do %dº produto: ", i + 1 );
			String name = sc.nextLine();
			System.out.printf("Digite o preço do %dº produto: ", i + 1);
			double price = sc.nextDouble();
			vect[i] = new Produto(name, price);
			System.out.println(vect[i]);
		}
		
		double soma = 0;
		
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPrice();
		}
		
		double avg = soma / vect.length;
		
		System.out.printf("A media de preços é: %.2f", avg);
		
		
		sc.close();
	}

}
