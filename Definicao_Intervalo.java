import java.util.Scanner;

public class Definicao_Intervalo {
	public static void main (String[] args) {
		
		float n1;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		
		n1 = entrada.nextFloat();
		
		if (n1 >= 0 && n1 <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		
		else if (n1 > 25 && n1 <= 50) {
			System.out.println("Intervalo [25,50]");
		}
		
		else if (n1 > 50 && n1 <= 75) {
			System.out.println("Intervao [50,75]");
		}
		
		else if (n1 > 75 && n1 <= 100) {
			System.out.println("Intervalo [75,100]");
		}
		
		else {
			System.out.println("Fora de intervalo");
		}
		
		entrada.close();
		
	}
}