/*
2. Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
*/

package application;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {

		int numeroEntrada;
		double soma = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar: ");
		numeroEntrada = entrada.nextInt();

		double[] vetorNumeroEntrada = new double[numeroEntrada];

		for (int i = 0; i < vetorNumeroEntrada.length; i++) {
			System.out.print("Digite um numero: ");
			vetorNumeroEntrada[i] = entrada.nextDouble();
		}
		
		System.out.print("VALORES = ");
		
		for (int i = 0; i < vetorNumeroEntrada.length; i++) {
			System.out.print(vetorNumeroEntrada[i] + " ");
			soma += vetorNumeroEntrada[i];
		}
		
		System.out.printf("%nSOMA = %.2f%n" +
							"MEDIA = %.2f", soma, soma/vetorNumeroEntrada.length);
		

		entrada.close();
	}
}