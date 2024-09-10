package entities;

public class Aluguel {

	private String ocupante;
	private String email;
	private int quarto;

	public Aluguel(String ocupante, String email, int quarto) {
	
		this.ocupante = ocupante;
		this.email = email;
		this.quarto = quarto;
	}

	public String getOcupante() {
		return ocupante;
	}

	public void setOcupante(String ocupante) {
		this.ocupante = ocupante;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

	@Override
	public String toString() {
		return ocupante + email ;
	}
	
	
	
}
