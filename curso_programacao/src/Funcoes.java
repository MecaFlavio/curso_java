import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		// Funções (sintaxe)
		Scanner leia = new Scanner(System.in);
		
		int a = leia.nextInt();
		int b = leia.nextInt();
		int c = leia.nextInt();
		
		int higher = max(a,b, c);
		
		showResult(higher);
		
		leia.close();
		
	}
	
	public static int max (int x, int z, int y) {
		int aux;
		if (x > y && x > z ) {
			aux =x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult (int value) {
		System.out.println(value);
	}
	

}
