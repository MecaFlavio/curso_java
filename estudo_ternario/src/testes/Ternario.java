package testes;

public class Ternario {

	public static void main(String[] args) {
		//testes
		int idade = 17;
		String reposta;
		
		reposta = idade < 18 
				? "Voce não é maior de idade" 
						: idade >= 21 
						? "Você ja é um aduldo" 
								: " Voce é maior de idade, mas não é um adulto";
		
		System.out.println(reposta);
	}

}
