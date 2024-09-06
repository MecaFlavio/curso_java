package exercicios_classes;

import java.util.Locale;
import java.util.Scanner;

import util.Dollar;

public class CompraDollar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double quantia;
		
		System.out.print("What is the dollar price? " + String.format("%.2f%n", Dollar.dollar));
		System.out.print("How many dollars will be bought? ");
		quantia = leia.nextDouble();
		System.out.println("Amont to be paid in reais = " + String.format("%.2f", Dollar.conversor(quantia)));		
		
		leia.close();
	}

}
