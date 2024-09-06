package exercicio_encapsulamento;

import java.util.Locale;
import java.util.Scanner;

import util.Conta;

public class Banco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numConta;
		String holder;
		char resposta;
		double saldo;
		Conta conta;
		
		System.out.print("Enter accont number: ");
		numConta = leia.nextInt();
		System.out.print("Enter accont holder: ");
		leia.nextLine();
		holder = leia.nextLine();
		
		System.out.print("Is there an initial deposit? ");
		resposta = leia.next().charAt(0);
		if (resposta == 'y') {
			System.out.print("Enter a initial deposit value: ");
			saldo = leia.nextDouble();
			conta = new Conta(numConta, holder, saldo);
		}
		else {
			conta = new Conta(numConta, holder);
		}
		
		System.out.println();
		System.out.println("Account Data:");
		System.out.println(conta);
		
		System.out.print("Enter a deposit value: ");
		double valor = leia.nextDouble();
		conta.deposito(valor);
		System.out.println("Updated Account Data:");
		System.out.println(conta);
		
		System.out.print("Enter a withdraw value: ");
		valor = leia.nextDouble();
		conta.saque(valor);
		System.out.println("Updated Account Data:");
		System.out.println(conta);
		
		leia.close();

	}

}
