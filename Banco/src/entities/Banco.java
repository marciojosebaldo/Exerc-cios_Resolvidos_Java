package entities;

public class Banco {
	
	
	// Atributos
	
	private int numeroConta;
	private String titular;
	private double balanco = 0.00;
	

	// Construtores
	
	public Banco() {		
	}
	
	public Banco(int numeroConta, String titular, double balanco) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.balanco = balanco;
	}
		
	
	// Métodos da classe
	
	public void deposito(double montante) {
		this.balanco += montante;
	}
	
	public void saque(double montante) {
		this.balanco = (this.balanco - montante) - 5;
	}
	
	public String toString() {
		return String.format("%n"
				+ "Dados da conta atualizados: %n"
				+ "Conta %d. Titular: %s. Montante: %.2f%n", this.numeroConta, this.titular, this.balanco);
	}
	
	public String toString1() {
		return String.format("%n"
				+ "Dados da conta: %n"
				+ "Conta %d. Titular: %s. Montante %.2f%n", this.numeroConta, this.titular, this.balanco);
	}
	
	
	//Métodos acessores
	
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getBalanco() {
		return this.balanco;
	}
	
	public void setBalanco(double balanco) {
		this.balanco = balanco;
	}
}