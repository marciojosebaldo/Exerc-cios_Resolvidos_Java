/*
Escreva um programa em que, dada uma variável x com algum valor inteiro, temos um
novo x de acordo com a seguinte regra:
Se x é par, x = x / 2 ;
Se x é impar, x = 3 * x + 1 ;
Imprime x ;
O programa deve parar quando x tiver o valor final de 1. Por exemplo, para x = 13 , a saída
será:
40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 */

import java.util.Scanner;

public class PararAteUm {
	public static void main(String[] args) {

		int inteiro;

		Scanner entrada = new Scanner(System.in);

		inteiro = entrada.nextInt();

		do {
			
			if (inteiro % 2 == 0) {
				inteiro = inteiro / 2;
				System.out.println(inteiro);
			}
			else {
				inteiro = 3 * inteiro + 1;
				System.out.println(inteiro);
			}
		}
		
		while (inteiro != 1);

		entrada.close();
	}

}