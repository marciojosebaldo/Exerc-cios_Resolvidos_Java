package entities;

public class Notas {

	public float nota1, nota2, nota3;
	
	public float calculoNota() {
		return nota1 + nota2 + nota3;
	}
	
	public float faltaNota() {
		return 60 - calculoNota();
	}
	
	public String toString() {
		return String.format("FINAL GRADE = %.2f%n" +
				"PASS", calculoNota());
	}
	
	public String toString2() {
		return String.format("FINAL GRADE = %.2f%n" + 
				"FAILED%n" +
				"MISSING %.2f POINTS", calculoNota(), faltaNota());
	}
	
}