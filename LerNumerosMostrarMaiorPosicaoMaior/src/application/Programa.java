package application;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {

		int qtdeNumeros, posicao = 0;
		float maiorNumero = 0, auxiliar = 0, maior = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar: ");
		qtdeNumeros = entrada.nextInt();

		float[] arranjoNumeros = new float[qtdeNumeros];

		for (int i = 0; i < arranjoNumeros.length; i++) {
			System.out.print("Digite um número: ");
			arranjoNumeros[i] = entrada.nextFloat();
		}

		maior = arranjoNumeros[0];
		for (int i = 0; i < arranjoNumeros.length; i++) {
			if (arranjoNumeros[i] > maior) {
				maior = arranjoNumeros[i];
				posicao = i;
			}
		}

		for (int i = 0; i < arranjoNumeros.length; i++) {
			for (int j = arranjoNumeros.length - 1; j > 0; j--) {
				if (arranjoNumeros[j] > arranjoNumeros[i]) {
					auxiliar = arranjoNumeros[j];
					arranjoNumeros[i] = arranjoNumeros[j];
					arranjoNumeros[j] = auxiliar;
					maiorNumero = arranjoNumeros[j];
				}
			}
		}

		System.out.println("MAIOR VALOR: " + maiorNumero);
		System.out.println("POSIÇÃO DO MAIOR VALOR: " + posicao);

		entrada.close();
	}
}