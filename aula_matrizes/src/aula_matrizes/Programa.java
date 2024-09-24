package aula_matrizes;

import java.util.Iterator;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// Matriz é um arranjo bidimensional, é um vetor de vetores
		// Vantagem acesso imetiato aos elementos pela sua posição
		// desvantagem Tamanho fixo, Dificuldade para se realizar inserções e deleções

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// Criando matriz em java
		// na ordem de colchetes linha e coluna

		int[][] mat = new int[n][n];
		int negative = 0;

		// Estrutura for para percorrer matriz

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Main diagonal: ");

		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}

		System.out.println();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					negative += 1;
				}
			}
		}

		System.out.println("Negative numbers: " + negative);
		
		sc.close();

	}

}
