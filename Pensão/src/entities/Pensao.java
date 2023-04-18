package entities;

public class Pensao {
	
	private String nome, email;
	private int numeroQuarto;
	
	//Construtor
	public Pensao (String nome, String email, int numeroQuarto) {
		this.nome = nome;
		this.email = email;
		this.numeroQuarto = numeroQuarto;
	}
	
	//Métodos
	
	public String toString() {
		return String.format("%d: %s, %s", numeroQuarto, nome, email);
	}
	
	//Métodos Acessores
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getNumeroQuarto() {
		return numeroQuarto;
	}
	
	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}
}