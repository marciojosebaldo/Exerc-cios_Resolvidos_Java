package entities;

public class Cobaia {

	private int totalCobaia;
	private String cobaia;
	
	// Construtor
	public Cobaia (int totalCobaia, String cobaia) {
		this.totalCobaia = totalCobaia;
		this.cobaia = cobaia;
	}
		
	// Métodos
	
	

	// Métodos Acessores
	public void setTotalCobaia(int totalCobaia) {
		this.totalCobaia = totalCobaia;
	}

	public int getTotalCobaia() {
		return totalCobaia;
	}

	public void cobaia(String cobaia) {
		this.cobaia = cobaia;
	}

	public String getCobaia() {
		return cobaia;
	}

}