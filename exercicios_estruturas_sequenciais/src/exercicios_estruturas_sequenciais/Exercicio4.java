package exercicios_estruturas_sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
//		Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//		decimais.
		
		int numFunc, horaTrab;
		double valorHora, salario;
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		numFunc = leia.nextInt();
		horaTrab = leia.nextInt();
		valorHora = leia.nextDouble();
		
		salario = horaTrab * valorHora;
		
		System.out.printf("Number = %d%n", numFunc);
		System.out.printf("Salary = U$ %.2f%n", salario );
		
		leia.close();
		

	}

}
