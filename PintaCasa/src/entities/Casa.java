package entities;

public class Casa {

	//Atributos
	private String cor;
	private int porta1, porta2, porta3;

	//Construtor
	public Casa (int porta1, int porta2, int porta3 ) {
		this.porta1 = porta1;
		this.porta2 = porta2;
		this.porta3 = porta3;
	}
	
	//Métodos
	public void pinta (String s) {
		this.cor = s;
	}
	
	public int quantasPortasEstaoAbertas() {
		return this.porta1 + this.porta2 + this.porta3;
	}	
	
	//Métodos acessores
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setPorta1(int porta1) {
		this.porta1 = porta1;
	}
	
	public int getPorta1() {
		return porta1;
	}
	
	public void setPorta2 (int porta2) {
		this.porta2 = porta2;
	}
	
	public int getPorta2 () {
		return porta2;
	}	
	
	public void setPorta3 (int porta3) {
		this.porta3 = porta3;
	}
	
	public int getPorta3() {
		return porta3;
	}	
}