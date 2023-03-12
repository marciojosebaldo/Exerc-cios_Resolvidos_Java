/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.*/


import java.util.Scanner;

public class numero_teste_com_peso {
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n;
		float valor1, valor2, valor3, resultado = 0;		
		
		System.out.println("Informe quantos testes deseja fazer: ");
		
		n = entrada.nextInt();
		
		System.out.println("Informe os 3 valores reais: ");
		
		valor1 = entrada.nextFloat();
		valor2 = entrada.nextFloat();
		valor3 = entrada.nextFloat();
	
		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				valor1 *= 2;
			}
			
			if (i == 1) {
				valor2 *= 3;
			}
			
			if (i == 2) {
				valor3 *= 5;
			}
		}
		
		resultado = (valor1 + valor2 + valor3) / (2+3+5);
		
		System.out.printf("%.1f", resultado);
		
		entrada.close();
	}
}