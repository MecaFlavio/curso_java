package exercicios_classes;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Rectangle retangulo = new Rectangle();
		
		System.out.println("Enter rectangle Width and Height: ");
		retangulo.width = leia.nextDouble();
		retangulo.height = leia.nextDouble();
		System.out.println(retangulo);
		
		leia.close();

	}

}
