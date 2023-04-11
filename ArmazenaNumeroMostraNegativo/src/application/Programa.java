/*
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números
inteiros e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
*/

package application;

import java.util.Scanner;

public class Programa {
	public static void main (String[] args) {
	
	Scanner entrada = new Scanner(System.in);
		
	int numeroDigitado;
		
	System.out.println("Quantos números você vai digitar: ");
	numeroDigitado = entrada.nextInt();
	
	int[] vetorNumero = new int[numeroDigitado];
	
	for (int i = 0; i < vetorNumero.length; i++) {
		System.out.print("Digite um número: ");
		int numero = entrada.nextInt();
		vetorNumero[i] = numero;
	}

	System.out.println("NUMEROS NEGATIVOS: ");
	
	for (int i = 0; i < vetorNumero.length; i++) {
		if (vetorNumero[i] < 0) {
			System.out.println(vetorNumero[i]);
		}
	}
	entrada.close();
	}
}