import java.util.Locale;
import java.util.Scanner;

public class Estruturas_repeticao {

	public static void main(String[] args) {
		// Estrutura "enquanto' while
		// Usar quando não se sabe previamente a quantidade de repetições realizadas
		// Sintaxe
		// while (condição){
//			comando 1;
//			comando 2;
//			}
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		int x = leia.nextInt();
		int soma = 0;

		while (x != 0) {
			soma += x;
			x = leia.nextInt();

		}

		System.out.println(soma);

		// Estrutura "para" for
		// Usar quando se sabe previamente a quantidade ou o intervalo de valores
		// Sintaxe
		// for (inicio; condição; incremento) {
//		 		comando1;
//		 		comando2;
//			}

		int N = leia.nextInt();

		int soma2 = 0;

		for (int i = 0; i < N; i++) {
			int y = leia.nextInt();
			soma2 += y;
		}

		System.out.println(soma2);

		// Estrutura "Faça enquanto" do while
		// O bloco de comando executa pelo menos uma vez, pois a condição é verificada
		// no final
		// sintaxe:
		// do {
//				comando1;
//				comando2;
//			} while(condição);

		char resp;

		do {
			System.out.println("Digite a temperatura em Celsius: ");
			double C = leia.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente a Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resp = leia.next().charAt(0);
		} while (resp != 'n');

		leia.close();
	}

}
