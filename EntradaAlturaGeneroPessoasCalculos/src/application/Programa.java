/*
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um
programa que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e
o número de homens.
*/

package application;

import java.util.Scanner;

public class Programa {
	public static void main (String[] args) {
		
		int qtdePessoas, contadorHomem = 0, contadorMulher = 0;
		double auxiliar, alturaMax = 0.0, alturaMin = 0.0, somaAlturaMulher = 0, mediaAlturaMulher = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas: ");
		qtdePessoas = entrada.nextInt();
		
		double[] altura = new double[qtdePessoas];
		char[] genero = new char[qtdePessoas];
				
		for (int i = 0; i < qtdePessoas; i++) {
			System.out.print("Altura da " + (i+1) + " pessoa: ");
			altura[i] = entrada.nextDouble();
			
			System.out.print("Gênero da " + (i+1) + " pessoa: ");
			genero[i] = entrada.next().charAt(0);
		}
		
		for (int i = 0; i < qtdePessoas; i++) {
			for (int j = 0; j < qtdePessoas; j++) {
				if (altura[i] > altura[j]) {
					auxiliar = altura[j];
					altura[j] = altura[i];
					altura[i] = auxiliar;
				}
			}
		}
		
		for (int i = 0; i < qtdePessoas; i++) {		
			alturaMin = altura[qtdePessoas-1];
			alturaMax = altura[0];
			
			if (genero[i] == 'M' || genero[i] == 'm') {
				contadorHomem += 1;
			}
			
			else {
				contadorMulher +=1;
				somaAlturaMulher += altura[i];	
			}
		}
			
		mediaAlturaMulher = somaAlturaMulher /contadorMulher; 
		
		
		System.out.println("Menor altura " + alturaMin);
		System.out.println("Maior altura " + alturaMax);
		System.out.printf("Média da altura das mulheres: %.2f%n", mediaAlturaMulher);
		System.out.println("Número de homens " + contadorHomem);
		
		
		
	entrada.close();
	}
}