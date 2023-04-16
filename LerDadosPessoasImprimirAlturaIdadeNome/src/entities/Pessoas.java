package entities;

public class Pessoas {

	private String nome;
	private int idade;
	private double altura;
	private double somaAltura;
	private int numeroPessoas;
	private int contador;

	// Construtor
	public Pessoas(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	// Métodos
	public double somaAltura(double altura) {
		return this.somaAltura += altura;
	}
	
	public double mediaAltura(int numeroPessoas) {
		return this.somaAltura/numeroPessoas;
	}
	
	public String toString() {
		return String.format("%nAltura média: %.2f", mediaAltura(numeroPessoas));
	}

	// Métodos Acessores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getSomaAltura() {
		return somaAltura;
	}
	
	public void setSomaAltura(double somaAltura) {
		this.somaAltura = somaAltura;
	}	
	
	public int getNumeroPessoas() {
		return numeroPessoas;
	}
	
	public void setNumeroPessoas(int numeroPessoas) {
		this.numeroPessoas = numeroPessoas;
	}
	
	public int setContador() {
		return contador;
	}
	
	public void getContador (int contador) {
		this.contador = contador;
	}
}