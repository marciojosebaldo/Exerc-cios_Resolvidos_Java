/*
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.
*/

package application;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {

	int qtdePessoas, auxiliarIdade;
	String auxiliarNome, nomeMaisVelho = "a";
	
	Scanner entrada = new Scanner(System.in);

	System.out.print("Quantas pessoas você incluirá? ");
	qtdePessoas = entrada.nextInt();
		
	String[] arranjoNome = new String[qtdePessoas];
	int[] arranjoIdade = new int[qtdePessoas];
		
	for (int i = 0; i < qtdePessoas; i++) {
							
		System.out.println("Dados da " + (i + 1) + " pessoa: ");
		
		System.out.print("Nome: ");
		arranjoNome[i] = entrada.next();
		
		System.out.print("Idade: ");
		arranjoIdade[i] = entrada.nextInt();
		
			for (int j = 0; j < qtdePessoas; j++) {
			
				if (arranjoIdade[j] > arranjoIdade[i]) {
					
					auxiliarIdade = arranjoIdade[j];
					arranjoIdade[j] = arranjoIdade[i];
					arranjoIdade[i] = auxiliarIdade;
					
					auxiliarNome = arranjoNome[j];
					arranjoNome[j] = arranjoNome[i];
					arranjoNome[i] = auxiliarNome;
					
					nomeMaisVelho = arranjoNome[i];
				}
			}
	}
		
	System.out.println("Pessoa mais velha: " + nomeMaisVelho);

	entrada.close();
	}
}