package exercicio_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		double dnum, soma, media;
		double [] vect;
		
		
		System.out.print("Quantos numeros voce vai digitar: ");
		num = sc.nextInt();
		vect = new double[num];
		soma = 0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			dnum = sc.nextDouble();
			vect[i] = dnum;
			soma += vect[i];
		}
		
		media = soma / vect.length;
		System.out.print("Valores digitados: ");
		for (int i = 0; i < vect.length; i++) {
			System.out.print(String.format("%.1f ", vect[i]));
		}
		System.out.printf("%nSoma = %.2f%n", soma);
		System.out.printf("Media = %.2f", media);
		
		sc.close();
		

	}

}
