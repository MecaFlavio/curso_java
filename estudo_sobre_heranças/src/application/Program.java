package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Herança é um tipo de associação que permite que uma classe herde todos dados e comportamentos de outra
//		
//		Definições Importantes
//		
//		VantagensS
//			Reuso
//			Polimorfismo
//			SSS
//		Sintaxe:
//			class A extends B
		
//      Upcasting
//		Casting de subclasse para superclasse
//		Uso comum: Polimorfismo
//		
//		Downcasting
//		Casting da superclasse para subclasse
//		Palavra instanceof
//		Uso comum> métodos que recebem parâmetros genéricos (ex:Equals)
		
		Account acc = new Account(1001, "Alex", 0.0);
		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Account acc1 = bacc;
		
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		
		//DOWNCASTING
		
		// casting manual
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3; - esta operação não é permitida pois acc3 não é BusinessAccount
		
		// pode ser testado com instanceof
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan");
		
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("update");
		}
		
		
	}

}
