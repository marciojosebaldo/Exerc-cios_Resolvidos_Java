package entities;

public class Porta {

	public String aberta;
	public String cor;
	public double dimensaoA;
	public double dimensaoL;
	public double dimensaoP;
	
	public void abre() {
		this.aberta = "aberta";
	}
	
	public void fecha() {
		this.aberta = "fechada";
	}
	
	public void pinta(String s) {
		this.cor = s;
	}
	
	public boolean estaAberta() {
		if (this.aberta == "aberta") {
			System.out.println("Verdadeiro. A porta está aberta.");
			return true;
		}
			else {
		
			System.out.println("Falso. A porta está fechada");
			return false;
			}
		
		// ou pode ser expressado de forma ternária:
		
		// return (this.aberta == "aberta") ? true : false;
	}
	
}