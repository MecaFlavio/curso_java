import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a;
		int b;
		String x;
		int y;
		double z;
		char w;
		String c;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ola Mundo!");
		System.out.println("Bom dia!");
		a = 5.0;
		b = (int) a; // casting
		
		System.out.println(b);
		
		x = sc.next(); // função para entrada de String
		System.out.println("Voce digitou: " + x);
		y = sc.nextInt(); // Função para entrada de  INT
		System.out.println("Voce digitou: " + y);
		z = sc.nextDouble(); // Função para entrada de ponto flutuante
		System.out.println(z);
		w = sc.next().charAt(0); // função next le como string e charAt pega o caracter do paramentro
		System.out.println(w);
		c = sc.nextLine(); //Função nextLine le uma frase inteira
		System.out.println(c);
		
		// Funções para String
		
		String original = "abcde FGHIJ ABC abc DEFG ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
		sc.close();
		
	}

}
