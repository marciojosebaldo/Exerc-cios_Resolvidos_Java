/*
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.
*/


package application;

import java.util.Scanner;

public class Programa {
	public static void main (String[] args) {
	
		int qtdeNumeros;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos valores terá cada vetor?");
		qtdeNumeros = entrada.nextInt();
		
		System.out.println("Digite os valores do vetor A: ");
		
		int[] arranjoValoresA = new int[qtdeNumeros];
		
		for (int i = 0; i < arranjoValoresA.length; i++) {
			arranjoValoresA[i] = entrada.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		
		int[] arranjoValoresB = new int[qtdeNumeros];
		
		for (int i = 0; i < arranjoValoresB.length; i++) {
			arranjoValoresB[i] = entrada.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE: ");
		
		int[] arranjoValoresC = new int[qtdeNumeros];
		
		for (int i = 0; i < arranjoValoresC.length; i++) {
			arranjoValoresC[i] = arranjoValoresA[i] + arranjoValoresB[i];
			System.out.println(arranjoValoresC[i]);
		}
		
		
		
		entrada.close();
	}	
}