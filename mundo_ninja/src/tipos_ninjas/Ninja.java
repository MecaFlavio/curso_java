package tipos_ninjas;

public class Ninja {
	public String nome;
	public String cla;
	public String tecnica;
	public String vila;
	
	public void apresentacao () {
		System.out.printf("Meu nome é %s sou do clã %s tenho a tecnica %s e sou da %s%n"
				,nome, cla, tecnica, vila);
	}

}
