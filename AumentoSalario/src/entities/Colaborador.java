package entities;

public class Colaborador {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	
	//Construtor
	public Colaborador(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	//Método
	public void aumentoSalario(double porcentagem) {
		this.salario *= ((porcentagem/100) + 1);
	}
	
	public String toString() {
		return String.format("%d, %s, %.2f", getId(), getNome(), getSalario());
	}
	
	//Métodos Acessores
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
}