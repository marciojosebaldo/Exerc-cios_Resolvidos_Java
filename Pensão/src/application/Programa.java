/*
A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses 
quartos identificados pelos números 0 a 9. Fazer um programa que inicie com todos os dez
quartos vazios, e depois leia uma quantidade N representando o número de estudantes que 
vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes.
Para cada registro de aluguel, informar o nome e e-mail do estudante, bem como qual dos 
quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu 
programa deve imprimir um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo.
*/

package application;

import java.util.Scanner;

import entities.Pensao;

public class Programa {
	public static void main(String[] args) {

		int qtdeQuartos, auxiliarNumeroQuarto;
		String auxiliarNome, auxiliarEmail;

		Scanner entrada = new Scanner(System.in);
		Pensao pensao = new Pensao(" ", " ", 0);

		System.out.print("Quantos quartos serão alugados: ");
		qtdeQuartos = entrada.nextInt();

		Pensao[] vPensao = new Pensao[qtdeQuartos];		

		for (int i = 0; i < vPensao.length; i++) {
			System.out.println();
			System.out.println("Aluguel #" + (i + 1));

			System.out.print("Nome: ");
			entrada.nextLine();
			String nome = entrada.nextLine();

			System.out.print("Email: ");
			String email = entrada.nextLine();

			System.out.print("Quarto: ");
			int quarto = entrada.nextInt();

			vPensao[i] = pensao = new Pensao(nome, email, quarto);
		}
		
		for (int i = 0; i < vPensao.length; i++) {
			for (int j = 0; j < vPensao.length; j++) {
				if (vPensao[i].getNumeroQuarto() > vPensao[j].getNumeroQuarto()) {
					auxiliarNumeroQuarto = vPensao[j].getNumeroQuarto();
					vPensao[j].setNumeroQuarto(vPensao[i].getNumeroQuarto());
					vPensao[i].setNumeroQuarto(auxiliarNumeroQuarto);
				
					auxiliarNome = vPensao[j].getNome();
					vPensao[j].setNome(vPensao[i].getNome());
					vPensao[i].setNome(auxiliarNome);
					
					auxiliarEmail = vPensao[j].getEmail();
					vPensao[j].setEmail(vPensao[i].getEmail());
					vPensao[i].setEmail(auxiliarEmail);
				}
			}				
		}

		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int i = vPensao.length-1; i >= 0; i--) {
			if (vPensao[i].getNumeroQuarto() != 0) {
				System.out.println(vPensao[i].toString());
			}
		}
		
		
		entrada.close();
	}
}