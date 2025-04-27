package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import util.Account;
import util.BusinessAccount;
import util.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		// A classe account é abstrata, não pode ser instanciada
		//Account acc = new Account(1001, "Alex", 1000.0);
		Account acc2 = new SavingsAccount(1002, "Maria", 500.0, 0.01);
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		Account acc4 = new BusinessAccount(1004, "Jeff",500.0 , 500.0);
		Account acc5 = new SavingsAccount(1005, "rick", 300.0, 0.01);
		
		//exemplo de polimorfismo com a classe abstrata
		List<Account> list = new ArrayList<>();
		
		list.add(acc2);
		list.add(acc3);
		list.add(acc4);
		list.add(acc5);
		
		double sum = 0.0;
		for(Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total Balance: %.2f%n", sum);
		
		for(Account acc : list) {
			acc.deposit(10.0);
		}
		
		for(Account acc : list) {
			System.out.printf("Updated balance dor account %d %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
		
	}

}
