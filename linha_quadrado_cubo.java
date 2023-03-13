import java.util.Scanner;
/*
Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
*/

public class linha_quadrado_cubo {
	public static void main (String[] args){
		
		int n, quadrado, cubo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		
		n = entrada.nextInt();
		
		for (int i = 1; i <= n; i++) {
			quadrado = (int) Math.pow(i, 2);
			cubo = (int) Math.pow(i, 3);
			
			System.out.printf("%d %d %d %n", i, quadrado, cubo);
		}
		
		entrada.close();
	}
}