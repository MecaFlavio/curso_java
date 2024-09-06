package pessoas_ninjas;

import tipos_ninjas.Ninja;

public class Habitantes {

	public static void main(String[] args) {
		
		Ninja naruto = new Ninja();
		Ninja sasuke = new Ninja();
		Ninja sakura = new Ninja();
		Ninja hinata = new Ninja();
		
		naruto.nome = "Naruto";
		naruto.tecnica = "Hasengan";
		naruto.cla = "Uzumaki";
		naruto.vila = "Vila da Folha";
		naruto.apresentacao();
		
		sasuke.nome = "Sasuke";
		sasuke.cla = "Uchiha";
		sasuke.tecnica = "Sharingan";
		sasuke.vila = "Vila da Folha";
		sasuke.apresentacao();
		
		sakura.nome = "Sakura";
		sakura.cla = "Haruno";
		sakura.tecnica = "Força";
		sakura.vila = "Vila da Folha";
		sakura.apresentacao();

		hinata.cla = "Hyuga";
		hinata.nome = "Hinata";
		hinata.tecnica = "Byacugan";
		hinata.vila = "Vila da Folha";
		hinata.apresentacao();

	}

}
