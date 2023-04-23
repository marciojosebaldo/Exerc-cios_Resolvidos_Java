package entities;

public class Construcao {
	
	private Integer comprimento, largura, resultado;
	private Float porcentagem;
	
	//Construtores
	public Construcao (int comprimento, int largura, int resultado) {
		this.comprimento = comprimento;
		this.largura = largura;
		this.resultado = resultado;
	}
	
	//Métodos Acessores
	public int getComprimento() {
		return comprimento;
	}
	
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	public int getLargura() {
		return largura;
	}
	
	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	public float getPorcentagem() {
		return porcentagem;
	}
	
	public void setPorcentagem(float porcentagem) {
		this.porcentagem = porcentagem;
	}
	
	public int getResultado() {
		return resultado;
	}
	
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
}