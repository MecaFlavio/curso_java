package exercicio_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, num;
		int [] vect; 
		
		System.out.println("Quantos numeros voce vai digitar: ");
		n = sc.nextInt();
		vect = new int [n];
		
		for ( int i= 0; i < vect.length; i++) {
			System.out.println("Digite um numero: ");
			num = sc.nextInt();
			vect[i] = num;
		}
		
		System.out.println("Os numeros negativos são: ");
		
		for (int i=0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}

		
		sc.close();
	}

}
