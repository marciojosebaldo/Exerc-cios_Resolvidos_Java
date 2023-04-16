/*
3. Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar
na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16
anos, bem como os nomes dessas pessoas caso houver
*/

package application;

import java.util.Scanner;

import entities.Pessoas;

public class Programa {
	public static void main(String[] args) {

		int numeroPessoas;
		double contadorMenor16 = 0.00;
		double porcentagemMenor16 = 0.00;

		Scanner entrada = new Scanner(System.in);
		Pessoas pessoas = new Pessoas("", 0, 0.00);

		System.out.println("Quantas pessoas serão digitadas? ");
		numeroPessoas = entrada.nextInt();

		pessoas.setNumeroPessoas(numeroPessoas);

		Pessoas[] vetorPessoas = new Pessoas[numeroPessoas];

		for (int i = 0; i < vetorPessoas.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			entrada.nextLine();

			System.out.print("Nome: ");
			String nome = entrada.nextLine();

			System.out.println("Idade: ");
			int idade = entrada.nextInt();

			System.out.print("Altura: ");
			double altura = entrada.nextDouble();

			vetorPessoas[i] = new Pessoas(nome, idade, altura);

			pessoas.somaAltura(altura);

			if (idade < 16) {
				contadorMenor16 += 1;
			}
		}

		porcentagemMenor16 = (contadorMenor16 / pessoas.getNumeroPessoas() * 100);

		System.out.println(pessoas.toString());
		System.out.printf("Pessoas com menos de 16 anos: %.2f", porcentagemMenor16);
		System.out.print("%");
		System.out.println();

		for (int i = 0; i < vetorPessoas.length; i++) {
			if (vetorPessoas[i].getIdade() < 16) {
				System.out.println(vetorPessoas[i].getNome());
			}
		}

		entrada.close();
	}
}