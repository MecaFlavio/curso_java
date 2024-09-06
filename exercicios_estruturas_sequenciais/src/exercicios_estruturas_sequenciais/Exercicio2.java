package exercicios_estruturas_sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
//		Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//		casas decimais conforme exemplos.
//		Fórmula da área: area = π . raio2
//		Considere o valor de π = 3.14159
		
		Locale.setDefault(Locale.US);
		
		double pi, raio, area;
		
		pi = 3.14159;
		
		Scanner leia = new Scanner(System.in);
		
		raio = leia.nextDouble();
		
		area = pi * (Math.pow(raio, 2));
		
		System.out.printf("A = %.4f%n", area);
		
		leia.close();

	}

}
