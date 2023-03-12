import java.util.Scanner;

public class dentro_fora_intervalo {
	public static void main (String[] args) {
		
		int x;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		
		x = entrada.nextInt();
		
		for (int i = 0; i <= x; i++) {
			if (i >= 10 && i <= 20) {
				System.out.println(i + " in");
			}
			
			else {
				System.out.println(i + " out");
			}
		}
		
		entrada.close();
		
	}
}