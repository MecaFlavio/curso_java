package exercicio_vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;
import util.Calculos;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidadePessoas;
		Pessoas [] vectPessoa;
		
		System.out.print("Quantas Pessoas serão registradas: ");
		quantidadePessoas = sc.nextInt();
		vectPessoa = new Pessoas [quantidadePessoas];
		
		for(int i = 0; i < vectPessoa.length; i++) {
			System.out.printf("Altura da %dª pessoa: ", i + 1);
			double altura = sc.nextDouble();
			System.out.printf("Genero da %dª pessoa: ", i + 1);
			char genero = sc.next().toLowerCase().charAt(0);
			vectPessoa[i] = new Pessoas(genero, altura);
		}
		
		Calculos teste = new Calculos(vectPessoa);
		
		System.out.printf("Menor Altura: %.2f%n", teste.minAltura());
		System.out.printf("Maior Altura: %.2f%n", teste.maxAltura());
		System.out.printf("Media da Altura das mulheres: %.2f%n", teste.mediaMulher());
		System.out.printf("Numero de Homens: %d", teste.numHomens());
		
		sc.close();

	}

}
