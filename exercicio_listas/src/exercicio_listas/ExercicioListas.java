package exercicio_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ExercicioListas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroEmpregados, idToIncrease;	
		double porcentagem;
		
		// O tipo da lista pode ser uma classe também
		List <Funcionario> lista = new ArrayList<>();
		
		System.out.print("How many employees wil be registred: ");
		numeroEmpregados = sc.nextInt();
		
		for (int i = 0; i < numeroEmpregados; i++) {
			System.out.println();
			System.out.printf("Empregado #%d: %n", i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			while(position(lista, id) != null) {
				System.out.println("Esse id Ja existe, digite um novo id.");
				System.out.println();
				System.out.printf("Empregado #%d: %n", i+1);
				System.out.print("Id: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextInt();
			lista.add(new Funcionario(id, name, salary));;
			
		}
		
		System.out.println();
		System.out.print("Enter the employee ID that will have salary increase: ");
		idToIncrease = sc.nextInt();
//		Forma de buscar id atravé de função lambda
		Funcionario pos = lista.stream().filter(x -> x.getId() == idToIncrease).findFirst().orElse(null);
		
//		Forma de buscar atraves de metodo auxiliar
//		Integer pos = position(lista ,idToIncrease);
		
		if (pos == null) {
			System.out.println("Esse id não existe.");
		}
		else{
			System.out.print("Enter the percentage: ");
			porcentagem = sc.nextDouble();
			pos.increaseSalary(porcentagem);
			
//			lista.get(pos).increaseSalary(porcentagem);
		}
		
		System.out.println("Lista de Funcionários: ");
		for (Funcionario x : lista) {
			System.out.println(x);
		}
				
		sc.close();
	}
	
	public static Integer position(List<Funcionario> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
