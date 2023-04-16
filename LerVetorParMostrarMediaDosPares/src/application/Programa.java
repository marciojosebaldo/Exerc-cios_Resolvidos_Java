/*
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"
*/

package application;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {

		int qtdeNumeros, contador = 0;
		float arranjoNumerosSoma = 0, arranjoNumerosMedia = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos elementos terá o vetor? ");
		qtdeNumeros = entrada.nextInt();

		float[] arranjoNumeros = new float[qtdeNumeros];

		for (int i = 0; i < arranjoNumeros.length; i++) {
			System.out.print("Digite um número: ");
			arranjoNumeros[i] = entrada.nextFloat();

			if (arranjoNumeros[i] % 2 == 0) {
				arranjoNumerosSoma += arranjoNumeros[i];
				contador += 1;
			}
		}

		arranjoNumerosMedia = arranjoNumerosSoma / contador;

		if (contador != 0) {
			System.out.printf("MEDIA DOS PARES: %.1f", arranjoNumerosMedia);
		} else {
			System.out.println("NENHUM NÚMERO PAR");
		}

		entrada.close();
	}
}