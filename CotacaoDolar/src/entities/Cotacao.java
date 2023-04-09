package entities;

public class Cotacao {
	
	//Atributos
	private static final double _DOLAR = 3.1;
	private double valor;
	private double resultado; //Falta colocar a função para não alterar o resultado
	
	//Construtor
	public Cotacao (double valor) {
		this.valor = valor;
	}
	
	//Métodos
	public double cotacaoDolar(double valor) {
		return this.resultado = Cotacao._DOLAR * this.valor * 1.06;
	}
	
	//Métodos de acesso
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setResultado (double resultado) {
		this.resultado = resultado;
	}
	
	public double getResultado() {
		return resultado;
	}	
}