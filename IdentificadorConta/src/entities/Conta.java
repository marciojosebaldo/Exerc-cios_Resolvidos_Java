package entities;

public class Conta {
	
	private static int identificador = 0;
	
	String titular;
	int numero;
	double saldo;
	int id;
	
	public Conta() {
		Conta.identificador ++;
		this.id = Conta.identificador;
	}
	
	//Métodos acessores da classe
	public int getIdentificador() {
		return Conta.identificador;
	}
	
	public int getId() {
		return this.id;
	}
		
	//Métodos Acessores
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumer(int numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}	
}