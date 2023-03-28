package entities;

public class Pessoa {
	
	public String nome;
	public int idade;
	
	public void fazAniversario() {
		this.idade += 1;
	}
	
	public String toString() {
		return String.format("Nome: %s%n" +
							"Idade atual: %d", nome, idade);
	}
}