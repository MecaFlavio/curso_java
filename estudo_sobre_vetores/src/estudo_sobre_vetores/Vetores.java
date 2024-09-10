package estudo_sobre_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double soma = 0;
		// Declaração de vetor no java
		// tipo 
		// abre e fecha colchetes
		// nome do vetor
		// <new> + tipo
		// tamnho do vetor dentro de colchetes
		double [] vect = new double [n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
			soma += vect[i];			
		}
		
		for(int j = 0; j < n; j++) {
			System.out.println(vect[j]);
		}
		
		double avg = soma/n;
		
		System.out.printf("Avarage Height: %.2f%%n", avg);
		
		sc.close();

	}

}
