package exercicios_fixacao_matriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// Ler dois números linhas e colunas
		
		Scanner sc = new Scanner(System.in);
		
		int numRow, numCollumn;
		
		System.out.println("Digite o numero de linhas: ");
		numRow = sc.nextInt();
		System.out.println("Digite o numero de colunas: ");
		numCollumn = sc.nextInt();
		
		//Ler Martriz 
		
		int [][] mat = new int [numRow][numCollumn];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		// Ler número inteiro
		
		int num;
		
		System.out.println("Digite um numero");
		num = sc.nextInt();
				
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				
				if (mat[i][j] == num) {
					System.out.printf("Position %d, %d: %n", i, j);
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (j < mat[i].length- 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}


				}	
			}
		}
		
		
		
		sc.close();

	}

}
