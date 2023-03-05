import java.util.Scanner;

public class Imposto_renda {
	public static void main (String[] args) {

		double salario, resultado = 0.00;
		double faixa1 = 0.08;
		double faixa2 = 0.18;
		double faixa3 = 0.28;
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o salário: ");
		
		salario = entrada.nextDouble();
		
		if (salario <= 2000) {
			System.out.println("Isento");
		}
	
		else {
			if (salario > 2000 && salario <= 3000) {
				resultado = (salario - 2000) * faixa1;
			}
			
			else if (salario > 3000 && salario <= 4500) {
				resultado = ((salario - 3000) * faixa2) + (1000 * faixa1);				
			}
			
			else if (salario > 4500) {
				resultado = ((salario - 4500) * faixa3) + (1500 * faixa2) + (1000 * faixa1);
			}
		
		System.out.printf("R$ %.2f", resultado);
		}
		
		entrada.close();
	}
}