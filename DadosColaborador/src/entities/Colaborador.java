package entities;

public class Colaborador {
	public String nome;
	public double salarioBruto;
	public double taxa;

	public double SalarioLiquido() {
		return salarioBruto - taxa;
	}

	public void IncrementoTaxaSalario(double porcentagem) {
		 salarioBruto += salarioBruto * (porcentagem/100);
	}

	public String toString() {
		return String.format("Colaborador: %s, $ %.2f %n", nome, SalarioLiquido());
	}

	public String toString2() {
		return String.format("Dados atualizadaos: %s, $ %.2f", nome, salarioBruto);
	}
	
}