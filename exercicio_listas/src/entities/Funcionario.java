package entities;

public class Funcionario {
	
	private Integer id;
	private String name;
	private Double salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(Integer id, String name, Double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalario() {
		return salario;
	}

	public void increaseSalary(Double porcentagem) {
		salario *= (1 + porcentagem / 100); 
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("R$ %.2f", salario);
	}
	
	
	
	
	
	
	
}
