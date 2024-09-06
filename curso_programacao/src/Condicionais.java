import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		// Estrutura condicional Simples
		
		Scanner leia = new Scanner (System.in);
		
		int x;
		
		x = leia.nextInt();
		
		if (x >= 0 ) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Negativo");
		}
		
		
		// Estrutura composta
		
		int y;
		
		System.out.println("Digite um numero: ");
		
		y = leia.nextInt();
		
		if (y > x) {
			System.out.printf("%d é maior que %d%n", y, x);
		}
		else if (y < x) {
			System.out.printf("%d é menor que %d%n",y ,x);
		}
		else {
			System.out.printf("%d é igual a %d%n", y ,x);
		}
		
		// Estrutura switch case
		
		System.out.println("Digite uma numero de 0 a 7");
		int z = leia.nextInt();
		String dia;
		
		switch (z) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Valor invalido";
			break;
		}
		
		System.out.printf("O dia da semanda é %s%n", dia);
		
		// Condicional ternaria
		
		String mensagem;
		
		mensagem = (x >= y) ? "X é maior" : "X é menor ou igual";
		
		System.out.println(mensagem);
		leia.close();
		
		
	}

}
