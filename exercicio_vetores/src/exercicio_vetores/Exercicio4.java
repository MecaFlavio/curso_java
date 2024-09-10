package exercicio_vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Quantos quartos vão ser alugados: ");
		num = sc.nextInt();
		System.out.println();
		
		Aluguel [] quartos = new Aluguel [10];
		
		for (int i =0; i < num; i++) {
			System.out.printf("Aluguel #%d%n", i + 1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Romm: ");
			int room = sc.nextInt();
			quartos[room] = new Aluguel(name, email, room);
			System.out.println();
		}
		
		System.out.println("Busy rooms: ");
		
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.println(i + ": " + quartos[i]);
			}
		}
		sc.close();
	}

}
