/* Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1. */

import java.util.Scanner;

public class fatorial {
	public static void main (String[] args) {
		
		int N, resultado = 1, auxiliar = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número para fatorial: ");
		
		N = entrada.nextInt();
				
		for (int i = 1; i <= N; i++) {
			auxiliar = i * resultado;
			resultado = auxiliar;
		}
		
		System.out.println(resultado);
		
		entrada.close();
	}
}