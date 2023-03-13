import java.util.Scanner;

//Ler um número inteiro N e calcular todos os seus divisores.

public class calcular_divisores {
	public static void main (String[] args) {
		
		int n;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		
		n = entrada.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		
		entrada.close();
	}
}