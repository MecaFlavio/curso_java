package exercicios_estruturas_sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
//		Fazer um programa para ler o código de uma peça 1, 
//		o número de peças 1, o valor unitário de cada peça 1, o
//		código de uma peça 2, o número de peças 2 e o valor unitário 
//		de cada peça 2. Calcule e mostre o valor a ser pago
		
		int codPeca1, codPeca2, numPeca1, numPeca2;
		double valorPeca1, valorPeca2, total;
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		codPeca1 = leia.nextInt();
		numPeca1 = leia.nextInt();
		valorPeca1 = leia.nextDouble();
		
		codPeca2 = leia.nextInt();
		numPeca2 = leia.nextInt();
		valorPeca2 = leia.nextDouble();
		
		total = ((numPeca1 * valorPeca1) + (numPeca2 * valorPeca2));
		
		System.out.printf("Valor a Pagar: R$ %.2f%n", total);
		
		leia.close();
		
	}

}
