package util;

public class Conta {
	
	private int numConta;
	private String nome;
	private double saldo;

	public Conta(int numConta, String nome, double depositoInicial) {
		this.numConta = numConta;
		this.nome = nome;
		deposito(depositoInicial);
	}
	
	public Conta(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposito(double quantia) {
		this.saldo += quantia;
	}
	
	public void saque(double quantia) {
		this.saldo -= quantia + 5;
	}
	
	public String toString() {
		return "Account: " 
				+ numConta
				+ ", Holder: "
				+ nome
				+ ", Balance: $ "
				+ String.format("%.2f%n", saldo);
	}
}
