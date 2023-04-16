/*
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em
seguida, mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois
mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
*/

package application;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {

		int qtdeNumeros;
		double somaVetor = 0, mediaVetor;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos elementos terá o vetor?");
		qtdeNumeros = entrada.nextInt();
		
		double[] arranjoNumeros = new double[qtdeNumeros];
		
		for (int i = 0; i < arranjoNumeros.length; i++) {
			System.out.print("Digite um número: ");
			arranjoNumeros[i] = entrada.nextDouble();
			somaVetor += arranjoNumeros[i]; 
		}
		
		mediaVetor = somaVetor / qtdeNumeros;

		System.out.printf("MÉDIA DO VETOR = %.3f", mediaVetor);
		System.out.println();
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
		
		for (int i = 0; i < arranjoNumeros.length; i++) {
			if (arranjoNumeros[i] < mediaVetor) {
				System.out.println(arranjoNumeros[i]);
			}
		}
		
		entrada.close();
	}
}