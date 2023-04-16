/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre
natela todos os números pares, e também a quantidade de números pares.
*/

package application;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {

		int tamanhoNumero, contador = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar?");
		tamanhoNumero = entrada.nextInt();

		int[] arranjoNumeroDigitado = new int[tamanhoNumero];

		for (int i = 0; i < arranjoNumeroDigitado.length; i++) {
			System.out.print("Digite um número: ");
			arranjoNumeroDigitado[i] = entrada.nextInt();
		}

		System.out.println("NÚMEROS PARES: ");

		for (int i = 0; i < arranjoNumeroDigitado.length; i++) {
			if (arranjoNumeroDigitado[i] % 2 == 0) {
				System.out.print(arranjoNumeroDigitado[i] + " ");
				contador++;
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES: " + contador);

		entrada.close();
	}
}